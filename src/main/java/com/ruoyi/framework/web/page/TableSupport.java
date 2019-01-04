package com.ruoyi.framework.web.page;

import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.constant.Constants;

/**
 * 表格数据处理
 * 
 * @author ruoyi
 */
public class TableSupport {
	/**
	 * 封装分页对象
	 */
	public static PageDomain getPageDomain() {
		PageDomain pageDomain = new PageDomain();
		// 从request中获取相应的参数值,转换类型后赋值给分页对象
		pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));// 页码
		pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));// 页大小
		pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));// 排序列
		pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));// 排序方式
		return pageDomain;
	}

}
