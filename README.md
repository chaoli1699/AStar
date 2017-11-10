# AStar

A Star 寻路算法简介：http://www.jianshu.com/p/bb317d02d055

1. 在此基础上对算法进行了一些优化
2. 设计并封装了map生成算法
3. 寻路完成返回路径坐标，便于继续调用
4. 使用方法：
    1.在项目中导入jar文件夹下 “astar.jar”
	2.调用代码
	
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