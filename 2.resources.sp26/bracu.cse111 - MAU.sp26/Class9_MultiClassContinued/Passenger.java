public class Passenger
{
  private String location;
  private String date;
  public String seat;
  public String ticketID;
  public Passenger(String loc, String date, String seat)
  {
    location = loc;
    this.date = date;
    this.seat = seat;
    ticketID = location+"-"+seat;
  }
  public Passenger(String date, String seat)
  {
    this.date = date;
    this.seat = seat;
//    this("Default", date, seat);
  }
  public String getLocation()
  {
    return location;
  }
  public String getDate()
  {
    return date;
  }
  public String setLocation(String newLoc)
  {
    location = newLoc;
    ticketID = location+"-"+seat;
    return "Location has been set. Ticket ID also generated.";
  }
}
class Bus
{
  public String name;
  public String [] locations;
  public Bus(String n, String [] l)
  {
    name = n;
    locations = l;
  }
  public void boardBus(Passenger obj)  
  {
    boolean flag = false;  
    if (obj.ticketID == null)  
    {
      System.out.println("Without a ticket ID, you cannot board the bus. Set a location to get the ticket ID.");
    }
    else {  
      for (int i =0; i< locations.length; i++)  
      {
        if (locations[i].equals(obj.getLocation()))  
        {
          System.out.printf("%s bus will stop at %s. Successfully boarded the bus. \n", name, obj.getLocation());
          System.out.println("Journey date: "+  obj.getDate());  
          System.out.println("Ticket ID: "+ obj.ticketID);
          System.out.println("Seat no: "+ obj.seat);
          flag = true;
        }
      }
      if (!flag)  
      {
        System.out.printf("%s bus does not stop at %s. Cannot board.\n", name, obj.getLocation());
      }
    }
  }
  
  public void boardBus(Passenger obj1, Passenger obj2)
  {
    boardBus(obj1);
    boardBus(obj2);
  }
}



















