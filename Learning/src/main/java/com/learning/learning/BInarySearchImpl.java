package com.learning.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//
//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BInarySearchImpl {

//	@Autowired
//	@Qualifier("hello")
	SortAlgo sortalgorithm;

	public SortAlgo getSortalgorithm() {
		return sortalgorithm;
	}

	public void setSortalgorithm(SortAlgo sortalgorithm) {
		this.sortalgorithm = sortalgorithm;
	}

	public int search(int[] numbes, int numbertToSearch) {
		// logic for searching the number

		// sort

		// BubbleSortAlgorithm sort =new BubbleSortAlgorithm();
		int[] numbers = null;
		sortalgorithm.bubbleSort(numbers);

		System.out.println(sortalgorithm);
		// search

		return 3;
	}

	@PostConstruct
	public void posConstruct() {
		System.out.println("this is post man ");
	}

	@PreDestroy
	public void Predestroy() {
		System.out.println("this is Pre man ");
	}
}
