import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.println(arr[i]+" "+arr[j]);
                count++;
            }
        }
        if(count==0){
            System.out.print("None");
        }
        // Your code here
    }
}