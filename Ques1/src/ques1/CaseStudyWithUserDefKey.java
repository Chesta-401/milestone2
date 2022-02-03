package ques1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CaseStudyWithUserDefKey {

	public static void main(String[] args) {
		Map<Student, Integer> map2 = new HashMap<>();
		map2.put(new Student(10, "raj", 95), 95);
		map2.put(new Student(61, "keta", 78), 78);
		map2.put(new Student(11, "gunika", 98), 98);
		map2.put(new Student(19, "keshav", 97), 97);

		// Print all records sorted as per name of the student
		System.out.println("------All records sorted as per name of the student------");
		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
				.forEach(student -> System.out.println(student));

		// Print all records as per id of the student
		System.out.println("------All records sorted as per id of the student------");
		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
				.forEach(student -> System.out.println(student));

	}

}
