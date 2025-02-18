import java.util.Scanner;
  public class StudentGrade {
   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	  String Subjects = ("Math,English,Biology,Agric,Physics,Chemistry");

	   for(int index = 0; index < subjects.length; index++){
	     System.out.println("Enter all the Subjects in the index:");
	      String index = input.next();
	}

	   int[] number = {5};

	    for(int number = 0; number < 5; number++){
	       System.out.println("Enter the number:");
		int numbers = input.nextInt();
	}

	   int[] total = {"scores"};

	    String names = {"Student"};
	     for(String student = 0; student < names; student++){
	      System.out.println("Enter names of student:");
	       String students = input.next();
	}

	   int[] total = {scores};

	    for(int total = 0; total < scores.length; total++){
	     System.out.println("Enter the total scores of the student:");
	      int total = input.nextInt();
	}

	   int[] grade = {highest};

	    for(int highest = 0; highest < grade.length; highest++){
	      System.out.println("Enter the grade:");
		int grades = input.nextInt();
	}

	   int[] marks = {average};

	    for(int average = 0; average < marks.length; average++){
	      System.out.println("Enter the marks:");
		int mark = input.nextInt();
	}

	   int[] values = {lowest};

	    for(int lowest = 0; lowest < values.length; lowest++){
	      System.out.println("Enter the values:");
		int value = input.nextInt();
	}
  }

}