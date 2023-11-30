package com.swen90014.paplatypusbackend.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;


@Configuration
@EnableAsync
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor MybatisPlusInterceptor(){
        MybatisPlusInterceptor MybatisPlusInterceptor = new MybatisPlusInterceptor();
        MybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return MybatisPlusInterceptor;
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

