
public class DAY_2MoveZeroesToEnd 
{
        public static void main(String[] args)
    {
        int arr[]={1,0,7,4,5,0,8,3,2,0,5,3,0};
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[c]=arr[i];
                c++;
            }
        }
        while(c<arr.length)
        {
            arr[c]=0;
            c++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}