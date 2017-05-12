/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_PersonTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 11.
 * </pre>
 *
 * @author : asus
 * @version : 1.0
 */
public class PersonTest {

	   /**
	    * @param args
	    */
	   public static void main(String[] args) {
	      Person[] p = {
	    		new Person("Tom"),
	    		new Korean("홍길동"),
	    		new Japanese("다나카"),
	    		new Chinese("왕밍")
	      };
	      
	      for (Person person : p){
	    	  dlstk(person);
	      }
	   }
	   
	   private static void dlstk(Person p){
		   System.out.println(p);
		   p.sayHello();
		   p.sayBye();
	     System.out.println();
	   }

	}