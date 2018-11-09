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

<!--formden.js communicates with FormDen server to validate fields and submit via AJAX -->
<script type="text/javascript"
	src="https://formden.com/static/cdn/formden.js"></script>

<!-- Special version of Bootstrap that is isolated to content wrapped in .bootstrap-iso -->
<link rel="stylesheet"
	href="https://formden.com/static/cdn/bootstrap-iso.css" />

<!--Font Awesome (added because you use icons in your prepend/append)-->
<link rel="stylesheet"
	href="https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css" />

<!-- Inline CSS based on choices in "Settings" tab -->
<style>
.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p,
	.bootstrap-iso form {
	font-family: Arial, Helvetica, sans-serif;
	color: black
}

.bootstrap-iso form button, .bootstrap-iso form button:hover {
	color: white !important;
}

.asteriskField {
	color: red;
}
</style>


</head>

<body class="animsition">

	<jsp:include page="../header.jsp" />

	<div>
		<c:choose>
			<c:when test='${title=="New Secondry Income"}'>
				<spring:url value="/admin/secondIncome/add" var="url" />
			</c:when>
			<c:when test='${title=="Secondry Income"}'>
				<spring:url value="/admin/secondIncome/edit" var="url" />
			</c:when>
		</c:choose>

		<spring:url value="/admin/secondIncome/add" var="url" />
		<div class="row sign" style="padding-bottom: 30px;">
			<div class="container col-lg-6 col-lg-offset-22 "
				style="text-align: center;">

				<div class="input-text">
					<h2>${headerMSG}</h2>
					<br /> <br />

					<form:form commandName="secondIncome" cssClass="form-horizontal"
						action="${url}" method="POST">

						<c:if test='${title=="Secondry Income"}'>
							<form:hidden path="id"></form:hidden>
						</c:if>

						<div class="form-group col-lg-12 col-lg-offset-5 act">

							<form:input path="fund" id="clientName1"
								cssClass="form-group col-lg-6 col-lg-offset-5 act" />

							<form:label class="form-group col-lg-4 col-lg-offset-0 "
								path="fund">
								<strong><spring:message code="label.fund" /></strong>
							</form:label>
							<div class="form-group col-lg-12 col-lg-offset-5">
								<form:errors path="fund" cssStyle="color:#f00;"></form:errors>
							</div>
						</div>


						<!-- 
						<div class="form-group ">
							<form:label path="creationDate"
								class="form-group col-lg-4 col-lg-offset-0 ">
								<strong><spring:message code="label.dateOfCreation" /></strong>
							</form:label>
							<div class="col-sm-10">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-calendar"> </i>
									</div>
									<form:input path="creationDate" cssClass="datepicker-1"
										name="date" placeholder="mm/dd/yyyy" type="text" />
								</div>
							</div>
						</div>
 -->
						<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
							<button type="submit"
								class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
								<c:choose>
									<c:when test='${title=="New Secondry Income"}'>
									new Secondry Income
									</c:when>
									<c:when test='${title=="Secondry Income"}'>
																			edit Secondry Income
																		</c:when>
								</c:choose>
							</button>
						</div>

					</form:form>


				</div>
			</div>
		</div>
	</div>

	<jsp:include page="../footer.jsp" />


	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$('#clientName1')
									.autocomplete(
											{
												source : '${pageContext.request.contextPath}/admin/group/searchName',
											});
						});
	</script>
</body>
</html>
</html>