public class TestPowerBoat
{
    public static void main(String[] args)
    {
        System.out.println("Power boat:");
        PowerBoat myBoat=new PowerBoat("yellow",20,20);
        System.out.println(myBoat.toString());
        System.out.println("Setting Power boat's engine size to 500.");
        myBoat.setEngineSize(500);
    }
}