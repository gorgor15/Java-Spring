package Practice.Practice1;

public class PlayerLevel {
	public void run() {
		
	}
	public void jump() {
	}
	public void turn() {
		
	}
	public void showLevelMessage() {
		
	}
	public void go (int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
}
