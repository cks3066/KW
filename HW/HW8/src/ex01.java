interface Player{
	void play();
	void stop();
}

interface ExPlayer extends Player{
	void slow();
}

class DVDPlayer implements Player, ExPlayer{
	public void play() {
		System.out.println("DVD ��� ����!");
	}
	public void stop() {
		System.out.println("DVD ��� ����!");
	}
	public void slow() {
		System.out.println("DVD ���� ��� ����!");
	}
}

public class ex01 {

	public static void main(String[] args) {
		DVDPlayer d = new DVDPlayer();
		Player p = new DVDPlayer();
		ExPlayer e = new DVDPlayer();
		System.out.println("*** DVDPlayer�� ���� d ***");
		d.play();
		d.stop();
		d.slow();
		System.out.println("*** Player�� ���� p ***");
		p.play();
		p.stop();
		System.out.println("*** ExPlayer�� ���� e ***");
		e.play();
		e.stop();
		e.slow();


	}

}
