
public class Player {
	
	//propperties
	private Room currentRoom;
	private int health;

	//constructor
	public Player() {
		// TODO Auto-generated constructor stub
		health = 100;
		
	}

	//functions
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public int getHealth() {
		return health;
		
	}
	
	public void damage(int amount) {
		this.health -= amount;
		
	}
	
	public boolean isAlive() {
		if (health > 0) {
			return true;
		}
		return false;
	}

	public void heal(int amount) {
		this.health += amount;
	}

	public void eat() {
		this.health += 5;
	}

}
