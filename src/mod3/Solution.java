package mod3;

import mod3.work3.CollegeStudent;
import mod3.work3.Course;
import mod3.work3.SpecialStudent;
import mod3.work3.Student;


public class Solution {

    public static void main(String[] args) {

        Course psihology = new Course(15,"Psihology","Petr");
        Course geographica = new Course(30,"Geographica","Larisa");
        Course history = new Course(19,"Historia","Oksana");
        Course phiziza = new Course(76,"Phizika","Vasia");
        Course historyUkraine = new Course(46, "HistoriaUkraine", "Pet9");

        Course[] courses = {psihology, geographica, history, phiziza, historyUkraine};

        Student student1 = new Student("Vasia", "Pupkin", 25);
        Student student2 = new Student("Petia",courses);

        CollegeStudent stugent3 = new CollegeStudent("Dima", courses);
        CollegeStudent student4 = new CollegeStudent("Dima", "Vesna",56);
        CollegeStudent student5 = new CollegeStudent("Petro","Zuma", 76, "Ivan", 43, 8);

        SpecialStudent student6 = new SpecialStudent("Vova", "Petruk",5);
        SpecialStudent student7 = new SpecialStudent("Varenuk", courses, 2544524);
        SpecialStudent student8 = new SpecialStudent("Alex", "Dydik", 8, "Tehnarh",5,845224455);



    }
}
