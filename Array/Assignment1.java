class Teacher {
    //Implement your code here
    private String teacherName;
    private String subject;
    private double salary;

    public Teacher(String teacherName, String subject, double salary) {
	this.teacherName = teacherName;
	this.subject = subject;
	this.salary = salary;
    }
    
    public String getTeacherName() {
    	return teacherName;
    }
    public void setTeacherName(String teacherName) {
    	this.teacherName = teacherName;
    }
    public String getSubject() {
    	return subject;
    }
    public void setSubject(String subject) {
    	this.subject = subject;
    }
    public double getSalary() {
    	return salary;
    }
    public void setSalary(double salary) {
    	this.salary = salary;
    }
}

class Tester {
	public static void main(String[] args) {
	    // Implement your code here 
	Teacher object1 = new Teacher("Alex", "Java Fundamentals", 1200L);
	Teacher object2 = new Teacher("John", "RDBMS", 800L);
	Teacher object3 = new Teacher("Sam", "Networking", 900L);
	Teacher object4 = new Teacher("Maria", "Python", 900L);
	
	Teacher[] aTeachers = {object1, object2, object3, object4};
	for (Teacher a : aTeachers) {
	    System.out.println("Name : "+a.getTeacherName()+", Subject : "+a.getSubject()+", Salary : "+a.getSalary());
	}
	}
}

