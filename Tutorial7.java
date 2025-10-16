package Week4;
// Tutorial7.java
class Product {
    String productName;
    int[] stockHistory;

    Product(String productName, int[] stockHistory) {
        this.productName = productName;
        this.stockHistory = stockHistory;
    }

    int stockIncrease() {
        int n = stockHistory.length;
        return stockHistory[n - 1] - stockHistory[n - 2];
    }
}

public class Tutorial7 {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptops", new int[]{50, 55, 60, 70}),
            new Product("Mobiles", new int[]{80, 85, 87, 95}),
            new Product("Tablets", new int[]{40, 42, 45, 47})
        };

        Product top = products[0];
        for (Product p : products) {
            if (p.stockIncrease() > top.stockIncrease())
                top = p;
        }

        System.out.println("Product with highest stock increase: " + top.productName);
        System.out.println("Stock increased by: " + top.stockIncrease() + " units last month");
    }
}

