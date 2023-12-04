public class Student {
    private int grade;
    private String car;
    private String name;
    public Student(int grade,String car,String name)
    {
        super();
        this.grade=grade;
        this.car=car;
        this.name=name;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  String toString()
    {
        return "Student[grade="+grade+",car="+car+",name="+name+"]\n";


    }
}
