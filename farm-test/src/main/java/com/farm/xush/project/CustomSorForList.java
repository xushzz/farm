package com.farm.xush.project;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSorForList {

	public List<String> listCustomSort(final List<String> regulationList,
			List<String> orderedList) {
		Collections.sort(orderedList, new Comparator<String>() {
			public int compare(String o1, String o2) {
				int io1 = regulationList.indexOf(o1);
				int io2 = regulationList.indexOf(o2);

				return io1 - io2;

			}
		});

		return orderedList;
	}
}
