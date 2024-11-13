import org.junit.jupiter.api.Test;


import java.sql.SQLOutput;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class StoreTester {

    @Test
    void testBook() {
        Store testStore = new Store();
        Book harryPotter = new Book("9780439362139", "2nd", "Harry Potter and the Philosopher's Stone");
        testStore.addBook(harryPotter);

        assertEquals(1, testStore.getItems("Book").size());
    }
    @Test
    void testPhone() {
        Store testStore = new Store();
        Phone iPhone7 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone7);

        assertEquals(1, testStore.getItems("Phone").size());
    }

    @Test
    void testBookPhone() {
        Store testStore = new Store();

        Book harryPotter = new Book("9780439362139", "2nd", "Harry Potter and the Philosopher's Stone");
        testStore.addBook(harryPotter);

        Phone iPhone7 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone7);

        assertEquals(1, testStore.getItems("Book").size());
        assertEquals(1, testStore.getItems("Phone").size());
    }

    @Test
    void testUpdateAdd(){
        Store testStore = new Store();
        Phone iPhone1 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone1);

        Phone iPhone2 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone2);

        Phone iPhone3 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone3);

        testStore.updatePhonesLocation("521");
        testStore.getAllPhones();

        assertEquals("521", iPhone1.getLocation());
        assertEquals("521", iPhone2.getLocation());
        assertEquals("521", iPhone3.getLocation());

    }

    @Test
    void testGetItems(){
        Store testStore = new Store();
        Phone iPhone1 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone1);

        Phone iPhone2 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone2);

        Phone iPhone3 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone3);

        Book harryPotter1 = new Book("9780439362139", "2nd", "Harry Potter and the Philosopher's Stone");
        testStore.addBook(harryPotter1);

        Book harryPotter2 = new Book("9788831000154", "2nd", "Harry Potter and the Chamber of Secrets");
        testStore.addBook(harryPotter2);

        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        expectedBooks.add(harryPotter1);
        expectedBooks.add(harryPotter2);

        ArrayList<Phone> expectedPhones = new ArrayList<Phone>();
        expectedPhones.add(iPhone1);
        expectedPhones.add(iPhone2);
        expectedPhones.add(iPhone3);

        assertEquals(expectedBooks, testStore.getItems("Book"));
        assertEquals(expectedPhones, testStore.getItems("Phone"));
    }

    @Test
    void testUpdateItems(){
        Store testStore = new Store();
        Phone iPhone1 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone1);

        Phone iPhone2 = new Phone("iPhone7", "LTE", 50);
        testStore.addPhone(iPhone2);


        Book harryPotter1 = new Book("9780439362139", "2nd", "Harry Potter and the Philosopher's Stone");
        testStore.addBook(harryPotter1);

        Book harryPotter2 = new Book("9788831000154", "2nd", "Harry Potter and the Chamber of Secrets");
        testStore.addBook(harryPotter2);

        testStore.updateItems("Book", "location", "618");
        assertEquals("618", harryPotter1.getLocation());
        assertEquals("618", harryPotter2.getLocation());

        testStore.updateItems("Phone", "screenSize", "100");
        assertEquals(100, iPhone1.getScreenSize());
        assertEquals(100, iPhone2.getScreenSize());

    }







}


