package br.newton.paiva;

public class DataTest {
    public static void main(String[] args){
        Date d = new Date( 17,  03,  2019);
        System.out.println(d);

        try {
            Date derro = new Date( 17,  03,  2019);
        } catch (IllegalArgumentException e){
            System.out.println("Mes 0:" + e.getMessage());
        }

        try {
            Date derro = new Date( 17,  13,  2019);
        } catch (IllegalArgumentException e){
            System.out.println("Mes 13:" + e.getMessage());
        }
    }
}
