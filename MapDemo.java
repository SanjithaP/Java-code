/*
Collections:
Map:

<key,value>... Iterator,Comparator

HashMap- Access data using get and put
TreeMap- sorted map, Access data using get and put
LinkedHashMap- Extra navigation is possible.

//HashMap

Syntax:  HashMap<String, Double> hm=new HashMap<>();
hm.put("Alice",1200.00);
hm.get("Alice")*/

import java.util.*;
class MapDemo{
	public static void main(String args[]){
		HashMap<String, Double> hm=new HashMap<String, Double>();
		hm.put("Alice",123.3);
		hm.put("Roy",987.3);
		hm.put("Sam",156.3);
		hm.put("Jack",903.3);
		double d=hm.get("Darth");
		hm.put("Darth", d+244.00);
		Set<Map.Entry<String, Double>> set=hm.entrySet();
		for(var me:set)
			System.out.println(me.getKey()+"\t"+me.getValue());
	}
}
