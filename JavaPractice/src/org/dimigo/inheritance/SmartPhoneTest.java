/**
 * 
 */
package org.dimigo.inheritance;

import org.dimigo.oop.FamilyMember;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_SmartPhoneTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author : asus
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000),
				
		};
		for (SmartPhone phone : s){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction(phone);
			phone.turnOff();
		}

	}

}
