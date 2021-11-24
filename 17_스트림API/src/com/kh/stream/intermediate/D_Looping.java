package com.kh.stream.intermediate;

import java.util.Arrays;

public class D_Looping {
	/*
	 * 루핑
	 * 	- 요소 전체를 반복하는 것을 말한다.
	 *  - peek()
	 *  	- 중간 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위해 사용한다.
	 *  	- 최종 처리 메소드가 호출되어야 동작한다. (모든 중간 처리 메소드에 적용된다.)
	 * 	- forEach()
	 * 		- 최종 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위해 사용한다.
	 * 		- 최종 처리 메소드이기 때문에 이후에 sum()과 같은 다른 최종 처리 메소드를 호출할 수 없다.
	 */
	
	public void method1() {
		int sum = 0;
		int[] values = {1, 2, 3, 4, 5};
		
//		Arrays.stream(values).filter(value -> value % 2 == 0).peek(value -> System.out.println(value));
		sum = Arrays.stream(values).filter(value -> value % 2 == 0).peek(value -> System.out.println(value)).sum();
		
		System.out.println("Sum : " + sum);
		
//		Arrays.stream(values).filter(value -> value % 2 != 0).forEach(value -> System.out.println(value)).sum();
		// 에러 발생한다. 왜냐하면 최종 처리 메소드 forEach는 void를 리턴하기때문에(즉, 반환값이 없기 때문에) 호출 이후에 또 다른 최종 처리 메소드인 sum()을 할 수 없다.(심지어 sum은 반환값이 int임)
		
	}
	
}
