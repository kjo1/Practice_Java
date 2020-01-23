
public class Main extends Player {

	public static void main(String[] args) {

		Main main = new Main();
		main.play("iKON - My type");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {

		System.out.println("Play " + songName);
	}

	@Override
	void pause() {

		System.out.println("Pause the song");

	}

	@Override
	void stop() {

		System.out.println("Stop the song");

	}

}
