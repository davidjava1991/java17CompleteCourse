package com.david.class136;

import java.lang.reflect.Field;
import java.util.Date;

import com.david.class136.DbColumn.Type;

public class Student {
	@DbColumn(name ="studentId",length = 30)
	int id;
	@DbColumn(name ="studentName",length = 40,type =Type.VARCHAR)
	String name;
	@DbColumn(name ="DateOfBirth",length = 20,type =Type.DATE)
	Date dob; 
	public static void main(String[] args) {
		Field[] fields = Student.class.getDeclaredFields();
		for(Field f : fields) {
			DbColumn d = f.getDeclaredAnnotationsByType(DbColumn.class)[0];
			System.out.println("=============");
			System.out.println("Field name : "+d.name());
			System.out.println("Field length : "+d.length());
			System.out.println("Field Type : "+d.type());
		}
	}
}
