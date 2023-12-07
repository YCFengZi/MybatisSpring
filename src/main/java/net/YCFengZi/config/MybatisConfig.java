package net.YCFengZi.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:02
 */
@Configuration
@MapperScan("net.YCFengZi.mapper")
@PropertySource("db-spring.properties")
public class MybatisConfig {
    @Value("${url}")
    private String url;
    @Value("${driver}")
    private String driver;
    @Value("${uname}")
    private String uname;
    @Value("${password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(uname);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("net.YCFengZi.pojo");
        factoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return factoryBean.getObject();
    }
}
