public class Main {
    public void main(String[] args){
        Shelves vgu = new Shelves();
        Book books = new Book("J. K. Rowling", "June 1997", "Harry Porter", 20);
        Devices iot = new Devices("Iphone 17", 18112005, "Mobile Phone", 11);
//        vgu.addItem("HoangVu", 1);  -> Disable since we tern Item into abstract class -> no more instance
        vgu.addItem(books);
        vgu.addItem(iot);
        vgu.showItems();
        // Take note about Abstract Interface -> it is not Inheritance (extends)
        // It just mean that some common things must be applied for all classes (here is item)
        // Example:
        books.greetings(); // This could be common things between class where the hierarchical order is not clear
        // Then we apply abstract (Interface)
    }
}