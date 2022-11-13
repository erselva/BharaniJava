package encapsulation;

public class Book {

    private int id;
    private String title;
    private boolean borrowed;

    //Getter method
    public int getId() {
      return this.id;
    }

    //Setter method
    public void setId(int id) {
        //check the id and store in this.id
        if (id < 1000 || id > 2000) {
            System.out.println("wrong value; get out");
            return;
        }
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    protected void borrow() {
        borrowed = true;
        System.out.println("Borrowed");
    }

    public static void main(String[] args) {

        Book book = new Book();
        book.setId(1);
        book.borrow();
    }

}
