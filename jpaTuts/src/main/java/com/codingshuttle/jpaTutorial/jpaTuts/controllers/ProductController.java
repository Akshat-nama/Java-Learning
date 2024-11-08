package com.codingshuttle.jpaTutorial.jpaTuts.controllers;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private final int PAGE_SIZE = 5;
    private final ProductRepository productRepository;


    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Page<ProductEntity> getAllProducts(@RequestParam (defaultValue = "") String title, @RequestParam (defaultValue = "0") int pageNumber, @RequestParam (defaultValue = "id") String sortBy){
//          Sorting
//        return productRepository.findBy(Sort.by(
//                Sort.Order.desc(sortBy),
//                Sort.Order.asc("title")
//        ));

        //Pagination
//        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(sortBy).ascending() );
//        return productRepository.findAll(pageable).getContent();

        return productRepository.findByTitleContainingIgnoreCase(
                title,
                PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(sortBy).ascending() )
        );



    }
}
