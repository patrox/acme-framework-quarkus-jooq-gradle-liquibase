package org.acme.daos;

import org.acme.daos.record.*;
import org.acme.daos.view.ProductViewDAO;

import jakarta.enterprise.context.ApplicationScoped;
import org.jooq.DSLContext;

/**
 * DAOFactory to create instances of context-scoped daos.
 */
@ApplicationScoped
public class DAOFactory {

    public ClientRecordDAO createClientRecordDAO(DSLContext dslContext) {
        return new ClientRecordDAO(dslContext);
    }

    public ProductRecordDAO createProductRecordDAO(DSLContext dslContext) {
        return new ProductRecordDAO(dslContext);
    }

    public ProductViewDAO createProductViewDAO(DSLContext jooqContext) {
        return new ProductViewDAO(jooqContext);
    }

    public ProductLangRecordDAO createProductLangRecordDAO(DSLContext dslContext) {
        return new ProductLangRecordDAO(dslContext);
    }

    public LangRecordDAO createLangRecordDAO(DSLContext dslContext) {
        return new LangRecordDAO(dslContext);
    }

    public UserRecordDAO createUserRecordDAO(DSLContext dslContext) {
        return new UserRecordDAO(dslContext);
    }

    public UserRoleRecordDAO createUserRoleRecordDAO(DSLContext dslContext) {
        return new UserRoleRecordDAO(dslContext);
    }

}
