public class BusTester {
   public static void main(String[] args) {
       Passenger p1 = new Passenger("Comilla", "16-03-2025", "A5");
       Passenger p2 = new Passenger("20-03-2025", "B5");
       Passenger p3 = new Passenger("Rangamati", "21-05-2025", "C2");
       System.out.println("1=================");
       String [] stops = {"Kanchpur", "Daudkandi", "Comilla", "Feni", "Chittagong"};
       Bus bus1 = new Bus("Green Line", stops);
       System.out.println("2=================");
       bus1.boardBus(p2);
       System.out.println("3=================");
       bus1.boardBus(p1);
       System.out.println("4=================");
       System.out.println(p2.setLocation("Feni"));
       System.out.println("5=================");
       bus1.boardBus(p2, p3);
   }
}

