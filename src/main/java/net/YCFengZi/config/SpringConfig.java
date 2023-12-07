package net.YCFengZi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:02
 */
@Configuration
@ComponentScan({"net.YCFengZi.service", "net.YCFengZi.controller"})
@Import(MybatisConfig.class)
@EnableTransactionManagement
public class SpringConfig {
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }
}
