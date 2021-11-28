package Practice.Practice1;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	// ��� ������ ����
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		level.showLevelMessage();
		this.level =level;
		
	}
	
	public void play(int count) {
		level.go(count);
	}
}
