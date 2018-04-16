package com.airhacks;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author smccollum
 */
@XmlRootElement
class Person {
	String name;
	Integer age;

	public Person(){}

	public Person(String name, Integer age){
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, age: %d", name, age);
	}
}
