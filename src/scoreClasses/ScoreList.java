package scoreClasses;

import java.util.ArrayList;

public class ScoreList 
{
	private ArrayList<Score> scores;

	public ScoreList()
	{
		scores = new ArrayList<Score>();
	}
	public void add(Score score)
	{
		scores.add(score);
	}
	@Override
	public String toString()
	{
		String str = "";
		for(int index = 0; index < scores.size(); index ++)
		{
			Score score = scores.get(index);
			str += score.toString() + " " ;
		}
		return str;
	}
}
