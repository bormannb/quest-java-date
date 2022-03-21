import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        
// A date formatted as "month-day-year", ex:04-22-2019 The day of the week corresponding to the date, ex:2

// Concatenates texts_"The date is: "_ and_"The day of week is:"_ in front of the corresponding data, 
// before displaying them in the terminal.

//Using simpleDateFormat --Aus der Questbeschreibung--

SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
Calendar c = new GregorianCalendar(year, month-1, day);
Date d = c.getTime();

// 


//
int dayWeek = c.get(Calendar.DAY_OF_WEEK);

System.out.println("The date is: " + sdf.format(d));
System.out.println("The day of week is " + dayWeek);
    }

}