

public class Book {
    //id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.

    //Переменная подсчитывающая количество созданных классов.
    private static int counter;



    private int id ;
    private String nameBok;
    private String author;
    private String PublishingHouse;
    private int yearOfPublishing;
    private int nNumberOfPages;
    private int price;
    private String typeOfBinding;

    public Book(int id, String nameBok, String author, String publishingHouse, int yearOfPublishing, int nNumberOfPages, int price, String typeOfBinding) {
        this.id = id;
        this.nameBok = nameBok;
        this.author = author;
        this.PublishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.nNumberOfPages = nNumberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
        counter++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBok='" + nameBok + '\'' +
                ", author='" + author + '\'' +
                ", PublishingHouse='" + PublishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", nNumberOfPages=" + nNumberOfPages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                ", methods=" + methods +
                '}';
    }

    public Book()
    {
        counter++;
    }

    public Book(int id)
    {
        counter++;
    }




    public static int getNumberOfInstance()
    {
        return counter;
    }


    Methods methods = new Methods();

    public int getId()
    {
        return methods.CreateId();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBok() {
        return nameBok;
    }

    public void setNameBok(String nameBok) {
        this.nameBok = nameBok;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return PublishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        PublishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getnNumberOfPages() {
        return nNumberOfPages;
    }

    public void setnNumberOfPages(int nNumberOfPages) {
        this.nNumberOfPages = nNumberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
}
