/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_Snack
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author : asus
 * @version : 1.0
 */
public class Snack {
	private String name ;
	private String company;
	private int price ;
	private int number ;

	
	public Snack() {
		
	}

	public String toString(){
		return "이름 : "+name+"\n제조사 : "+company+"\n가격 : "+String. format("%,d", price)
+"원\n개수 : "+number +"개";
	}
	
	public int calcPrice(){
		return price * number;
		
	}
public Snack(String name, String company, int price, int number ){
		
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
		
			
		}
	

public Snack(String name, String company, String price){
	this(name, company, 0,0);


}


public Snack(String name, String company){
	this(name, company,0,0);

	
}


	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCompany() {
		return company;
	}

	
	public void setCompany(String company) {
		this.company = company;
	}

	
	public int getPrice() {
		return price;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getNumber() {
		return number;
	}

	
	public void setNumber(int number) {
		this.number = number;
	}

}
