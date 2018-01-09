package com.dik.webstore.controller;

import com.dik.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class OrderController {

    @Autowired
    ProductService productService;

    @RequestMapping("/cart")
    public String showCart(Model model) {
        return "cart";
    }

    @RequestMapping("/findItem")
    public String getProductById(Model model) {
        return "product?id=1";
    }

}
