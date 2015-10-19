<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
	<h1>${headerMessage}</h1>
	<h1>Ad Campaign Manager - Campaign Details Form</h1>
	<form:errors path="campaign1.*"/>
 	<form action="/AdCampaignApp/submitCampaignForm.html" method="post">
 	
 	<table>
		<tr>
			<td>Campaign Name: </td><td>        <input type="text" name="campaignName" /></td>
		</tr>
		<tr>
			<td>Campaign Description: </td><td>       <input type="text" name="campaignDescription" /></td>
		</tr>
		<tr>
			<td>Campaign UID : </td><td>      <input type="text" name="campaignUID" /></td>
		</tr>
		  <tr>
			<td>Campaign Start Date : </td><td> <input type="text" name="campaignStartDate" /></td>
		</tr>
		<tr>
			<td>Campaign Target Regions :</td><td>    <select name="campaignTargetRegions" multiple>
													<option value="CA">CA</option>
													<option value="WA">WA</option>
													<option value="NYC">NYC</option>
													</select><td>
		</tr>
		<tr><td></td></tr>
		
		</table>
		<table>
		<tr><td>Ad Details:</td><td></td></tr>
		<tr><td>Ad Name</td><td><input type="text" name="campaignAd.adName"/></td></tr>
		<tr><td>Ad Type</td><td><input type="text" name="campaignAd.adType"/></td></tr>
		</table>
		<input type="submit" value="Submit this form by clicking here" />
 	</form>
</body>
</html>