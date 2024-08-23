/*Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.

*/

class PassOrFail{
	public static void main(String args[]){
		int sub1 = 45, sub2 = 21, sub3 = 15, failcount = 0;
		String result;
		if (sub1>=40 && sub2>=40 && sub3>=40){
			result = "pass";
		}
		else
		{
			result = "fail";
		}
		
		switch(result){
			case "pass": System.out.println("Student has passed all 3 subjects.");
			break;
			
			case "fail":
			if(sub1<40){
				failcount++;
			}
			if(sub2<40){
				failcount++;
			}
			if(sub3<40){
				failcount++;
			}
			switch(failcount){
					case 1: System.out.println("Student has failed in 1 subject.");
					break;
					case 2: System.out.println("Student has failed in 2 subjects.");
					break;
					case 3: System.out.println("Student has failed in 3 subjects.");
					break;
			}		
			break;
		}
	}
}