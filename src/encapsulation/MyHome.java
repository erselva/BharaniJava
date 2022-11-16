package encapsulation;

public class MyHome {

    public String sofa; //class variables
    private String tv;

    private void bharaniRoom() {
        System.out.println("This is Bharani's room");
        String myPencil = "pencil";
        String myBed = "bed";
       // int temp;
        {
            int temp = 0; //local variable
        }
        //sofa = "mysofa";
        System.out.println("sofa=" + sofa);
        //System.out.println("a=" + temp);
    }

    private void parentsRoom() {
        System.out.println("This is Parents' room");
        String laptop = "laptop";
        System.out.println("tv=" + tv);
    }

    public void kitchen() {
        System.out.println("This is kitchen");
        String stove = "stove";
        System.out.println("sofa=" + sofa);
    }

    public static void main(String[] args) {
        MyHome myHome = new MyHome();

        myHome.kitchen();
        myHome.bharaniRoom();
        myHome.parentsRoom();

        Book book = new Book();
        book.setId(1250);
        book.setTitle("my title");
        System.out.println("id=" + book.getId());
        System.out.println("title=" + book.getTitle());
        book.borrow();
    }
}
