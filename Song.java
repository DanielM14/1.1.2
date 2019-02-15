public class Song
{
    private int rating;
    private String title;
    private boolean favorite;
    private double price;
    private static int numSongsInLibrary;
    private String lengthSong;
    
        public Song(){ 
        rating = 0; 
        title = "";
        price = 0.0;
    }
        public Song(String title, double price){
        this.title = title;
        this.price = price;
        this.rating = rating;
        
        numSongsInLibrary = numSongsInLibrary = 1;
    }
        public Song(String title, double price, int rating){
        this.title = title;
        this.price = price;
        numSongsInLibrary = numSongsInLibrary = 1;
    }
        public Song(String length){
        this.lengthSong = lengthSong;
    }
        public String getTitle(){
        return title;
    }
        public void setTitle(String t){
        title = t;
    }
        public Integer getRating(){
        return rating;
    }
        public Double getPrice(){
        return price;
    }
        public void setPrice(double p){
        price = p;
    }
        public void setRating(int r){
        rating = r;
    }
        public void addToFavorites(){
        favorite = true; 
    }
    
}