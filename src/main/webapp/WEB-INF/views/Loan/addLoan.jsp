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
			<c:when test='${title=="New Loan"}'>
				<spring:url value="/admin/member/add" var="url" />
			</c:when>
			<c:when test='${title=="Edit Loan"}'>
				<spring:url value="/admin/member/edit" var="url" />
			</c:when>
		</c:choose>

		<spring:url value="/admin/loan/add" var="url" />
		<div class="row sign" style="padding-bottom: 30px;">
			<div class="container col-lg-4 col-lg-offset-9 "
				style="text-align: center;">

				<div class="input-text">
					<h2>${headerMSG}</h2>
					<br /> <br />
					<div class="col-md-6 col-sm-6 col-xs-12">

						<form:form commandName="loan" cssClass="form-horizontal"
							action="${url}" method="POST" enctype="multipart/form-data">

							<!-- ************        Name of Member           *************** -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="io_member.fullName" id="familyName"
									cssClass="form-group col-lg-6 col-lg-offset-5 act"
									placeholder="Type your email" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="io_member.fullName">
									<strong><spring:message code="label.fullname" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="io_member.fullName" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>


							<!-- ************        Name  of Follower         *************** -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<spring:message code="label.followerMemberName"
									var="fullnameDetail" />
								<form:input path="followerMemberName"
									cssClass="form-group col-lg-9 col-lg-offset-5 act"
									placeholder="${fullnameDetail}" />
								<label class="form-group col-lg-3 col-lg-offset-0 "> <strong><spring:message
											code="label.fullname" /></strong>
								</label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="followerMemberName" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>

							<!-- ********************  loan value  ****************** -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="loanvalue"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="loanvalue">
									<strong><spring:message code="label.loanvalue" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="loanvalue" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>

							<!-- ***************         paymentTimesCount    ****************** -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="paymentTimesCount"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="paymentTimesCount">
									<strong><spring:message code="label.paymentTimesCount" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="paymentTimesCount" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>

							<!-- *****************   expectedMonthlyPaidValue   ********************* -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="expectedMonthlyPaidValue"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="expectedMonthlyPaidValue">
									<strong><spring:message
											code="label.expectedMonthlyPaidValue" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="expectedMonthlyPaidValue"
										cssStyle="color:#f00;"></form:errors>
								</div>
							</div>


							<!-- ************  Date  expectedPayDate  ********************** -->

							<div class="form-group ">
								<form:label path="expectedPayDate"
									class="form-group col-lg-4 col-lg-offset-0 ">
									<strong><spring:message code="label.expectedPayDate" /></strong>
								</form:label>
								<div class="col-sm-10">
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"> </i>
										</div>
										<form:input path="expectedPayDate" cssClass="datepicker-1"
											name="date" placeholder="mm/dd/yyyy" type="text" />
									</div>
								</div>
							</div>

							<!-- 	************        loan Date           *************** -->

							<div class="form-group ">
								<form:label path="loanDate"
									class="form-group col-lg-4 col-lg-offset-0 ">
									<strong><spring:message code="label.loanDate" /></strong>
								</form:label>
								<div class="col-sm-10">
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"> </i>
										</div>
										<form:input path="loanDate" cssClass="datepicker-1"
											name="date" placeholder="mm/dd/yyyy" type="text" />
									</div>
								</div>
							</div>



							<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
								<button type="submit"
									class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
									<c:choose>
										<c:when test='${title=="New Loan"}'>
									new Loan
									</c:when>
										<c:when test='${title=="Edit Loan"}'>
																			edit Loan
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

		<!-- Extra JavaScript/CSS added manually in "Settings" tab -->
		<!-- Include jQuery -->
		<script type="text/javascript"
			src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

		<!-- Include Date Range Picker -->
		<script type="text/javascript"
			src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
		<link rel="stylesheet"
			href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />

		<script>
			$(document)
					.ready(
							function() {
								var date_input = $('input[name="date"]'); //our date input has the name "date"
								var container = $('.bootstrap-iso form').length > 0 ? $(
										'.bootstrap-iso form').parent()
										: "body";
								date_input.datepicker({
									format : 'mm/dd/yyyy',
									container : container,
									todayHighlight : true,
									autoclose : true,
								})
							})
			$(function() {
				$(".datepicker-1").datepicker();
				format: 'mm/dd/yyyy'
			});

				</script>
</body>
</html>
</html>