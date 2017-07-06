import java.text.ParseException;
import java.util.*;

import static java.lang.Math.abs;

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

    public void realWork(Program program, int duration) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите вид отчета для студента. Нет параметра или параметр 0 – сокращенный вид отчета, иначе – подробный");
        String s = scan.nextLine();
        long durationInMillis = duration * 3600000;
        Date startStudy = program.getDateStart();
        long difference = startStudy.getTime() - System.currentTimeMillis();
        long howMuchTime = abs(durationInMillis - difference);
        if ((difference < durationInMillis) && ((s.equals("0")) || (s.equals(""))))
            System.out.println(name + " " + surname + " (" + program.getName() + ") Обучение закончено. После окончания прошло " + program.getDaysEndOfTheProgram(howMuchTime));
        else if ((difference < durationInMillis) && (!(s.equals("0")) || !(s.equals(""))))
            System.out.println(name + " " + surname + ". Рабочие часы: с " + program.getWorkTimeStart() + " до " + program.getWorkTimeEnd() + ". Название программы - " + program.getName() + ". Длительность программы - " + duration + " часов. Начало обучения - " + program.getDateStart() + ". Обучение закончено. После окончания прошло " + program.getDaysEndOfTheProgram(howMuchTime));
        else if ((difference > durationInMillis) && ((s.equals("0")) || (s.equals(""))))
            System.out.println(name + " " + surname + " (" + program.getName() + ") Обучение не закончено. До окончания осталось " + program.getDaysEndOfTheProgram(howMuchTime));
        else if ((difference > durationInMillis) && (!(s.equals("0")) || !(s.equals(""))))
            System.out.println(name + " " + surname + ". Рабочие часы: с " + program.getWorkTimeStart() + " до " + program.getWorkTimeEnd() + ". Название программы - " + program.getName() + ". Длительность программы - " + duration + " часов. Начало обучения - " + program.getDateStart() + ". Обучение не закончено. До окончания осталось " + program.getDaysEndOfTheProgram(howMuchTime));
    }

}