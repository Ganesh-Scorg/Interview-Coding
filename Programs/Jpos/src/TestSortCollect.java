import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Hosting {

	private int Id;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getWebsites() {
		return websites;
	}

	public void setWebsites(long websites) {
		this.websites = websites;
	}

	private String name;
	private long websites;

	public Hosting(int id, String name, long websites) {
		Id = id;
		this.name = name;
		this.websites = websites;
	}

	// getters, setters and toString()
}

public class TestSortCollect {

	

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));
		list.add(new Hosting(6, "linode.com", 100000));

		// example 1
		Map result1 = list.stream().sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
				.collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, // key
																					// =
																					// name,
																					// value
																					// =
																					// websites
						(oldValue, newValue) -> newValue, // if same key, take
															// the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep
											// order
		));
		
		Map result2 = list.stream().sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
				.collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, // key
																					// =
																					// name,
																					// value
																					// =
																					// websites
						(oldValue, newValue) -> oldValue, // if same key, take
															// the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep
											// order
		));

		System.out.println("Result 1 : " + result1);
		System.out.println("Result 1 : " + result2);

	}
}