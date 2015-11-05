

package com.spacex.util;


 /**
 
 * @ClassName: Page

 * @Description: 分页

 * @author Vino Dang

 * @date 2015年6月6日 上午11:38:20

 * @version V1.0

 */

public class PageUtil {
	private int totalRows; // 总行数
	private int pageSize; // 每页显示的行数
	private int currentPage; // 当前页号
	private int totalPages; // 总页数
	private int startRow; // 当前页在数据库中的起始行
	private int endRow; //结束行 此为oracle查询需要增加
	 

	public PageUtil() {
	}

	public PageUtil(int _totalRows, int _page, int _pageSize) {
	totalRows = _totalRows;
	pageSize = _pageSize;
	totalPages = totalRows / pageSize;
	//totalPages = (int) Math.ceil(totalRows / pageSize);
	int mod = totalRows % pageSize;
	if (mod > 0) {
	  totalPages++;
	}
	currentPage = _page;
	// 如果当前页数大于总页数，显示第一页
	if(totalPages < currentPage){
		currentPage = 1;
	}
	// 起始行
	startRow = (currentPage - 1) * pageSize;
	// 结束行
	endRow = currentPage * pageSize;
	}

	public int getStartRow() {
	return startRow;
	}

	public int getTotalPages() {
	return totalPages;
	}

	public int getCurrentPage() {
	return currentPage;
	}

	public int getPageSize() {
	return pageSize;
	}

	public void setTotalRows(int totalRows) {
	this.totalRows = totalRows;
	}

	public void setStartRow(int startRow) {
	this.startRow = startRow;
	}

	public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
	}

	public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
	}

	public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
	}

	public int getTotalRows() {
	return totalRows;
	}
	public void setEndRow(int endRow) {
	this.endRow = endRow;
	}

	public void first() {
	currentPage = 1;
	startRow = 0;
	}

	public void previous() {
	if (currentPage == 1 || currentPage == 0) {
	return;
	}
	currentPage--;
	startRow = (currentPage - 1) * pageSize;
	}

	public void next() {
	if (currentPage < totalPages) {
	currentPage++;
	}
	startRow = (currentPage - 1) * pageSize;
	}

	public void last() {
	currentPage = totalPages;
	startRow = (currentPage - 1) * pageSize;
	}

	public int getEndRow() {
	
		return endRow;
	}
	
	public static void main(String[] args) {
		Double a = 0.1;
		Double b = 2.5;
		Double c = 2.9;
		int x = 29;
		
	    int y = 10;
	    
	    Double s = a/b;
		System.out.println((int)Math.ceil(a));
		System.out.println((int)Math.ceil(b));
		System.out.println((int)Math.ceil(c));
		System.out.println(x%y);
	}

}


