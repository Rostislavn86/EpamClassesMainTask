public class Main
{
    public static void main(String[] args)
    {
        Methods methods = new Methods();

        //список книг

//        Михаил Булгаков — Мастер и Маргарита
//        Федор Достоевский — Преступление и наказание
//        Лев Толстой — Война и мир
//        Михаил Булгаков — Собачье сердце
//        Федор Достоевский — Идиот
//        Федор Достоевский — Братья Карамазов
//        Илья Ильф, Евгений Петров — Двенадцать стульев
//        Николай Гоголь — Мёртвые души
//        Иван Тургенев — Отцы и дети
//        Лев Толстой — Анна Каренина

    ObjMassOfBooksAndMethods objMassOfBooksAndMethods = new ObjMassOfBooksAndMethods();


        Book createbook1= new Book(objMassOfBooksAndMethods.CreateId());
        Book createBook2 = new Book(methods.CreateId(),"asda","asdasd","dasda",1992,10,199,"type");
        Book createBook3 = new Book(methods.CreateId(),"Третья книга","asdasd","dasda",1992,10,199,"type");
        System.out.println(createbook1.getId());
        System.out.println(createBook2.getId());

        System.out.println(createbook1.getId());

        System.out.println(createBook3.toString());

        //    if (createbook1.getNameBok().equals("null")) System.out.println("0");

        System.out.println(Book.getNumberOfInstance());

        System.out.println(objMassOfBooksAndMethods.library[0] = createBook3);
        System.out.println(objMassOfBooksAndMethods.library[1] = createbook1);


    }
}
