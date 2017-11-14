package cn.cienet.astar;

import java.util.List;

public class MapBuilder {

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
	
    /**
     * ������ͼ����
     * @param width
     * @param height
     * @param stoneList eg:{ax, ay, bx, by} a,b�ֱ����ϰ����򣨾��Σ����ϽǺ����½ǵĵ�
     * @return int[][] map
     */
	public int[][] createMap(int width, int height,List<int[]> stoneList){
		int[][] map=new int[height][width];
		
		for(int k=0;k<stoneList.size();k++){
			int[] stone=stoneList.get(k);
			for(int i=0;i<height;i++){
				for(int j=0;j<width;j++){
					if(j>=stone[0]&&j<=stone[2]&&i>=stone[1]&&i<=stone[3]){
						map[i][j]=1;
					}
				}
			}
		}
		
		return map;
	}
	
	/**
	 * �����ͼ����
	 * @param map
	 */
	public void printMap(int[][] map){
		for(int i=0;i<map.length;i++){
			System.out.print('\n');
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]);
			}
		}
	}
	
	/**
	 * ���·������
	 * @param pointList
	 */
	public void printPathPoints(List<int[]> pointList){
		for(int i=pointList.size()-1;i>=0;i--){
			System.out.print('\n');
			int[] point=pointList.get(i);
			System.out.print("point"+i+":x="+point[0]+",y="+point[1]);
		}
	}
}
