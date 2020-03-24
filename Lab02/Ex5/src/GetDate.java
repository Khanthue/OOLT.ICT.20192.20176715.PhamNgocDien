import java.util.Scanner;
public class GetDate {

  public static void main( String[] strings) {

        Scanner scanner = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month: ");
        String month = scanner.nextLine();

        System.out.print("Input a year: ");
        int year = Interger.parseInt(scanner.nextLine());
        switch (month) {
            case "January": case "Jan.": case "1":
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case "February": case "Feb.": case "2":
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case "March": case "Mar.": case "3":
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case "April": case "Apr.": case "4":
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case "May": case "5":
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case "June": case "Jun.": case "6":
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case "July": case "Jul.": case "7":
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case "August": case "Aug.": case "8":
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case "September": case "Sep.": case "9":
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case"October": case "Oct.": case "10":
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case "November": case "Nov.": case "11":
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case "December": case "Dec.": case "12":
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}