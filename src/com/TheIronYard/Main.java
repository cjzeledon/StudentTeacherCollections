package com.TheIronYard;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        TODO:
        In the main() method of Main create an ArrayList of 15 students which represents all the 1st grade students at an
        elementary school. Make sure the ids are unique and set the grade to 1. The Teacher class is the same as the
        Student class (Hint: you could use this fact to save yourself some time).
        */
        List<Student> student = new ArrayList<>();
        student.add(new Student("Sophia", "Stone", 4857, 1 ));
        student.add(new Student("Melania", "Zeledon", 5648, 1));
        student.add(new Student("Mercedes", "Zeledon", 2957, 1));
        student.add(new Student("Charlie", "Blackwell", 2309, 1));
        student.add(new Student("Patricia", "Castro", 5971, 1));
        student.add(new Student("Tara","Richards", 4947, 1));
        student.add(new Student("Patrick", "Graves", 5660, 1));
        student.add(new Student("James", "Fowler", 2755, 1));
        student.add(new Student("Sarah", "Ingram", 4028, 1));
        student.add(new Student("Hubert", "Hampton", 2952, 1));
        student.add(new Student("Valerie", "Hughes", 3051, 1));
        student.add(new Student("Ella", "Benson", 3895, 1));
        student.add(new Student("Bernard", "Miles", 3013, 1));
        student.add(new Student("Debra	", "Davidson", 6651, 1));
        student.add(new Student("Marie	", "Lane", 8019, 1));
        student.add(new Student("Lauren	", "Conrad", 8375, 1));

        // Instantiate 3 Teachers just like for Students and add to an ArrayList of teachers.
        List<Teacher> teacher = new ArrayList<>();
        teacher.add( new Teacher("Gary", "Watson", 6654, 1));
        teacher.add( new Teacher("Ora", "Holland", 3412, 1));
        teacher.add( new Teacher("Roy", "Nunez", 9981, 1));

        /*
        TODO:
        Code a HashMap that takes a Teacher for a key and a Set of students for the value (not a List of students). Each
        Teacher will have 5 different students in a HashSet.

        Print out the map keys in a for loop (use the keySet() method). Print out the map values in a for loop (use the
        values() method).
        */
        Map<Teacher, Set<Student>> group = new HashMap<>();

        /*
        Another way to assign group of students to a teacher
        Set<Student> studSet = new HashSet<>();
        studSet.add(student.get(0));
        group.put(teacher.get(0), studSet);
        */

        // Instead of manually adding each student to a teacher, set it up in a loop
        // Remember the index numbers!
        group.put(teacher.get(0), new HashSet<>());
        for (int i = 0; i < 5; i++){
            group.get(teacher.get(0)).add(student.get(i));
        }
        /*
        group.get(teacher.get(0)).add(student.get(0));
        group.get(teacher.get(0)).add(student.get(1));
        group.get(teacher.get(0)).add(student.get(2));
        group.get(teacher.get(0)).add(student.get(3));
        group.get(teacher.get(0)).add(student.get(4));
        */

        // Instead of manually adding each student to a teacher, set it up in a loop
        // Remember the index numbers!
        group.put(teacher.get(1), new HashSet<>());
        for (int i = 5; i < 10; i++){
            group.get(teacher.get(1)).add(student.get(i));
        }
        /*
        group.get(teacher.get(1)).add(student.get(5));
        group.get(teacher.get(1)).add(student.get(6));
        group.get(teacher.get(1)).add(student.get(7));
        group.get(teacher.get(1)).add(student.get(8));
        group.get(teacher.get(1)).add(student.get(9));
        */

        // Instead of manually adding each student to a teacher, set it up in a loop
        // Remember the index numbers!
        group.put(teacher.get(2), new HashSet<>());
        for (int i = 10; i < 15; i++){
            group.get(teacher.get(2)).add(student.get(i));
        }
        /*
        group.get(teacher.get(2)).add(student.get(10));
        group.get(teacher.get(2)).add(student.get(11));
        group.get(teacher.get(2)).add(student.get(12));
        group.get(teacher.get(2)).add(student.get(13));
        group.get(teacher.get(2)).add(student.get(14));
        */


        // Prints the three teachers with their assigned students (to them)
        for ( Teacher teach : group.keySet()) {
            System.out.println(teach + " " + group.get(teach));
        }


        /*
        Seems like this entrySet method works but also don't really understand the WHY it works.
        I can see the initial set shows the initial values of the students and then the new set shows "Lauren" is added
        to the set
        */

        Set<Map.Entry<Teacher, Set<Student>>> mappingSet = group.entrySet();
        System.out.println("Initial people in a classroom: " + mappingSet);

        // add another key value mapping
        group.get(teacher.get(2)).add(student.get(15));

        // print the values which the set contains
        System.out.println("New person (or people) in a classroom: " + mappingSet);
    }
}
