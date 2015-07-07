package com.bloc.securitypackages.citrus;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.colors.OrangeRed;
import com.bloc.securitypackages.Fruit;
public class Grapefruit extends Fruit {
	public Grapefruit() {
		super(Grapefruit.class.getSimpleName(), 210, new OrangeRed(), .48d);
	}
}