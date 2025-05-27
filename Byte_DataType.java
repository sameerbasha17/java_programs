public class Byte_DataType {
    public static void main (String [] args)
    {
        byte a=100;
        byte b= 27;
        byte c=28;// byte range -128 to 127 it repeats...
        byte d;
        d=(byte)(a+b);
        byte e =(byte)(a+c);

        System.out.println("a+b = "+ d);
        System.out.println("a+c = "+ e);
    }
}


