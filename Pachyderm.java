import java.util.Random;
public class Pachyderm extends Animal{

	public Pachyderm(String name, String noise, String type){
		super(name,noise,type);
	}

	public void roam(){
		Random random = new Random();
		int roll = random.nextInt(3);
		if(roll == 0){
			System.out.println(this.name+" has refused to exercise! They chose at you instead!");
		}
		else{
			System.out.println(this.name+" roams around.");
		}
	}
}
