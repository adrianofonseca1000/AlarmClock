package br.newton.paiva;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();


        t.setTime(10, 11,  33);
        System.out.println(t.toUniversalString());
        System.out.println(t.toString());

        t.setTime(22, 11, 33);
        System.out.println(t.toUniversalString());
        System.out.println(t.toString());

        t.setTime(12, 11, 33);
        System.out.println(t.toUniversalString());
        System.out.println(t.toString());

        try {
            t.setTime(-1, 11, 33);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
