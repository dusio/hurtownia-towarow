package com.dik.webstore.controller;


import com.dik.webstore.entity.Customer;
import com.dik.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listOfCustomers(Model model) {
        List<Customer> customers = customerService.getCustomers();

        model.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/addCustomerForm")
    public String addCustomerForm(Model model) {
        Customer customer = new Customer();

        model.addAttribute("newCustomer", customer);

        return "add-customer-form";
    }

    @PostMapping("/addCustomerForm")
    public String saveCustomer(@Valid @ModelAttribute("newCustomer") Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            return "add-customer-form";
        }

        customerService.addCustomer(customer);
        return "redirect:/customer/list";
    }


}
