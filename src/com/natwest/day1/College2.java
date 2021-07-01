package com.natwest.day1;

public class College2 {
	static int total;

//A person takes 3 exams in college, Physics, Chemistry, and Biology, 
//	each exam has a maximum of 150 marks. 
//	When all the exam marks have been added together, 
//	we can find the overall percentage that the person has got by multiplying 
//	their score by 100 and then dividing by 450.

//Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, 
//total and percentage. 
//This class should also have 2 methods:

//Method 1 - displays the results that the person got for each exam and then the total mark. 
//	Try to make the output neat and bespoke for each exam.
//Method 2 - which finds and displays the percentage that the person received for the exams overall.

//	public, private protected default - access modifiers 
//	non-static way of calling methods
//	results person1 = new Results (); 
//	creating an instance of the results class person1.percents();

//	static way of calling methods -one instance that is shared across everywhere
//	results.totalmarks();
//	return types - void returns nothing, int returns integer, String return a string, long double
//	give method a name -camelCase, 2nd word is a capital 
//	() - brackets which can have parameters, value to pass into the method -inputs 
//	scope represented by { - start of your method,} - where the method ends
//	before the last } bracket you write your return statement ( dont have this for void methods)
	public static int totalMarks(int physics, int chem, int bio, int math) {
		 total = physics + chem + bio + math;
		return total;

	}

	public static int percent() {
		int per = total*100/450;
		return per;
	}
	public static int average() {
		int ave = total/4;
				return ave;
	}
	}

