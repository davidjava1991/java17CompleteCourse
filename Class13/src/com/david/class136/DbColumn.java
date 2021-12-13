package com.david.class136;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD)
public @interface DbColumn {
	String name();
	int length();
	enum Type{ NUMBER,VARCHAR, DATE, BLOB};
	Type type() default Type.NUMBER;
 
}
