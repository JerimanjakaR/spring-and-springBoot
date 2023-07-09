package company.invoise.service.simpleInvose;

import company.invoise.entity.Invoise;
import company.invoise.repository.InvoiseRepositoryInterface;
import company.invoise.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class InvoiseService  implements InvoiseServiceInterface {

    @Value("112L")
    private Long lastNumber;

    @Autowired
    private InvoiseRepositoryInterface invoiseRepository;
    public void createInvoise(Invoise invoise){
        invoise.setNumber(String.valueOf(++lastNumber));
        invoiseRepository.create(invoise);
    }

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }
}
