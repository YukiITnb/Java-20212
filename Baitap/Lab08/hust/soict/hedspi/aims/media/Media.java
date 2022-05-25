package media;

public abstract class Media {
    private String title;
    private String category;
    private float cost;
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public String getTitle() {
        return this.title;
    }
    public String getCategory() {
        return this.category;
    }
    public float getCost() {
        return this.cost;
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
}   