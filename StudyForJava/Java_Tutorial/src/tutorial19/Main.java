package StudyForJava.Java_Tutorial.src.tutorial19;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Mage("마법사");
		
		for(int i=0; i<=heros.length;i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) {
				Warrior temp = (Warrior) heros[i];
				temp.groundCutting();
			}
			else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else
			{
				Mage temp = (Mage) heros[i];
				temp.freezing();
			}
		}
	}

}
