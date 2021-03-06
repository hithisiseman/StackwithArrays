import static org.junit.Assert.*;

import org.junit.Test;

public class StackArrayTesting {

	@Test
	public void testStacksize() {
		
		Stack s= new Stack();
		assertEquals(0, s.size);
	}
	
	@Test
	public void testpush1() {
		
		Stack s= new Stack();
		s.push(1);
		assertEquals(1, s.size);
	}
	
	@Test
	public void testpush2() {
		
		Stack s= new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		assertEquals(3, s.size);
	}
	
	@Test
	public void testpush3() {
		
		Stack s= new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		assertEquals(10, s.size);
	}
	
	@Test
	public void testpush4() {
		
		int n=10;
		Stack s= new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		s.push(10);
		s.push(11);
		
		assertEquals(n+2, s.size);
	}

	@Test
	public void testpop1() {
		
		Stack s= new Stack();
		s.push(1);
		s.pop();
		assertEquals(0, s.size);
	}
	
	@Test
	public void testpop2() {
		
		Stack s= new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		assertEquals(1, s.size);
	}
	
	@Test
	public void testpop3() {
		
		Stack s= new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
			s.pop();
		}
		
		assertEquals(0, s.size);
	}
	
	@Test
	public void testpop4() {
		
		Stack s= new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		s.pop();
		assertEquals(9, s.size);
	}
	
	@Test
	public void testpop5() {
		
		Stack s= new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		for(int i=0;i<5;i++) {
			s.pop();
		}
		
		assertEquals(5, s.size);
	}
	
	@Test
	public void testpop6() {
		
		Stack s=new Stack();
		s.push(1);
		s.pop();
		s.push(2);
		s.pop();
		s.push(3);
		s.pop();
		s.push(4);
		s.pop();
		s.push(5);
		s.pop();
		s.push(6);
		s.pop();
		s.push(8);
		
		assertEquals(1, s.size);
	}
	
	@Test
	public void testpop7() {
		
		int n=10;
		Stack s= new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		s.pop();
		s.pop();
		
		assertEquals(n-2, s.size);
	}
}
