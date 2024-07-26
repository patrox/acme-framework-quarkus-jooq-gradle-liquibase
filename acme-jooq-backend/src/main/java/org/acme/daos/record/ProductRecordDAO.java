package org.acme.daos.record;

import org.acme.daos.AbstractRecordDAO;
import org.acme.generated.jooq_testshop.tables.Product;
import org.acme.generated.jooq_testshop.tables.interfaces.IProduct;
import org.acme.generated.jooq_testshop.tables.records.ProductRecord;
import org.jooq.DSLContext;

/**
 * ProductRecordDAO
 */
public class ProductRecordDAO extends AbstractRecordDAO<ProductRecord, IProduct, Long> {

    public ProductRecordDAO(DSLContext dslContext) {
        super(dslContext, Product.PRODUCT);
    }

    @Override
    public Long getId(ProductRecord object) {
        return object.getProductId();
    }
}
