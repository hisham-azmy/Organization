<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/views/Layout/TagLib.jsp"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<title>Product</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="<spring:url value="/resources/images/icons/favicon.png"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/fonts/themify/themify-icons.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/fonts/elegant-font/html-css/style.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/animate/animate.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/css-hamburgers/hamburgers.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/animsition/css/animsition.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/select2/select2.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/daterangepicker/daterangepicker.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/slick/slick.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/lightbox2/css/lightbox.min.css"/>"
	type="text/css" />
<!--===============================================================================================-->
<link rel="stylesheet"
	href="<spring:url value="/resources/css/main.css"/>" type="text/css" />

<link rel="stylesheet"
	href="<spring:url value="/resources/css/util.css"/>" type="text/css" />
<spring:url value="/resources/css/util.css" var="kmhome16"></spring:url>
<script src="${kmhome16}"></script>
<!--===============================================================================================-->
<spring:url value="/resources/css/main.css" var="kmhome15"></spring:url>
<script src="${kmhome15}"></script>
<!--===============================================================================================-->


</head>
<body class="animsition">




	<div class="products_aj">
		<table class="table table-striped">
			<caption>Clients using filter</caption>
			<thead>
				<tr>
					<th>Name Of Client</th>
					<th>Modify</th>
					<th>Last Modify</th>
				</tr>
			</thead>
			<tbody>
				<spring:url value='/teacher/QuestionBank' var="toto"></spring:url>
				<c:forEach var="product" items="${client}">
					<td><c:out value="${product.name}" /></td>
					<td><a
						href='<spring:url value="/admin/client/edit/${product.id}" />'>
							<img
							src="<spring:url value="/resources/Css/images/icons/options.png"   />">
					</a> <a
						href='<spring:url value="/admin/client/details/${product.id}" />'>
							<img
							src="<c:url value="/resources/Css/images/icons/view.png "></c:url>">
					</a> <a
						href='<spring:url value="/teacher/QuestionBank/deleteQuestion/${product.id}" />'><img
							src=" <spring:url value="/resources/Css/images/icons/delete.png"   ></spring:url>"></a></td>
					<td>today</td>
				</c:forEach>

				<!-- ------------------------ شكل كروكى مش اكتر  -->
		</table>
	</div>

</body>
</html>
