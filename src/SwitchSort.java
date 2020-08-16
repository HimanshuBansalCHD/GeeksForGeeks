import java.util.Scanner;

public class SwitchSort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int Switchsort(int[] arr,int n){
        int steps=0;
        if(isSorted(arr)){
            return 0;
        }
        int i=0;
        while(i<n){
            if(i+1 == arr[i]) {
                i += 1;
            }
            else if(arr[i] == n) {
                i += 1;
            }
            else if(arr[i]-1 == ((i+arr[i])%n)){
                swap(arr,i,((i+arr[i])%n));
                steps++;
                i=0;
            }
            else if(arr[i]-1 == ((i-arr[i])%n)){
                swap(arr,i,((i-arr[i])%n));
                steps++;
                i=0;
            }
            else{
                i+=1;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Switchsort(arr,n));
    }
}
