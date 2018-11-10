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


</head>

<body class="animsition">

	<jsp:include page="../header.jsp" />

	<div>
		<c:choose>
			<c:when test='${title=="New Group"}'>
				<spring:url value="/admin/group/add" var="url" />
			</c:when>
			<c:when test='${title=="Edit Client"}'>
				<spring:url value="/admin/group/edit" var="url" />
			</c:when>
		</c:choose>

		<spring:url value="/admin/group/add" var="url" />
		<div class="row sign" style="padding-bottom: 30px;">
			<div class="container col-lg-4 col-lg-offset-9 "
				style="text-align: center;">

				<div class="input-text">
					<spring:message code="label.A_TitleGroup" var="TitleGroup" />
					<h2>${TitleGroup}</h2>
					<br /> <br /> <br /> <br />


					<form:form commandName="group" cssClass="form-horizontal"
						action="${url}" method="POST" enctype="multipart/form-data">

						<c:if test='${title=="Edit Client"}'>
							<form:hidden path="id" class="form-control"></form:hidden>
						</c:if>


						<!-- ************        Name           *************** -->

						<div class="form-group col-lg-12 col-lg-offset-5 act">
							<spring:message code="label.fullnameDetail" var="fullnameDetail" />
							<form:input path="fullName"
								cssClass="form-group col-lg-9 col-lg-offset-5 act"
								placeholder="${fullnameDetail}" />
							<label class="form-group col-lg-offset-0 "> <strong><spring:message
										code="label.fullnameGroup" /></strong>
							</label>
							<div class="form-group col-lg-12 col-lg-offset-5">
								<form:errors path="fullName" cssStyle="color:#f00;"></form:errors>
							</div>
						</div>


						<div class="form-group col-lg-12 col-lg-offset-5 act">
							<spring:message code="label.GroupDescriptionDetail"
								var="GroupDescriptionDetail" />
							<form:textarea path="description"
								cssClass="form-group col-lg-9 col-lg-offset-5 act"
								placeholder="${GroupDescriptionDetail}" />
							<label class="form-group col-lg-offset-0 "> <strong><spring:message
										code="label.GroupDescription" /></strong>
							</label>
							<div class="form-group col-lg-12 col-lg-offset-5">
								<form:errors path="description" cssStyle="color:#f00;"></form:errors>
							</div>
						</div>

						<!-- 						************        EMAIL           *************** -->

						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="email">email</form:label> --%>
						<%-- 							<form:input path="email" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type your email" /> --%>
						<!-- 						</div> -->

						<!-- 						************        COUNTRY          *************** -->

						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="country">country</form:label> --%>
						<%-- 							<form:input path="country" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type your country" /> --%>
						<!-- 						</div> -->
						<!-- 						************        ADDRESS           *************** -->

						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="address">address</form:label> --%>
						<%-- 							<form:input path="address" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type your address" /> --%>
						<!-- 						</div> -->

						<!-- 						<div class="form-group col-lg-12 col-lg-offset-0 act"> -->
						<%-- 							<form:label class="form-group col-lg-4 col-lg-offset-0 " --%>
						<%-- 								path="telephone">telephone</form:label> --%>
						<%-- 							<form:input path="telephone" --%>
						<%-- 								cssClass="form-group col-lg-6 col-lg-offset-5 act" --%>
						<%-- 								placeholder="Type your telephone" /> --%>
						<!-- 						</div> -->



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
							<button type="submit"
								class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
								<%-- 								<c:choose> --%>
								<%-- 									<c:when test='${title=="New Client"}'> --%>
								new Member
								<%-- 									</c:when> --%>
								<%-- 									<c:when test='${title=="Edit Client"}'> --%>
								<!-- 										edit Product -->
								<%-- 									</c:when> --%>
								<%-- 								</c:choose> --%>

								<br /> <br />
							</button>
						</div>

					</form:form>
				</div>
			</div>
		</div>



	</div>

	<jsp:include page="../footer.jsp" />

</body>
</html>