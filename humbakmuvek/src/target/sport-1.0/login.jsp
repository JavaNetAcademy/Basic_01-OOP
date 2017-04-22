<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<form action="j_security_check" accept-charset="UTF-8" method="post">
    <fieldset id="postForm">
        <legend>j_security_check method</legend>
        <div class="partContainer">
            <div class="left"><label for="user" >User Name: </label></div>
            <div class="right"><input type="text" name="j_username" id="user" required="required" maxlength="20"></div>
        </div>
        <hr/>

        <div class="partContainer">
            <div class="left"><label for="pass" >Pass: </label></div>
            <div class="right"><input type="password" name="j_password" id="pass" required="required" maxlength="20"></div>
        </div>

        <hr/>
        <div class="partContainer">
            <div class="left"><input type="submit" value="Log In"></div>
            <div class="right"><input type="reset" value="Reset"></div>
        </div>
    </fieldset>
</form>