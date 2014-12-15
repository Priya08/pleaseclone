package com.bayamp.java.package1;

public class WordsCountinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] wordListOne = {"24/7" ,"multiTiar", 
			"30,OOO foot", "B-to-B" , "win-win" , "frontend"
			, "web- based" , "pervasive", "smart", "sixsigma",
			"cri tical-path" , "dynamic"} ;
			String[] wordListTwo = { "empowered", "sticky","value-added", "oriented", "centric", "distributed",
			"clustered", "branded", "outaide-the-box", "positioned","networked", " f ocused" , "leveraged", "aligned",
			"targeted", "shared" ,"cooperative", "accelerated"};
			String[] wordListThree = {"process", "tippingpoint",
					"solution", "architecture", "core competency" ,
					"strategy", "mindshare", "portal" , "apace" , "vision",
					"~adigm", "~ssion"};
			// find out how many owrds are in each list
			int oneLength= wordListOne.length;
			int twoLength = wordListTwo.length;
			int threeLength= wordListThree.length;
			
			//Generate Three random words
			int rand1 = (int) (Math.random()*oneLength);
			int rand2 = (int)(Math.random()*twoLength);
			int rand3 = (int) (Math.random()*threeLength);
			System.out.println(rand1);
			System.out.println(rand2);
			System.out.println(rand3);
			//build a new phrase
			String Phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
			System.out.println(Phrase);
			
	}

}
