package oop_Lecture14_Collections_samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare2Strings {

	public static void main(String[] args) {
		List<Module> mods = new ArrayList<Module>();
        mods.add(new Module("OOP"));
        mods.add(new Module("Prog 1"));
        mods.add(new Module("OOD"));
        Collections.sort(mods, new ModuleComp());
        System.out.println(mods);
        
	}

}
