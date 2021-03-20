<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<script type="text/javascript">

</script>

<link rel="stylesheet"
	href="css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/od-hrm.js"></script>
<script src="js/bootstrap-modal.min.js"></script>
<style type="text/css">
.hiddenId {
	display: none;
}

body, table, tbody, tr, td {
	background-color: white;
	text-align: left;
}
</style>

<!-- this funtion is used for hover on button-->
<style>
.savebutton:hover {
	background-color: #3e8e41
}

#btnCancel:hover {
	background-color: #4d4d4d
}

.Add:hover {
	background-color: #3e8e41
}

</style>

</head>


<body>

		<div id="nationalityList">
			<!-- List component  -->

			<div class="box" id="search-results">
				<div class="inner">

					<form method="post" action="deleteNationality.do" name="" id="">
					
				
               			<div id="tableWrapper">
							<table class="table hover" id="resultTable">
                                      
                                      <div class="top" style="display: block;">

						                <input type="submit" class="delete"
								id="btnDelete" name="btnDelete" value="Delete"
								disabled="disabled" data-toggle="modal" data-target="#deleteConfModal">
						</div>
										<thead>
											<tr>
												<th rowspan="1" class="checkbox-col"><input
													type="checkbox" id="select_all" name="select_all" value=""></th>
												<th rowspan="1" style="width:; text-align: left"><span
													class="headerCell">Nationality</span></th>
											</tr>
										</thead>

								<tbody><center>
									<c:forEach items="${viewNationality}" var="view"
										varStatus="status">
												<tr class="#">
													<td class="nid"><input type="checkbox"
														name="chkSelectRow" class="case" value="${view.nId}"
														id="checkBoxId"></td>
													<td class="field_name"><a href="javascript:" target=""
														class="hrm_name">${view.nName}</a></td>
													<td class="hiddenId"><a href="javascript:" target="">${view.nId}</a></td>

												</tr>

									</c:forEach>
                                      </center>
								</tbody>
                             </table>
						</div>
					</form>
	

				</div>
			</div>

		</div>
	
 <script type="text/javascript">
	
	$(document).ready(function(){
		$("#btnDelete").click(function(){
			alert();
		     var $form=$(this).closest('form'); 
	         $('#dialogDeleteBtn').click(function(){
	            $form.trigger('submit'); // submit the form
	        
	  		  });
	        // .one() is NOT a typo of .on()
			});
		});
	</script>
</body>
</html>