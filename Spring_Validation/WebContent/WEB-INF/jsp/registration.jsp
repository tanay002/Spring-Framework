<%@page import="com.springmvc.UserDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
    function validation()
    {
    var uname=document.getElementById('uname').value;
    var upass=document.getElementById('upass').value;
    var uemail=document.getElementById('uemail').value;
    var umobile=document.getElementById('umobile').value;
    if(uname=="")
        {
        /*     document.getElementById('uname').innerHTML="Username can't be blank"; */
            alert("Username can't be blank");
            return false;
        }
        
        if(upass==""||((upass.length<6)&&(upass.length>12)))
        {
            /* document.getElementById('upass').innerHTML="Password can't be blank and should have more than 6 digits"; */
            alert("Password can't be blank and should have more than 6 digits and less than 12 digits");
            return false;
        }
        if(umobile.length!=10)
            {
            /*   document.getElementById('umobile').innerHTML="mobile no should be 10 digits"; */
              alert("mobile no should be 10 digits");
            return false;  
            }
        }
    </script>
    </head>
<body>

<center>
<table>
<form name="myform" id="forme" action="doReg.do" method="post" onsubmit="return validation()" modelAttribute="user">
<tr><td>Username<input type="text" name="uname" id="uname" autocomplete="off">    </td>     </tr>      
<tr><td>Password<input type="password" name="upass" id="upass" autocomplete="off">   </td>  </tr>   
<tr><td>Email<input type="text" name="uemail" id="uemail" autocomplete="off">   </td> </tr>   
<tr><td>Mobileno<input type="text" name="umobile" id="umobile" autocomplete="off">  </td></tr>   
<tr><td><input type="submit" name="submit" value="Register" autocomplete="off"></td></tr>
</form>
 </table>
 </center>
</body>
</html>