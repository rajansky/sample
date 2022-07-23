package com.sam;

import java.io.File;
import java.io.IOException;

public class Sample {
	public static void main(String[]args) throws IOException {
		File f = new File("D:\\raja 10am\\pending topic\\man\\son\\file operation.txt\\time.txt");
		boolean b =f.createNewFile();
		System.out.println(b);
		
		boolean c = f.canRead();
		System.out.println(c);
		
		boolean d =f.canWrite();
		System.out.println(d);
		
		boolean e = f.isFile();
		System.out.println(e);
		
		boolean h = f.isDirectory();
		System.out.println(h);
		
		boolean d1=f.canWrite();
		System.out.println(d);
		
		boolean e1 = f.isFile();
		System.out.println(e);
		
		boolean h22 = f.isDirectory();
		System.out.println(h);

}}
