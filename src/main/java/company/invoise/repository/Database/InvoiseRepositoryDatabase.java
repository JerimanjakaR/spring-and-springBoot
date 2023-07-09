package company.invoise.repository.Database;

import company.invoise.entity.Invoise;
import company.invoise.repository.InvoiseRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiseRepositoryDatabase implements InvoiseRepositoryInterface {
    public void create(Invoise invoise){
        System.out.println(" invoise numero : "+ invoise.getNumber() +" and "+ invoise.getCustomerName() +" added in repository ");
    }
}
