package loops;

import firstpackage.Song;

public class PlaylistRunner 
{

	public static void main(String[] args)
	{
		Playlist playlist = new Playlist();
		Song song = new Song("Britiney Spears ", " Toxic ", 240);
		playlist.add(song);
		playlist.add(new Song("Cavetown ", " Lemon Boy ", 190));
		playlist.add(new Song("Lovejoy ", "Taunt ", 230));
		playlist.add(new Song("Harry Syles ", " She ", 160));
		playlist.add(new Song("Coldplay ", " Yellow ", 260));
		playlist.add(new Song("Cavetown ", "Devil Town ", 310));
		
		Song longest = playlist.longestSong();
		System.out.println(longest);
	
		int count = playlist.countShortestSong();
		System.out.println(count);
		
		Song longestName = playlist.longestName();
		System.out.println(longestName);
		
		boolean hasArtist = playlist.hasArtist("Cavetown ");
		System.out.println("This playlist contains Cavetown: " + hasArtist);
	}

}
