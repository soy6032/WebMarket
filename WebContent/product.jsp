<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dto.Product" %> 
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>

	<%
		String id = request.getParameter("id");
		Product product = productDAO.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3><%= product.getPname() %></h3>
				<p><%= product.getDescription() %></p>
				<p>
					<b>상품코드 : </b> 
					<span class="badge badge-danger">
						<%=product.getProductId() %>
					</span>
				</p>
				<p>
					<b>제조사</b> : <%=product.getManufacturer() %>
				</p>
				<p>
					<b>분류</b> : <%=product.getCategory() %>
				</p>
				<p>
					<b>재고 수</b> : <%=product.getUnitsInStock() %>
				</p>
				<h4>
					<%=product.getUnitPrice() %>원
				</h4>
				<p>
					<a href="./products.jsp" class="btn btn-secondary">상품목록 &raquo;</a>
				</p>
			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>