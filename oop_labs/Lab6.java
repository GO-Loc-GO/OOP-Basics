package oop_labs;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Lab6 {
	private static Set<Day> getNoWorkDay(Worker[] workers) {
		 Set < Day > noWorkDays = EnumSet.allOf(Day.class);
		 for (Worker worker: workers) {
			 noWorkDays.removeAll(worker.getWorkDays());
		 }
		 return noWorkDays;
	}
	private static Set < Day > getDayLeast1People(Worker[] workers) {
		 Set < Day > leastOnePeopleDays = EnumSet.noneOf(Day.class);
		 for (Worker worker: workers) {
			 leastOnePeopleDays.addAll(worker.getWorkDays());
	     }
		 return leastOnePeopleDays;
   }
	private static Set < String > getPeopleWorkOnMonAndTue(Worker[] workers) {
		 Set < String > names = new HashSet < >();
		 for (Worker worker: workers) {
			 if (worker.getWorkDays().containsAll(EnumSet.of(Day.MONDAY, Day.TUESDAY))) {
				 names.add(worker.getName());
			 }
	     }
		 return names;
	}
	public static void main(String[] args) {
		Day day=Day.SATURDAY;
		System.out.println(day.isWeekday());
		Set<Day> DLoc = new HashSet<Day>();
		DLoc.add(Day.MONDAY);
		DLoc.add(Day.FRIDAY);
		Worker Loc = new Worker("Loc", DLoc);
		System.out.println(Loc.getWorkDays());
		Worker John = new Worker("John", EnumSet.of(Day.MONDAY,Day.TUESDAY,Day.WEDNESDAY,Day.FRIDAY));
		Worker Edward = new Worker("Edward", EnumSet.of(Day.TUESDAY,Day.THURSDAY,Day.SATURDAY));
		Worker Marco = new Worker("Marco", EnumSet.of(Day.TUESDAY,Day.THURSDAY));
		Worker[] workers = new Worker[] {John,Edward,Marco};
		System.out.println("No one will work for" + getNoWorkDay(workers));
		System.out.println("At least one person will work for " + getDayLeast1People(workers));
		System.out.println(getPeopleWorkOnMonAndTue(workers) + "will work for Mon and Tue");
	}
}

