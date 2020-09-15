import java.util.Random;
public class Feline extends Animal{

	public void sleep(){
		Random random = new Random();
		int roll = random.nextInt(10);
		if(roll <= 2){
			System.out.println(this.name+" has refused to sleep!");
			this.roam();
		}
		else if(roll <= 5 && roll >= 3){
			System.out.println(this.name+" has refused to sleep!");
			this.makeNoise();
		}
		else{
			this.sleep();
		}
	}
}