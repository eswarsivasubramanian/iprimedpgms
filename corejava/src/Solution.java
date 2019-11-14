
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	class Student 
	{
	   private int token;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.token = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getToken() {
	      return token;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

	public class Solution 
	{
	    public static void main(String[] args) 
	    {
	      Scanner in = new Scanner(System.in);
	      int totalEvents = Integer.parseInt(in.nextLine());
	      PriorityQueue<Student> queue=new PriorityQueue<Student>(1000, new Comparator<Student>(){
	      public int compare(Student student1, Student student2) 
	      {
	          if(student1.getCgpa()<student2.getCgpa())
	              return 1;
	          else if(student1.getCgpa()>student2.getCgpa())
	              return -1;
	          else
	          {
	              if(!student1.getFname().equals(student2.getFname()))
	                  return student1.getFname().compareTo(student2.getFname());
	              else
	              {
	                  return(student1.getToken()-student2.getToken());
	              }
	           }
	      }
	      });
	        Iterator itr=queue.iterator();  
	      while(totalEvents>0)
	      {
	          String event = in.next();
	          if(event.equals("ENTER"))
	          {
	              String name=in.next();
	              double cgpa=in.nextDouble();
	              int id=in.nextInt();
	              Student s=new Student(id,name,cgpa);
	              queue.add(s);
	          }
	          if(event.equals("SERVED"))
	          {
	              if(itr.hasNext())
	                queue.poll();
	          }
	          totalEvents--;
	      }
	        if(itr.hasNext()==false)
	            System.out.println("EMPTY");
	        while(itr.hasNext())
	        {
	            System.out.println(queue.poll().getFname());
	        }
	    }
	}

