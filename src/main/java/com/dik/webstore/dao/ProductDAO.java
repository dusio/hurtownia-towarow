package com.dik.webstore.dao;

import com.dik.webstore.entity.Product;

public interface ProductDAO {

    Product findProductById(int productId);

}
