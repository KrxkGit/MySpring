import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Book book = context.getBean("book", Book.class); // Dependencies injury (DI).
        System.out.println(book);

        Book book1 = (Book) context.getBean("book2");
        System.out.println(book1);
    }
}