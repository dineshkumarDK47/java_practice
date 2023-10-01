import java.util.*;

class practice{
    static int insertmid(int[] arr, int index, int value){
        for(int i=arr.length-1;i>index;i--){
                arr[i]=arr[i-1];
        }
        arr[index] = value;
        printarr(arr);
        return 0;
    }
    static int deletemid(int[] arr, int index1){
        for(int i=0;i<index1;i++){
            arr[i] = arr[i+1];
        }
        arr[index1] = 0;
        printarr(arr);
        return 0;
    }

        static int findvalue(int[] arr, int k){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                    System.out.println("element founded : "+ arr[i] + "at index no: "+i);
                }
            }
            return 0;
        }
    static int printarr(int[] arr){
        System.out.println("values in array");
         for(int j=0;j<arr.length;j++){
             System.out.print(arr[j]+" ");
         }
             System.out.print("\n");
        //   for(int j=arr.length-1;j>=0;j--){
        //      System.out.print(arr[j]);
        //  }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("enter the values in array");
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        arr[0] = 6;
        arr[1] = 4;
        arr[2] = 7;
        int k=6;
        //printarr(arr);
        findvalue(arr,k);

        //insertng at mid of array :
        int index = 1;
        int value = 5;
        insertmid(arr, index, value);

        //delete at mid :
        int index1 = 2;
        deletemid(arr, index1);
         sc.close();
    }
}