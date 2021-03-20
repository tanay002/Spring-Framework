/*this script is used to get value in textbox 
	$(document).ready(function() {
		$(".field_name").on('click',function() {
			var $tr = $(this).parent('tr');
			var hId = $tr.find('td.hiddenId').text(); 
			var textValue = $tr.find('.field_name').text();
			var tdValue = $tr.find('.tdValue').text();
			$("#hiddenId").val(hId); 
			$("#hrm_name").val(textValue);	
			$("#description").val(tdValue);
		});
	});
*/
/*
 this script is used to change the textbox color  */
/*	$(document).ready(function(){
		$("#btnSave").click(function(){
			if ($('#hrm_name').val() == '') {
				$('#hrm_name').css('border-color', 'red');
				$('#hrm_name-error').css('display', 'block');
  
			}
			else {
				$('#hrm_name').css('border-color', '');
			}   
		});
	});
*/
/* this script is used to clear text box of field on cancel button click */
/*
	function ClearTextBox()
	{   
		document.getElementById("hrm_name").value="";
		document.getElementById("descp").value="";
		
	}
*/
/* this script is used for hide and show add box */
	
	/*$(document).ready(function(){
	    $("#btnCancel").click(function(){
	        $("#block").hide();
	        $(".top").show();
	        $('#hrm_name').css('border-color', '');
			$('#hrm_name-error').css('display', 'none');
	    });
	    $("#btnAdd").click(function(){
	          $("#block").show();
	          $(".top").hide();
	          $('#add').attr("class", "head");//change "select all" checked status to true
	          $('#add').css('display','block');
	          $('#edit').removeAttr('class');//change "select all" checked status to true
	          $('#edit').css('display','none');
	          $(".head").show();
	          
	    });
	});	*/

	/*this script is used to even-odd row of resulttable  */
	$(document).ready(function()
			{
		  
			$('#resultTable tr:odd').attr("class", "odd" );
			$('#resultTable tr:even').attr("class", "even");	
		
	});
	
	/*this script is used for hide and show edit box */
	/*$(document).ready(function(){
	   
	    $(".hrm_name").click(function(){
	        $("#block").show();
	        $(".top").hide();
	        $('#edit').attr("class", "head");//change "select all" checked status to true
	        $('#edit').css('display','block');
	        $('#add').removeAttr("class");//change "select all" checked status to true
	        $('#add').css('display','none');
	        $(".head").show();
	       
	        
	    });
	});
*/

	/* this script is used to select all checkbox */
	
	$(document).ready(function(){

	$("#select_all").change(function(){  //"select all" change 
	  var status = this.checked; // "select all" checked status
	  if(status == false){ //if this item is unchecked
		  $('#btnDelete').attr("disabled", "disabled");//change "select all" checked status to true
	  }
	  if(status == true){ //if this item is checked
		  $('#btnDelete').removeAttr("disabled");//change "select all" checked status to true
	  }
	  $('.case').each(function(){ //iterate all listed checkbox items
	        this.checked = status; //change ".checkbox" checked status
	    });
	  
	});
	});

	$(document).ready(function(){
	$('.case').change(function(){ //".checkbox" change 
	    //uncheck "select all", if one of the listed checkbox item is unchecked
	    if(this.checked == false){ //if this item is unchecked
	        $("#select_all")[0].checked = false; //change "select all" checked status to false
	    }
	    
	    //check "select all" if all checkbox items are checked
	    if ($('.case:checked').length == $('.case').length ){ 
	        $("#select_all")[0].checked = true; //change "select all" checked status to true
	    }
	});
	});

	/*this script is used */
	$(document).ready(function(){

		$('.case').click(function(){ //".checkbox" change 


		    //check "select all" if all checkbox items are checked
		    if ($('.case:checked').length > 0)
		    {
		    	$('#btnDelete').removeAttr("disabled");//change "select all" checked status to true
		    }
		    else
		    { 
		    	$('#btnDelete').attr("disabled", "disabled");//change "select all" checked status to true
		    }
		    	
		});
		});
     
	
	/* when we clicked on ok button of confirmation
	 *  box (delete data), than this funtion will call
	 *   submit action of form 
	 */
	
	
	$(document).ready(function(){
		$("#btnDelete").click(function(){
		     var $form=$(this).closest('form'); 
	         $('#dialogDeleteBtn').click(function(){
	            $form.trigger('submit'); // submit the form
	        
	  		  });
	        // .one() is NOT a typo of .on()
			});
		});


	

	