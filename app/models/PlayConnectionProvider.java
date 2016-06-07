package models;

import org.jooq.ConnectionProvider;
import org.jooq.exception.DataAccessException;
import play.Logger;
import play.db.Database;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PlayConnectionProvider implements ConnectionProvider {
    Connection conn;

    @Inject Database db;
    public Connection acquire() throws DataAccessException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://209.148.94.217:3306/Gara", "Gara", "123456");
        } catch (SQLException e) {
            Logger.error("Error closing connection " + conn, e);
        }
        return conn;
    }

    public void release(Connection released) throws DataAccessException {
        if (this.conn != released) {
            throw new IllegalArgumentException("Expected " + this.conn + " but got " + released);
        }
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            Logger.error("Error closing connection " + conn, e);
        }
    }
}