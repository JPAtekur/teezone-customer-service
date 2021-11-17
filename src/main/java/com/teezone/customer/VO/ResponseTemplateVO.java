package com.teezone.customer.VO;

import com.teezone.customer.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ResponseTemplateVO {
    private Product product;
    private Customer customer;
}
