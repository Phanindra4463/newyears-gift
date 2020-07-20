package oops.gifts.chocolates;

public class chocolate implements Comparable<chocolate>{
	private String name;
	private float price;
	private float weight;
	
    public chocolate(String name,float price,float weight) {
    	this.name = name;
    	this.price = price;
    	this.weight = weight;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name = name;
    }
    public float getPrice()
    {
    	return price;
    }
    public void setPrice(float price)
    {
    	this.price = price;
    }
    
    @Override
	public String toString()
    {
    	return "chocolate \n" +
                "Name= " +name +'\n' +
                "price= " +price +'\n' +
                "weight= " +weight +'\n' ;
    }
    public float getWeight() {
    	return weight;
    }
    public void setWeight(float weight)
    {
    	this.weight = weight;
    }
    public int compareTo(chocolate o) {
    	return(int)(this.getPrice() - o.getPrice());
    }
	

}
