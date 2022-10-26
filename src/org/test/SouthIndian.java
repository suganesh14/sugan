package org.test;
public class SouthIndian extends Indian{
//	@Override
	public void breakfast() {
		System.out.println("idly");
	}
    public static void main(String[] args) {
	SouthIndian s = new SouthIndian();
	s.lunch();
	s.breakfast();
			}
}
