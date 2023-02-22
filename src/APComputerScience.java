import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class APComputerScience {
    private ArrayList<Student> classList;

    public APComputerScience()  {
        classList = new ArrayList<>();
    }

    public void addStudent(Student s)   {
        classList.add(s);
    }

    public void loadDataFile(String filename)   {
        try {
            Scanner in = new Scanner(new File(filename));
            String[] line;
            while(in.hasNext()) {
                line = in.nextLine().split(",");
            }
        }
        catch(Exception e)  {
            e.printStackTrace();
        }
    }

    public void printRoster()   {
        for(Student s : classList)
            System.out.println(s);
        int throwaway = classList.get(0).getAge(true);
    }

    public static void main(String[] args) {
        APComputerScience dPeriod = new APComputerScience();
        dPeriod.addStudent(new Student("Ani", "Sukhija", 12, 18, 4.1, "Julian Cochran"));
        dPeriod.addStudent(new Student("Issie", "Scurria", 11, 16, 4.05, "Owen Bryant"));
        dPeriod.addStudent(new Student("Ryan", "Bauroth", 10, 15, 4.23, "Julian Cochran"));
        dPeriod.addStudent(new Student("Bef", "Steinberg", 11, 18, 4.78, "Julian Cochran"));

        Student s1 = new Student("Shreya", "Rao", 10, 15, 5.23, "Julian Cochran");
        System.out.println(s1);
        Student s2 = new Student(s1);
        System.out.println(s2);

        String word1 = "hello world!";
        String word2 = new String(word1);

        //dPeriod.printRoster();
        //dPeriod.printRoster();
    }
}
