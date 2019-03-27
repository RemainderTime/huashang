package cn.xf.huashang.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatServerApplication {
    
    
    public static void main(String[] args){
        SpringApplication.run(PlatServerApplication.class,args);
    }
}
