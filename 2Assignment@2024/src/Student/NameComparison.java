package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students
{
	int id;
	String studentName; // Updated to follow Java naming conventions

	public Students(int id, String studentName)
	{
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
}
class IdComparision implements Comparator<Students>
{
	public int compare(Students o1, Students o2) 
	{
		return o1.getId()-o2.getId();
		
	}
}

public class NameComparison implements Comparator<Students>
{

	public int compare(Students o1, Students o2)
	{
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

	public static void main(String[] args) 
	{
		List<Students> list = new ArrayList<>();

		list.add(new Students(01, "Wasim"));
		list.add(new Students(02, "Fahim"));
		list.add(new Students(03, "Imtiyaz"));

		Collections.sort(list, new NameComparison());
		
		for (Students student : list) 
		{
			System.out.println("ID: " + student.getId() + ", Name: " + student.getStudentName());
		
		}
		Collections.sort(list, new IdComparision());
		for (Students student : list)
		{
			System.out.println("ID: " + student.getId() + ", Name: " + student.getStudentName());
		
		}
	}
}
