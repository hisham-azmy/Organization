<html>
<%@ include file="/WEB-INF/views/Layout/TagLib.jsp"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<body>
	<center>
		<h2>Page not Found please try again</h2>
		 <a href='<spring:url value="/admin"
								></spring:url>'>
			Go Back</a>
	</center>

	<img
		src='<spring:url value="/resources/images/error.jpg"
								></spring:url>'
		alt="IMG-PRODUCT">


</body>
</html>
