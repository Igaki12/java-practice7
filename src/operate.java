
class operate {
	int robot_x = 0;
	int robot_y = 0;
	
	public void goN() {
		robot_y += 1;
	}
	public void goS() {
		robot_y -= 1;
	}
	public void goE() {
		robot_x += 1;
	}
	public void goW() {
		robot_x -= 1;
	}
	public void display() {
		System.out.println("���݂̍��W��" + robot_x +"," + robot_y + "�ł�");
	}

}
