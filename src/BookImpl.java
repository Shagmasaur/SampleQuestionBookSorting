import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookImpl
{
    public static void main(String[] args)
    {

        List<Book> List=new ArrayList();

        Book book  = new Book("TINTIN","HERGE",123456789L,1050);
        Book book1 = new Book("ARCHIES","UNKNOWN",74764376535L,800);
        Book book2 = new Book("TINKLE","RANDOM",5123453462L,600);
        Book book3 = new Book("MARVEL","STAN LEE",12512344365L,1000);
        Book book4 = new Book("DC","SUPERHERO",12356471524L,1100);

        List.add(book);
        List.add(book1);
        List.add(book2);
        List.add(book3);
        List.add(book4);

        for(Book element : List)
        {
            System.out.println(element);
        }


        for(int i=0;i<List.size();i++)
        {
            for(int j=0;j<List.size() -1 - i;j++)
            {
                if(List.get(j).getPrice()>List.get(j+1).getPrice())
                {
                    Book temp=List.get(j);
                    List.set(j,List.get(j+1));
                    List.set(j+1,temp);
                }
            }
        }

        System.out.println();
        System.out.println("SORTED LIST");
        System.out.println("----------------");
        for(Book element : List)
        {
            System.out.println(element);
        }



       // Collections.sort(List);
       // List.sort(book);

    }

}

