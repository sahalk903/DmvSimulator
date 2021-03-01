import java.util.Random;

public class DmvSimulator {
	public static void main(String[] args) {
	
			
			Random rand = new Random();
			int count;
			
			
			int rand_int1 = rand.nextInt(200); 
			
			
			System.out.println("Welcome to the DMV!");
			
			System.out.println("This is your number, wait to be called on:"+rand_int1);
			
			count = rand_int1 + 1;
			
			while (count <= 200) {
				System.out.println("Currently serving:  " + count);
				count++;
			
			
			}
		     
			for (int i = 1; i < rand_int1; i++) 
			{
				System.out.println("Currenlty serving: " + i);
			}
	
			System.out.println("Currently serving: " + rand_int1);
			System.out.println("The documents you brought are not sufficient. Next time, make sure to read what you need to bring before wasting everyone's time.");
			
			System.exit(0);
	}
			

}


