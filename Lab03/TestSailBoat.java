public class TestSailBoat
{
    public static void main(String[] args)
    {
        System.out.println("Sailboat:");
        SailBoat myBoat=new SailBoat("red",25,2);
        System.out.println(myBoat.toString());
        System.out.println("Changing Sailboat's color to purple.");
        myBoat.setColor("purple");
        System.out.println("Changing Sailboat's length to 55");
        myBoat.setLength(55);
    }
}