package github.lucasas.ugeopgave.opgave2;

import java.util.Arrays;
import java.util.Comparator;

public class ProductMain {
    void main() {
        Product product1 = new Product("Kaffemaskine", 123, new String[]{"sale", "electronics"});
        Product product2 = new Product("Iphone", 10000, new String[]{"sale", "overpriced", "new"});
        Product product3 = new Product("Vand", 2, new String[]{"Water", "Toilet"});
        Product[] products = {product1, product2, product3};
        printSaleProducts(products);
        printMostExpensive(products);
    }

    private void printSaleProducts(Product[] products) {
        Arrays.stream(products)
                .filter(product -> product.hasTag("sale"))
                .forEach(Product::printInfo);
    }

    private void printMostExpensive(Product[] products) {
        Arrays.stream(products)
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow()
                .printInfo();
    }
}
