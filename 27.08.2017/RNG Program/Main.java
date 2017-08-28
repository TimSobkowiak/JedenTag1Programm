
	public class Main {
		public static void main(String args[]){
			
		Scanner sc = new Scanner(System.in); //Scanner sc ist ein Array das man erst importieren muss in eclipse	
		
		System.out.print("Enter a Number 1-10");
		
		String number =sc.nextline(); //Eingabe der Zahl
		
		double randomNumber =Math.floor(Math.random() * 10);
		System.out.println(randomNumber);
		
		sc.close();
			
			}
			
			
	}