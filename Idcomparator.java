package Navigbleset;

import java.util.Comparator;

public class Idcomparator implements Comparator<Geniusstudent>{

	@Override
	public int compare(Geniusstudent o1, Geniusstudent o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId()) {
			return 0;
		}
		else if(o1.getId()>o2.getId()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	public int compare1(Geniusstudent o3, Geniusstudent o4) {
		if(o3.getsalary()==o4.getsalary()) {
			return 0;
		}
		else if(o3.getsalary()>o4.getsalary()) {
			return 1;
		}else {
			return -1;
		}
	}

}
