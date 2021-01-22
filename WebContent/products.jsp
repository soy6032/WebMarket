<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSP 파일에 자바 클래스를 사용할 수 있도록 선언 -->
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Product" %> 

<!-- 자바빈즈를 사용 -->
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
	<!-- 액션태그 중 include 를 이용해서 menu.jsp 로 이동하여 실행 -->
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<!-- ArrayList : 데이터를 저장하기 위한 자료 구조 중 한가지, 배열과 비슷함, Java의 배열(Array)은 크기가 설정되면 변경할 수 없지만 ArrayList는 크기를 동적으로 변경할 수 있음 -->
	<!-- Product 클래스 타입으로 배열 생성 -->
	<%
	ArrayList<Product> listOfProduct = productDAO.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
			<%
			for (int i = 0; i < listOfProduct.size(); i++) {
				// listOfProduct의 i번째 데이터를 가져와서 Product 타입의 변수 product에 저장
				// 
				Product product = listOfProduct.get(i);
			%>
			<div class="col-md-4">
				<h3><%= product.getPname() %></h3>
				<p><%= product.getDescription() %></p>
				<p><%= product.getUnitPrice() %> 원</p>
				<p><a href="./product.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button">
				상세 정보 &raquo;
				</a></p>
			</div>
			<%
			}
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>