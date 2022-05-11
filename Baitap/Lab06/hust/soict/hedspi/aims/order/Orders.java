package order;

// import utils.MyDate;
import media.Media;

import java.util.ArrayList;
// import java.util.List;

public class Orders{
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	public static int nbOrders = 0;

	private Orders(){

	}

	public static Orders createOrder(){
		if (nbOrders >= MAX_LIMITED_ORDERS)
		{
			System.out.println("You have reached maximum orders");
			return null;
		}
		else {
			nbOrders ++;
			return new Orders();
		}
	}

	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	// private MyDate date = new MyDate();


	// public void addDate(MyDate d){
	// 	date = d;
	// }

	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}

	public void removeMedia(Media media) {
		for(int i=0;i<itemsOrdered.size();i++) {
			if(itemsOrdered.get(i).getTitle().equals(media.getTitle()) == true ) {
				itemsOrdered.remove(i);
			}
		}
	}

	public float totalcost() {
		float total =0;
		for(int i = 0 ; i< itemsOrdered.size();i++) {
			total += this.itemsOrdered.get(i).getCost();
		}
		return total;
	}

	public void showOrder() {
		System.out.println("Ordered items:");
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println("" + this.itemsOrdered.get(i));
		}
	}
}