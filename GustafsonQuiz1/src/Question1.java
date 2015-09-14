
public class Question1 {
	public static void main(String[] args){
		double TD; // touchdowns
		System.out.println("Number of touchdowns: ");
		double Yards; //Yards
		System.out.println("Number of Yards: ");
		double INT; // interceptions
		System.out.println("Number of Interceptions: ");
		double comp; //completions
		System.out.println("Number of completions: ");
		double Att; //passes attempted
		System.out.println("Number of passes attempted: ");
		
		double QB;
		
		double a = (((comp/Att) - .3)*5);
		double b = (((Yards/Att) - 3)*.25);
		double c = ((TD/Att)*20);
		double d = 2.375 - ((INT/Att) *25);
		
		QB = (((a+b+c+d)/6)*100);
		System.out.println("The QB Rating is: ");
		
	}

}
