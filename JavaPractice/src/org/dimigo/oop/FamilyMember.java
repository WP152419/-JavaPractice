/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_FamilyMember
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author : asus
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	
	public FamilyMember(){
	      
	   }
	   public FamilyMember(String memberName){
	      this.memberName = memberName;
	      FamilyMember.memberCnt++;
	   }
	
	   
	   
	   
	public static int getMemberCnt() {
		return 4;
	}
	
	public static void setMemberCnt(int memberCnt) {
		FamilyMember.memberCnt = memberCnt;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
