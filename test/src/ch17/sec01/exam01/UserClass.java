package ch17.sec01.exam01;

import java.util.function.Consumer;


public class UserClass implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}
