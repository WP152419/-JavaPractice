/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_PiggyBankTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author : asus
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
	
		
		FamilyMember[] member = {
				new FamilyMember("아빠 : "),
				new FamilyMember("엄마 : "),
				new FamilyMember("나 : "),
				new FamilyMember("남동생 : ")
		};
		
		System.out.println("가족 총 인원수 : "+FamilyMember.getMemberCnt()+"명");
		PiggyBank.putMoney(member[0], 10000);
		PiggyBank.putMoney(member[1], 5000);
		PiggyBank.putMoney(member[2], 2000);
		PiggyBank.putMoney(member[3], 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(member[2], 1000);
		PiggyBank.printBalance();
		
		}


		

	}


