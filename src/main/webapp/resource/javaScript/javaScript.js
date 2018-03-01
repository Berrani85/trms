/**
 * 
 */
function userLogin(){
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "GetUser");
	xhr.onreadystatechange = function(){
	console.log("READY STATE CHANGE: " + xhr.readyState);
	
		if(xhr.readyState == 4 && xhr.status == 200){
			var xmlText = xhr.responseXML;
			console.log(xmlText);
			var response = xmlText.getElementsByTagName("user");
			console.log(response);
			var sp = document.getElementById("log_user");
			sp.innerHTML=response[0].innerHTML;
			
			
			
		/*	for(e in response){
				var row = document.createElement("tr");
				var td1 = document.createElement("td");
				var td2 = document.createElement("td");
				var td3 = document.createElement("td");
				var td4 = document.createElement("td");
				
				td1.innerHTML = response[e].childNodes[0].innerHTML;
				td2.innerHTML = response[e].childNodes[1].innerHTML;
				td3.innerHTML = response[e].childNodes[2].innerHTML;
				td4.innerHTML = response[e].childNodes[3].innerHTML;
				
				row.appendChild(td1);
				row.appendChild(td2);
				row.appendChild(td3);
				row.appendChild(td4);
				
				resultTable.appendChild(row);
			}*/
		}else if(xhr.readyState == 4 && xhr.status!=200){
			console.log("ERROR, STATUS: " + xhr.status);
			document.getElementById("log_user").innerHTML=xhr.status;
		}
		

	}
	
	xhr.send(); //State == 2
}
function usrLogOut(){
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "UserLogOut");
	xhr.onreadystatechange = function(){
	console.log("READY STATE CHANGE: " + xhr.readyState);
	
		if(xhr.readyState == 4 && xhr.status == 200){
			
		}
	}
	
}
function reimbForm(){
	console.log("i am in the function")
	var d=document.getElementById("reimbForm").setAttribute("hidden",false);
	var d=document.getElementById("evalForm").setAttribute("hidden",true);
}
function gradeForm(){
	console.log("i am in the function")
	var d=document.getElementById("reimbForm").setAttribute("hidden",true);
	var d=document.getElementById("evalForm").setAttribute("hidden",false);
}	
function adminLogin(){
	var xhr = new XMLHttpRequest();
	
	xhr.open("GET", "AdminAccount");
	xhr.onreadystatechange = function(){
	console.log("READY STATE CHANGE: " + xhr.readyState);
	
		if(xhr.readyState == 4 && xhr.status == 200){
			var xmlText = xhr.responseXML;
			console.log(xmlText);
			var response = xmlText.getElementsByTagName("user");
			console.log(response);
			var sp = document.getElementById("log_user");
			sp.innerHTML=response[0].innerHTML;
			
			
			
		/*	for(e in response){
				var row = document.createElement("tr");
				var td1 = document.createElement("td");
				var td2 = document.createElement("td");
				var td3 = document.createElement("td");
				var td4 = document.createElement("td");
				
				td1.innerHTML = response[e].childNodes[0].innerHTML;
				td2.innerHTML = response[e].childNodes[1].innerHTML;
				td3.innerHTML = response[e].childNodes[2].innerHTML;
				td4.innerHTML = response[e].childNodes[3].innerHTML;
				
				row.appendChild(td1);
				row.appendChild(td2);
				row.appendChild(td3);
				row.appendChild(td4);
				
				resultTable.appendChild(row);
			}*/
		}else if(xhr.readyState == 4 && xhr.status!=200){
			console.log("ERROR, STATUS: " + xhr.status);
			document.getElementById("log_user").innerHTML=xhr.status;
		}
		

	}
	
	xhr.send(); //State == 2
}