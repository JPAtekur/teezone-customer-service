package com.teezone.customer.service;

import com.teezone.customer.VO.Product;
import com.teezone.customer.VO.ResponseTemplateVO;
import com.teezone.customer.entity.Customer;
import com.teezone.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findCustomerByCustomerId(customerId);
    }

    public ResponseTemplateVO getCustomerProduct(Long customerId) {
        Customer customer = customerRepository.findCustomerByCustomerId(customerId);
        Product product =
                restTemplate.getForObject("http://localhost:9001/product/1", Product.class);
        ResponseTemplateVO vo = new ResponseTemplateVO(product,customer);
        return vo;
    }
}
