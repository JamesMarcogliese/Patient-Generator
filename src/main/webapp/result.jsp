<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Patient Generator Demo</title>
    <link rel="stylesheet" type="text/css" href="resources/css/view.css" media="all">
    <script type="text/javascript" src="resources/js/view.js"></script>
</head>
<body id="main_body" >

<img id="top" src="top.png" alt="">
<div id="form_container">

    <h1><a>Patient Generator Demo</a></h1>
    <form id="form_55162" class="appnitro"  method="post" action="">
        <div class="form_description">
            <h2>Patient Generator Demo</h2>
            <p>Java web client to access patient generator JEE web service. Supports the creation of randomized patient records using FHIR.</p>
        </div>
        <ul >

            <li id="li_1" >
                <label class="description" for="element_1">Patient Records </label>
                <div>
                    <textarea id="element_1" name="element_1" class="element textarea medium">${patients}</textarea>
                </div>
            </li>

            <li class="buttons">
                <input type="hidden" name="form_id" value="55162" />
                <a href="index.jsp">Go Back</a>

            </li>
        </ul>
    </form>
</div>
<img id="bottom" src="bottom.png" alt="">
</body>
</html>
