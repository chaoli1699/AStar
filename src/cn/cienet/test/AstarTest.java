package cn.cienet.test;

import java.util.ArrayList;
import java.util.List;

import cn.cienet.astar.AStar;
import cn.cienet.astar.MapInfo;
import cn.cienet.astar.Node;
import cn.cienet.astar.MapBuilder;

public class AstarTest {
	
	public static void main(String[] args){
		System.out.println("main");
		
		MapBuilder mapBuilder=MapBuilder.build();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<int[]> stoneList=new ArrayList();
		int[] a={4,1,8,3};
		int[] b={6,3,9,7};
		int[] c={4,9,10,19};
		stoneList.add(a);
		stoneList.add(b);
		stoneList.add(c);
		//onMap.showMap(onMap.createMap(20,20,stoneList));
		int[][] map=mapBuilder.createMap(20, 20, stoneList);
		
		MapInfo info=new MapInfo(map,20,20,new Node(4,5),new Node(15,18));
		List<int[]> path=new AStar().start(info);
		mapBuilder.printMap(map);
		
		if(path!=null){
			mapBuilder.printPathPoints(path);
		}
		
		
	}
}
