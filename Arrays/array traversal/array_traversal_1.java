//array traversal
import java.util.*;
public class array_traversal_1 {
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i =0;i<n;i++){
        a[i]=sc.nextInt();
    }
    sum(a);
    System.out.println();
    prod(a);
    System.out.println();
    even(a);
    System.out.println();
    odd(a);
    System.out.println();
    evenr(a);
    System.out.println();
    oddr(a);
    System.out.println();
    checkprime(a);
    System.out.println();
    sc.close();

}
//1. elements at even index
public static void even(int[] a){
    for(int i=0;i<a.length;i++){
        if(i%2==0){
            System.out.print(a[i]+" ");
        }
    }

}
//2. elements at odd index
public static void odd(int[] a){
    for(int i=0;i<a.length;i++){
        if(i%2!=0){
            System.out.print(a[i]+" ");
        }
    }

}
//3.even index elements in the reverse order
public static void oddr(int[] a){
    for(int i=a.length-1;i>=0;i--){
        if(i%2!=0){
            System.out.print(a[i]+" ");
        }
    }

}
//4.odd index elements in the reverse order
public static void evenr(int[] a){
    for(int i=a.length-1;i>=0;i--){
        if(i%2==0){
            System.out.print(a[i]+" ");
        }
    }

}
//5. check prime no. in the array
public static void checkprime(int[] a){
    for(int i=0;i<a.length;i++){
        if(check(a[i])){
            System.out.print(a[i]+" ");
        }
    }

}
public static boolean check(int a){
    if(a<=1)
        return false;
    for(int i=2;i<=a/2;i++){
        if(a%i==0){
            return false;
        }
    }
    return true;
}
//6. sum of all elements
public static void sum(int[] a){
    int sum=0;
    for(int i=0;i<a.length;i++){
        
      sum=sum+  a[i];
        
    }
    System.out.println(sum);

}

//7.prod of array
public static void prod(int[] a){
    int p=1;
    for(int i=0;i<a.length;i++){
        
      p=p*a[i];
        
    }
    System.out.println(sum);

}
}
