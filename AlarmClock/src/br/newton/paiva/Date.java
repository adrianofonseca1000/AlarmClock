package br.newton.paiva;

public class Date {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if(month< 1 || month > 12)
            throw new IllegalArgumentException("Mes invalido");
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
