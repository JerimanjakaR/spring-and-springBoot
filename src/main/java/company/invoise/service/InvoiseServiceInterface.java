package company.invoise.service;

import company.invoise.entity.Invoise;

import java.util.List;

public interface InvoiseServiceInterface {
     void createInvoise(Invoise invoise);
     List<Invoise> listInvoise();
}
