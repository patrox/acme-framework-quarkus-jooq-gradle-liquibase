package org.acme.daos.record;

import org.acme.daos.AbstractRecordDAO;
import org.acme.generated.jooq_testshop.tables.Lang;
import org.acme.generated.jooq_testshop.tables.interfaces.ILang;
import org.acme.generated.jooq_testshop.tables.records.LangRecord;
import org.jooq.DSLContext;

/**
 * LangRecordDAO
 */
public class LangRecordDAO extends AbstractRecordDAO<LangRecord, ILang, Integer> {

    public LangRecordDAO(DSLContext dslContext) {
        super(dslContext, Lang.LANG);
    }

    @Override
    public Integer getId(LangRecord object) {
        return object.getLangId();
    }
}
