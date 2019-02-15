public class Medialab
{
    public static void main(){
           double totalCost = 0.0;
           double totalRating = 0;
           double runTime = 0;
           int numSongs = 0;
           int numMovies = 0;
           int numBooks = 0;
           double aveCost;
           double aveRating;
           double runTimeHour2, runTimeHour3, runTimeHour4, runTimeHour5, runTimeHour6;
           double runTimeMin2, runTimeMin3, runTimeMin4, runTimeMin5, runTimeHou6;
           double chapters2, chapters3, chapters4;
           double pages2, pages3, pages4;
           double lengthSong2, lengthSong3, lengthSong4, lengthSong5, lengthSong6, lengthSong7;
           
           System.out.println("Welcome to your Media Library");
           
           Song song1 = new Song();
           System.out.println(song1);
           song1.setTitle("Really Really");  
           System.out.println("Song Title " + song1.getTitle());
           song1.setRating(8);
           System.out.println("Song Rating " + song1.getRating());
           song1.setPrice(1.99);
           System.out.println("Song Price " + song1.getPrice());
           
           Song song2 = new Song("Alot", 1.00, 10);
           numSongs = numSongs + 1;
           totalCost = totalCost + song2.getPrice();
           totalRating = totalRating + song2.getRating();
           lengthSong2 = 1; 
           
           Song song3 = new Song("Calling my Sprit", 0.99, 10);
           numSongs = numSongs + 1;
           totalCost = totalCost + song3.getPrice();
           totalRating = totalRating + song3.getRating();
           lengthSong3 = 1; 
           
           Song song4 = new Song("Rover", 1.00, 10);
           numSongs = numSongs + 1;
           totalCost = totalCost + song4.getPrice();
           totalRating = totalRating + song4.getRating();
           lengthSong4 =1; 
           
           Song song5 = new Song("Never Recover", 1.00, 10);
           numSongs = numSongs + 1;
           totalCost = totalCost + song5.getPrice();
           totalRating = totalRating + song5.getRating();
           lengthSong5 = 1; 
           
           Song song6 = new Song("Belly", 1.00, 10);
           numSongs = numSongs + 1;
           totalCost = totalCost + song6.getPrice();
           totalRating = totalRating + song6.getRating();
           lengthSong6 = 1; 
           
           Song song7 = new Song("Ever Season", 1.00, 10);
           numSongs = numSongs + 1; 
           totalCost = totalCost + song7.getPrice();
           totalRating = totalRating + song7.getRating();
           lengthSong7 = 1; 
           
           System.out.println("Number of Songs:");
           System.out.println(numSongs);
           
           System.out.println("Total cost" + totalCost);
           
           aveCost = totalCost / numSongs;
           System.out.println("Average Cost:" + aveCost);
           
           aveRating = totalRating / numSongs;
           System.out.println("Average Rating:" + aveRating);
           
           Movies movie1 = new Movies();
           System.out.println(movie1);
           movie1.setTitle("Movie Title " + movie1.getTitle());  
           System.out.println(movie1.getTitle()); 
           movie1.setRating(10);
           System.out.println("Movie Rating " + movie1.getRating());
           movie1.setPrice(5.50);
           System.out.println("Movie Price " + movie1.getPrice());
           
           Movies movie2 = new Movies("The Dark Knight", 15.00, 10);
           numMovies = numMovies + 1;
           totalCost = totalCost + movie2.getPrice();
           totalRating = totalRating + movie2.getRating();
           runTimeHour2 = 152/60;
           runTimeMin2 = 152%60;
           System.out.println("The Run Time of The Dark Night is " + runTimeHour2 + " Hours and " + runTimeMin2 + " Minutes."); 
           
           Movies movie3 = new Movies("Kill Bill", 15.00, 10);
           numMovies = numMovies + 1;
           totalCost = totalCost + movie3.getPrice();
           totalRating = totalRating + movie3.getRating();
           runTimeHour3 = 112/60;
           runTimeMin3 = 112%60;
           System.out.println("The Run Time of  is " + runTimeHour3 + " Hours and " + runTimeMin3 + " Minutes."); 
           
           Movies movie4 = new Movies("Mad Max", 15.00, 10);
           numMovies = numMovies + 1;
           totalCost = totalCost + movie4.getPrice();
           totalRating = totalRating + movie4.getRating();
           runTimeHour4 = 120/60;
           runTimeMin4 = 120%60;
           System.out.println("The Run Time of Mad Max is " + runTimeHour4 + " Hours and " + runTimeMin4 + " Minutes."); 
           
           Movies movie5 = new Movies("The Avengers", 15.00, 10);
           numMovies = numMovies + 1;
           totalCost = totalCost + movie5.getPrice();
           totalRating = totalRating + movie5.getRating();
           runTimeHour5 = 143/60;
           runTimeMin5 = 143%60;
           System.out.println("The Run Time of The Avengers is " + runTimeHour5 + " Hours and " + runTimeMin5 + " Minutes."); 
           
           Books book1 = new Books();
           System.out.println(book1);
           book1.setTitle("Book Title " + book1.getTitle());   
           System.out.println(book1.getTitle());
           book1.setRating(5);
           System.out.println("Book Rating " + book1.getRating());
           book1.setPrice(3.50);
           System.out.println("Book Price " + book1.getPrice());
           
           Books book2 = new Books("The hobbit", 3.00, 10);
           numMovies = numSongs + 1;
           totalCost = totalCost + movie5.getPrice();
           totalRating = totalRating + movie5.getRating();
           chapters2 = 19;
           pages2 = 310;
           System.out.println("The book The Hobbit has " + chapters2 + " and " + pages2 + " pages!");
           
           Books book3 = new Books("The Lost Girls of Paris", 5.00, 8);
           numMovies = numSongs + 1;
           totalCost = totalCost + movie5.getPrice();
           totalRating = totalRating + movie5.getRating();
           chapters3 = 20;
           pages3 = 384;
           System.out.println("The book The lost girls of Paris has " + chapters3 + " and " + pages3 + " pages!");
           
           Books book4 = new Books("The Tattooist of Auschwitz", 7.00, 5);
           numMovies = numSongs + 1;
           totalCost = totalCost + movie5.getPrice();
           totalRating = totalRating + movie5.getRating();
           chapters4 = 23;
           pages4 = 288;
           System.out.println("The book The Tattooist of Auzhwitz has " + chapters4 + " and " + pages4 + " pages!");
           
           
    }
}
