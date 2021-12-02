package oop_labs;

import java.util.Set;

public class Worker {
	private String name;
	private Set<Day> workDays;
	public Worker(String name, Set<Day> workDays) {
		 this.name = name;
		 this.workDays = workDays;
    }
	public String getName() {
		 return name;
	}
	public void setName(String name) {
		 this.name = name;
    }
    public Set<Day> getWorkDays() {
		 return workDays;
	}
	public void setWorkDays(Set<Day> workDays) {
		 this.workDays = workDays;
	}
}
