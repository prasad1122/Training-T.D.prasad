class Mobile
{
int Model_number;
String Model_name;
String Model_color;
String SIM_type;
String Internal_Storage;
String RAM;
int Primary_camera;
String Processor_core;
String Primary_Clock;

Float Bluetooth_version;



}
public class Pocom2
{
public static void main(String args[])
{
Mobile version=new Mobile();
version.Model_number=6;
version.Model_name="M2";
version.Model_color="Slate Blue";
version.SIM_type="Dual SIm";
version.Internal_Storage="64GB";
version.RAM="6GB";
version.Primary_camera=13;
version.Processor_core="Octa Core";
version.Primary_Clock="2GHZ";
version.Bluetooth_version=4.0f;
System.out.println("=====================pocom2 Specifications==========================");
System.out.println("model number is:"+version.Model_number);
System.out.println("model name is:"+version.Model_name);
System.out.println("model color is:"+version.Model_color);
System.out.println("sim type is:"+version.SIM_type);
System.out.println("internal storage is:"+version.Internal_Storage);
System.out.println("RAM:"+version.RAM);
System.out.println("primary camera:"+version.Primary_camera);

System.out.println("primary clock speed:"+version.Primary_Clock);
System.out.println("Bluetooth version:"+version.Bluetooth_version);

}


}