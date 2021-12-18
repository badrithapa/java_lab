import java.util.*;
import java.io.*;


public class Balanced {
    public static int isBalanced(int []a){
        int flag = 1,i;
        int n = a.length;
        for(i = 0; i < n; i += 2){
            if(a[i] % 2 != 0){
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            for (i = 1; i < n; i += 2) {
                if (a[i] % 2 != 1) {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String []args)
    {
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No. of element you want in the array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i=0; i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        System.out.println(isBalanced(a));
    }
}
