package com.kodnest.objectaorientation.Encapsulation002;

public class StudentApp {
public static void main(String[] args) {
	Student st=new Student();
	st.setId(1);
	st.setName("ajith");
    st.setMark(99);
    st.setGender("male");
    System.out.println(st.getId()+" "+st.getName()+" "+st.getMark()+" "+st.getGender());
}
}
