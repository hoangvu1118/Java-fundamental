import java.util.ArrayList;

public class Shelves {
    private ArrayList<Item> items;

    public Shelves(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){ // Abstraction -> Method
        items.add(item);
    }
    // Compile time Polymorphism
//    public void addItem(String name, int quantity){ // remember Operator Overloading
//        items.add(new Item(name, quantity));
//    } --> Ignore it since we turn Item into abstract class -> no more instance create
    // Runtime Polymorphism
    public void showItems(){
        for(Item item : items){
            item.displayInfo();
        }
    }

}
