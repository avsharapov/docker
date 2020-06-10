package stc.inno.ConnectionManager;

import java.sql.Connection;

public interface ConnectionManager {
    Connection getConnection();

    int get15();
}
