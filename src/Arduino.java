public class Arduino extends ElectronicItem{
    private String version;

    public Arduino(String version){
        this.version = version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String toString(){
        return "\nName: " + this.getName() + ", Location: " + this.getLocation() + ", Price: " + this.getPrice() + ", Description: " + this.getDescription() + "Arduino Version: " + version + ", Storage Capacity: " + this.getStorageCapacity() + ", Model: " + this.getModel() + ", Maker: " + this.getMaker() + ", Operating System: " + this.getOperatingSystem();
    }
}
