package Controlflowexample;

public class StringSwitchDemo {
	int i;
	 
    public static void printMyName() {
        System.out.println("Ketan");
    }
 
    public static int getMonthNumber(String month) {//February, february
 
    //  getMonthNumber();
        int monthNumber = 0;
 
        if (month == null) {
            return monthNumber;
        }
        //getMonthNumber(month);
        switch (month.toLowerCase()) {//JANUARY
        case "january":
            monthNumber = 1;
            break;
        case "february":
            monthNumber = 2;
            break;
        case "march":
            monthNumber = 3;
            break;
        case "april":
            monthNumber = 4;
            break;
        case "may":
            monthNumber = 5;
            break;
        case "june":
            monthNumber = 6;
            break;
        case "july":
            monthNumber = 7;
            break;
        case "august":
            monthNumber = 8;
            break;
        case "september":
            monthNumber = 9;
            break;
        case "october":
            monthNumber = 10;
            break;
        case "november":
            monthNumber = 11;
            break;
        case "december":
            monthNumber = 12;
            break;
        default:
            monthNumber = 0;
            break;
        }
 
        return monthNumber;
        // int j;
    }
 
    public static void main(String[] args) {
 
        String month = "March";
        int returnedMonthNumber;
        returnedMonthNumber = getMonthNumber(month);
 
        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
        month = "January";
        int returnedMonthNumber2 = getMonthNumber(month);
 
        if (returnedMonthNumber2 == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber2);
        }
        printMyName();
 
        month = "FEBRUARY";
        getMonthNumber(month);//You can call and not store even if method returns 
        if (getMonthNumber(month) == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(getMonthNumber(month));
        }
        System.out.println();
    //  System.out.println(printMyName());
 
    }
}