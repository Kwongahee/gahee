package com.edu.lambda.Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.*;

public class ConsumerExample {
	public static void main(String[] args) {

		// fonctional interface : 람다표현식 가능
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "출력합니다.");

		};
		consumer.accept("냠냠굿을 ");

		BiConsumer<Integer, Integer> biCon = (t, u) -> {

			System.out.println("result = " + (t + u));

		};
		biCon.accept(20, 40);
	}
}
