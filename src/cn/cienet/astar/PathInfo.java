package cn.cienet.astar;

public class PathInfo {

	public int[][] maps; // 二维数组的地图
	public int width; // 地图的宽
	public int hight; // 地图的高
	public Node start; // 起始结点
	public Node end; // 最终结点
	
	/**
	 * 初始化寻路信息
	 * @param maps
	 * @param width
	 * @param hight
	 * @param start
	 * @param end
	 */
	public PathInfo(int[][] maps, int width, int hight, Node start, Node end)
	{
		this.maps = maps;
		this.width = width;
		this.hight = hight;
		this.start = start;
		this.end = end;
	}
}
