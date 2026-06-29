import java.util.Arrays;
class Product{
    int id;
    String PName;
    String category;
    Product(int id, String name, String cat){
        this.id = id;
        this.PName = name;
        this.category = cat;
    }
}

class LinearSearch{
    public void linearSearch(Product[] prodList, int pid){
        for (Product prod:prodList){
            if (prod.id == pid){
                System.out.println("Product ID: " + prod.id);
                System.out.println("Product Name: " + prod.PName);
                System.out.println("Product Category: " + prod.category);
                return;
            }
        }
        System.out.println("Product Not Found");
    }
}

class BinarySearch{
    public void binarySearch(Product[] prodList, int pid){
        int left = 0;
        int right = prodList.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (prodList[mid].id == pid){
                System.out.println("Product ID: " + prodList[mid].id);
                System.out.println("Product Name: " + prodList[mid].PName);
                System.out.println("Product Category: " + prodList[mid].category);
                return;
            } else if (prodList[mid].id < pid){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Product Not Found");
    }
}

/**
 * SearchingAlgo
 */
public class SearchingAlgo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Bag", "Fashion"),
            new Product(101, "Shoes", "Fashion"),
            new Product(105, "Watch", "Accessories"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "Laptop", "Electronics")
        };
        int target = 102;
        System.out.println("Implementation of Linear Search");
        LinearSearch search1 = new LinearSearch();
        search1.linearSearch(products,target);
        System.out.println("\nImplementation of Binary Search");
        BinarySearch search2 = new BinarySearch();
        Arrays.sort(products, (a,b) -> a.id - b.id);
        search2.binarySearch(products, target);
    }
}