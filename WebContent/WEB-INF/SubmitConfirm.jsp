<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>${headerMessage}</h1>
 
	<h2>Details submitted by you: </h2>

	<table>
		<tr>
			<td>Campaign Name :</td>
			<td>${campaign1.campaignName}</td>
		</tr>
		<tr>
			<td>Campaign Details :</td>
			<td>${campaign1.campaignDescription}</td>
		</tr>
		<tr>
			<td>Campaign UID :</td>
			<td>${campaign1.campaignUID}</td>
		</tr>
		 <tr>
			<td>Campaign Start Date :</td>
			<td>${campaign1.campaignStartDate}</td>
		</tr> 
		<tr>
			<td>Campaign Target Regions :</td>
			<td>${campaign1.campaignTargetRegions}</td>
		</tr>
		<tr>
			<td>Ad Name :</td>
			<td>${campaign1.campaignAd.adName}</td>
		</tr>
		<tr>
			<td>Ad Type :</td>
			<td>${campaign1.campaignAd.adType}</td>
		</tr>

	</table>
 </body>
</body>
</html>