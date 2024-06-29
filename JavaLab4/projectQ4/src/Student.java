public class Student {
    // Instance variables
    private String name,id,major;

    public Student(){

    }

    public Student(String name, String id, String major){
        this.name = name;this.id = id;this.major = major;

    }
    public void setID(String id){
        this.id = id;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getMajor() {
        return major;
    }
    public String getName() {
        return name;
    }

    public boolean equals(Student other){
        return name.equals(other.getName()) && id.equals(other.getId()) && major.equals(other.getMajor());
    }
    public String toString() {
        return  (id + " " + name + " " + major);
    }


    //new methods
    public String getDigit(int firstdigit , int lastdigit){
        return id.substring(firstdigit,lastdigit+1);
    }

    public String getYear(){
        return getDigit(0,1);
    }

    public String getLevelCode(){
        return  getDigit(2,2);
    }

    public String getFacultyCode(){
        return  getDigit(8,9);
    }

    public boolean sameYear(Student other){
        //return other.getYear() == this.getYear();
        return this.getYear().equals(other.getYear());

    }

    public boolean sameLevel(Student other){
        return this.getLevelCode().equals(other.getLevelCode());
    }

    public boolean sameFaculty(Student other){
        return this.getFacultyCode().equals(other.getFacultyCode());
    }
}
