package test.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;

/**
 * Created by ivan on 4/28/16.
 */
public class JoinerTest {
	public static void main(String[] args) {
		String[] strArr = { "t1", null, "t2" };
		System.out.println(Joiner.on(',').skipNulls().join(strArr));
		System.out.print(Joiner.on(',').useForNull("-").join(strArr));

		int[] nums = { 1, 2, 3 };
		System.out.println(Ints.join(",", nums));

		ImmutableMap map = ImmutableMap.of("k1", "v1", "k2", "v2");
		System.out.println(Joiner.on(";").withKeyValueSeparator(":").join(map));
	}
}
