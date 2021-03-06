package com.bloc.securitypackages;

/************************************************
 *	ASSIGNMENT:
 *	Import the appopriate classes/packages below
/************************************************/
import com.bloc.securitypackages.apples.Macintosh;
import com.bloc.securitypackages.citrus.Grapefruit;
import com.bloc.securitypackages.apples.Green;
import com.bloc.securitypackages.colors.Orange;

/************************************************
 *	DO NOT MODIFY BELOW THIS BLOCK
/************************************************/

public class Main extends Object {

	public static void main(String [] args) {
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Macintosh();
		fruits[1] = new Green();
		fruits[2] = new com.bloc.securitypackages.citrus.Orange();
		fruits[3] = new Grapefruit();

		Color[] colors = new Color[5];
		colors[0] = fruits[0].getColor();
		colors[1] = fruits[1].getColor();
		colors[2] = fruits[2].getColor();
		colors[3] = fruits[3].getColor();
		colors[4] = new Orange();

		
		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
