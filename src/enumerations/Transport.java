package enumerations;

// An enumeration of Transport varieties
enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	private int speed;
	
	Transport(int s) { speed = s; }
	
	int getSpeed() { return speed; }
}