package net.lecigne.tpinterface.test;

import java.util.*;
import net.lecigne.tpinterface.model.*;


public class MainTestCollections {

	public static void main(String[] args) {
		
		Surface c = new Circle(100.0);
		Surface r = new Rectangle(100.0, 100.0);
		Surface s = new Square(100.0);
		
		ArrayList<Surface> ls = new ArrayList<>();
		ls.add(c);
		ls.add(r);
		ls.add(s);
		
		// *** FOR without iterator ***
		
//		for (Surface surface : ls) {
//			System.out.println("Before remove: " + ls.size());
//			if (surface.getArea() > 10.0) {
//				ls.remove(surface);
//			}
//			System.out.println("After remove: " + ls.size());
//		}
		
		// *** FOR with iterator ***
		
//		for (Iterator<Surface> it = ls.iterator(); it.hasNext();) {
//			Surface surface = it.next();
//			System.out.println("Before remove it: " + ls.size());
//			if (surface.getArea() > 10.0) {
//				it.remove();
//			}
//			System.out.println("After remove it:" + ls.size());
//		}
//		
//		for (Surface surface : ls) {
//			System.out.println(surface);
//		}
		
		// *** HashMap ***
		
		HashMap<String, Surface> map = new HashMap<>();
		
		map.put("cercle", c);
		map.put("rectangle", r);
		map.put("square", s);
		
		System.out.println(map.get("cercle"));
		map.remove("cercle");
		System.out.println(map.get("cercle"));
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("La map contient " + map.get(key));
		}
		
		Collection<Surface> collection = map.values();
		List<Surface> lSurfaces = new ArrayList<>(collection);
//		ArrayList<Surface> lSurfaces = (ArrayList<Surface>) map.values(); // alternative ?
		
		for (Surface surface : lSurfaces) {
			System.out.println(surface);
		}
		
	}

}
