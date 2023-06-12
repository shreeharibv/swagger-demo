package com.reactive.swaggerdemo.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringFoxConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("test@test.com");
        contact.setName("test");
        contact.setUrl("test.com");

        Info info = new Info()
                .title("Sample Open API Test")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage cases.")
                .termsOfService("https://www.test.com/terms");

        return new OpenAPI().info(info);

    }
}