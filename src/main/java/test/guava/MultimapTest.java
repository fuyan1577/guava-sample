package test.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * Created by ivan on 4/28/16.
 */
public class MultimapTest {
	public static void main(String[] args) {
		Multimap<String, String> multimap = ArrayListMultimap.create();
		multimap.put("k1", "v1");
		multimap.put("k1", "v2");

		System.out.println(multimap);
	}
}
