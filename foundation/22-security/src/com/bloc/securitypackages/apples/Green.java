package com.bloc.securitypackages.apples;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

 class Green extends Object {

	Green() {
		super(Green.class.getSimpleName(), 230, new Green(), 0.21d);
	}

	void bite() {
		setWeight(getWeight() - 0.02d);
	}

}