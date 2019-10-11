public class WrappersDelight {
    int num1 = 14;
    Integer num2 = new Integer(8);
    double num3 = 2.5;
    double num4 = num2 + num3;

    public int getNum1(double num1) {
        num1 = (double)num2 + num4;
        System.out.println(num1);
        return (int) num1;
    }
    public Integer getNum2(int num2) {
        num2 = 5;
        System.out.println(num2);
        return num2;
    }
    public double getNum3(double  num3) {
        num3 = num1 + num2 + num4;
        System.out.println(num3);
        System.out.println(num4);
        return num3;
    }




    }

