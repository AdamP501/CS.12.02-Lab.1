public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;

    private String name;

    public Phone(String name, String networkType, int screenSize){
        this.networkType = networkType;
        this.screenSize = screenSize;
        this.name = name;
    }

    public String toString(){
        return "\nName: " + this.getName() + ", Location: " + this.getLocation() + ", Price: " + this.getPrice() + ", Description: " + this.getDescription() + ", Phone Name: " + name + ", Network Type:" + networkType + ", Screen size: " + screenSize + ", Storage Capacity: " + this.getStorageCapacity() + ", Model: " + this.getModel() + ", Maker: " + this.getMaker() + ", Operating System: " + this.getOperatingSystem();
    }

    public void setNetworkType(String networkType){
        this.networkType = networkType;
    }

    public void setName(){
        this.name = name;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize(){
        return screenSize;
    }


}
