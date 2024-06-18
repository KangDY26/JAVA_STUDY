import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class D04_Genric {
	/*
	 	# 제네릭 (Genric)
	 	
	 	- 클래스를 정의할 때 타입을 나중에 지정하겠다고 설정해두는 것
	 	- 제네릭이 사용된 클래스의 인스턴스 생성시 <>를 통해 제네릭 타입을 지정할 수 있다
	 	
	 */
	public static void main(String[] args) {
		// 제네릭 미설정시 Oject 타입이 된다
		GenricClss instance1 = new GenricClss();
		
		instance1.setValue(8080);
		System.out.println(instance1.getValue());

		GenricClss<String> instance2 = new GenricClss<>();
		
		instance2.setValue("Cow");
		System.out.println(instance2.getValue());
		
		jiphapTools<String> tools = new jiphapTools();
		
		List<String> cars = new ArrayList<>();
		List<String> animals = new LinkedList<>();
		
		Collections.addAll(cars, "마티즈", "소나타", "K5", "스타렉스");
		Collections.addAll(animals, "사자", "호랑이", "곰", "돼지");

		
		Set<String> unionResult = tools.union(cars, animals);
		
		System.out.println(unionResult);
	}
}

class GenricClss<T> {
	// T : 인스턴스가 생성되면서 결정되는 타입 (다른이름 써도 됨)
	T value;
	
	int getNum() {
		return 10;
	}
	
	T getValue() {
		return value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
}

// class를 public으로 만들 수 없으면
class jiphapTools<E> {
	
	// 메서드가 public 이어봤자 다른 패키지에서 가져다 쓸 수 없다
	public Set union(Collection<E> a, Collection<E> b){
		Set<E> unionSet = new HashSet<>();
		
		unionSet.addAll(a);
		unionSet.addAll(b);
		
		return unionSet;
	}
	
	public Set<E> intersection(Collection<E> a, Collection<E> b){
		Set<E> interSet = new HashSet<E>();
		
		interSet.addAll(a);
		interSet.retainAll(b);
		
		return interSet;		
	}
}













