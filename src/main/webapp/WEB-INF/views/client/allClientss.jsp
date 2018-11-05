<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<body class="body">
	<h3>
		Questions <img
			src="<spring:url value="/resources/Css/images/icons/question-mark.png"   ></spring:url>">
	</h3>

	<div class="panel panel-default">
		<div class="panel-body" style="background-color: whitesmoke;">

			<%-- 			<form:form class="form-horizontal" style="margin-top: 35px;" --%>
			<%-- 				commandName="Subjects" method="post"> --%>
			<!-- 				<div class="form-group"> -->
			<!-- 					<label for="category" class="col-sm-3 control-label">Select -->
			<!-- 						Type of Q </label> -->
			<!-- 					<div class="col-sm-9"> -->
			<%-- 						<form:select path="typeofQuestion" class="form-control" --%>
			<%-- 							style="width: 300px;"> --%>

			<%-- 						</form:select> --%>
			<!-- 					</div> -->
			<!-- 				</div> -->
			<!-- 				<input type="submit" value="Create New Question" -->
			<!-- 					class="btn btn-primary col-sm-offset-4"> -->
			<%-- 			</form:form> --%>
			<div class="panel panel-default" style="margin-top: 30px;">
				<!-- Default panel contents -->
				<!-- Table -->
				<table class="table table-striped">
					<caption>Avaliable Questions</caption>
					<thead>
						<tr>
							<th>Question</th>
							<th>Modify</th>
							<th>Last Modify</th>
						</tr>
					</thead>
					<tbody>
						<spring:url value='/teacher/QuestionBank' var="toto"></spring:url>
						<%-- 						<form:form class="form-horizontal" style="margin-top: 35px;" --%>
						<%-- 							modelAttribute="questions" method="post" action="${toto}"> --%>
						<c:forEach var="product" items="${client}">

							<!-- 									<td><input type="checkbox" name="questionsIds" -->
							<%-- 										value="${questions.questionId}" /></td> --%>
							<td><c:out value="${product.name}" /></td>

							<td><a
								href='<spring:url value="/teacher/QuestionBank/editQuestion/${product.id}" />'>
									<img
									src="<spring:url value="/resources/Css/images/icons/options.png"   />">
							</a> <a
								href='<spring:url value="/teacher/QuestionBank/viewQuestion/${product.id}" />'>
									<img
									src="<c:url value="/resources/Css/images/icons/view.png "></c:url>">
							</a> <a
								href='<spring:url value="/teacher/QuestionBank/deleteQuestion/${product.id}" />'><img
									src=" <spring:url value="/resources/Css/images/icons/delete.png"   ></spring:url>"></a></td>
							<td>today</td>

							</tr>
						</c:forEach>
						<!-- ------------------------ شكل كروكى مش اكتر  -->
						<tr>
							<td><input class="in" type="checkbox" value="">&nbsp;Matching
								Question</td>
							<td><a href=""><img src="Css/Images/icons/options.png"></a>
								<a
								href='<spring:url value="/teacher/QuestionBank/viewQuestion/${product.id}" />'>
									<img src="Css/Images/icons/view.png">
							</a> <a href=""><img src="Css/Images/icons/delete.png"></a></td>
							<td>today</td>
						</tr>
						<tr>
							<td><input class="in" type="checkbox" value="">&nbsp;Short
								Answer Question</td>
							<td><a
								href='<spring:url value="/teacher/QuestionBank/editQuestion/${product.id}" />'>
									<img
									src="<spring:url value="/resources/Css/images/icons/options.png"   />">
							</a> <a
								href='<spring:url value="/teacher/QuestionBank/viewQuestion/${product.id}" />'>
									<img
									src="<c:url value="/resources/Css/images/icons/view.png "></c:url>">
							</a> <a
								href='<spring:url value="/teacher/QuestionBank/deleteQuestion/${product.id}" />'><img
									src=" <spring:url value="/resources/Css/images/icons/delete.png"   ></spring:url>"></a></td>
							<td>today</td>
						</tr>
				</table>
			</div>
		</div>
	</div>
</html>