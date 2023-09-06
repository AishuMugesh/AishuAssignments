package org.system;

public class Desktop extends Computer
{
	
	public void desktopSize()
		{
			System.out.println("/** Method from child class **/");
			System.out.println("Desktop Size is 21.8'");
		}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		System.out.println("/** Sample for Single Inheritance **/");
		d.computerModel();
		d.desktopSize();
	}
	}

