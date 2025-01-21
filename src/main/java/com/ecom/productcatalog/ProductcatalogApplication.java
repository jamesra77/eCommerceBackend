package com.ecom.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ecom.productcatalog")
public class ProductcatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductcatalogApplication.class, args);
	}

}
