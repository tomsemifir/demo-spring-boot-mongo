package fr.semifir.demospring.services;

import java.util.List;

public interface GenericService<T> {

    public List<T> getAll();

    public T getById(String id);

    public T create(T entity);

    public T update(T entity);

    public void delete(String id);
}
