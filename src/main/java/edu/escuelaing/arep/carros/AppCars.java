package edu.escuelaing.arep.carros;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class AppCars {
	public static void main(String[] args) {
		SpringApplication.run(AppCars.class, args);
	}

	@Configuration
   public class DatabaseConfig {
      @Bean
      public DataSource dataSource(){
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
         dataSource.setDriverClassName("org.postgresql.Driver");
         dataSource.setUrl("jdbc:postgresql://database-1.cogcd9oufuzw.us-east-1.rds.amazonaws.com:5432/postgres");
         dataSource.setUsername( "postgres" );
         dataSource.setPassword( "postgres5432" );
		 return dataSource;
      }
   }

}