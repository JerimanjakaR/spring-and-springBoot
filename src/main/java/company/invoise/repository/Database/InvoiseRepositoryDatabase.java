package company.invoise.repository.Database;

import company.invoise.entity.Invoise;
import company.invoise.repository.InvoiseRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component : permet d'indiquer que c'est un component
@Repository
public class InvoiseRepositoryDatabase implements InvoiseRepositoryInterface {
    public void create(Invoise invoise){
        System.out.println(" invoise numero : "+ invoise.getNumber() +" and "+ invoise.getCustomerName() +" added in repository ");
    }

    @Override
    public List<Invoise> list() {

        Invoise invoise1 = new Invoise();
        invoise1.setNumber("NUM_112");
        invoise1.setCustomerName("JIRAMA");

        Invoise invoise2 = new Invoise();
        invoise2.setNumber("ORA_123");
        invoise2.setCustomerName("TELMA");
        return List.of(invoise1,invoise2);
    }
}
