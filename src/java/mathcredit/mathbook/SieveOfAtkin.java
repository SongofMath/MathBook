package mathcredit.mathbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfAtkin {

	public final static List<Integer> setList = Arrays.asList(1,7,11,13,17,19,23,29,31,37,41,43,47,49,53,59);
	
	public static List<Integer> getPrimes(int lowerlimit, int limit) {
		boolean[] arr = new boolean[limit];
		List<Integer> results = new ArrayList<Integer>();
		
		if(limit>2&&lowerlimit<=2) {results.add(2);}
		if(limit>3&&lowerlimit<=3) {results.add(3);}
		if(limit>5&&lowerlimit<=5) {results.add(5);}
		
		for (int i = lowerlimit; i < limit; i++) {
			int r = i%60;
			if(setList.contains(r)) {
				arr[i] = !arr[i];
			}
		}
		
		for(int k = lowerlimit; k < limit; k++) {
			if(arr[k]) {
				results.add(k);
			}
			int sq = k * k;
			for(int t = 0; t < limit; t++) {
				if(t%sq==0) {
					arr[t] = false;
				}
			}
		}
		return results;
	}
}
