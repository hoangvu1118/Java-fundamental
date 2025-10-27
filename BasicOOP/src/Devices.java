public class Devices extends Item{
    private String deviceName;
    private int code;
    public Devices(String deviceName, int code, String name, int quantity){
        super(name, quantity);
        this.deviceName = deviceName;
        this.code = code;
    }
    public String getDeviceName(){
        return deviceName;
    }
    public int getCode(){
        return code;
    }
    @Override
    public void displayInfo(){
        System.out.println("Device: " + deviceName + "Code: " + code + "Name: " + getName() + "Quantity: " + getQuantity());
    }
}
