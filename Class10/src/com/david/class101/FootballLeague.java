package com.david.class101;

public enum FootballLeague {
	CHE(14, 37),
	MANU(12,32),
	MANC(14,33),
	LIV(13, 30),
	TOT(12,23);
	int matchPlayed;
	int points;
	private FootballLeague(int matchPlayed, int points) {
		this.matchPlayed = matchPlayed;
		this.points =points;
	}

	public String printStatus() { //  enum method
		return super.toString()+ " played "+this.matchPlayed+ " and got "+this.points+" points";
	}
	
	
}
