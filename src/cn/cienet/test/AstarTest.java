package cn.cienet.test;

import java.util.ArrayList;
import java.util.List;

import cn.cienet.astar.AStar;
import cn.cienet.astar.PathInfo;
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
		int[][] map=mapBuilder.createMap(20, 20, stoneList);
				
		PathInfo info=new PathInfo(map,20,20,new Node(4,5),new Node(15,18));
		List<int[]> path=new AStar().start(info);
		
		if(map.length>0){
			mapBuilder.printMap(map);
		}
		
		if(path!=null){ 
			mapBuilder.printPathPoints(path);
		}
		
		
	}
}
