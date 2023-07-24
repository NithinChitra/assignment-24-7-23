import java.util.*;

class CummulativeMultiple{
    public static void main(String[] args){
        int[] input_arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter Values:");
        //taking input
        for(int i=0;i<n;i++){
            input_arr[i]=sc.nextInt();
        }
        //calculating
        for(int i=1;i<n;i++){
            input_arr[i]=input_arr[i]*input_arr[i-1];
        }
        //to display
        for(int i=0;i<n;i++){
            System.out.print(input_arr[i]+" ");
        }
    }
}