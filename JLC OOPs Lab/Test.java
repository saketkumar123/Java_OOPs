class Test{
	public static void main(String[] args)throws Exception {
		Hello ob1 = new Hello();
		Object ob2 = ob1.clone();
		System.out.println("ok");
	}
}
class Hello implements Cloneable{}
/*class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public boolean equals(Object st){
		return this.name.equals(st.name);
	}
}*/