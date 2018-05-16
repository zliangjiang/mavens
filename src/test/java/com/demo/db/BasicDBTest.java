package com.demo.db;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import com.demo.object.Student;

public class BasicDBTest {

	public static byte[] toBytes(Student student) throws IOException {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		DataOutputStream dout = new DataOutputStream(bout);
		dout.writeUTF(student.getName());
		dout.writeInt(student.getAge());
		dout.writeDouble(student.getScore());
		return bout.toByteArray();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student("zlj",21, 99.9d);
		Student b = new Student("abc",22, 89.9d);
		try {
			BasicDB db = new BasicDB("./","test");
			db.put("1", toBytes(a));
			db.put("2", toBytes(b));
			db.put("3", toBytes(b));
			db.put("4", toBytes(b));
			db.put("5", toBytes(b));
			db.put("6", toBytes(b));
			db.put("7", toBytes(b));
			db.display();
			db.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
