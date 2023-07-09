package company.invoise.controller.scan;

import company.invoise.controller.InvoiseControllerInterface;
import company.invoise.entity.Invoise;
import company.invoise.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiseControllerScan implements InvoiseControllerInterface {
    @Autowired
    private InvoiseServiceInterface invoiseService;
    @Override
    public void createInvoise() {
        System.out.println( " this is the Scan " );

        String customerName = "Space X";
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
