<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <h1><center>GET STATES BASED OMN COUNTRY</center></h1>
 <form  action="countryurl"  method="post"  name="frm">
 country::<select name="country"  onchange="frm.submit()">
 <option  value="">select a value </option>
  <option  value="india">india</option> 
  <option  value="usa">usa</option>
  <option  value="eng">eng</option>
 </select>
 
 </form>