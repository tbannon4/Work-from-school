package loops;

import java.util.ArrayList;

import firstpackage.Song;

public class Playlist 
{
		private ArrayList<Song> playlist;
		public Playlist()
		{
			playlist = new ArrayList<Song>();
		}
		public void add(Song song)
		{
			playlist.add(song);
		}
		public boolean hasArtist(String artist)
		{
			for(int index = 0; index < playlist.size(); index++)
			{
				/*Song song = playlist.get(index);
    			String currentArtist = song.getArtist();
				if(currentArtist.equals(artist))
				{
					return true;
				} */
			//the good way to learn code ^^- easy to understand
			//this is how people really code
			if(playlist.get(index).getArtist().equals(artist))
			{
				return true;
			}
			}
			return false;
		}
		public Song longestName()
		{
			Song longestName = playlist.get(0);
			for(int index = 0; index < playlist.size(); index++)
			{
				Song song = playlist.get(index);
				String title = song.getTitle();
				int length = title.length();
				//can string together if the output of one method is the input of another
				if(length > longestName.getTitle().length())
				{
					longestName = song;
				}
			}
			return longestName;
		}
		public Song longestSong()
		{
			Song longest = playlist.get(0);
			for(int index = 0; index < playlist.size(); index++)
			{
				Song song = playlist.get(index);
				int length = song.getLength();
				if(length > longest.getLength())
				{
					longest = song;
				}
			}		
			return longest;
		}
		public int countShortestSong()
		{
			int count = 0;
			for(int index = 0; index < playlist.size(); index++)
			{
				Song song = playlist.get(index);
				int length = song.getLength();
				if(length < 180)
				{
					count++;
				}
			}
			return count;
		}
		
		
	

}
