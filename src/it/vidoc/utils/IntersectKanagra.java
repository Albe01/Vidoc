package it.vidoc.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectKanagra {
	private ArrayList<Integer> result = new ArrayList<Integer>();

	public IntersectKanagra() {
		result.clear();
	}

	public ArrayList<Integer> IntersectKanagra(final List<Integer> l1, final List<Integer> l2 ) {
		ArrayList<Integer> tmpL = new ArrayList<Integer>();
		ArrayList<Integer> tmpL1 = new ArrayList<Integer>();
		ArrayList<Integer> tmpL2 = new ArrayList<Integer>();
		if (l1.size() > l2.size()) {
			tmpL.addAll(l1);
			tmpL1.addAll(l2);
			tmpL2.addAll(tmpL);
		} else {
			tmpL1.addAll(l1);
			tmpL2.addAll(l2);
		}
		Collections.sort(tmpL1);
		Collections.sort(tmpL2);
		if (tmpL1.get(tmpL1.size() - 1) < tmpL2.get(0)) {
			return result;
		}
		if (tmpL1.get(0) > tmpL2.get(tmpL2.size() - 1)) {
			return result;
		}
		Integer i1=0;
		Integer i2=0;
		while( i1 < tmpL1.size() && i2 < tmpL2.size())  {
			if (tmpL1.get(i1) < tmpL2.get(i2)) {
				i1++;
			} else {
				if (tmpL1.get(i1).equals(tmpL2.get(i2))) {
					result.add(tmpL1.get(i1));
					i1++;
					i2++;
				} else {
					i2++;
				}
			}
		}
	return result;
	}
}