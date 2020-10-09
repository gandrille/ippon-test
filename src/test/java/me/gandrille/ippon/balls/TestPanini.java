package me.gandrille.ippon.balls;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import me.gandrille.ippon.panini.PaniniAlbum;
import me.gandrille.ippon.panini.PaniniSticker;

public class TestPanini {

	@Test
	void addTheSameTwice() {
		// with
		PaniniAlbum album = new PaniniAlbum();
		PaniniSticker player = new PaniniSticker("player1", "team1", 2020);
		
		// add twice
		album.addToAlbum(player);
		album.addToAlbum(player);
		
		// must be present only once
		assertEquals(1, album.getDistinctCount());
	}
	
	@Test
	void addIdenticalTwice() {
		// with
		PaniniAlbum album = new PaniniAlbum();
		PaniniSticker player1 = new PaniniSticker("player1", "team1", 2020);
		PaniniSticker player2 = new PaniniSticker("player1", "team1", 2020);
		
		// add twice
		album.addToAlbum(player1);
		album.addToAlbum(player2);
		
		// must be present only once
		assertEquals(1, album.getDistinctCount());
	}
	
	@Test
	void massiveAdd() {
		// with
		PaniniAlbum album = new PaniniAlbum();
		PaniniSticker[] stickers = Arrays.asList(
				new PaniniSticker("player1", "team1", 2020),
				new PaniniSticker("player1", "team1", 2020),
				new PaniniSticker("player1", "team2", 2020),
				new PaniniSticker("player1", "team2", 2000),
				new PaniniSticker("player2", "team1", 2020),
				new PaniniSticker("player3", "team1", 2020),
				new PaniniSticker("player4", "team1", 2020)
		).toArray(new PaniniSticker[0]);
		
		// add all
		album.addToAlbum(stickers);
		 
		// check for duplicates
		assertEquals(6, album.getDistinctCount());
	}
}
