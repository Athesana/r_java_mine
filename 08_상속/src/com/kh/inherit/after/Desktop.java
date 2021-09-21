package com.kh.inherit.after;

/* 자식 클래스임!
 * 상속
 * 
 * [표현법]
 *		[접근제한자] class 클래스명 extends 부모 클래스명 {..}
 *
 * <상속의 장점>
 * - 적은 양의 코드로 새로운 클래스를 작성이 가능하다. 
 * - 코드를 공통적으로 관리하기 때문에 코드가 추가하거나 변경하기 용이하다.
 * - 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.
 */
public class Desktop extends Product {		// Product이라는 부모 클래스를 상속받았다.

	private boolean allInOne;  // 일체형 여부 (Desktop에만 있어야 하는 필드) 
	
	public Desktop() {
		System.out.println("자식 객체 기본 생성자");
	}
	
	/*
	 * 부모 필드를 초기화 할 수 있는 방법
	 * 
	 * 1. super. 를 통해서 부모의 필드에 직접 접근
	 *  - 부모의 필드가 private이면 직접 접근할 수 없다.
	 *  - 부모의 필드가 default이면 동일한 패키지 경로에 있어야만 직접 접근이 가능하다.
	 *  - 부모의 필드가 protected이면 상속관계일 때 자식 객체에서 직접 접근이 가능하다.
	 *  - 부모의 필드가 public이면 어디서든 접근이 가능하다.
	 *  
	 * 2. 부모의 setter 메소드를 통해서 초기화
	 *  - 부모에서 setter 메소드를 제공하면 자식 객체에서 setter 메소드를 통해서 필드의 초기화가 가능하다.
	 *  - setter는 public 접근 제한자를 갖기 때문에 가능한 것이다.
	 * 
	 * 3. 부모 생성자 호출해서 최고하
	 *  - super([매개값, ...])를 통해서 자식의 생성자에서 부모의 생성자를 호출할 수 있다. 
	 * 
	 */
	
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) { //자식객체에서 받은 애들
		super(brand, pCode, name, price);  // 내가 받아온거 가져가서 부모에 있는 필드를 초기화 시켜줘~ 부모한테 전달하기 위해서!
		
		// 부모의 게터세터 상속받기 때문에 이렇게 바로 접근 가능
//		this.setBrand(brand);
//		this.setPrice(price);
//		this.setName(name);
//		this.setpCode(pCode);
		
//		super.name = "메롱"; -> 부모 필드가 protected일 때 이런 식으로 초기화 가능
		
		this.allInOne = allInOne;  // 부모 필드 초기화 하고 그 다음으로 나머지들은 수행된다.
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override  // 부모 클래스에 있는 인포메이션을 자식 클래스에서 다시 정의하겠다! 부모한테 없는 애들 덧붙여서 재정의!
	public String information() {
		return super.information() + ", " + this.allInOne;
	}
	
	
	
	
}
