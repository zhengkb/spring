package cn.zkb.feign;

import cn.zkb.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="provider-demo",configuration = cn.config.Configuration.class)
public interface UserFeignClient {
    @RequestLine("GET /user/getUser/{id}")
    public User getUser(@Param("id") Long id);
}
