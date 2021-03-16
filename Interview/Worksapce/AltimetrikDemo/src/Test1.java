import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * Given someone's favorite songs (as a map) and a genre category (as a map as well). 
 * Find out this person's most favorite genre. For example,

"John": ["song1", "song2", "song3", "song4", "song8"],
"Jyotsna": ["song5", "song6", "song7"]

and

"Rock": ["song1", "song3"],
"Dubstep": ["song7"],
"Techno": ["song2", "song4"],
"Pop": ["song5", "song6"],
"Jazz": ["song8", "song9"]


 *
 */
public class Test1
{
	
	public static void main(String[] args)
	{
		HashMap<String, List<String>> favoriteSongs = new HashMap<>();
		HashMap<String, List<String>> songcategory = new HashMap<>();
		
		favoriteSongs.put("John",new ArrayList<>(Arrays.asList("song1", "song2", "song3", "song4", "song8")));
		favoriteSongs.put("Jyotsna",new ArrayList<>(Arrays.asList("song5", "song6", "song7")));
		
		
		songcategory.put("Rock",new ArrayList<>(Arrays.asList("song1", "song3")));
		songcategory.put("Dubstep",new ArrayList<>(Arrays.asList("song7")));
		songcategory.put("Techno",new ArrayList<>(Arrays.asList("song2", "song4")));
		songcategory.put("Pop",new ArrayList<>(Arrays.asList("song5", "song6")));
		songcategory.put("Jazz",new ArrayList<>(Arrays.asList("song8", "song9")));
		
		
		for(String user: favoriteSongs.keySet())
		{
			List<String> favoritesonglist = favoriteSongs.get(user);
			int minremain = favoritesonglist.size();
			List<String> favoritecategory = new ArrayList<>();
			
			for(String category: songcategory.keySet())
			{
				List<String> songs = songcategory.get(category);
				
				////
				//favoritesonglist.stream().
				
				
				///
				
				songs.removeAll(favoritesonglist);
				
				if(minremain>songs.size())
				{
					minremain = songs.size();
					favoritecategory.add(category);
				}
			}
			
			System.out.println("User "+user+" likes "+favoritecategory);
			
		}
		
		
		
	}
	
}

