package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student 
{
	int id, age ;
	String date_of_joining,name ;
	
	public Student(int id, int age, String date_of_joining, String name)
	{
		super();
		this.id = id;
		this.age = age;
		this.date_of_joining = date_of_joining;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", age=" + age + ", date_of_joining=" + date_of_joining + ", name=" + name + "]";
	}

	public static void main(String[] args) 
	{
		Student s1=new Student(01,24,"24-12-2021","wasim");
		Student s2=new Student(02,34,"02-12-2019","Imtiyaz");
		Student s3=new Student(03,27,"29-01-2021","Fahim");
		List<Object> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext())
			{
			System.out.println(itr.next());
			}
	 list.forEach(System.out::println);
	}
}
