import disc.CompactDisc;
import disc.DigitalVideoDisc;
import utils.MyDate;
import order.Orders;

public class Aims{
	public static void main(String[] args) {
		Orders anOrder = Orders.createOrder();
		MyDate date = new MyDate();
		anOrder.addDate(date);

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);

		// anOrder.addDVD(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f);

		DigitalVideoDisc[] dvdList = {dvd1, dvd2};

		// anOrder.addDVD(dvd2);
		anOrder.addDVD(dvdList);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.99f);

		anOrder.addDVD(dvd3);

		CompactDisc cd1 = new CompactDisc("Top Trending",15f);
		CompactDisc cd2 = new CompactDisc("VN BXH",12.5f);

		anOrder.addCD(cd1);
		anOrder.addCD(cd2);

		// System.out.println(dvd1.search("the King"));

		anOrder.printOrders(anOrder);

		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());

		anOrder.removeDVD(dvd3);

		System.out.println("Remove " + dvd3.getTitle());
		System.out.println("-----------Updated---------- ");

		anOrder.printOrders(anOrder);

		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());	


		DigitalVideoDisc luckyd = anOrder.getALuckyItem();
		System.out.println("You are so lucky!!! " + luckyd.getTitle() + " is now free for you!!!");
		System.out.println("-----------Updated---------- ");
		anOrder.printOrdersLucky(anOrder,luckyd.getTitle());

		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost() - luckyd.getCost());	
	}
}