import java.util.*;  

public class Zoo{
	

	public static void main(String[] args){  

    	Scanner scan= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.println("Welcome to The Zoo!");  
		System.out.println("Enter the number of days you'd like to simulate:");
		int days = scan.nextInt();
		System.out.println("================================================\n");  


		List<Animal> animals = new ArrayList<Animal>();

		Canine wolf = new Canine();
		Canine dog = new Canine();
		Feline tiger = new Feline();
		Feline cat = new Feline();
		Feline lion = new Feline();
		Pachyderm rhino = new Pachyderm();
		Pachyderm hippo = new Pachyderm();
		Pachyderm elephant = new Pachyderm();
		Primate monkey = new Primate();
		Primate orangutan = new Primate();
		Primate baboon = new Primate();

		wolf.setInfo("Wendy","howl", "wolf");
		dog.setInfo("Dumbo", "bark", "dog");
		tiger.setInfo("Tommy", "roar", "tiger");
		cat.setInfo("Candice", "meow", "cat");
		lion.setInfo("Leo", "roar", "lion");
		rhino.setInfo("Ronny", "snort", "rhino");
		hippo.setInfo("Hooper", "snort", "hippo");
		elephant.setInfo("Elly","trumpet", "elephant");
		monkey.setInfo("Manny", "howl", "monkey");
		orangutan.setInfo("Ori", "howl", "orangutan");
		baboon.setInfo("Bonny", "howl", "baboon");

		animals.add(wolf);
		animals.add(dog);
		animals.add(tiger);
		animals.add(cat);
		animals.add(lion);
		animals.add(rhino);
		animals.add(hippo);
		animals.add(elephant);
		animals.add(monkey);
		animals.add(orangutan);
		animals.add(baboon);

		int length = animals.size();

		for(int i = 1; i <= days; i++){
			System.out.println("Day "+i+":");
			ZooKeeper keeper = new ZooKeeper();
			System.out.println("Zookeeper has entered the zoo!");
			for(int j = 0; j < length; j++){
				Animal currentAnimal = animals.get(j);
				keeper.wake(currentAnimal);
				keeper.rollCall(currentAnimal);
				keeper.feed(currentAnimal);
				keeper.exercise(currentAnimal);
				keeper.sleep(currentAnimal);
			}
			keeper = null;
			System.out.println("Zookeeper has left the zoo!\n");
		}
    }  
}