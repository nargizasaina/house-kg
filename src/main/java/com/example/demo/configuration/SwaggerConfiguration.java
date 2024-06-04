package com.example.demo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI getConfigurerSwagger(){
        Info info = new Info()
                .title("Сервис по продаже недвижимости")
                .description("Сервис по продаже недвижимости");
        return new OpenAPI().info(info);
    }
}
