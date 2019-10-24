public class Main
{
    public static void main(String[] args)
    {
        Methods methods = new Methods();

        Book createbook1= new Book(methods.CreateId());
        Book createBook2 = new Book(methods.CreateId(),"asda","asdasd","dasda",1992,10,199,"type");
        Book createBook3 = new Book(122,"asda","asdasd","dasda",1992,10,199,"type");
        System.out.println(createbook1.getId());
        System.out.println(createBook2.getId());

        System.out.println(createbook1.getId());

        System.out.println(createbook1.toString());

        //    if (createbook1.getNameBok().equals("null")) System.out.println("0");

        System.out.println(Book.getNumberOfInstance());

    }
}
