package giftshop;
import oops.gifts.chocolates.chocolate;
import oops.gifts.sweets.sweet;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class gift {
	private ArrayList<chocolate> chocolates;
	private ArrayList<sweet>sweets;
    public Gift()
    {
	this.chocolates = new ArrayList<chocolate>();
	this.sweets = new ArrayList<sweet>();
	
    }
    public boolean addchocolates(chocolate...chocolates) {
    	try {
    		this.chocolates.addAll(Arrays.asList(chocolates));
    		return true;
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		return false;
    	}
    	
    }
    public boolean addsweets(sweet...sweets) {
    	try {
    		this.sweets.addAll(Arrays.asList(sweets));
    		return true;
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		return false;
    	}
    	
    public void sort()
    {
    	Collections.sort(chocolates);
    	Collections.sort(sweets);
    	
    }
    public float findTotalWeight() {
    	return this.chocolates.stream()
    			.map(chocolate::getWeight)
    			.reduce(0.0f,Float::sum)
    			+
    			 this.sweets.stream()
    			.map(sweet::getWeight)
    			.reduce(O.Of,Float::sum);
    public float findTotalPrice() {
    	return this.chocolates.stream()
    			.map(chocolate::getPrice)
    			.reduce(O.Of,Float::sum)
    			+
    			 this.sweets.stream()
    			.map(sweet::getPrice)
    			.reduce(O.Of,Float::sum);
    }
 
    public ArrayList<chocolate>getchocolate(){
    	return chocolates;
    }
    public ArrayList setchocolates(ArrayList<chocolate>chocolates) {
    	this.chocolates = chocolates;
    }
    public ArrayList<sweet>getsweet(){
    	return sweets;
    }
    public ArrayList setsweets(ArrayList<sweet>sweets) {
    	this.sweets = sweets;
    }
    
}
