package com.dik.webstore.dao.impl;

import com.dik.webstore.dao.ProductDAO;
import com.dik.webstore.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Product findProductById(int productId) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Product> q = currentSession.createQuery("from Product where productId = :id", Product.class);

        q.setParameter("id", productId);

        return q.uniqueResult();
    }
}
