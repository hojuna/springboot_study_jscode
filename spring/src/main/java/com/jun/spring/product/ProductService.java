package com.jun.spring.product;

import org.springframework.stereotype.Service;
import java.util.Random;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private  final ProductRepository productRepository;



    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<ProductEntity> getProducts(){
        return productRepository.findAll();
    }


    public ProductEntity getProductId(Long id) throws Exception {
        Optional<ProductEntity> index= productRepository.findById(id);

        index.orElseThrow(() -> new Exception("찾을 수 없는 상품입니다."));

        return index.get();
    }


    public List<ProductEntity> findByNameOrderByPriceDesc( String name){
        return productRepository.findByNameOrderByPriceDesc(name);
    }


    public String saveProducts(ProductEntity productEntity) throws Exception {
        if(productRepository.existsById(productEntity.id)){
            throw new Exception("상품등록에 실패했습니다.");
        }
        productRepository.save(productEntity);
        return "성공";

    }

    public List<ProductEntity> getFindByNameAndPrice(String name, int price){
        return productRepository.findByNameAndPrice(name,price);
    }

    public String saveRandomIdProducts(Product product){
        Random random = new Random();

        while (true){
            long idNum= random.nextInt(1000);
            if(!productRepository.existsById(idNum)){
                ProductEntity index = new ProductEntity(idNum,product.name,product.price);
                productRepository.save(index);
                return index+" - 성공";
            }
        }
    }
}
