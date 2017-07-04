import java.util.*;

/**
 * Created by Marinka on 19.06.2017.
 */
public class Student {
    private String name;
    private String surname;
    private Program individualProgram;


    public Student(String name, String surname, Program program) {
        this.name = name;
        this.surname = surname;
        this.individualProgram = program;
    }



    //TODO think about input parameters
    public void realWork(Program program, Date startDate, int duration) {
        //what input should be?
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Calendar currentDate = Calendar.getInstance();
        long durationInMillis = duration * 3600000;
        /*long difference = startStudy.getTimeInMillis() - currentDate.getTimeInMillis();
        if ((difference < durationInMillis) && ((s.equals("0")) || (s.equals(""))))
            System.out.println("Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else if ((difference < durationInMillis) && (!(s.equals("0")) || !(s.equals(""))))
            System.out.println(name.toString() + " " + surname.toString() + ". Рабочие часы: с 00 до 24. Название программы - " + program.getName() + ". Длительность программы - " + duration + " часов. Начало обучения - " + startDate + ". Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else if ((difference > durationInMillis) && ((s.equals("0")) || (s.equals(""))))
            System.out.println("Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");
        else if ((difference > durationInMillis) && (!(s.equals("0")) || !(s.equals(""))))
            System.out.println(name.toString() + " " + surname.toString() + ". Рабочие часы: с 00 до 24. Название программы - " + program.getName() + ". Длительность программы - " + duration + " часов. Начало обучения - " + startDate + ". Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");*/
    }

}