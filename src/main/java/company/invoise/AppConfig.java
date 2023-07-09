package company.invoise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"company.invoise.controller.console,company.invoise.service.web,company.invoise.repository.Database"})
@PropertySource("classpath:application.properties")
public class AppConfig {

}
