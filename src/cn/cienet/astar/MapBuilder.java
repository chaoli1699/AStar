package cn.cienet.astar;

import java.util.List;

public class MapBuilder {

	
    private int[][] map;
    private volatile static MapBuilder instance;
    
    private MapBuilder(){}
    
    public static MapBuilder build(){
    	if(instance==null){
    		synchronized(MapBuilder.class){
    			if(instance==null){
    				instance=new MapBuilder();
    			}
    		}
    	}
    	return instance;
    }
	
	public int[][] createMap(int width, int height,List<int[]> stoneList){
		map=new int[height][width];
		
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				map[i][j]=0;
			}
		}
		
		for(int i=0;i<stoneList.size();i++){
			int[] stone=stoneList.get(i);
			setStones(width,height,stone[0],stone[1],stone[2],stone[3]);
		}
		
		return map;
	}
	
	private void setStones(int width,int height,int ax,int ay,int bx,int by){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				if(j>=ax&&j<=bx&&i>=ay&&i<=by){
					map[i][j]=1;
				}
			}
		}
	}
	
	public void printMap(int[][] map){
		for(int i=0;i<map.length;i++){
			System.out.print('\n');
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]);
			}
		}
	}
	
	public void printPathPoints(List<int[]> pointList){
		for(int i=0;i<pointList.size();i++){
			System.out.print('\n');
			int[] point=pointList.get(i);
			System.out.print("point"+i+":x="+point[0]+",y="+point[1]);
		}
	}
}
