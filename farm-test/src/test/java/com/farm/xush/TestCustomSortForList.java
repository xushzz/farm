package com.farm.xush;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.farm.xush.project.CustomSorForList;

public class TestCustomSortForList {

	@Test
	public void listCustomSortTet(){
		String[] regulation = {"dog","bird","cat"};
		String[] ordered = {"dog","cat","bird","bird","dog","cat","dog","bird"};
		final List<String> regulationOrder = Arrays.asList(regulation);
		List<String> orderedList = Arrays.asList(ordered);	
		
		CustomSorForList customSorForList = new CustomSorForList();
		List<String> list = customSorForList.listCustomSort(regulationOrder, orderedList);
		System.out.println(list);
	}
}
