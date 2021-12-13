package com.david.class135;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	int id;
	String name;
	String department;
	public Employee() {
		
	}
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(this.id);
		out.writeObject(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readInt();
		this.name = (String)in.readObject();
	}
	
	
}
