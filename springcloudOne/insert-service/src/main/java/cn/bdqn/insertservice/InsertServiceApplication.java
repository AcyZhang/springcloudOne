package cn.bdqn.insertservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan("cn.bdqn.insertservice.dao")
public class InsertServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsertServiceApplication.class, args);
    }
}
