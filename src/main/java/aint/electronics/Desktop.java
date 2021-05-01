package aint.electronics;

public class Desktop {

    public Device deviceName;

    public Desktop(){}
    public Desktop(Device deviceName){
        this.deviceName = deviceName;
    }
    public Device getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(Device deviceName) {
        this.deviceName = deviceName;
    }

    public void deviceConfig(){
        System.out.println("Device Spec:> Monitor: " + deviceName.getDeviceMonitorSize()+ " Ram: "+deviceName.getDeviceRamSize());
    }
}
