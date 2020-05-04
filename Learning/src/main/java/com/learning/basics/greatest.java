package com.learning.basics;

public class greatest {

	Datalogic datalogic;

	public greatest(Datalogic datalogic) {
		super();
		this.datalogic = datalogic;
	}

	

	public int findGreatestOfAll() {
		int result[] = datalogic.data();
		int bigger = Integer.MIN_VALUE;
		for (int i : result) {
			if (i > bigger) {
				bigger = i;
			}
		}

		return bigger;
	}

}
