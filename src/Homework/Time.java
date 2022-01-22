package Homework;

public class Time {
        // ALL IMPLEMEANTATION HERE
        int hour;
        int minute;
        int second;
        int month;
        int year;
        public Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public Time(int month, int year){
            this.month = month;
            this.year = year;
        }
        public Time(int hour, int minute, int second, int month, int year){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.month = month;
            this.year = year;
        }
        public int getHour(){

            return hour;
        }
        public int getMinute(){
            return minute;
        }
        public int getSecond(){
            return second;
        }
        public int getMonth(){
            return month;
        }
        public int getYear(){
            return year;
        }
        public void setHour(int hour){
            this.hour = hour;
            if(hour<0 || hour>24){
                hour = 0;
            }
        }
        public void setMinute(int minute){
            this.minute = minute;
            if(minute<0 || hour>60){
                minute = 0;
            }
        }
        public void setSecond(int second){
            this.second = second;
            if(second<0 || second>60){
                second = 0;
            }
        }
        public void setMonth(){
            this.month = month;
            if(month<0 || month>12){
                month = 0;
            }
        }
        public void setYear(){
            this.year = year;
            if(year<0){
                year = 0;
            }
        }
        public String amPm(int hour){
            if(hour<12){
                return "am";
            }else{
                return "pm";
            }
        }
        public String season(int month){

            switch (month) {
                case 12:
                    return "Winter";

                case 1:
                    return "Winter";

                case 2:
                    return "Winter";

                case 3:
                    return "Spring";

                case 4:
                    return "Spring";

                case 5:
                    return "Spring";

                case 6:
                    return "Summer";

                case 7:
                    return "Summer";

                case 8:
                    return "Summer";

                case 9:
                    return "Fall";

                case 10:
                    return "Fall";

                case 11:
                    return "Fall";

                default:
                    return "No Season Found";

            }
        }
        public String timeInfo(){
            return hour+":"+minute+":"+second;
        }
        public String date(){
            return month+"/"+year;
        }
        public String toString(){
            return hour+":"+minute+ ":" + second+" - "+month+"/"+year;
        }
    }
