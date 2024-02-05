package exercice_geometry;

public class App {

	public static void main(String[] args) {
		
		Point centre = new Point(3.0,4.0);
		Cercle monCercle = new Cercle(centre, 3.0);
		Point pointA = new Point(4.0,6.0);
		Point pointB = new Point(7.0,1.0);
		
		System.out.println(monCercle.toString());
		monCercle.testAppartenance(pointA);
		monCercle.testAppartenance(pointB);

	}

}
