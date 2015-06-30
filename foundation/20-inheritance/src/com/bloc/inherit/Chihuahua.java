package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the Chihuahua class below
 *
 *	Chiuahuas must be fed 5 times in order to grow
 *	larger.
/************************************************/
class Chihuahua extends Dog {
	public void feed(){
		mFeedCounter++;
		mWeight += WEIGHT_GAINED_FROM_FEEDING;
		if (mFeedCounter % 5 == 0){
			changeSize(true);
		}   
	}
}
