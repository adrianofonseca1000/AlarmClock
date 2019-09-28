package br.newton.paiva;

public class Time {

    private Integer hour, minute, second;

    public Time() {

        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(Time a) {
        this.hour = a.hour;
        this.minute = a.minute;
        this.second = a.second;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public void setTime(Integer hour, Integer minute, Integer second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
        public void setHour ( int hour){
            if (hour < 0 || hour > 23) {
                throw new IllegalArgumentException("Hora Invalida");
            }
            this.hour = hour;
        }


        public void setMinute ( int minute){
            if (hour < 0 || hour > 59) {
                throw new IllegalArgumentException("Minuto invalido");
            }
            this.minute = minute;
        }

        public void setsecond ( int second){
            if (hour < 0 || hour > 59) {
                throw new IllegalArgumentException("Segundo Invalido");
            }
            this.second = second;
        }

        public String toUniversalString () {
            return String.format("%02d: %02d: %02d:", hour, minute, second);
        }

        public String toString () {
            var horaDoze = (hour == 0 || hour == 12) ? 12 : hour % 12;
            var pos = (hour >= 12) ? "PM" : "AM";

            return String.format("%02d: %02d: %02d %s",
                    horaDoze, minute, pos);
    }
}

