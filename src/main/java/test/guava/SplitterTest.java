package test.guava;

import com.google.common.base.Splitter;

/**
 * Created by ivan on 4/28/16.
 */
public class SplitterTest {
	public static void main(String[] args) {
		String str = "t1 , t2, ,t3";
		System.out.println(Splitter.on(',').trimResults().omitEmptyStrings().split(str));

		str = "k1:v1;k2:v2";
		System.out.println(Splitter.on(';').withKeyValueSeparator(':').split(str));
	}
}
