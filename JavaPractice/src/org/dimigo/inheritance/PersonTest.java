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
	      Person t=new Person("Tom");
	      Korean h=new Korean("홍길동");
	      Japanese d =new Japanese("다나카");
	      Chinese w=new Chinese("왕밍");
	      
	      System.out.println(t);
	      System.out.println(h);
	      System.out.println(d);
	      System.out.println(w);
	      System.out.println();
	      t.sayHello();
	      h.sayHello();
	      d.sayHello();
	      w.sayHello();
	      System.out.println();
	      t.sayBye();
	      h.sayBye();
	      d.sayBye();
	      w.sayBye();
	   }

	}