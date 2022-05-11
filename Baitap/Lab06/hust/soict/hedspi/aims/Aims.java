import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import disc.CompactDisc;
import disc.DigitalVideoDisc;
// import utils.MyDate;
import order.Orders;
import media.Book;

public class Aims{
	public static void Showmenu(){
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		// int numberorder = 0;
		List<Orders> orders = new ArrayList<>();
		int choose = 10;
		while(choose !=0){
			Showmenu();
			choose = key.nextInt();
			switch(choose){
				case 1:
					Orders od = Orders.createOrder();
					orders.add(od);
					// numberorder++;
					break;
				case 2:
					System.out.println("Choose type of media: ");
					System.out.println("1.Book\n2.CompactDisc\n3.DigitalVideoDisc");
					int type = key.nextInt();
					switch(type){
						case 1:
							System.out.println("Add a new book: ");
							Book book = new Book();
							System.out.println(book);
							// orders.get(Orders.nbOrders-1).addMedia(book);
							break;
						case 2:
							System.out.println("Add a new CD: ");
							CompactDisc cd = new CompactDisc();
							System.out.println(cd);
							orders.get(Orders.nbOrders-1).addMedia(cd);
							break;
						case 3:
							System.out.println("Add a new DVD: ");
							DigitalVideoDisc dvd = new DigitalVideoDisc();
							System.out.println(dvd);
							break;
					}
					break;
				case 3:
					break;
				case 4:
					// od.showOrder();
					orders.get(Orders.nbOrders-1).showOrder();
					break;
					
			}
		}
		
	}
}