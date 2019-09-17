public class MyDate {
    private int day;
    private int month;
    private int year;
 
    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
 
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
 
    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
 
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
 
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
 
        return false;
    }
 
    public int differenceInYears(MyDate compared) {
        if (this.earlier(compared)) {
            return differenceWhenThisEarlier(compared);
        }
         
        int minusOneYear = 0;
        if (this.month < compared.month) {
            minusOneYear = 1; 
        } else if (this.month == compared.month && this.day < compared.day) {
            minusOneYear = 1; 
        }
 
        return this.year - compared.year - minusOneYear;
    }
 
    private int differenceWhenThisEarlier(MyDate compared) {
        int minusOneYear = 0;
 
        if (compared.month < this.month) {
            minusOneYear = 1;
        } else if (compared.month == this.month && compared.day < this.day) {
            minusOneYear = 1;
        }
 
        return compared.year - this.year - minusOneYear;
    }    
    
}