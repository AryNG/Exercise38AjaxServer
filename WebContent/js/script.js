/**
 * 
 */
let xhr = new XMLHttpRequest();
window.onload = function(){
	//alert ("alert")
	document.getElementById("btnSalary").addEventListener("click",salaryFinal);
	document.getElementById("btnSalary2").addEventListener("click",salaryFinal2);
	
}
function salaryFinal(){
	xhr.onload = CallBack;
	let name = document.getElementById("txtName").value;
	let salary = document.querySelector("#txtSalary").value;
	xhr.open("GET","salaryServlet?txtName="+name+"&txtSalary="+salary);
	xhr.send(null);
}
function salaryFinal2(){
	xhr.onload = CallBack2;
	let name2 = document.getElementById("txtName2").value;
	let salary2 = document.querySelector("#txtSalary2").value;
	
	//Create a form
	let myForm = new FormData();
	
	//Paramaters
	myForm.append("txtName",name2);
	myForm.append("txtSalary",salary2);
	
	xhr.open("POST","salaryServlet2");
	xhr.send(myForm);
}

function CallBack(){
	//alert("on Callback");
	document.getElementById("SalaryFinal").innerHTML = xhr.responseText;
}
function CallBack2(){
	document.getElementById("SalaryFinal2").innerHTML = xhr.responseText;
}