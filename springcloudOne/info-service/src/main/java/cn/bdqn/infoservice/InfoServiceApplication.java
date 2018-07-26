package cn.bdqn.infoservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("cn.bdqn.infoservice.dao")
public class InfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoServiceApplication.class, args);
    }
}
