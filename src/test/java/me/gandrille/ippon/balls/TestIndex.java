package me.gandrille.ippon.balls;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

import org.junit.jupiter.api.Test;

import me.gandrille.ippon.index.Index;

public class TestIndex {

	@Test
	void frenchAlphabeticalOrder() {
		assertTrue(Index.compare("é", "e") > 0);
		assertTrue(Index.compare("é", "f") < 0);
		assertTrue(Index.compare("e", "e") == 0);
	}

	@Test
	void nonCaseSensitive() {
		assertTrue(Index.compare("E", "e") == 0);
		assertTrue(Index.compare("É", "é") == 0);
	}

	@Test
	void indexBuilding() {
		// with
		List<String> input = List.of("Ippon", "IPPON", "IpponTech");

		// build index
		SortedSet<String> actual = Index.getIndexWords(input);

		// check
		assertEquals("Ippon", actual.first());
		assertEquals(2, actual.size());
	}

	@Test
	void indexMapBuilding() {
		// with
		List<String> input = List.of("Ippon", "IPPON", "IpponTech");

		// build index
		SortedMap<String, List<Integer>> actual = Index.getIndexMap(input);

		// check
		assertIterableEquals(List.of(0, 1), actual.get("Ippon"));
	}
}
