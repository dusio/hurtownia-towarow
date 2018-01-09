package com.dik.webstore.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customers")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int customerId;

    @NotNull
    @Size(min=2, max=30, message="{customerFirstName.size}")
    @Column(name = "customerFirstName")
    private String customerFirstName;

    @NotNull
    @Size(min=2, max=30, message = "{customerLastName.size}")
    @Column(name = "customerLastName")
    private String customerLastName;

    @NotNull
    @Size(min=5 , message = "{customerEmail.size}")
    @Email(message = "{customerEmail.regex}")
    @Column(name = "customerEmail")
    private String customerEmail;

    public Customer(){
        super();
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return new EqualsBuilder()
                .append(customerId, customer.customerId)
                .append(customerFirstName, customer.customerFirstName)
                .append(customerLastName, customer.customerLastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(customerId)
                .append(customerFirstName)
                .append(customerLastName)
                .toHashCode();
    }
}
