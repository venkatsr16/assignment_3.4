public class Student {
     private String name;
     private int id;
     private int marks;
     
     public Student(String name,int id,int marks){
	this.name=name;
	this.id=id;
	this.marks=marks;
     }
     public void calculate_result(){
	if(marks>90)
          System.out.println("A Grade");
        else if(marks>70 && marks<=90)
	  System.out.println("B Grade");
        else if(marks>50 && marks<=70)
          System.out.println("C Grade");
	else if(marks>30 && marks<=50)
	  System.out.println("D Grade");  
	else
	  System.out.println("Fail");
     }
     public static void main(String args[]) {
     	Student s1 = new Student("Adithya",1,55);
	Student s2 = new Student("Dinesh",17,74);
	Student s3 = new Student("Muthu",38,45);
	Student s4 = new Student("Ram",55,91);
	System.out.print(s1.name+"'s marks: "+s1.marks+" result: ");
	s1.calculate_result(); 
	System.out.print(s2.name+"'s marks: "+s2.marks+" result: ");
	s2.calculate_result();
	System.out.print(s3.name+"'s marks: "+s3.marks+" result: ");
	s3.calculate_result();
	System.out.print(s4.name+"'s marks: "+s4.marks+" result:");
	s4.calculate_result();
     }
}     