public class WhatsappGroup
{
  String group_name;
  String [] members = new String[5];
  int index = 0;
  public void add_members(String name)
  {
    if(index < members.length)
    {
      members[index++] = name;
      System.out.println("A member has been successfully added");
    }
    else
    {
      System.out.println("Cannot be added. Sorry");
    }
  }
  public String display()
  {
    String data = group_name + "\n";
    for(int i =0; i<index; i++)
    {
      data += members[i]+"\n"; //if last member, add without \n. if i ==index - 1
    }
    return data;
  }
  public boolean check(String nm)
  {
    for(int i =0; i<index; i++)
    {
      if(members[i].equals(nm))
      {
        return true;
      }
    }
    return false;
  }
  public void send_message(String s1, String s2)
  {
    if(check(s1))
    {
      System.out.println(s1+" can send a message. He wants to say "+s2);
    }
    else
    {
      System.out.println(s1+" cannot send a message.");
    }
  }
}