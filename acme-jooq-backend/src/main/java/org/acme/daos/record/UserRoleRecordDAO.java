package org.acme.daos.record;

import org.acme.daos.AbstractRecordDAO;
import org.acme.generated.jooq_testshop.tables.UserRole;
import org.acme.generated.jooq_testshop.tables.interfaces.IUserRole;
import org.acme.generated.jooq_testshop.tables.records.UserRoleRecord;
import org.jooq.DSLContext;
import org.jooq.Record2;

/**
 * UserRoleRecordDAO
 */
public class UserRoleRecordDAO extends AbstractRecordDAO<UserRoleRecord, IUserRole, Record2<Integer, String>> {

    public UserRoleRecordDAO(DSLContext dslContext) {
        super(dslContext, UserRole.USER_ROLE);
    }

    @Override
    public Record2<Integer, String> getId(UserRoleRecord object) {
        return compositeKeyRecord(object.getUserId(), object.getRoleId());
    }
}
