import java.io.IOException;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		Maze large_file = new Maze("./resources/test.txt");

		AStarPathFinder a2 = new AStarPathFinder(large_file, true);

		System.out.println(a2.solve());	
		System.out.println(a2.solve());
	}
}