package cn.cienet.onmap;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
	
	public static void main(String[] args){
		System.out.println("main");
		
		OnMap onMap=new OnMap();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<int[]> stoneList=new ArrayList();
		int[] a={4,2,8,3};
		int[] b={6,3,9,7};
		int[] c={4,7,10,9};
		stoneList.add(a);
		stoneList.add(b);
		stoneList.add(c);
		//onMap.showMap(onMap.createMap(20,20,stoneList));
		int[][] map=onMap.createMap(20, 20, stoneList);
		
		MapInfo info=new MapInfo(map,20,20,new Node(4,5),new Node(18,7));
		List<int[]> path=new AStar().start(info);
		onMap.showMap(map);
		
		if(path!=null){
			onMap.getPathPoints(path);
		}
		
		
	}
}
