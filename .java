import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        
        
        int[] arr = new int[5];
        
        
        for(int i =0;i<5;i++){
            arr[i] = ss.nextInt();
        }
        
        System.out.println(arr[0]);
        System.out.println(arr[2]);
    }
}
