package oops.gifts.sweets;

public class sweet implements Comparable<sweet>{
	private String name;
	private float price;
	private float weight;
	
    public sweet(String name,float price,float weight) {
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
    	return "sweet \n" +
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
    public int compareTo(sweet o) {
    	return(int)(this.getPrice() - o.getPrice());
    }


}
