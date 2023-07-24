import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        int[] input_arr = new int[30];
        int[] checking_arr = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array:");
        int n = sc.nextInt();
        System.out.print("Enter Values:");
        //taking input
        for(int i=0;i<n;i++){
            input_arr[i]=sc.nextInt();
        }
        int first = input_arr[0];
        int i = 1;
        while(i<n){
            if(input_arr[i]==first+1){
                first+=1;
                i+=1;
                continue;
            }
            else{
                first+=1;
                while(first<input_arr[i]){
                    System.out.println(first+" ");
                    first+=1;
                }
            }
            i+=1;
        }
    }
}
