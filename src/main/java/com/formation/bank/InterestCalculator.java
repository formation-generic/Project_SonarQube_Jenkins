package com.formation.bank;

public interface InterestCalculator {

	/**
	 *
	 * @param rate
	 * Il est inutile de préciser public pour une methode dans une interface
	 * car elle l'est déjà par nature. C'est ce que PMD remonte
	 */
	 void setRate(double rate);
	 double calculate(double amount, double year);

}

