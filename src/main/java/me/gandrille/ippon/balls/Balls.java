package me.gandrille.ippon.balls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Balls {	
	
	public static List<ColorBall> parse(String stringBalls) {
		String[] keys = stringBalls.split(" ");
		return Arrays.stream(keys).map(ColorBall::fromSymbol).collect(Collectors.toList());
	}
	
	public static List<ColorBall> removeGreen(String stringBalls){
		List<ColorBall> list = parse(stringBalls);
		list.removeIf(ball -> ball.equals(ColorBall.GREEN));
		return list;
	}
	
	public static List<ColorBall> findRedFollowers(String stringBalls){
		List<ColorBall> followers = new ArrayList<ColorBall>();
		
		List<ColorBall> filtered = removeGreen(stringBalls);
        for (int i=0; i<filtered.size()-1; i++) {
            ColorBall cur = filtered.get(i);
            if (cur.equals(ColorBall.RED)) {
            	ColorBall next = filtered.get(i+1);
                followers.add(next);
            }
        }

        return followers;
	}
}

