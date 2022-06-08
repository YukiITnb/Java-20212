package disc;

public class Track implements Playable ,Comparable<Track>{
    private String title;
    private int length;
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return this.title;
    }
    public int getLength() {
        return this.length;
    }
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public boolean equals(Object o){
        return (this.length == ((Track) o).getLength()) && (this.title == ((Track) o).getTitle());
    }
    @Override
    public int compareTo(Track o) {
        int l1 = this.getLength();
        int l2 = o.getLength();
        int cmp = Integer.compare(l1, l2);
        return cmp;
    }
}