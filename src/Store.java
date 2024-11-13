import java.util.ArrayList;

public class Store {

    private String location;
    private ArrayList<CISItem> cisItems = new ArrayList<CISItem>();

    public void addBook(Book book){
        cisItems.add(book);
    }

    public void addPhone(Phone phone){
        cisItems.add(phone);
    }

    public CISItem getItem(int i){
        return cisItems.get(i);
    }
    public void updatePhonesLocation(String location){
        for (CISItem item : cisItems){
            if (item instanceof Phone){
                item.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phones = new ArrayList<Phone>();
        for (CISItem item : cisItems){
            if (item instanceof Phone){
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    public ArrayList<CISItem> getItems(String type){
        ArrayList<CISItem> result = new ArrayList<CISItem>();
        for (CISItem item : cisItems){
            if (item.getClass().getSimpleName().equals(type)){   //if the item is of the inputted type
                result.add(item);
            }
        }
        return result;
    }


    public void updateItems(String itemType, String property, String value){
        for (CISItem item : cisItems){
            if (item.getClass().getSimpleName().equals(itemType)) {
                switch (property) {
                    case "location":
                        item.setLocation(value);
                        break;
                    case "description":
                        item.setDescription(value);
                        break;
                    case "price":
                        item.setPrice(Integer.parseInt(value));
                        break;
                    case "name":
                        item.setName(value);
                        break;
                    case "author":
                        if (item instanceof ReadingItem){
                            ((ReadingItem) item).setAuthor(value);
                        }
                        break;
                    case "wordCount":
                        if (item instanceof ReadingItem){
                            ((ReadingItem) item).setWordCount(Integer.parseInt(value));
                        }
                        break;
                    case "datePublished":
                        if (item instanceof ReadingItem){
                            ((ReadingItem) item).setDatePublished(value);
                        }
                        break;
                    case "title":
                        if (item instanceof Book) {
                            ((Book) item).setTitle(value);
                        }
                        break;
                    case "isbn":
                        if (item instanceof Book){
                            ((Book) item).setIsbn(value);
                        }
                        break;
                    case "edition":
                        if (item instanceof Book){
                            ((Book) item).setEdition(value);
                        }
                        break;
                    case "printDate":
                        if (item instanceof Magazine){
                            ((Magazine) item).setPrintDate(value);
                        }
                        break;
                    case "coverStoryTitle":
                        if (item instanceof Magazine){
                            ((Magazine) item).setCoverStoryTitle(value);
                        }
                        break;
                    case "storageCapacity":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setStorageCapacity(Integer.parseInt(value));
                        }
                        break;
                    case "model":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setModel(value);
                        }
                        break;
                    case "maker":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setMaker(value);
                        }
                        break;
                    case "operatingSystem":
                        if (item instanceof ElectronicItem) {
                            ((ElectronicItem) item).setOperatingSystem(value);
                        }
                        break;
                    case "networkType":
                        if (item instanceof Phone) {
                            ((Phone) item).setNetworkType(value);
                        }
                        break;
                    case "screenSize":
                        if (item instanceof Phone) {
                            ((Phone) item).setScreenSize(Integer.parseInt(value));
                        }
                        break;
                    case "version":
                        if (item instanceof Arduino) {
                            ((Arduino) item).setVersion(value);
                        }
                        break;
                }
            }

        }

    }

    public void showAllInfo(){
        for (CISItem item : cisItems){
            System.out.println(item);
            System.out.println("------------------------------------------");
        }
    }
}
