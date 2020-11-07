package model;

public abstract class PublicPl extends Playlist{

	private double totalScore;
	private int rates;

	public PublicPl(String name){
		super(name);
		totalScore=0;
		rates=0;
	}

	public void upgrade(double rate){
		totalScore+=rate;
		rates++;
	}

	public double calculateRates(){
		return totalScore/rates;
	}

}