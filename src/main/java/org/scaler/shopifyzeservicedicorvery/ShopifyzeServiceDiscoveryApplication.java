package org.scaler.shopifyzeservicedicorvery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopifyzeServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopifyzeServiceDiscoveryApplication.class, args);
    }

}
