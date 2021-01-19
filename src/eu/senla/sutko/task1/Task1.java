package eu.senla.sutko.task1;

public class Task1 {
//примитивы
    static public byte a1=12;
    static public short b1=15;
    static public int c1=17;
    static public long d1=199999999999999999L;
    static public float e1=127;
    static  public double f1=127.15;
    static public boolean g1=true;
    static public char h1='$';


    //обертки с методами get и set
    static private Byte a2;
    public static Byte getA2() {

        return a2;
    }
    public static void setA2(Byte a2) {

        Task1.a2 = a2;
    }



    static private Short b2;
    public static Short getB2() {
        return b2;
    }
    public static void setB2(Short b2) {
        Task1.b2 = b2;
    }


    static private Integer c2;
    public static Integer getC2() {
        return c2;
    }

    public static void setC2(Integer c2) {
        Task1.c2 = c2;
    }


    static private Long d2;
    public static Long getD2() {
        return d2;
    }

    public static void setD2(Long d2) {
        Task1.d2 = d2;
    }


    static private Float e2;
    public static Float getE2() {
        return e2;
    }

    public static void setE2(Float e2) {
        Task1.e2 = e2;
    }


    static private Double f2;
    public static Double getF2() {
        return f2;
    }

    public static void setF2(Double f2) {
        Task1.f2 = f2;
    }



    static private Boolean g2;
    public static Boolean getG2() {
        return g2;
    }

    public static void setG2(Boolean g2) {
        Task1.g2 = g2;
    }



    static private Character h2;
    public static Character getH2() {
        return h2;
    }

    public static void setH2(Character h2) {
        Task1.h2 = h2;
    }



    //рисваиваем значения примитивов оберткам и выводим на экран
    public static void main(String[] args) {
        setA2(a1);//с помощью метода set присваиваем значение полю А2 значение примитива А1
        System.out.println(getA2());//выводим значение поля А2




    }


}
