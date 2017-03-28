/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *    |_Car
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private long price;
	
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = newMaxSpeed;
		this.price = newPrice;
	}
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed){
		this.(newCompany,newModel,newColor,newMaxSpeed,0);
	}
	public Car3(String newCompany, String newModel, String newColor){
		this.(newCompany,newModel,newColor,0);
	}
	public Car3(String newCompany, String newModel){
		this.(newCompany,newModel,"");
	}
	public Car3(String newCompany){
		this.(newCompany,"");
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public long getPrice(){
		return price;
	}
	
	public void setCompany(String newCompany){
		company = newCompany;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	public void setMaxSpeed(int newMaxSpeed){
		if(maxSpeed >= 1){
		maxSpeed = newMaxSpeed;
		}
	}
	public void setPrice(long newPrice){
		price = newPrice;
	}
}
