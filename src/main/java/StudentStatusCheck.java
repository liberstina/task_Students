import java.util.*;

/**
 * Created by Marinka on 19.06.2017.
 */
public class StudentStatusCheck {
    public static void main(String[] args) throws InterruptedException {

        Course javascript = new Course("javascript", 300);
        Course javaCore = new Course("java core", 500);
        Course javaSE = new Course("java SE", 500);
        Course automation = new Course ("automation", 200);
        Course html = new Course("html", 100);
        Course css = new Course("css", 200);
        Course qa = new Course("qa", 300);

        List<Course> jsProgram = new ArrayList<>();
        jsProgram.add(javascript);
        jsProgram.add(css);
        jsProgram.add(html);

        List<Course> javaProgram = new ArrayList<>();
        javaProgram.add(javaCore);
        javaProgram.add(javaSE);

        List<Course> qaProgram = new ArrayList<>();
        qaProgram.add(qa);
        qaProgram.add(html);

        List<Course> automationProgram = new ArrayList<>();
        automationProgram.add(automation);
        automationProgram.add(javaCore);
        automationProgram.add(qa);

        Student ivanov = new Student("Ivan", "Ivanov", new GregorianCalendar(2017, 5, 28));
        Student petrov = new Student("Petr", "Petrov", new GregorianCalendar(2017, 5, 28));
        Student sidorov = new Student("Sidor", "Sidorov", new GregorianCalendar(2017, 5, 28));
        Student alexandrova = new Student("Alexandra", "Alexandrova", new GregorianCalendar(2017, 5, 28));

        ivanov.realWork(ivanov.getStartStudy(), ivanov.calculateDuration(ivanov.createProgram(jsProgram)));
        petrov.realWork(petrov.getStartStudy(), petrov.calculateDuration(petrov.createProgram(javaProgram)));
        sidorov.realWork(sidorov.getStartStudy(), sidorov.calculateDuration(sidorov.createProgram(automationProgram)));
        alexandrova.realWork(alexandrova.getStartStudy(), alexandrova.calculateDuration(alexandrova.createProgram(qaProgram)));

    }
}
