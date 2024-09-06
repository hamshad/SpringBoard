class Student{
    //Implement your code here
	private int[] marks;
	private char[] grade;
	public Student(int[] marks) {
		this.marks = marks;
		grade = new char[marks.length];
	}
	
	public void findGrade() {
		for (int i = 0; i < marks.length; i++) 
			grade[i] = marks[i] >= 92 ? 'E' : marks[i] >= 85 && marks[i]<92 ? 'A' : marks[i] >= 70 && marks[i] < 85 ? 'B' : marks[i] >=65 && marks[i]< 70 ? 'C' : 'D';
		
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public char[] getGrade() {
		return grade;
	}
	public void setGrade(char[] grade) {
		this.grade = grade;
	}
}

class Tester{
	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
		Student student = new Student(marks);
		student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}
	}
}

 

