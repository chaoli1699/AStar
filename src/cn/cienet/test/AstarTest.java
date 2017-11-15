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
		
		int mWidth =125;
		int mHeight =125;
		MapBuilder mapBuilder=MapBuilder.build();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<int[]> stoneList=new ArrayList();
		int[] a={10,10,20,30};
		int[] b={50,50,60,60};
		int[] c={30,80,40,100};
		stoneList.add(a);
		stoneList.add(b);
		stoneList.add(c);
		int[][] map=mapBuilder.createMap(mWidth, mHeight, stoneList);
				
		long startTime=System.currentTimeMillis();
		PathInfo info=new PathInfo(map,mWidth,mHeight,new Node(2,2),new Node(mWidth-2,mHeight-2));
		List<int[]> path=new AStar().start(info);
		
//		if(map.length>0){
//			mapBuilder.printMap(map);
//		}
		
		if(path!=null){ 
			long endTime=System.currentTimeMillis();
			System.out.println("TOTAL TIME: "+(endTime-startTime)+"ms");
//			mapBuilder.printPathPoints(path);
		}
		
		
	}
}
