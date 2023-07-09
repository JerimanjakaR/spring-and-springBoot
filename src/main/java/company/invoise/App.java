package company.invoise;

import company.invoise.controller.InvoiseControllerInterface;
import company.invoise.service.InvoiseServiceInterface;
import company.invoise.service.web.InvoiseServiceWeb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * on peut mettre aussi ces configurations(@Configuration, @ComponentScan, @PropertySource) dans une autre class
 * exemple dans la classe AppConfig, on peut creer aussi un autre classe
 *
 */
@Configuration
//@ComponentScan(basePackages = {"company.invoise.controller.console,company.invoise.service.web,company.invoise.repository.Database"})
@ComponentScan(basePackages = {"company.invoise.controller.scan,company.invoise.repository.Database"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args ) {

        //configuration en utilisant le fichier de configuration Spring
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Configuration en utilisation une class de configuration Spring en utilisant le AppConfig
      //  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Configuration en utilisation une class de configuration Spring si on utilise App
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);

        InvoiseControllerInterface invoiseController = applicationContext.getBean(InvoiseControllerInterface.class);
        invoiseController.createInvoise();
    }

    //en utilisant l'annotation @Bean on peut specifier aussi le bean à utiliser
    @Bean
    public InvoiseServiceInterface configureInvoiseService(){
        return new InvoiseServiceWeb();
    }


}
