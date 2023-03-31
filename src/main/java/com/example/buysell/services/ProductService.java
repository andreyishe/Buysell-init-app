package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product("Ps5", "Simple descriptio", 1500, "Krakow", "Kiril", ++ID));
        products.add(new Product("Iphone 8","Simple description", 4000, "Warsaw", "Oleg",++ID));
    }

    public List<Product> listProducts(){return products;}
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);

    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
