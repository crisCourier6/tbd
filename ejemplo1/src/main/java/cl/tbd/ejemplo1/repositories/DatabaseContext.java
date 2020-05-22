package cl.tbd.ejemplo1.repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

@Configuration
public class DatabaseContext {
    @Value("jdbc:postgresql://127.0.0.1:5432/postgres")
    private String dbUrl;

    @Value("postgres")
    private String dbUser;

    @Value("Cristob98")
    private String dbPass;
    
    @Bean
    public Sql2o sql2o(){
        return new Sql2o("jdbc:postgresql://127.0.0.1:5432/voluntariado_db", "postgres", "Cristob98");
    }
}
