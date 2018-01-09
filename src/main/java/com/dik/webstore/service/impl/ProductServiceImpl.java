package com.dik.webstore.service.impl;

import com.dik.webstore.dao.ProductDAO;
import com.dik.webstore.entity.Product;
import com.dik.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO productDAO;


    @Transactional
    public Product findProductById(int productId) {
        return productDAO.findProductById(productId);
    }
}
