/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lu.pragmaconsult.mytudulist.config;

import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author jy
 */
public class DataSourceFactory {

    private DataSource dataSource;
    private DataSource derbyDataSource;

    public void init() {

        try {
            Connection connection = derbyDataSource.getConnection();
            connection.close();
            this.dataSource = derbyDataSource;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Required
    public void setDerbyDataSource(DataSource derbyDataSource) {
        this.derbyDataSource = derbyDataSource;
    }
}
