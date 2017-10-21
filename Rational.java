package ch15Exercises;

public class Rational {
	private int numerator;
	private int denominator;

	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	public Rational(int num1, int num2) {
		numerator = num1;
		denominator = num2;
	}

	public void printRational(Rational num) {
		System.out.println(numerator+"/"+denominator);
	}

	public void negate(Rational num) {
		System.out.println(0-numerator+"/"+denominator);
	}

	public void invert(Rational num) {
		int store = numerator;
		numerator = denominator;
		denominator = store;
		System.out.println(numerator+"/"+denominator);
	}

	public double toDouble(Rational num) {
		double doubleNum = (double) numerator;
		double doubleDem = (double) denominator;
		return doubleNum/doubleDem;
	}

	public int gcd(int int1, int int2) {
		int storage = 0; //used to store value if need to switch 
		if(int2>int1) { //if first number smaller than second, switch the two
			storage = int1;
			int1 = int2;
			int2 = storage;
		}
		if(int2 == 0) {
			return int1;
		} else {
			return gcd(int2, int1%int2); //euclid's algorithm
		}
	}

	public void reduce(Rational num) {
		int newNum = num.getNum()/gcd(num.getNum(), num.getDen()); //divide numerator by gcd
		int newDen = num.getDen()/gcd(num.getNum(), num.getDen()); //divide denominator by gcd
		num.setNum(newNum);
		num.setDen(newDen);
	//	System.out.println(num.getNum() + "/" + num.getDen());
	}

	public Rational add(Rational num1, Rational num2) {
		Rational newNum = new Rational(); //sum of num1 and num2
		int newNum1 = num1.getNum()*num2.getDen();
		int newNum2 = num2.getNum()*num1.getDen();
	//	num2.setNum(num2.getNum()*num1.getDen());
		newNum.setNum(newNum1+newNum2);
		newNum.setDen(num1.getDen()*num2.getDen());
		reduce(newNum);
		return newNum;
	} 

	public int getNum() { //getter for numerator
		return numerator;
	}

	public int getDen() { //getter for denominator
		return denominator;
	}

	public void setNum(int newNumerator) { //setter for numerator
		numerator = newNumerator;
	}

	public void setDen(int newDenominator) { //setter for denominator
		denominator = newDenominator;
	}

	public static void main(String[] args) {
		Rational yay = new Rational();
		Rational bananas = new Rational(1, 2);
		//	yay.printRational(yay);
		//	yay.negate(yay);
		//	yay.invert(yay);
		//	System.out.println(yay.toDouble(yay));
		//	yay.reduce(yay);
		int i = yay.gcd(12, 6);
		System.out.println(i);
		Rational orange;
		orange = yay.add(yay,  bananas);
		orange.printRational(orange);
	}
}
