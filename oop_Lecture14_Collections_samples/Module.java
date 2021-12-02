package oop_Lecture14_Collections_samples;

import java.util.Comparator;

public class Module {
	private String code;
	public Module(String c){code=c;}
	public String toString(){return code;}
}
class ModuleComp implements Comparator<Module>{
	public int compare(Module m1, Module m2) {
		return m1.toString().compareTo(m2.toString());
	}
}
