public class Main {

    public static Product linerSearch(Product[] products,int targetId){
        int len = products.length;

        for(int i = 0 ; i < len ; i++){
            if(targetId == products[i].getProductId()){
                return products[i];
            }
        }

        return null;

        /*
        Time Complexity
        Best Case:
            O(1) if the element in the first place
        Average Case:
            O(n) if the element in the Middle
        Worst Case:
            O(n) if the element in the last or Not found
        */

    }

    public static Product binarySearch(Product[] products,int targetId){

        int left = 0 ;
        int right = products.length;
        int mid = left + (right - left)/2;

        while(left < right){

            mid = left + (right - left)/2;

            if(products[mid].getProductId() == targetId){

                return products[mid];

            }else if(products[mid].getProductId() > targetId){

                left = mid+1;

            }else{
                right = left - 1;
            }

        }


        return null;

        /*
        Time Complexity

        Best Case:
            O(1) if the element is in the middle
        Average Case:
            O(log n)
        Worst Case:
            O(log n)
            */
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(101,"Laptop","Electronics"),
                new Product(102,"Phone","Electronics"),
                new Product(103,"Shoes","Fashion"),
                new Product(104,"Watch","Accessories"),
                new Product(105,"Bag","Fashion")
        };


        System.out.println(binarySearch(products,106));
        System.out.println(linerSearch(products,106));

    }
}
