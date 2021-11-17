package com.teezone.customer.controller;

import com.teezone.customer.VO.ResponseTemplateVO;
import com.teezone.customer.entity.Customer;
import com.teezone.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long customerId){
        return customerService.getCustomerById(customerId);
    }

    @GetMapping("/cuspro/{id}")
    public ResponseTemplateVO getCustomerProduct(@PathVariable("id") Long customerId){
        return customerService.getCustomerProduct(customerId);
    }

}
