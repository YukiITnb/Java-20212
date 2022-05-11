package media;
import java.util.Scanner;

public class Media{
	private String title;
	private String category;
	private float cost;

	private Scanner key = new Scanner(System.in);

	public Media(){
		input();
	}

	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public void input(){
		System.out.print("Input title: ");
		String title = key.nextLine();
		this.title = title;
		System.out.print("Input category: ");
		String category = key.nextLine();
		this.category = category;
		System.out.print("Input cost: ");
		float cost = key.nextFloat();
		this.cost = cost;
		key.nextLine();
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public String toString(){
		String result = "\nTitle: " + title + "\nCategory: " + category + "\nCost" + cost;
		return result; 
	}
}