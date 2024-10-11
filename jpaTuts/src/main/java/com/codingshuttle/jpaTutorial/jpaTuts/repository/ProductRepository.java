package com.codingshuttle.jpaTutorial.jpaTuts.repository;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    //List<ProductEntity> findBy(Sort sortBy);

    Page<ProductEntity> findAll(Pageable pageable);

    Page<ProductEntity> findByTitleContainingIgnoreCase(String title, Pageable pageable );


//    List<ProductEntity> findByTitleOrPrice(String coke, BigDecimal bigDecimal);
//    @Query("select e from ProductEntity where e.title=?1 or e.price=?2")
//    Optional<ProductEntity> findByTitleOrPrices(String title, BigDecimal price);
}
