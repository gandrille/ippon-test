package me.gandrille.ippon.panini;

public class PaniniSticker {
	private String playerName;
	private String teamName;
	private int year;

	public PaniniSticker(String playerName, String teamName, int year) {
		this.playerName = playerName;
		this.teamName = teamName;
		this.year = year;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaniniSticker other = (PaniniSticker) obj;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}
