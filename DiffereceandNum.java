import java.util.*;
public class DiffereceandNum
{
    public int findCount (int arr[], int length, int num, int diff) 
    {
        int count = 0;
        for (int i = 0; i < length; i++)
        {
            if (Math.abs (num - arr[i]) <= diff)
                count++;
        }
        return count>0?count:-1;
    }
    
    public static void main (String[]args) 
    {
        DiffereceandNum obj=new DiffereceandNum();
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        int num = sc.nextInt ();
        int diff = sc.nextInt ();
        int result=obj.findCount(arr,n,num,diff);
        System.out.println(result);

        
    } 
} 