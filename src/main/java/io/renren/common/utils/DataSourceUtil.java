package io.renren.common.utils;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;

import javax.sql.DataSource;

/**
 * 数据源工具
 *
 * @author huyi
 * @create 2017/12/13 16:27
 */
public class DataSourceUtil {

    public static DataSource getAtomikosXADataSource(
            String uniqueResourceName, String databaseUrl, String userName, String password) {
        MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();//创建支持XA协议的数据源
        mysqlXADataSource.setUrl(databaseUrl);
        mysqlXADataSource.setUser(userName);
        mysqlXADataSource.setPassword(password);

        AtomikosDataSourceBean atomikosDataSource = new AtomikosDataSourceBean();//实现连接池
        atomikosDataSource.setUniqueResourceName(uniqueResourceName);
        atomikosDataSource.setXaDataSource(mysqlXADataSource);
        atomikosDataSource.setMinPoolSize(5);
        atomikosDataSource.setMaxPoolSize(20);
        atomikosDataSource.setTestQuery("SELECT 1");
        return atomikosDataSource;
    }
}
