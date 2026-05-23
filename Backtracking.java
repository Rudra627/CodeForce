class Backtracking {
    public static void printarr(int arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void changeArr(int arr[],int i,int val){
        if(i==arr.length){
            printarr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
  public static void main(String[] args) {
    
  }
}