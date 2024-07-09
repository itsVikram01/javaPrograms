package java_codes.zavaprogram;

public class Sharu{

    public static void main(String args[])
    {
        //System.out.println("hello");
        int[] ar= new int[]{1,0,3,4,0,0,5,0,6};

        int i=0,j=0;
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]!=0)
            {
                ar[j++]=ar[i];
            }
        }
        for(i=0;i< ar.length;i++)
        {
            if (i>j)
            {
                ar[i]=0;
            }
            System.out.println(ar[i]);
        }
    }

}
