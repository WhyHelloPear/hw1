import java.util.Random;
public class Primate extends Animal{

	public void eat(){
		Random random = new Random();
		int roll = random.nextInt(10);
		if(roll <= 2){
			System.out.println(this.name+" has refused to eat!");
			this.sleep();
		}
		else if(roll <= 5 && roll >= 3){
			System.out.println(this.name+" has refused to eat!");
			this.makeNoise();
		}
		else{
			this.eat();
		}
	}
}