package com.jason.cloudbox.feign;

import com.jason.cloudbox.hystrix.UserServerHystrix;
import com.jason.cloudbox.dto.MessageDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * cloud-user熔断
 * @author zssjz
 */
@FeignClient(value = "cloud-user", fallback = UserServerHystrix.class)
@Component
public interface UserFeign {

    @GetMapping("/register/form")
    MessageDTO getMessage();
}
