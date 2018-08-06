package org.formation.spring.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "org.formation.spring" })
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = { "org.formation.spring" })
public class ApplicationConfig {

	@Autowired
	private Environment environment; // property placeholder du XML

	@Bean
	public DataSource dataSource() { // cf. XML
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getProperty("jdbc.url"));
		dataSource.setUsername(environment.getProperty("jdbc.username"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));
		return dataSource;
	}

	// TODO Database populator : pour peupler une base de données à partir d'un
	// fichier
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager jtm = new JpaTransactionManager();
		jtm.setEntityManagerFactory(emf);
		return jtm;
	}
	
	@Bean
	// Configuration du provider
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter jva = new HibernateJpaVendorAdapter();
		jva.setDatabase(Database.MYSQL); // création du dialecte
		jva.setShowSql(true);
		return jva;
	}
	
	@Bean
	// Transactions gérées depuis Spring et pas depuis le conteneur
	// fin de la config ; on set tout dans la "machine" à générer des EMF
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setJpaVendorAdapter(jpaVendorAdapter());
		emf.setPackagesToScan("org.formation.spring.model"); // pour trouver les @Entity
		Properties jpaProperties = new Properties(); // cf. XML, <props>
		jpaProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		emf.setJpaProperties(jpaProperties);
		return emf;
	}

}
