package net.frontawesome.springboot.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"net.frontawesome.springboot.domain"})
@EnableJpaRepositories(basePackages = {"net.frontawesome.springboot.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {

}
