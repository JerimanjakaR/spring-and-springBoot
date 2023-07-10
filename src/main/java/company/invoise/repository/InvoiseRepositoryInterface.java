package company.invoise.repository;

import company.invoise.entity.Invoise;

import java.util.List;

public interface InvoiseRepositoryInterface {
    void create(Invoise invoise);
    List<Invoise> list();
}
