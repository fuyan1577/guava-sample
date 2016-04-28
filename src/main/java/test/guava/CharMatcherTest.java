package test.guava;

import com.google.common.base.CharMatcher;

/**
 * Created by ivan on 4/28/16.
 */
public class CharMatcherTest {
	public static void main(String[] args) {
		String str = "test12T";
		CharMatcher charmatcher1 = CharMatcher.inRange('a', 'z').or(CharMatcher.inRange('A', 'Z'));
		System.out.println(charmatcher1.retainFrom(str));

		System.out.println(CharMatcher.DIGIT.retainFrom(str));
		System.out.println(CharMatcher.DIGIT.removeFrom(str));
	}
}
