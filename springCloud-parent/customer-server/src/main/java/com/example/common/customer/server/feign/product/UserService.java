package com.example.common.customer.server.feign.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/1/22.
 */
@Component
@FeignClient(value = "product-service")
@RequestMapping("/product/user")
public interface UserService {

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String getUserById(@PathVariable("id") Integer id);



}
