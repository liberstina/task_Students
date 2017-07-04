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
    private String dateStart;
    private Courses[] course;

    public String getName() {
        return name;
    }

    public Program(String name, String dateStart) {
        this.name = name;
        this.dateStart = dateStart;
    }

    public void setProgram(Courses... courses) {
        //TODO refactor this method
        for (int i = 0; i < courses.length; i++) {
            course[i] = courses[i];
        }
    }

    public Date convertStringToDateFormat(String date) throws ParseException {
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return date1;
    }

    public String convertDateToStringFormat(Date date){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = format.format(date);
        return dateString;
    }

    public Date getDateStart() throws ParseException {
        return convertStringToDateFormat(dateStart);
    }

    public int calculateDuration() {

        //TODO refactor this method

        return totalDuration;
    }

    //TODO define return type and list of input parameters
    public void getProgramEndDate(){

        //TODO implement
    }

    //TODO define return type and list of input parameters
    public int getDaysEndOfTheProgram(Date dateStart){
        dateStart.
        //TODO implement
        return Integer.parseInt(null);
    }
}
