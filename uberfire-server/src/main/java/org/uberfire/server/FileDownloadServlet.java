/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.server;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.io.IOService;
import org.uberfire.java.nio.file.Path;
import org.uberfire.server.util.FileServletUtil;

import static java.lang.String.format;

public class FileDownloadServlet
        extends BaseFilteredServlet {

    private static final Logger logger = LoggerFactory.getLogger(FileDownloadServlet.class);

    @Inject
    @Named("ioStrategy")
    private IOService ioService;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        try {
            final URI uri = makeURI(request.getParameter("path"));

            if (!validateAccess(uri,
                                response)) {
                return;
            }

            final Path path = ioService.get(uri);

            byte[] bytes = ioService.readAllBytes(path);

            response.setHeader("Content-Disposition",
                               format("attachment; filename=\"%s\";",
                                      path.getFileName().toString()));

            response.setContentType("application/octet-stream");

            response.getOutputStream().write(
                    bytes,
                    0,
                    bytes.length);
        } catch (final Exception e) {
            logger.error("Failed to download a file.",
                         e);
        }
    }

    URI makeURI(final String path) throws URISyntaxException {
        final String encodedPath = FileServletUtil.encodeFileNamePart(path);
        return new URI(encodedPath);
    }
}
