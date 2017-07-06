/**
 * Created by Maryna_Kulenkova on 7/3/2017.
 */

public enum Courses {
    JAVASCRIPT("javascript", 300),
    JAVA_CORE("java core", 500),
    JAVA_SE("java SE", 500),
    CSS("css", 200),
    HTML("html", 100),
    QA("qa", 300),
    AUTOMATION("automation", 300);

    String courseName;
    int duration;

    Courses(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }
}

