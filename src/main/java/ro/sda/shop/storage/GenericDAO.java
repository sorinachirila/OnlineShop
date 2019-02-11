package ro.sda.shop.storage;

import java.util.List;

public interface GenericDAO<T> {
    List<T> findAll();

    T findById(Long id);

    void update(T value);

    T add(T value);

    void delete(T value);

    void deleteById(Long id);
}
