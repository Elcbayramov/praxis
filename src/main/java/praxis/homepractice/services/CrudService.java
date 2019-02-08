package praxis.homepractice.services;

import java.util.List;

public interface CrudService<T, ID> {
    T getID(T ID);

    List<T> getAll();
    T save (T t);
    T update (T t);
    void  delete (ID id);

}
