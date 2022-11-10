import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalMoney = scan.nextInt();
        int bookAndSupplies = (int) (totalMoney * 0.75);
        double coffees = (totalMoney * 0.0825) / 2;
        double flashComputers = (totalMoney * 0.08) / 4;
        double subwayTickets = (totalMoney * 0.0825) / 3;
        double whiteRoses = (totalMoney * 0.005) ;

        int coffees1 = (int) coffees;
        int flashComputers1 = (int) flashComputers;
        int subwayTickets1 = (int) subwayTickets;
        int whiteRoses1 = (int) whiteRoses;

        System.out.println("How much did you receive money ($)? :-  " + totalMoney );
        System.out.println("Book and Supplies:-  " + bookAndSupplies );
        System.out.println("You can then buy:");
        System.out.println( coffees1 + "  Coffees");
        System.out.println( flashComputers1 + "  FlashComputers" );
        System.out.println( subwayTickets1 + "  SubwayTickets" );
        System.out.println("and you will have " + whiteRoses1 + " dollars for the white roses." );

    }
}