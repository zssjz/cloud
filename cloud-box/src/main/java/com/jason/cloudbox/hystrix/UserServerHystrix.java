package com.jason.cloudbox.hystrix;

import com.jason.cloudbox.dto.MessageDTO;
import com.jason.cloudbox.feign.UserFeign;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 熔断器fallback
 * @author zssjz
 */
@Component
public class UserServerHystrix implements UserFeign {

    @Override
    public MessageDTO getMessage() {
        return new MessageDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "0", "服务不可用", null);
    }
}
