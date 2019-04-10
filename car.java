package codecraft;

public class car {
	int id;
	int from;
	int to;
	int speed;
	int planTime;
	public car(String info) {
		this.id = Integer.parseInt(info.split(",")[0]);
		this.from = Integer.parseInt(info.split(",")[1]);
		this.to = Integer.parseInt(info.split(",")[2]);
		this.speed = Integer.parseInt(info.split(",")[3]);
		this.planTime = Integer.parseInt(info.split(",")[4]);
	}
}
