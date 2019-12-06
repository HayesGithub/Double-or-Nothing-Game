package Coinflipmain;

import java.util.Scanner;

import java.util.Random;

public class Mainclass {

	public static void main (String []args) {	

		System.out.println("Welcome to Double or Nothing!\n");

		coinflipbody coinflipbodyObject = new coinflipbody();
		//Create new object from the "coinflipbody" class

		coinflipbodyObject.menudisplay();
		//Access new object menudisplay() method from "coinflipbody" class
	}
}
