package com.cts.learning.concepts;

public enum TheatreTier {
	SILVER,
	GOLD,
	PLATINUM,
	DIAMOND;
	int cost;
	public int getCost()
	{
		switch(this)
		{
		case SILVER:
			cost = 200;
			break;
		case GOLD:
			cost = 300;
			break;
		case PLATINUM:
			cost =  450;
			break;
		case DIAMOND:
			cost = 600;
			break;
		default:
			cost = 0;
			break;
		}
		
		return cost;
	}
}
