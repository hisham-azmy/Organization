<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

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
<!-- <body style="font-family: 'Open Sans', sans-serif;"> -->
<body class="animsition">

	<jsp:include page="header.jsp" />
	<div class="container">
		<div class="centered title">
			<h1>Setting Page</h1>
		</div>
	</div>

	<spring:url value="/admin/settings" var="url" />
	<div class="row sign" style="padding-bottom: 30px;">
		<div class="container col-lg-6 col-lg-offset-22 "
			style="text-align: center;">

			<div class="input-text">
				<h2>${headerMSG}</h2>
				<br /> <br />
				<form:form commandName="settings" cssClass="form-horizontal"
					action="${url}" method="POST">

					<form:hidden path="id"/>
					<!-- ************        organizationName           *************** -->
					<spring:message code="label.organizationName"
						var="organizationName" />
					<div class="form-group col-lg-12 col-lg-offset-5 act">

						<form:input path="organizationName"
							cssClass="form-group col-lg-6 " />

						<label class="form-group col-lg-4 col-lg-offset-0 "> <strong><spring:message
									code="label.organizationName" /></strong>
						</label>
						<div class="form-group col-lg-6 col-lg-offset-5"></div>
						<form:errors path="organizationName" cssStyle="color:#f00;"></form:errors>
					</div>

					<!-- ************        address           *************** -->

					<div class="form-group col-lg-12 col-lg-offset-5 act">
						<form:input path="address" id="clientName1"
							cssClass="form-group col-lg-6 col-lg-offset-5 act" />

						<form:label class="form-group col-lg-4 col-lg-offset-0 "
							path="address">
							<strong><spring:message code="label.addressOrg" /></strong>
						</form:label>
						<div class="form-group col-lg-12 col-lg-offset-5">
							<form:errors path="address" cssStyle="color:#f00;"></form:errors>
						</div>
					</div>
					<!-- ************        bankBalanceValue           *************** -->

					<div class="form-group col-lg-12 col-lg-offset-5 act">
						<form:input path="bankBalanceValue"
							cssClass="form-group col-lg-6 col-lg-offset-5 act" />

						<form:label class="form-group col-lg-4 col-lg-offset-0 "
							path="bankBalanceValue">
							<strong><spring:message code="label.bankBalanceValue" /></strong>
						</form:label>
						<div class="form-group col-lg-12 col-lg-offset-5">
							<form:errors path="bankBalanceValue" cssStyle="color:#f00;"></form:errors>
						</div>
					</div>


					<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
						<button type="submit"
							class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
							<strong><spring:message code="label.save" /></strong>
						</button>
					</div>

				</form:form>


			</div>
		</div>
	</div>

	<!-- 
	<hr class="featurette-divider"></hr>
	<div class="container">
		<div class="row">

			<div class="col-sm-6">
				<label class='control-label'></label>

				<div class="alert alert-info"">Please choose your method of
					payment and hit continue. You will then be sent down to pay using
					your selected payment option.</div>
				<br>
				<div class="btn-group-vertical btn-block">
					<a class="btn btn-default" style="text-align: left;"
						data-toggle="tab" href="#stripe">Stripe/Credit Card</a> <a
						class="btn btn-default" style="text-align: left;"
						data-toggle="tab" href="#paypal">PayPal</a>
				</div>

				<br> <br> <br>

				<div class="jumbotron jumbotron-flat">
					<div class="center">
						<h2>
							<i>BALANCE DUE:</i>
						</h2>
					</div>
					<div class="paymentAmt">$100</div>



				</div>



				<br> <br> <br>
			</div>


			<div class="col-sm-6">
				<div class="tab-content">
					<div id="stripe" class="tab-pane fade in active">
						<script src='https://js.stripe.com/v2/' type='text/javascript'></script>
						<form accept-charset="UTF-8" action="/" class="require-validation"
							data-cc-on-file="false"
							data-stripe-publishable-key="pk_bQQaTxnaZlzv4FnnuZ28LFHccVSaj"
							id="payment-form" method="post">
							<div style="margin: 0; padding: 0; display: inline">
								<input name="utf8" type="hidden" value="✓" /><input
									name="_method" type="hidden" value="PUT" /><input
									name="authenticity_token" type="hidden"
									value="qLZ9cScer7ZxqulsUWazw4x3cSEzv899SP/7ThPCOV8=" />
							</div>
							<br>
							<div class='form-row'>
								<div class='form-group required'>
									<div class='error form-group hide'>
										<div class='alert-danger alert'>Please correct the
											errors and try again.</div>
									</div>
									<label class='control-label'>Name on Card</label> <input
										class='form-control' size='4' type='text'>
								</div>

							</div>
							<div class='form-row'>
								<div class='form-group card required'>
									<label class='control-label'>Card Number</label> <input
										autocomplete='off' class='form-control card-number' size='20'
										type='text'>
								</div>
							</div>
							<div class='form-row'>
								<div class='form-group card required'>
									<label class='control-label'>Billing Address</label> <input
										autocomplete='off' class='form-control' size='20' type='text'>
								</div>
							</div>
							<div class='form-row'>
								<div class='form-group cvc required'>
									<label class='control-label'>CVC</label> <input
										autocomplete='off' class='form-control card-cvc'
										placeholder='ex. 311' size='4' type='text'>
								</div>
								<div class='form-group expiration required'>
									<label class='control-label'>Expiration</label> <input
										class='form-control card-expiry-month' placeholder='MM'
										size='2' type='text'>
								</div>
								<div class='form-group expiration required'>
									<label class='control-label'>Year</label> <input
										class='form-control card-expiry-year' placeholder='YYYY'
										size='4' type='text'>
								</div>
							</div>


							<div class='form-row'>
								<div class='form-group'>
									<label class='control-label'></label>

									<button class='form-control btn btn-primary' type='submit'>
										Continue →</button>
						</form>

					</div>
				</div>

			</div>

			<div id="paypal" class="tab-pane fade">
				<form action="?" id="paypalForm" method="POST">
					<div class="paypalResult">
					</div>
					<br> <input type="hidden" id="action" value="paypal"></input>
					<input type="hidden" id="token"
						value="token-supersecuretoken123123123"></input> <a href="#paypal"><img
						src="https://www.paypalobjects.com/webstatic/en_US/i/buttons/checkout-logo-large.png"
						alt="paypal" width="100%"></a> <br> <br> <br>
					<button class='form-control btn btn-primary submit-button'
						type='submit'>Continue →</button>
			</div>
		</div>



	</div>

 -->






	<jsp:include page="footer.jsp" />
</body>


</html>