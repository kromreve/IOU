const form = document.getElementById("card-info");
form.addEventListener('submit', (e) => {
    e.preventDefault();
    
    var val = localStorage.getItem('userInfo');
    var obj = JSON.parse(val);
    console.log(obj.userID);
    console.log(document.getElementById("cardNumber").value);
    fetch("http://localhost:8080/userinfo/updateCard", {
     method:"PUT", 
     headers:{
       "Content-Type":"application/json"
     },
     body:JSON.stringify({
       bankacct_number: document.getElementById("cardNumber").value,
       userID: obj.userID
     })
   }).then((res)=> {
     if(res.status===201 || res.status===200 || res.status===204){
       console.log("Sucess");
       window.location.href='paymentFinish.html';
     }else{
       //error message
     }
   })
 });


 var val = localStorage.getItem('userInfo');
 var obj = JSON.parse(val);
 document.getElementById("username").innerText = obj.name;