import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

   //     switch (fruit){
//            case "Mango":
//                System.out.println("king of fruits");
//                break;
//            case "Apple":
//                System.out.println("a sweet round fruit");
//                break;
//            case "Orange":
//                System.out.println("round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Enter the valid fruit name");

           // OR

//            switch (fruit) {
//                case "Mango" -> System.out.println("king of fruits");
//                case "Apple" -> System.out.println("a sweet round fruit");
//                case "Orange" -> System.out.println("round fruit");
//                case "Grapes" -> System.out.println("Small fruit");
//                default -> System.out.println("Enter the valid fruit name");
//            }

                                 //DAY

//            switch (day) = in.nextInt();
//            switch(day){
//                case 1 -> System.out.println("Monday");
//                case 2 -> System.out.println("Tuesday");
//                case 3 -> System.out.println("Wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("Saturday");
//                case 7 -> System.out.println("Sunday");

       //     }
                             //WEEKDAYS AND WEEKENDS
//              switch(day){
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//        case 5:
//            System.out.println("Weekdays");
//            break;
//        case 6:
//        case 7:
//            System.out.println("Weekends");
//            break;
//    }
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}