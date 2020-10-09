package me.gandrille.ippon.index;

import java.util.*;

import java.text.Collator;

public class Index {

	private final static Collator collator = getCollator();

	private static Collator getCollator() {
		Collator collator = Collator.getInstance(Locale.FRANCE);
		collator.setStrength(Collator.SECONDARY);
		return collator;
	}

	public static int compare(final String str1, final String str2) {
		return collator.compare(str1, str2);
	}

	public static SortedSet<String> getIndexWords(List<String> words) {
		SortedSet<String> set = getEmptySet();

		for (String word : words) {
			if (!set.contains(word)) {
				set.add(word);
			}
		}
		return set;
	}

	public static SortedMap<String, List<Integer>> getIndexMap(List<String> words) {
		SortedMap<String, List<Integer>> map = new TreeMap<String, List<Integer>>(Index::compare);
		for (int i = 0; i < words.size(); i++) {
			String cur = words.get(i);
			if (map.containsKey(cur)) {
				map.get(cur).add(i);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(cur, list);
			}
		}

		return map;
	}

	private static SortedSet<String> getEmptySet() {
		return new TreeSet<String>(Index::compare);
	}
}
