public class Course {
    private String title;
    private String instructor;

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{title='" + title + "', instructor='" + instructor + "'}";
    }
}


