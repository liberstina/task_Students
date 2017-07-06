import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Marinka on 30.06.2017.
 */
public class Program {
    private static final int WORK_TIME_START = 10;
    private static final int WORK_TIME_END = 18;
    private String name;

    public static int getWorkTimeStart() {
        return WORK_TIME_START;
    }

    public static int getWorkTimeEnd() {
        return WORK_TIME_END;
    }

    private String dateStart;
    private Courses[] courses;

    public String getName() {
        return name;
    }

    public Program(String name, String dateStart) {
        this.name = name;
        this.dateStart = dateStart;
    }

    public void setProgram(Courses... courses) {
        this.courses = courses;
    }

    public Date convertStringToDateFormat(String date) throws ParseException {
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return date1;
    }

    public String convertDateToStringFormat(Date date) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = format.format(date);
        return dateString;
    }

    public Date getDateStart() throws ParseException {
        return convertStringToDateFormat(dateStart);
    }

    public int calculateDuration() {
        int totalDuration = 0;
        for (Courses course : courses) {
            totalDuration += course.duration;
        }
        return totalDuration;
    }

    public Date getProgramEndDate(Date dateStart, int totalDuration) {
        Date endDate = new Date(dateStart.getTime() + (1000 * 60 * 60 * 8));
        return endDate;
    }

    public StringBuilder getDaysEndOfTheProgram(Long howMuchTime) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH");
        long diffHours = howMuchTime / (60 * 60 * 1000) % 8;
        long diffDays = howMuchTime / (8 * 60 * 60 * 1000);
        StringBuilder sb = new StringBuilder();
        sb.append(diffDays + " дней, ");
        sb.append(diffHours + " часов. ");
        return sb;
    }

}
