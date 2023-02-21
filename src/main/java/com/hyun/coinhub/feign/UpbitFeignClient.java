package com.hyun.coinhub.feign;

import com.hyun.coinhub.model.UpbitCoinPrice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="upbit", url="https://api.upbit.com/v1") //Open API를 사용하기 위해서
public interface UpbitFeignClient {
    @GetMapping("/ticker")
    List<UpbitCoinPrice> getCoinPrice(@RequestParam("market") String coin);
}
