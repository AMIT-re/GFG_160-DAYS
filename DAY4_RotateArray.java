public class DAY4_RotateArray {
    public static void reverse(int arr[],int low,int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        

    }
}
