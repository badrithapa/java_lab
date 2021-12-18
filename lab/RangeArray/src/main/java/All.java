import java.util.*;

public class All {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isAllPossibilities(arr));

    }
    static int isAllPossibilities(int []ar){
        int n = ar.length;
        //convert array into list in int[]into list<int> not List<int[]>
        List<Integer> list = new ArrayList<Integer>(n);
        for(int x:ar){
            list.add(x);
        }

        int flag = 1;
        for(int i=0;i<n;i++){
            if(!list.contains(i)) {
                flag=0;
                break;
            }
        }
        return flag;
    }
}
