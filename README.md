# AStar

A Star 寻路算法简介：http://www.jianshu.com/p/bb317d02d055

1. 在此基础上对算法进行了一些优化
2. 设计并封装了map生成算法
3. 寻路完成返回路径坐标，便于继续调用
4. 使用方法：
    1. 在项目中导入jar文件夹下 “astar.jar”
	2. 调用
	
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
				
		MapInfo info=new MapInfo(map,20,20,new Node(4,5),new Node(15,18));
		List<int[]> path=new AStar().start(info);
		
		if(map.length>0){
			mapBuilder.printMap(map);
		}
		
		if(path!=null){ 
			mapBuilder.printPathPoints(path);
		}	
	}
	
	3. 调试结果
	
	总代价：198

00000000000000000000
00001111100000000000
00001111100000000000
00001111110000000000
00000011110000000000
00002011110000000000
00002011110000000000
00000211110000000000
00000022222000000000
00001111111200000000
00001111111200000000
00001111111200000000
00001111111200000000
00001111111200000000
00001111111200000000
00001111111020000000
00001111111002000000
00001111111000200000
00001111111000020000
00001111111000000000

point0:x=15,y=18
point1:x=14,y=17
point2:x=13,y=16
point3:x=12,y=15
point4:x=11,y=14
point5:x=11,y=13
point6:x=11,y=12
point7:x=11,y=11
point8:x=11,y=10
point9:x=11,y=9
point10:x=10,y=8
point11:x=9,y=8
point12:x=8,y=8
point13:x=7,y=8
point14:x=6,y=8
point15:x=5,y=7
point16:x=4,y=6
point17:x=4,y=5