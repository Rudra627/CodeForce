public class Class {
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int product(int arr[]){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        return product;
    }
    public static void main(String[] args) {
          int arr2[]={1,2,3,4,5};
        // for(int i=0;i<arr2.length;i++){
        //     System.out.print(arr2[i]);
        // // }
        // // 1,2,3,4,5
        System.out.println("Sum="+sum(arr2));
        System.out.println("Product="+product(arr2));
        
    }
    }

