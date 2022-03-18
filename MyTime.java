package MyTime;

public class MyTime {

    private int hour   =0;
    private int minute =0;
    private int second =0;

    public MyTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second){
        this.hour =hour;
        this.minute =minute;
        this.second =second;
    }

    public void SetTime(int hour,int minute, int second){
        this.hour =hour;
        this.minute =minute;
        this.second =second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getminute(){
        return this.minute;
    }

    public int getsecond(){
        return this.second;
    }


    public void setHour(int hour){
        this.hour = hour;
    }

    public void setminute(int minute){
         this.minute=minute;
    }

    public void setsecond(int second){
            this.second=second;
    }

    public String toString(){
        return "HH:MM:SS with leading zeros,e.g.,"+this.hour+':'+this.minute+':'+this.second;
    }

    public MyTime nextSecond(){
        if(this.second == 59){
            this.second = 00;
            this.minute+=01;
        }
        else{
            this.second+=01;
        }
        return this;
    }

    public MyTime nextMinute(){
        if(this.minute == 59){
            this.minute = 00;
            this.hour+=01;
        }
        else{
            this.minute+=01;
        }
        return this;
    }

    public MyTime nextHour(){
        if(this.hour == 23){
            this.hour = 00;
        }
        else{
            this.hour+=01;
        }
        return this;
    }

    public MyTime previousSecond(){
        if(this.second == 00){
            this.second = 59;
            this.minute-=01;
        }
        else{
            this.second-=01;
        }
        return this;
    }


    public MyTime previousMinute(){
        if(this.minute == 00){
            this.minute = 59;
            this.hour-=01;
        }
        else{
            this.minute-=01;
        }
        return this;
    }


    public MyTime previousHour(){
        if(this.hour == 00){
            this.hour = 23;
        }
        else{
            this.hour-=01;
        }
        return this;
    }




}
