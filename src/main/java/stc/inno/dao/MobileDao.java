package stc.inno.dao;


import stc.inno.pojo.Mobile;

import java.sql.SQLException;

public interface MobileDao {
    Long addMobile(Mobile mobile);

    Mobile getMobileById(Long id);

    boolean updateMobileById(Mobile mobile);

    boolean deleteMobileById(Long id);

    void renewDatabase() throws SQLException;
}
