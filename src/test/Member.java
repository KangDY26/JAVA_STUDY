package test;

public class Member {
String Id;
String name;
int age;

public Member(String name, String Id, int age) {
	this.Id = Id;
	this.name = name;
	this.age = age;
}

public void setAge(int age) {
	this.age = age;
}

public int getAge() {
	return age;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setId(String id) {
	Id = id;
}

public String getId() {
	return Id;
}

@Override
	public String toString() {
		return name + ' ' + Id + ' ' + age;
		
	}
	

}
