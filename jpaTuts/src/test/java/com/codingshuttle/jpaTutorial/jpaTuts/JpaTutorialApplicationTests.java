package com.codingshuttle.jpaTutorial.jpaTuts;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootTest
class JpaTutorialApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEntry(){
		ProductEntity productEntity = ProductEntity.
				builder().
				sku("12311").
				title("Coke").
				price(BigDecimal.valueOf(500.00)).build();
		productRepository.save(productEntity);
	}

	@Test
	void findByTitle(){
		List<ProductEntity> productEntities = productRepository.findByTitle("Coke");
		System.out.println(productEntities);

	}
//
//	@Test
//	void findByTitleOrPrice(){
//
//		Optional<ProductEntity> productEntities = productRepository.findByTitleOrPrices("Coke", BigDecimal.valueOf(500.00));
//		System.out.println(productEntities);
//	}

}
