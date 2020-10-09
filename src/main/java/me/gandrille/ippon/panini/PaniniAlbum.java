package me.gandrille.ippon.panini;

import java.util.HashSet;
import java.util.Set;

public class PaniniAlbum {

	public Set<PaniniSticker> content = new HashSet<PaniniSticker>();

	// Add a list of stickers
	public void addToAlbum(PaniniSticker... stickers) {
		for (PaniniSticker sticker : stickers)
			addToAlbum(sticker);
	}

	// Add a sticker if not already present
	public boolean addToAlbum(PaniniSticker sticker) {
		return content.add(sticker);
	}

	// Return the number of different stickers
	public int getDistinctCount() {
		return content.size();
	}
}
