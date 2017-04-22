<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="webappname" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sport</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>        
        <script src="${webappname}/app.js" type="text/javascript"></script>

        <!-- table
        http://bootstrap-table.wenzhixin.net.cn/getting-started/
        -->
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/locale/bootstrap-table-hu-HU.min.js"></script> 
        <!-- datetime https://cdnjs.com/libraries/bootstrap-datetimepicker-->
        <script src="${webappname}/js/collapse.js" type="text/javascript"></script>
        <script src="${webappname}/js/moment-with-locales.min.js" type="text/javascript"></script>
        <script src="${webappname}/js/transition.js" type="text/javascript"></script>
        <script src="${webappname}/js/picklist.js" type="text/javascript"></script>
       
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
    </head>
    <body>
        <div class="container">
            <nav role="navigation" class="navbar navbar-default navbar-fixed-top">
                <div class="navbar-collapse collapse" id="menu" >
                    <ul class="nav navbar-nav ">
                        <c:forEach var="item" items="${menuitems}">
                            <li role="presentation"><a href="${webappname}${item.url}">${item.text}</a></li>                            
                        </c:forEach>
                    </ul>        
                </div>
            </nav>
                    <br><br><br><br>
            <div class="panel panel-default">
                <div class="panel-body">
