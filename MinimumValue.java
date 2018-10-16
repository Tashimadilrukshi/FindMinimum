import java.util.Scanner;
class MinimumValue
{
    static int n;
    static double min=0;
    
    public static double findMinimum(double arr[]){
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
         n = s.nextInt();

        double[] arr = new double[n];
        
        //get values to the array
        for(int i=0;i<n;i++){
            arr[i]=s.nextDouble();
        }

        System.out.println("Minimum number is "+findMinimum(arr));
    }
}

