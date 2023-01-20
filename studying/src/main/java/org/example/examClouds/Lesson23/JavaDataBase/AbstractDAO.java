package org.example.examClouds.Lesson23.JavaDataBase;

import java.util.List;

/**
 * В программном обеспечении data access object (DAO) — это объект, который предоставляет абстрактный интерфейс
 * к какому-либо типу базы данных или механизму хранения. DAO может использоваться для разных видов доступа
 * к БД (JDBC, JPA).
 */

public abstract class AbstractDAO<K extends Number, T> {
    public abstract List<T> findAll();

    public abstract T findEntityById(K id);

    public abstract boolean delete(K id);

    public abstract boolean delete(T entity);

    public abstract boolean create(T entity);

    public abstract T update(T entity);
}
