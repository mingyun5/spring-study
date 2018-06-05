<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- regdate 간단하게 수정하기위한 링크 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>


<h1>게시물 상세페이지</h1>

<form role="form" method="post">
	<input type="hidden" name="bno" value="${boardVO.bno }" />
</form>
<div class="box-body"></div>
<div class="form-group">
	<label for="exampleInputEmail1">Title</label> <input type="text"
		name="title" value="${boardVO.title }" readonly="readonly"
		class="form-control" /> <label for="exampleInputPassword1">Content</label>
	<textarea type="text" name="content" rows="3" readonly="readonly"
		class="form-control">${boardVO.content }</textarea>
	<label for="exampleInputEmail1">Writer</label> <input type="text"
		name="writer" value="${boardVO.writer }" readonly="readonly"
		class="form-control" />
</div>
<div class="box-footer">
	<button type="submit" class="btn btn-warning">Modify</button>
	<button type="submit" class="btn btn-danger">Remove</button>
	<button type="submit" class="btn btn-primary">List All</button>
</div>

<%@ include file="../common/footer.jspf"%>

<script>
/* 버튼 링크 */
	$(document).ready(function() {
		var formObj = $("form[role='form']");

		$(".btn-warning").on('click', function() {
			formObj.attr("action", "/board/modify");
			formObj.attr("method","get");
			formObj.submit();
		});
		$(".btn-danger").on('click', function() {
			formObj.attr("action", "/board/remove");
			formObj.submit();
		});
		$(".btn-primary").on('click', function() {
			self.location = "/board/listAll";
		});

	})
</script>