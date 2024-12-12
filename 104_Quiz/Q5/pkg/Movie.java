package pkg;

public class Movie{

String movieName;
double rating;
int numRatings;
int revenue;

public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
}
public Movie(String movieName, double rating, int numRatings, int revenue){
    this.movieName = movieName;
    this.rating = rating;
    this.numRatings = numRatings;
    this.revenue = revenue;
}

public void movieToString(){
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings: " + numRatings);
    System.out.println("Revenue " + revenue);
    System.out.println(" ");
}
public String getMovieName(){
    return movieName;
}

public int getRevenue(){
    return revenue;
}
public double getRatings(){
    return rating;
}

public void addRating(double a){
    this.rating = (rating*numRatings + a)/(numRatings+1);
    this.numRatings = numRatings +1;
}

public boolean compareRatings(Movie b){
    double c = b.getRatings();
     if(this.rating>c)
        return true;
    else if(this.rating<c)
        return false;
    else
        return false;
}
public int revenueToString(){
    return this.revenue;
}
public void pirateMovie(){
    //no more time :(
}
}
