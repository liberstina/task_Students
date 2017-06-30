import java.util.*;

/**
 * Created by Marinka on 19.06.2017.
 */
public class StudentStatusCheck {
    public static void main(String[] args) throws InterruptedException {

        Course javascript = new Course("javascript", 300);
        Course javaCore = new Course("java core", 500);
        Course javaSE = new Course("java SE", 500);
        Course automation = new Course("automation", 200);
        Course html = new Course("html", 100);
        Course css = new Course("css", 200);
        Course qa = new Course("qa", 300);

        List<Course> jsList = new ArrayList<>();
        jsList.add(javascript);
        jsList.add(css);
        jsList.add(html);

        List<Course> javaList = new ArrayList<>();
        javaList.add(javaCore);
        javaList.add(javaSE);

        List<Course> qaList = new ArrayList<>();
        qaList.add(qa);
        qaList.add(html);

        List<Course> automationList = new ArrayList<>();
        automationList.add(automation);
        automationList.add(javaCore);
        automationList.add(qa);

        Student ivanov = new Student("Ivan", "Ivanov", new GregorianCalendar(2017, 5, 10));
        Student petrov = new Student("Petr", "Petrov", new GregorianCalendar(2017, 5, 10));
        Student sidorov = new Student("Sidor", "Sidorov", new GregorianCalendar(2017, 6, 10));
        Student alexandrova = new Student("Alexandra", "Alexandrova", new GregorianCalendar(2017, 6, 10));

        Map <Course, Integer> jsMap = ivanov.createProgram(jsList);
        Map <Course, Integer> javaMap = petrov.createProgram(javaList);
        Map <Course, Integer> automationMap = ivanov.createProgram(automationList);
        Map <Course, Integer> qaMap = ivanov.createProgram(qaList);
        Program jsProgram = new Program("Javascript Developer", jsMap);
        Program javaProgram = new Program("Java Developer", javaMap);
        Program automationProgram  = new Program("QA Automation", automationMap);
        Program qaProgram = new Program("QA Manual", qaMap);


        ivanov.realWork(ivanov.getStartStudy(), jsProgram.calculateDuration());
        petrov.realWork(petrov.getStartStudy(), javaProgram.calculateDuration());
        sidorov.realWork(sidorov.getStartStudy(), automationProgram.calculateDuration());
        alexandrova.realWork(alexandrova.getStartStudy(), qaProgram.calculateDuration());

    }
}