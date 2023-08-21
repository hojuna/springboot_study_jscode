package com.jun.spring.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//<>에 사용할 entity의 종류와 id의 타입을 명시해줘야한다.
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {


    List<ProductEntity> findByName(String name);

//    이런식으로 수동으로 쿼리를 주입해줄 수 있음
//    @Query("SELECT p from ProductEntity p where p.name = :name")
//    List<ProductEntity> findByName(String name);

    List<ProductEntity> findByNameAndPrice(String name, int price);

    List<ProductEntity> findByNameOrderByPriceDesc(String name);
}
