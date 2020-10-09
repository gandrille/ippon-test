package me.gandrille.ippon.balls;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestBalls {

	@Test
	void parse() {
		String input = "G R B R G B B R G";
		List<ColorBall> expected = List.of(ColorBall.GREEN, ColorBall.RED, ColorBall.BLUE, ColorBall.RED, ColorBall.GREEN, ColorBall.BLUE, ColorBall.BLUE, ColorBall.RED, ColorBall.GREEN);
		List<ColorBall> actual = Balls.parse(input);

		assertIterableEquals(expected, actual);				
	}
	
	@Test
	void removeGreen() {
		String input = "G R B R G B B R G";
		List<ColorBall> expected = List.of(ColorBall.RED, ColorBall.BLUE, ColorBall.RED, ColorBall.BLUE, ColorBall.BLUE, ColorBall.RED);
		List<ColorBall> actual = Balls.removeGreen(input);

		assertIterableEquals(expected, actual);				
	}
	
	@Test
	void redFollowers() {
		String input = "G R B R G B B R G";
		List<ColorBall> expected = List.of(ColorBall.BLUE, ColorBall.BLUE);
		List<ColorBall> actual = Balls.findRedFollowers(input);

		assertIterableEquals(expected, actual);				
	}
}
