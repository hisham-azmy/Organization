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
					<c:when test='${title=="New Member"}'>
						<spring:url value="/admin/member/add" var="url" />
					</c:when>
					<c:when test='${title=="Edit member"}'>
						<spring:url value="/admin/member/edit" var="url" />
					</c:when>
				</c:choose>

		<spring:url value="/admin/member/add" var="url" />
		<div class="row sign" style="padding-bottom: 30px;">
			<div class="container col-lg-4 col-lg-offset-9 "
				style="text-align: center;">

				<div class="input-text">
					<h2>${headerMSG}</h2>
					<br /> <br />
					<div class="col-md-6 col-sm-6 col-xs-12">

						<form:form commandName="member" cssClass="form-horizontal"
							action="${url}" method="POST" enctype="multipart/form-data">

							<!-- ************        Name           *************** -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<spring:message code="label.fullnameDetail" var="fullnameDetail" />
								<form:input path="fullName"
									cssClass="form-group col-lg-9 col-lg-offset-5 act"
									placeholder="${fullnameDetail}" />
								<label class="form-group col-lg-3 col-lg-offset-0 "> <strong><spring:message
											code="label.fullname" /></strong>
								</label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="fullName" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>

							<!-- 						************        Family           *************** -->

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="ioGroup.fullName" id="familyName"
									cssClass="form-group col-lg-6 col-lg-offset-5 act"
									placeholder="Type your email" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="ioGroup.fullName">
									<strong><spring:message code="label.fullnameGroup" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="ioGroup.fullName" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>


							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="telephone1"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="telephone1">
									<strong><spring:message code="label.telephone1Member" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="telephone1" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>


							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="telephone2"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="telephone2">
									<strong><spring:message code="label.telephone2Member" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="telephone2" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="address1"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="address1">
									<strong><spring:message code="label.address1Member" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="address1" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>

							<div class="form-group col-lg-12 col-lg-offset-5 act">
								<form:input path="address2"
									cssClass="form-group col-lg-6 col-lg-offset-5 act" />

								<form:label class="form-group col-lg-4 col-lg-offset-0 "
									path="address2">
									<strong><spring:message code="label.address2Member" /></strong>
								</form:label>
								<div class="form-group col-lg-12 col-lg-offset-5">
									<form:errors path="address2" cssStyle="color:#f00;"></form:errors>
								</div>
							</div>


							<!-- 							<div class="form-group col-lg-12 col-lg-offset-5 act"> -->
							<%-- 								<form:input path="joinDate" --%>
							<%-- 									cssClass="form-group col-lg-6 col-lg-offset-5 act" /> --%>

							<%-- 								<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
							<%-- 									path="joinDate"> --%>
							<%-- 									<strong><spring:message code="label.joinDateMember" /></strong> --%>
							<%-- 								</form:label> --%>
							<!-- 								<div class="form-group col-lg-12 col-lg-offset-5"> -->
							<%-- 									<form:errors path="joinDate" cssStyle="color:#f00;"></form:errors> --%>
							<!-- 								</div> -->
							<!-- 							</div> -->


							<div class="form-group ">
								<form:label path="joinDate"
									class="form-group col-lg-4 col-lg-offset-0 ">
									<strong><spring:message code="label.joinDateMember" /></strong>
								</form:label>
								<div class="col-sm-10">
									<div class="input-group">
										-->
										<div class="input-group-addon">
											<i class="fa fa-calendar"> </i>
										</div>
										<form:input path="joinDate" cssClass="datepicker-1"
											name="date" placeholder="mm/dd/yyyy" type="text" />
									</div>
								</div>
							</div>

							<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
								<button type="submit"
									class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
									<c:choose>
										<c:when test='${title=="New Client"}'>
									new Member
									</c:when>
										<c:when test='${title=="Edit member"}'>
																			edit Product
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
								$('#familyName')
										.autocomplete(
												{
													source : '${pageContext.request.contextPath}/admin/group/searchName',
												});
							});
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

			// 		$(document)
			// 				.ready(
			// 						function() {
			// 							$('#groupName')
			// 									.autocomplete(
			// 											{
			// 												source : '${pageContext.request.contextPath}/admin/group/searchName',
			// 											});
			// 						});

			// 			$(function () {
			// 			    $('.datepicker').datepicker({
			// 			        format: 'd-M-yyyy'
			// 			    });
			// 			});
		</script>
</body>
</html>
</html>