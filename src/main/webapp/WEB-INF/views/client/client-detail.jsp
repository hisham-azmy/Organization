<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/views/Layout/TagLib.jsp"%>
<title>Client</title>
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



	<jsp:include page="../header.jsp" />

	<!-- Product Detail -->
	<div class="container bgwhite p-t-35 p-b-80">
		<div class="flex-w flex-sb">
			<div class="w-size13 p-t-30 respon5">
				<div class="wrap-slick3 flex-sb flex-w">

					<div class="slick3">

						<div class="wrap-pic-w">

							<img
								src="<spring:url value="/resources/img/${client.id}.png"
								></spring:url>"
								alt="IMG-PRODUCT">
						</div>
					</div>
				</div>
			</div>

			<div class="w-size14 p-t-30 respon5">
				<h4 class="product-detail-name m-text16 p-b-13">${client.name}</h4>
				<br>


				<div class="flex-m flex-w">
					<div class="s-text15 w-size15 t-center">email</div>
					${client.email}
				</div>
				<br>
				<div class="flex-m flex-w">
					<div class="s-text15 w-size15 t-center">country</div>
					${client.country}
				</div>
				<br>
				<div class="flex-m flex-w">
					<div class="s-text15 w-size15 t-center">telephone</div>
					${client.telephone}
				</div>
				<br> <br>
				<div class="flex-m flex-w">
					<div class="s-text15 w-size15 t-center">address</div>
					${client.address}
				</div>
				<br> <br>
				<div class="flex-m flex-w">
					<div class="s-text15 w-size15 t-center">job</div>
					${client.job}
				</div>
				<br> <br>
				<div class="flex-m flex-w">
					<div class="s-text15 w-size15 t-center">nameOfShop</div>
					${client.nameOfShop}
				</div>
				<br>
			</div>
		</div>
	</div>



	<jsp:include page="../footer.jsp" />

</body>
</html>