import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Marinka on 19.06.2017.
 */
public class StudentStatusCheck {
    public static void main(String[] args) throws InterruptedException, ParseException {

        Program java = new Program("java developer", "23/06/2017");
        Program javascript = new Program("javascript developer", "23/06/2017");
        Program qaAutomation = new Program("qa automation", "23/06/2017");
        Program qaManual = new Program("qa manual", "23/06/2017");
        java.setProgram(Courses.JAVA_CORE, Courses.JAVA_SE);
        javascript.setProgram(Courses.JAVASCRIPT, Courses.CSS, Courses.HTML);
        qaAutomation.setProgram(Courses.AUTOMATION, Courses.JAVA_CORE, Courses.QA);
        qaManual.setProgram(Courses.QA, Courses.HTML);
        Student ivanov = new Student("Иван", "Иванов", java);
        Student petrov = new Student("Петр", "Петров", javascript);
        Student sidorov = new Student("Сидор", "Сидоров", qaAutomation);
        Student alexandrova = new Student("Александра", "Александрова", qaManual);

        ivanov.realWork(java, java.calculateDuration());
        petrov.realWork(javascript, javascript.calculateDuration());
        sidorov.realWork(qaAutomation, qaAutomation.calculateDuration());
        alexandrova.realWork(qaManual, qaManual.calculateDuration());
    }
}