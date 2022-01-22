package PrimitiveTypes;

public class CastingPractice2
{

    public static void main(String[] args) {

        double number = 3.45;

        float fl1 = (float)number;

        long l1 = (long)fl1;

        int i1 = (int)l1;

        short sh1 = (short)i1;

        byte by1 = (byte)sh1;

        System.out.println(by1);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println();


        int count = 129;
        byte count2 = (byte)count;

        System.out.println("Count is in the int type: " +count); // 129

        System.out.println("Count is in byte type: " + count2); // 130, result is actually -126
        // because it loops back to min value for that data type. Because it already reached Max value for that data type.



    }
}
