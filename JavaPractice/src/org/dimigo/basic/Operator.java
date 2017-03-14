/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_Operator
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author : asus
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String.format("%,d", 10000);
		int g = 1700000;
		int wlrdnjs = 3;
		int wjavh = 1500;
	
		System.out.println("<<디미베네 연간 인건비>>");
		
		
		
		
		System.out.println("월 평균 급여 : " + String.format("%,d", g)+"원");
		System.out.println("점포 내 직원 수 : " +String.format("%,d", wlrdnjs)+"명");
		System.out.println("점포 수 : " +String.format("%,d", wjavh)+"개");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("연간 인건비 : " + String.format("%,d",(long) g * 12 * wlrdnjs * wjavh) + "원");
		

	}

}
