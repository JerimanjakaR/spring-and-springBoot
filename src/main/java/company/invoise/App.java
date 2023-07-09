package company.invoise;

import company.invoise.controller.InvoiseControllerInterface;
import company.invoise.service.InvoiseServiceInterface;
import company.invoise.service.web.InvoiseServiceWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * on peut mettre aussi ces configurations(@Configuration, @ComponentScan, @PropertySource)
 * dans une autre class
 * exemple dans la classe AppConfig, on peut creer aussi un autre classe
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {

        //configuration en utilisant le fichier de configuration Spring
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Configuration en utilisation une class de configuration Spring en utilisant le AppConfig
      //  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Configuration en utilisation une class de configuration Spring si on utilise App
       // ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);

        //utilisant Spring boot
        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        InvoiseControllerInterface invoiseController = applicationContext.getBean(InvoiseControllerInterface.class);
        invoiseController.createInvoise();
    }

    //en utilisant l'annotation @Bean on peut specifier aussi le bean à utiliser, c'est un autre façon que le @ComponentScan
   /* @Bean
    public InvoiseServiceInterface configureInvoiseService(){
        return new InvoiseServiceWeb();
    }

    */


}
