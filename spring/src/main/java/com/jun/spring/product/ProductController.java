package com.jun.spring.product;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class ProductController {

    private  final ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService){
        this.productService = productService;
    }
    @GetMapping("api/products")
    public List<ProductEntity> getProducts(){
        return productService.getProducts();
    }



    @GetMapping(value = "api/products", params = "id")
    public ProductEntity getProductId(@RequestParam(value = "id", required = true) Long id) throws Exception  {
       return productService.getProductId(id);
    }

    @GetMapping(value = "api/products", params = "name")
    public List<ProductEntity> findByNameOrderByPriceDesc(@RequestParam(value = "name", required = true) String name){
        return productService.findByNameOrderByPriceDesc(name);
    }


    @GetMapping(value = "api/products", params = {"name","price"})
    public List<ProductEntity> getFindByNameAndPrice(@RequestParam(value = "name", required = true) String name,
                                                     @RequestParam(value = "price", required = true) int price
    ){
        return productService.getFindByNameAndPrice(name,price);
    }


//    @PostMapping("api/products")
//    public String saveProducts(@RequestBody ProductEntity productEntity) throws Exception {
//        return productService.saveProducts(productEntity);
//    }

    @PostMapping("api/products")
    public String saveRandomIdProducts(@RequestBody Product product) {
        return productService.saveRandomIdProducts(product);
    }

}
