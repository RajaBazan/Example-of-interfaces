package hello.com;
interface MyCamera{
    void takeSnaps();
    void RecordVideo();
}
interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void CallNumber(long PhoneNumber){
        System.out.println("Calling: " + PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting..");
    }

}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnaps(){
        System.out.println("Taking snap");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recording a video");
    }
    public String[] getNetwork() {
        String[] networkList = {"Bazan", "Ali", "Ahmed"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }}
public class Lec_57_Example_Interface_and_defaultMethods {
    public static void main(String[] args) {
    MySmartPhone ms = new MySmartPhone();
    String [] ar = ms.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }
        ms.takeSnaps();
        ms.RecordVideo();
        ms.CallNumber(1913862866);
    }
}
