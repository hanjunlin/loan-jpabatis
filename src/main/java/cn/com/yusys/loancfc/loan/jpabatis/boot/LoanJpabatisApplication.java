package cn.com.yusys.loancfc.loan.jpabatis.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"cn.com.yusys.loancfc.loan.jpabatis"})
@MapperScan(basePackages = {"cn.com.yusys.loancfc.loan.jpabatis.mapper"})
@EnableJpaRepositories("cn.com.yusys.loancfc.loan.jpabatis.dao")
@EntityScan("cn.com.yusys.loancfc.loan.jpabatis.entity")
public class LoanJpabatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanJpabatisApplication.class, args);
    }

}
