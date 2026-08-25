package oob;
class  Book{
    String  title;
    String  author;
    double  price;
    void  displayInfo(){
        System.out.println("==============================");
        System.out.println("Title  : "+title );
        System.out.println("author : "+author );
        System.out.println("price  : $"+price );
        System.out.println("==============================");
    }

}


public class oob {



    public static void main(String[] args) {
        Book book1= new Book();
        Book book2= new Book();
        book1.title ="java fundementals";
        book1.author ="john";
        book1.price =30;
        book2.title ="Sptring booot ";
        book2.author ="ahmed";
        book2.price =45;

        book1.displayInfo();
        book2.displayInfo();

    }
}
