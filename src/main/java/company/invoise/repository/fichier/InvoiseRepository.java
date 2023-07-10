package company.invoise.repository.fichier;

import company.invoise.entity.Invoise;
import company.invoise.repository.InvoiseRepositoryInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Component : permet d'indiquer que c'est un component
 // @Repository C'est un repository
public class InvoiseRepository implements InvoiseRepositoryInterface {

    List<Invoise> invoises = new ArrayList<>();
    public void create(Invoise invoise){
        invoises.add(invoise);
        System.out.println(" invoise numero : "+ invoise.getNumber() +" and "+ invoise.getCustomerName() +" added in repository ");
    }

    @Override
    public List<Invoise> list() {
        throw new UnsupportedOperationException();
    }
}
