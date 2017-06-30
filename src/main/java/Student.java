import java.util.*;

/**
 * Created by Marinka on 19.06.2017.
 */
public class Student {
    private String name;
    private String surname;
    private Calendar startStudy;

    public Calendar getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Calendar startStudy) {
        this.startStudy = startStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(String name, String surname, Calendar startStudy) {
        this.name = name;
        this.surname = surname;
        this.startStudy = startStudy;
    }

    public Map<Course, Integer> createProgram(List<Course> courses) {
        Map<Course, Integer> program = new HashMap<>();
        for (int i = 0; i < courses.size(); i++) {
            program.put(courses.get(i), courses.get(i).getDuration());
        }
        return program;
    }

    public void realWork(Calendar startDate, int duration) {
        Calendar currentDate = Calendar.getInstance();
        long durationInMillis = duration * 3600000;
        long difference = startDate.getTimeInMillis() - currentDate.getTimeInMillis();
        if (difference < durationInMillis)
            System.out.println("Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else
            System.out.println("Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");
    }
/*
    public void realWork(Calendar startDate, int duration) {
        Scanner scan = new Scanner(System.in);
        Calendar currentDate = Calendar.getInstance();
        long durationInMillis = duration * 3600000;
        long difference = startDate.getTimeInMillis() - currentDate.getTimeInMillis();
        if ((difference < durationInMillis) && ((scan.nextLine().equals("0")) || (scan.nextLine().equals(""))))
            System.out.println("Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else if ((difference < durationInMillis) && (!(scan.nextLine().equals("0") )|| !(scan.nextLine().equals(""))))
            System.out.println(name.toString() + " " + surname.toString() + " Working hours from 00 till 24 " + duration + " " + startDate + " Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else if ((difference > durationInMillis) && ((scan.nextLine().equals("0")) || (scan.nextLine().equals(""))))
        System.out.println("Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");
        else if ((difference > durationInMillis) && (!(scan.nextLine().equals("0")) || !(scan.nextLine().equals(""))))
            System.out.println(name.toString() + " " + surname.toString() + " Working hours from 00 till 24 " + duration + " " + startDate + " Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");
    }
*/
}