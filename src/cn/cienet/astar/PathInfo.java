package cn.cienet.astar;

public class PathInfo {

	public int[][] maps; // ��ά����ĵ�ͼ
	public int width; // ��ͼ�Ŀ�
	public int hight; // ��ͼ�ĸ�
	public Node start; // ��ʼ���
	public Node end; // ���ս��
	
	/**
	 * ��ʼ��Ѱ·��Ϣ
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
