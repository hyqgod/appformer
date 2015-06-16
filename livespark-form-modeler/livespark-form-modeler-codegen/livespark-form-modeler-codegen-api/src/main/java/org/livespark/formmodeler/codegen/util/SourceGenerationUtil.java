package org.livespark.formmodeler.codegen.util;

/**
 * Created by pefernan on 4/27/15.
 */
public interface SourceGenerationUtil {

    public static final String JAVA_LANG_OVERRIDE = "java.lang.Override";

    public static final String ERRAI_PORTABLE = "org.jboss.errai.common.client.api.annotations.Portable";
    public static final String ERRAI_BINDABLE = "org.jboss.errai.databinding.client.api.Bindable";
    public static final String ERRAI_BOUND = "org.jboss.errai.ui.shared.api.annotations.Bound";

    public static final String ERRAI_MAPS_TO = "org.jboss.errai.common.client.api.annotations.MapsTo";
    public static final String ERRAI_DATAFIELD = "org.jboss.errai.ui.shared.api.annotations.DataField";
    public static final String ERRAI_TEMPLATED = "org.jboss.errai.ui.shared.api.annotations.Templated";

    public static final String ERRAI_REST_CLIENT = "org.jboss.errai.enterprise.client.jaxrs.api.RestClient";
    public static final String ERRAI_REMOTE_CALLBACK = "org.jboss.errai.common.client.api.RemoteCallback";

    public static final String INJECT_NAMED = "javax.inject.Named";
    public static final String INJECT_INJECT = "javax.inject.Inject";

    public static final String VALIDATION_VALID = "javax.validation.Valid";
    public static final String VALIDATION_NOT_NULL = "javax.validation.constraints.NotNull";
    public static final String HIBERNATE_NOT_EMPTY = "org.hibernate.validator.constraints.NotEmpty";

    public static final String EJB_STATELESS = "javax.ejb.Stateless";
    public static final String EJB_ENTITY_MANAGER = "javax.persistence.EntityManager";
    public static final String EJB_PERSISTENCE_CONTEXT = "javax.persistence.PersistenceContext";
    public static final String EJB_TRANSACTION_ATTR = "javax.ejb.TransactionAttribute";
    public static final String EJB_REQUIRES_NEW = "javax.ejb.TransactionAttributeType.REQUIRES_NEW";

    public static final String FORM_MODEL_CLASS = "org.livespark.formmodeler.rendering.client.shared.FormModel";
    public static final String FORM_VIEW_CLASS = "org.livespark.formmodeler.rendering.client.view.FormView";
    public static final String LIST_VIEW_CLASS = "org.livespark.formmodeler.rendering.client.view.ListView";
    public static final String LIST_ITEM_VIEW_CLASS = "org.livespark.formmodeler.rendering.client.view.ListItemView";

    public static final String LIST_VIEW_DELETE_EXECUTOR = "org.livespark.formmodeler.rendering.client.view.ListView.DeleteExecutor";

    public static final String ENTITY_SERVICE_CLASS = "org.livespark.formmodeler.rendering.server.rest.BaseEntityService";

    public static final String READONLY_PARAM = "readOnly";
    
    public static final String JAVAX_PERSISTENCE_ID = "javax.persistence.Id";

}
