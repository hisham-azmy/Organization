<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/views/Layout/TagLib.jsp"%>

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
	href="<spring:url value="/resources/vendor/jquery.validate.min.js"/>"
	type="text/css" />

<link rel="stylesheet"
	href="<spring:url value="/resources/vendor/jquery-3.2.1.min.js"/>"
	type="text/css" />
<!--===============================================================================================-->



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

	<div>
		<c:choose>
			<c:when test='${title=="New Client"}'>
				<spring:url value="/admin/product/add" var="url" />
			</c:when>
			<c:when test='${title=="Edit Client"}'>
				<spring:url value="/admin/product/edit" var="url" />
			</c:when>
		</c:choose>

		<spring:url value="/admin/client/add" var="url" />
		<div class="row sign" style="padding-bottom: 30px;">
			<div class="container col-lg-4 col-lg-offset-9 "
				style="text-align: center;">
				<spring:message code="label.firstName" var="lolo" />
				<div class="input-text">
					<h2>${headerMSG}</h2>
					<br /> <br />
					<form:form commandName="part" cssClass="form-horizontal"
						action="${url}" method="POST" enctype="multipart/form-data">

						<%-- 						<c:if test='${title=="Edit Client"}'> --%>
						<%-- 							<form:hidden path="id" class="form-control"></form:hidden> --%>
						<%-- 						</c:if> --%>



						<!-- ************        clientPartnershipId           *************** -->

						<div class="form-group col-lg-12 col-lg-offset-5 act">
							<form:input path="clientPartnershipId"
								cssClass="form-group col-lg-9 col-lg-offset-5 act"
								placeholder="${lolo}" />
							<label class="form-group col-lg-offset-0 "> <strong><spring:message
										code="label.firstName" /></strong>
							</label>
							<div class="form-group col-lg-12 col-lg-offset-5">
								<form:errors path="clientPartnershipId" cssStyle="color:#f00;"></form:errors>
							</div>
						</div>

						<!-- ************        clientPartnershipValue           *************** -->

						<div class="form-group col-lg-12 col-lg-offset-0 act">
							<form:label class="form-group col-lg-4 col-lg-offset-0 "
								path="clientPartnershipValue">clientPartnershipValue</form:label>
							<form:input path="clientPartnershipValue"
								cssClass="form-group col-lg-6 col-lg-offset-5 act"
								placeholder="Type  clientPartnershipValue" />
						</div>

						<!-- ************        clientPartnershipPaidValue          *************** -->

						<div class="form-group col-lg-12 col-lg-offset-0 act">
							<form:label class="form-group col-lg-4 col-lg-offset-0 "
								path="clientPartnershipPaidValue">clientPartnershipPaidValue</form:label>
							<form:input path="clientPartnershipPaidValue"
								cssClass="form-group col-lg-6 col-lg-offset-5 act"
								placeholder="Type clientPartnershipPaidValue" />
						</div>

						<!-- ************        client           *************** -->

						<div class="form-group col-lg-12 col-lg-offset-0 act">
							<form:label class="form-group col-lg-4 col-lg-offset-0 "
								path="client">client</form:label>
							<form:input path="client"
								cssClass="form-group col-lg-6 col-lg-offset-5 act"
								placeholder="Type clientPartnershipPaidValue" />
						</div>


						<!-- ************        clientPartnershipDate           *************** -->

						<div class="form-group col-lg-12 col-lg-offset-0 act">
							<form:label class="form-group col-lg-4 col-lg-offset-0 "
								path="clientPartnershipDate">clientPartnershipDate</form:label>
							<form:input path="clientPartnershipDate"
								cssClass="form-group col-lg-6 col-lg-offset-5 act"
								placeholder="Type clientPartnershipDate" />
						</div>



						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="job">job</form:label> --%>
						<%-- 							<form:input path="job" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type your job" /> --%>
						<!-- 						</div> -->

						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="nameOfShop">nameOfShop</form:label> --%>
						<%-- 							<form:input path="nameOfShop" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type your nameOfShop" /> --%>
						<!-- 						</div> -->

						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="DateOfcreationContact">DateOfcreationContact</form:label> --%>
						<%-- 							<form:input path="DateOfcreationContact" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type the  Date Of creation Contact" /> --%>
						<!-- 						</div> -->

						<!-- 						<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10"> -->

						<%-- 							<form:label class="control-label" path="productImage" for="pic">upload picture</form:label> --%>
						<%-- 							<form:input path="productImage" id="pic" type="file" --%>
						<%-- 								Class="form:input-large" /> --%>
						<!-- 						</div> -->

						<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
							<button type="submit" value="new parternship"
								class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
								<%-- 								<c:choose> --%>
								<%-- 									<c:when test='${title=="New Client"}'> --%>
								<!-- 								                                       new Product -->
								<%-- 																	</c:when> --%>
								<%-- 									<c:when test='${title=="Edit Client"}'> --%>
								<!-- 																		edit Product -->
								<%-- 																	</c:when> --%>
								<%-- 								</c:choose> --%>
							</button>
						</div>

					</form:form>
				</div>
			</div>
		</div>



	</div>

	<jsp:include page="../footer.jsp" />

	<!-- 	<link href="/resources/js/jquery-ui/"  rel="stylesheet" type="text/css" > -->

	<script type="text/javascript">
		$(document).ready(function() {
			var minPrice = 0;
			var maxPrice = 1000000000;
			// filter by price
			// 							
			$('.btn_price_filter')
			// 									.on(
			// 											'click',
			// 											function() {
			// 												console.log('entered');

			// 												minPrice = $('.min').val();
			// 												maxPrice = $('.max').val();

			// 												console.log(minPrice);
			// 												console.log(maxPrice);

			// 												$
			// 														.ajax({
			// 															url : '<spring:url value="/product/ajax/filter" />',
			// 															data : {
			// 																'minPrice' : minPrice,
			// 																'maxPrice' : maxPrice
			// 															},
			// 															success : function(
			// 																	data) {
			// 																$(
			// 																		'.products_aj')
			// 																		.html(
			// 																				data);
			// 															}

			// 														});
			// 											});

			// filter by name
			$('.btn_name_filter').on('click', function() {
				console.log('entered');

				var name = $('.name').val();

				console.log(name);

				$.ajax({
					url : '<spring:url value="/admin/ajax/filterByName" />',
					data : {
						'name' : name
					},
					success : function(data) {
						$('.products_aj').html(data);
					}

				});
			});

			// 			$('.btn_name_filter').on('click', function() {
			// 				console.log('entered');

			// 				var name = $('.telephone').val();

			// 				console.log(name);

			// 				$.ajax({
			// 					url : '<spring:url value="/admin/ajax/filterBy" />',
			// 					data : {
			// 						'telephone' : telephone
			// 					},
			// 					success : function(data) {
			// 						$('.products_aj').html(data);
			// 					}

			// 				});
			// 			});

			// search
			// 				

			// 			$('#clientname').autocomplete({
			// 				source :'<spring:url value="/admin/ajax/searchName" />'

			// 				});		
			$('.btn_search')
			// 									.on(
			// 											'click',
			// 											function() {
			// 												console.log('entered');

			// 												var query = $('.search_product')
			// 														.val();

			// 												console.log(minPrice);
			// 												console.log(maxPrice);
			// 												console.log(query);

			// 												$
			// 														.ajax({
			// 															url : '<spring:url value="/product/ajax/search" />',
			// 															data : {
			// 																'minPrice' : minPrice,
			// 																'maxPrice' : maxPrice,
			// 																'query' : query
			// 															},
			// 															success : function(
			// 																	data) {
			// 																$(
			// 																		'.products_aj')
			// 																		.html(
			// 																				data);
			// 															}

			// 														});
			// 											});

			// 							$('.btnAdd')
			// 									.on(
			// 											'click',
			// 											function() {
			// 												console.log('entered');
			// 												var product_id = $(this).val();
			// 												console.log(product_id);
			// 												$
			// 														.ajax({
			// 															url : '<spring:url value="/customer/cartItem/ajax/add" />',
			// 															data : {
			// 																'id' : product_id
			// 															},
			// 															success : function(
			// 																	data) {
			// 																console
			// 																		.log('return');
			// 																console
			// 																		.log(data);
			// 																console
			// 																		.log(data[0]);
			// 																console
			// 																		.log(typeof (data[0]));
			// 																console
			// 																		.log(data.length);
			// 																$(
			// 																		'.cartItemNumber')
			// 																		.html(
			// 																				data.length);
			// 																var cartItems = '';
			// 																var total = 0;
			// 																for (item in data) {
			// 																	total += parseFloat(data[item].totalPrice);
			// 																	cartItems += '<li class="header-cart-item"><div class="header-cart-item-img"><img src=\'<spring:url value="/resources/images/item-cart-01.jpg" />\' alt="IMG"></div><div class="header-cart-item-txt"><a href="#" class="header-cart-item-name">'
			// 																			+ data[item].name
			// 																			+ '</a><span class="header-cart-item-info"> $'
			// 																			+ data[item].totalPrice
			// 																			+ '</span></div></li>';
			// 																}
			// 																$(
			// 																		'.header-cart .header-cart-wrapitem')
			// 																		.html(
			// 																				cartItems);
			// 																$(
			// 																		'.header-cart .header-cart-total')
			// 																		.html(
			// 																				total);

			// 															}
			// 														});
			// 											});

		});
	</script>

</body>
</html>