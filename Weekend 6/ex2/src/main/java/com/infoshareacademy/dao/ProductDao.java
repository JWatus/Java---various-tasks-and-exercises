package com.infoshareacademy.dao;

import com.infoshareacademy.model.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Long save(Product s) {
        entityManager.persist(s);
        return s.getId();
    }

    public Product update(Product s) {
        return entityManager.merge(s);
    }

    public void delete(Long id) {
        final Product s = entityManager.find(Product.class, id);
        if (s != null) {
            entityManager.remove(s);
        }
    }

    public Product findById(Long id) {
        return entityManager.find(Product.class, id);
    }

    public List<Product> findAll() {
        final Query query = entityManager.createQuery("SELECT p FROM Product p ORDER BY id DESC");

        return query.getResultList();
    }

    public List<Product> findAllReversed() {
        final Query query = entityManager.createQuery("SELECT p FROM Product p ORDER BY id ASC");

        return query.getResultList();
    }

    public List<Product> findAllByName() {
        final Query query = entityManager.createQuery("SELECT p FROM Product p ORDER BY name");

        return query.getResultList();
    }

    public List<Product> findAllByQuantity() {
        final Query query = entityManager.createQuery("SELECT p FROM Product p ORDER BY quantity");

        return query.getResultList();
    }
}
