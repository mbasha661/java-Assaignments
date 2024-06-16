package moodleAssign;

public class Theatre {
	String movie_name;
	int movie_time;

	public static void main (String[] args)
	{
	Theatre movie1=new Theatre();
	Theatre movie2=new Theatre();
	movie1.movie_name="Jailer";
	movie2.movie_name="Leo";
	movie1.movie_time=630;
	movie2.movie_time=7;
	movie1.watch_movie();
	movie2.watch_movie();

	}
	public void watch_movie()
    {
    System.out.println("Watching " + movie_name);
    System.out.println("Show Time is " +movie_time);
    }

	
	
}
