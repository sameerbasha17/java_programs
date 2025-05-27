public class Short_DataType {
    public static void main (String [] args)
    {
        short s1 = 32000;                             // The range of short is -32768 to 32767
        short s2 =767;
        short s3 =768; 
        short sum1 = (short)(s1+s2);
        short sum2 = (short)(s1+s3);
        System.out.println("Sum1 = "+ sum1);
        System.out.println("Sum2 = "+ sum2);
        System.out.println("Sum3 = " +(s1+s3));             
        System.out.println("Don't forget that : "+s1+s3);
    }
}
