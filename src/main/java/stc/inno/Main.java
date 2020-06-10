package stc.inno;


import stc.inno.ConnectionManager.ConnectionManager;
import stc.inno.ConnectionManager.ConnectionManagerJdbcImpl;
import stc.inno.dao.MobileDao;
import stc.inno.dao.MobileDaoJdbcImpl;
import stc.inno.pojo.Mobile;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();
        MobileDao         mobileDao         = new MobileDaoJdbcImpl(connectionManager);
        mobileDao.renewDatabase();
        Main main = new Main();
        main.method1(mobileDao);
    }


    public void method1(MobileDao mobileDao) {
        Mobile mobile = new Mobile(null, "Iphone 2", 25000, "Apple");
        Long   aLong  = mobileDao.addMobile(mobile);
        mobile = mobileDao.getMobileById(aLong);
        System.out.println("Начальный объект: {" + mobile + "}");
        mobile.setPrice(getPrice(mobile.getPrice(), 2));
        mobileDao.updateMobileById(mobile);
        mobile = mobileDao.getMobileById(aLong);
        System.out.println("Итоговый объект: {" + mobile + "}");
    }

    public int getPrice(int oldPrice, int multiply) {
        return oldPrice * multiply;
    }
}
