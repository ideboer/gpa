public class Student {

    // data - properties
    private String name;
    setGradeLevel(gradeLevel);

    private String mathScore;
    private String englishScore;
    private String csScore;

    // constructor
    public Student(String name, int gradeLevel) {
        this.name = name; // or name = n; as long as the name on line 12 is called n
        this.gradeLevel = gradeLevel;
        
        this.mathScore = "F"; // the this is optional bc there is only 1 mathScore
        this.englishScore = "F";
        this.csScore = "F";
    }

    // functions - abilities

    // getters and setters
    public String getName() {
        return this.name;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        }
    }

    // calculate gpa
    public double calculateGPA() {
        return  ;
    }


}