package com.codingshuttle.jpaTutorial.jpaTuts.repository;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByTitle(String title);

//    List<ProductEntity> findByTitleOrPrice(String coke, BigDecimal bigDecimal);

    @Query("select e from ProductEntity where e.title=?1 or e.price=?2")
    Optional<ProductEntity> findByTitleOrPrices(String title, BigDecimal price);
}
