package class5;

public class IfExam {
	public static void main(String[] args) {
		int i = -10;
		if (i<0) i = -i;
		System.out.println("i의 절대값 = "+i);
		
		int score = 65;
		if (score >= 60) System.out.println("합격입니다");
		else System.out.println("불합격 입니다");
		
		int score2 = 75;
		char grade;
		if (score2 >= 90) grade = 'A';
		else if (score2 >= 80) grade = 'B';
		else if (score2 >= 70) grade = 'C';
		else if (score2 >= 60) grade = 'D';
		else grade = 'F';
		System.out.println("등급은 "+grade+" 입니다.");
		
		int day = 3;
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default :
			System.out.println("invalid day!!");
			break;
		}
		
		int day2 = 3;
		if (day==1)
			System.out.println("Sunday");
		else if (day==2)
			System.out.println("Monday");
		else if (day==3)
			System.out.println("Tuesday");
		else if (day==4)
			System.out.println("Wednesday");
		else if (day==5)
			System.out.println("Thursday");
		else if (day==6)
			System.out.println("Friday");
		else if (day==7)
			System.out.println("Saturday");
		else 
			System.out.println("invalid day!!");
		
		
		
		
		int month = 2; 
		int year = 2100;
		int numDays = 0;
		
		switch (month) {
			case 1,3,5,7,8,10,12:
				numDays=31;
				break;
			case 4,6,9,11:
				numDays=30;
				break;
			case 2:
				if(((year % 4 == 0)&& !(year % 100 == 0))||(year % 400 == 0))
					numDays=29;
				else
					numDays=28;
				break;
			default:
				numDays=0;
				break;
		}
		System.out.println("Number of Days = "+numDays);
		
	}
} 
