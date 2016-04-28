package test.guava;

import com.google.common.primitives.Ints;

/**
 * Created by ivan on 4/28/16.
 */
public class PrimitiveUtilsTest {
	public static void main(String[] args) {
		System.out.println(Ints.join(",", 1, 2));
		System.out.println(Ints.asList(1, 2));
	}
}
