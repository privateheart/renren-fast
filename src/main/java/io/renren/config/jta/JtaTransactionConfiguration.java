package io.renren.config.jta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

/**
 * spring boot 的 JTA 配置
 *
 * @author huyi
 * @create 2017/12/13 16:34
 */
public class JtaTransactionConfiguration {
    @Autowired
    private AtomikosJtaConfiguration jtaConfiguration;

    @Bean(name = "jtaTestTransactionManager")
    public PlatformTransactionManager platformTransactionManager()  throws Throwable {
        return new JtaTransactionManager(jtaConfiguration.userTransaction(), jtaConfiguration.transactionManager());
    }
}
