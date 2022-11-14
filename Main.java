package treeSetComprator.sortWithSalary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Employee> emp = new HashSet<>();
		emp.add(new Employee(101, 40000 , "javed"));
		emp.add(new Employee(101, 40000 , "javed"));
		emp.add(new Employee(103, 42000 , "raj"));
		emp.add(new Employee(108, 40000 , "shyam"));
		emp.add(new Employee(107, 40000 , "seema"));
		emp.add(new Employee(101, 40000 , "ravi"));
		
		//ArrayList<Employee> emp1 = emp.stream().distinct()
		
		
		//System.out.println(student);
		for( Employee ea : emp) {
			ea.print();
		}


		
	}

}
