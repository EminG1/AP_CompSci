/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
	String aa = new String (randName());
	String bb = new String (randName());
	String cc = new String (randName());
	String dd = new String (randName());
	String ee = new String (randName());
	String ff = new String (randName());
	String gg = new String (randName());
	int ab = (int)(Math.random()*100);
	int ac = (int)(Math.random()*100);
	int ad = (int)(Math.random()*100);
	int ae = (int)(Math.random()*100);
	int af = (int)(Math.random()*100);
	int ag = (int)(Math.random()*100);
	int ah = (int)(Math.random()*100);
	
		PooleDwarf dwarfA = new PooleDwarf(aa,ab);
		PooleDwarf dwarfB = new PooleDwarf(bb,ac);
		PooleDwarf dwarfC = new PooleDwarf(cc,ad);
		PooleDwarf dwarfD = new PooleDwarf(dd,ae);
		PooleDwarf dwarfE = new PooleDwarf(ee,af);
		PooleDwarf dwarfF = new PooleDwarf(ff,ag);
		PooleDwarf dwarfG = new PooleDwarf(gg,ah);

	int count = 0;
	if(dwarfA.isSameName(dwarfB))
		count= count +1;
	if(dwarfA.isSameName(dwarfC))
		count= count +1;
	if(dwarfA.isSameName(dwarfD))
		count= count +1;
	if(dwarfA.isSameName(dwarfE))
		count= count +1;
	if(dwarfA.isSameName(dwarfF))
		count= count +1;
	if(dwarfA.isSameName(dwarfG))
		count= count +1;
	
	System.out.println(count + " Dwarf(s) had the same name and the name was: " + (dwarfA.getName()));
	}
	
}
