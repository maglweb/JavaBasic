package List;

class Date{
	int year;
	int month;
	int day;
	public Date(int y,int m,int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
}

public class ListTestDate {

	public static void main(String[] args) {
		Date[] days = new Date[3];
		for (int i = 0;i < 3; i++){
			days[i] = new Date(2017, 4, i+1);
			System.out.println(days[i]);
		}
	}

}
