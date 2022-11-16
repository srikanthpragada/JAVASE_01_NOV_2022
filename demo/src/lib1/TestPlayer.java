package lib1;

record Player(String name, String game) {}

public class TestPlayer {

	public static void main(String[] args) {
		var p1 = new Player("Dhoni", "C");
		var p2 = new Player("Ronaldo", "Football");
		
		System.out.println(p1);
		System.out.println(p2.name());

	}

}
