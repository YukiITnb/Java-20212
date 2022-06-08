package media;

public abstract class Media implements Comparable<Media>{
    private String title;
    private String category;
    private float cost;
    private int id;
    private int numId = 0;
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = numId++;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getCategory() {
        return this.category;
    }
    public float getCost() {
        return this.cost;
    }
    public int getId(){
        return this.id;
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
    public boolean equals(Object o){
        return (this.id == ((Media) o).getId());
    }
    public int compareTo(Media o){
        return this.getTitle().compareTo(o.getTitle());
    }
}