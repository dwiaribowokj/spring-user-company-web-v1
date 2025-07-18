package com.company.user.web.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.company.user.lib.core.v1")
@SpringBootApplication(scanBasePackages = {
        "com.company.user.lib.core.v1",
        "com.company.user.web.v1",
})
@EntityScan(basePackages = {"com.company.user.lib.core.v1"})
public class UserCompanyWebV1Application {

    public static void main(String[] args) {
        SpringApplication.run(UserCompanyWebV1Application.class, args);
    }

}
