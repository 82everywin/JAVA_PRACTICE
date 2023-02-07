package Interface;

public class Interface2 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.lisureSports();
		guide.sightseeing();
		guide.food();
	}

}

class KoreaTour implements Providable{

	@Override
	public void lisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
	
	
}
class JapanTour implements Providable{

	@Override
	public void lisureSports() {
		System.out.println("도쿄 타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
	
}
class TourGuide{
	private Providable tour = new JapanTour();
	
	public void lisureSports() { 
		tour.lisureSports();
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}

	public void food() {
		tour.food();
	}
}