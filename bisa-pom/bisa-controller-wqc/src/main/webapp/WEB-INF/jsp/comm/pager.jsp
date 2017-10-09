<%@ page import="com.bisa.health.entity.SystemContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<c:set var="pg_url" value='<%=request.getParameter("url")%>'></c:set>
<c:set var="pg_items" value='<%=request.getParameter("items")%>'></c:set>
<%-- <c:set var="report_type" value='<%=request.getParameter("report_type")%>'></c:set> --%>


   <pg:pager export="currentPageNumber=pageNumber" items="${pg_items }"
	maxPageItems="<%=SystemContext.getPageSize()%>" url="${pg_url}">
	
<%-- 	<pg:param name="type" value="${report_type}"/> --%>

  	<pg:index export="items,pages">
  	
        <c:if test="${!empty params}">
            <c:forEach items="${params}" var="item">
            <pg:param name="${item.key}" value="${item.value}"/>
            <input name="${item.key}" value="${item.value}" type="hidden"/>
            </c:forEach>
            
        </c:if>

       <%--  <span>共有${items }条记录</span>&nbsp;
        <span>当前第${currentPageNumber }页/共${pages }页</span>
        <pg:first><a href="${pageUrl }" onclick="return setOffset(this,${pageNumber })?pageSubmit(this):true;">首页</a></pg:first> --%>
       	<nav aria-label="Page navigation" class="col-sm-12 Page">
		<ul class="pagination">
		
       <pg:prev>
			<!-- 上一页 -->
			<%-- <li><a href="${pageUrl }" class="pager_link">&laquo;</a></li> --%>
			<li><a href="${pageUrl}" aria-label="Previous" onclick="return setOffset(this,${pageNumber })?pageSubmit(this):true;" class="pager_link"> 
			<span aria-hidden="false">&laquo;</span>
			</a>
			</li>
		</pg:prev>
		
        <pg:pages>
        
            <c:choose>
            <c:when test="${currentPageNumber eq pageNumber }">
                <%-- <font color="red">${pageNumber }</font> --%>
                <li class="active"><a href="${pageUrl}" class="pager_link">${pageNumber }</a></li>
            </c:when>
            
            <c:otherwise>
               <%--  <a href="${pageUrl }" onclick="return setOffset(this,${pageNumber })?pageSubmit(this):true;">${pageNumber }</a> --%>
                <li><a href="${pageUrl}"  class="pager_link">${pageNumber}</a></li>
            </c:otherwise>
            </c:choose>
            
        </pg:pages>
        
       <%--  <pg:next>
            <a href="${pageUrl }" onclick="return setOffset(this,${pageNumber })?pageSubmit(this):true;">后一页</a>
        </pg:next> --%>
        
        <pg:next>
			<%-- 	<li><a href="${pageUrl }" class="pager_link">&raquo;</a></li> --%>
			<li><a href="${pageUrl}" aria-label="Next" onclick="return setOffset(this,${pageNumber })?pageSubmit(this):true;"> <span
					aria-hidden="false">&raquo;</span>
			</a></li>
		</pg:next>
		</ul>
		</nav>
      <%--   <pg:last>
            <a href="${pageUrl }" onclick="return setOffset(this,${pageNumber })?pageSubmit(this):true;">尾页</a>
        </pg:last>
        <pg:skip pages="${pageNumber }">
        <input name="pager.offset" type="hidden" value="0" />
        <input type="text" style="width: 50px;" number="${pageNumber}" value="${pageNumber}" pagesize="${pagesize }" pageOffset="${pageOffset }" pageCount="${pages }" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'') " ></input>
        <a href="${pageUrl }" onclick="return tj(this)?pageSubmit(this):false;">跳转</a>
        </pg:skip> --%>
    </pg:index> 
</pg:pager>
<!-- </div> -->
