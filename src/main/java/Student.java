import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Student (String name, String surname, Calendar startStudy){
        this.name = name;
        this.surname = surname;
        this.startStudy = startStudy;
    }
    public Map<Course, Integer> createProgram (List<Course> courses){
        Map<Course, Integer> program = new HashMap<>();
        for (int i = 0; i < courses.size(); i++) {
            program.put(courses.get(i), courses.get(i).getDuration());
        }
        return program;
    }
    public int calculateDuration(Map<Course, Integer> program){
        int totalHours = 0;
        for (Map.Entry<Course, Integer> entry : program.entrySet()){
            totalHours += entry.getValue();
        }
        return totalHours;
    }
    public void realWork(Calendar startDate, int duration) {
        Calendar currentDate = Calendar.getInstance();
        long durationInMillis = duration*3600000;
        long difference = startDate.getTimeInMillis()-currentDate.getTimeInMillis();
        if(difference < durationInMillis)
            System.out.println("Обучение закончено. После окончания прошло " + (durationInMillis - difference)/3600000 + " часов.");
        else
            System.out.println("Обучение не закончено. До окончания осталось " + (difference - durationInMillis)/3600000 + " часов.");
    }

}
