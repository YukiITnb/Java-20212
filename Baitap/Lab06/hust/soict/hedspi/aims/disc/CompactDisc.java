package disc;

import media.Media;
import java.util.Scanner;

public class CompactDisc extends Media{
	private String director;
	private int lenght;
	private Scanner key = new Scanner(System.in);

	public CompactDisc(){
		super();
		inputCD();
	}

	public void inputCD(){
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

	public String toString(){
		String result = "\nDirector: " + director + "\nLenght: " + lenght ;
		return result; 
	}

}