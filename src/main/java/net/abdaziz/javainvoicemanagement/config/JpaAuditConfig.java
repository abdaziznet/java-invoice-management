package net.abdaziz.javainvoicemanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditConfig {
    
    // @Bean
    // public AuditorAware<String> auditorProvider() {
    //     return new AuditorAware<String>() {
    //         @Override
    //         public Optional<String> getCurrentAuditor() {
    //             return "admin";
    //         }
    //     };
    // }

}
