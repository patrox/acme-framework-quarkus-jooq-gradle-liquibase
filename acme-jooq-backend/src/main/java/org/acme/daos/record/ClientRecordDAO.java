package org.acme.daos.record;

import org.acme.daos.AbstractRecordDAO;
import org.acme.generated.jooq_testshop.tables.Client;
import org.acme.generated.jooq_testshop.tables.interfaces.IClient;
import org.acme.generated.jooq_testshop.tables.records.ClientRecord;
import org.jooq.DSLContext;

/**
 * ClientRecordDAO
 */
public class ClientRecordDAO extends AbstractRecordDAO<ClientRecord, IClient, Integer> {

    public ClientRecordDAO(DSLContext dslContext) {
        super(dslContext, Client.CLIENT);
    }

    @Override
    public Integer getId(ClientRecord object) {
        return object.getClientId();
    }
}
