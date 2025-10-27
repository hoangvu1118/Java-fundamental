public class Book extends Item implements ItemStuff{
    private String author; // Encapsulation
    private String releaseDate;
    private String greet = "hello";

    public Book(String author, String releaseDate, String name, int quantity){
        super(name, quantity); // Inheritance
        this.author = author;
        this.releaseDate = releaseDate;
    }

    @Override
    public void greetings(){
        System.out.println(greet);
    }
    public String getAuthor(){
        return author;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    @Override // Polymorphism
    public void displayInfo(){
        System.out.println("Author: " + author + "\n Release: " + releaseDate + "\n Name: " + getName() + "\n Quantity: " + getQuantity());
    }

}

