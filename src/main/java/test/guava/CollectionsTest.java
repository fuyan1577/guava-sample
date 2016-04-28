package test.guava;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ivan on 4/28/16.
 */
public class CollectionsTest {
	public static void main(String[] args) {
		ImmutableMap immutableMap = ImmutableMap.of("ivan", "male", "jobs", "IT");
		System.out.println("map value is : " + immutableMap);

		ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c", "d");
		System.out.println("imutable list is: " + immutableList);

		Set<Integer> set1 = ImmutableSet.of(1, 2, 3);
		Set<Integer> set2 = ImmutableSet.of(2, 3);
		System.out.println(Sets.intersection(set1, set2));
		System.out.print(Sets.difference(set1, set2));

		Map transformedMap = Maps.transformValues(immutableMap, new Function<String, String>() {

			public String apply(String input) {
				return input.concat(":_");
			}
		});

		System.out.println(transformedMap.values());

		List<Integer> numList = ImmutableList.of(1, 2, 3);
		System.out.println(Iterators.contains(numList.iterator(), 1));

	}
}
