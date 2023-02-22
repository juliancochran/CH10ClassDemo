public class Student {
    // encapsulation of these properties
    private String firstName, lastName;
    private int grade, age;
    private double gpa;
    private String advisor;

    /**
     * Default constructor for Student
     */
    public Student()    {
        firstName = "";
        lastName = new String();
        grade = 0; age = 0; gpa = 0.;
        advisor = "";
    }

    /**
     *
     * @param firstName
     * @param ln
     * @param gr
     * @param ag
     * @param gp
     * @param adv
     */
    public Student(String firstName, String ln, int gr, int ag, double gp, String adv)   {
        this.firstName = firstName;
        this.lastName = ln;
        grade = gr;
        age = ag;
        gpa = gp;
        advisor = adv;
    }

    /**
     * This is called a COPY constructor
     * @param other
     */
    public Student(Student other) {
        this.firstName = new String(other.firstName);
        this.lastName = other.lastName;
        this.grade = other.grade;
        this.age = other.age;
        this.gpa = other.gpa;
        this.advisor = other.advisor;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public int getAge(boolean happyBirthday) {
        return ++age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getAdvisor() {
        return advisor;
    }

    public String toString()    {
        return lastName + ", " + firstName + " grade " + grade + " age " + age + " your mom is awesome.";
    }

    public boolean equals(Object other) {
        if(other instanceof Student)    {
            Student temp = (Student)other;
            boolean same = lastName.equals(temp.lastName) && firstName.equals(temp.firstName);
            if(same)
                return this.advisor.equals(temp.advisor);
            else
                return same;
        }
        else
            return false;
    }
}









