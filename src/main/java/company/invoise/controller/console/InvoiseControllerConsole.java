package company.invoise.controller.console;

import company.invoise.controller.InvoiseControllerInterface;
import company.invoise.entity.Invoise;
import company.invoise.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

//@Component : permet d'indiquer que c'est un component
//@Controller
public class InvoiseControllerConsole implements InvoiseControllerInterface {
    @Autowired
    private InvoiseServiceInterface invoiseService;
    public void createInvoise(){
        System.out.println( "what is a customeName !" );

        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoise invoise = new Invoise();
        invoise.setCustomerName(customerName);


        invoiseService.createInvoise(invoise);
    }

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }
}
