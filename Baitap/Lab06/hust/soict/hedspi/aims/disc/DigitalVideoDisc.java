package disc;

import media.Media;
import java.util.Scanner;

public class DigitalVideoDisc extends Media{
	private String director;
	private int lenght;
	private Scanner key = new Scanner(System.in);

	public DigitalVideoDisc(){
		super();
		inputDVD();
	}

	public void inputDVD(){
		System.out.print("Input director: ");
		String director = key.nextLine();
		this.director = director;
		System.out.print("Input lenght: ");
		int lenght = key.nextInt();
		this.lenght = lenght;
	}

	public String getDirector(){
		return director;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public int getLenght(){
		return lenght;
	}

	public void setLenght(int lenght){
		this.lenght = lenght;
	}

	public boolean search(String title){
		title = title.toLowerCase();
		String [] part = title.split(" ");
		int i;
		String tit = this.getTitle();
		tit = tit.toLowerCase();
		for (i = 0; i < part.length; i++){
			if (tit.contains(part[i]) == false)
				return false;
		}
		return true;
	}

	public String toString(){
		String result = "\nDirector: " + director + "\nLenght: " + lenght ;
		return result; 
	}
}