var val = localStorage.getItem('userInfo');
var obj = JSON.parse(val);
document.getElementById("username").innerText = obj.name;

const paymentForm = document.getElementById("payment-form");

paymentForm.addEventListener('submit', (e) => {
  e.preventDefault();


  var val = localStorage.getItem('userInfo');
  var obj = JSON.parse(val);
  fetch("http://localhost:8080/transaction", {
    method:"PUT",
    headers:{
      "Content-Type":"application/json"
    },
    body:JSON.stringify({
      senderName: obj.email,
      amount: document.getElementById("amount").value,
      receiverName: document.getElementById("receiverName").value
    })
  }).then((res)=> {
    if(res===201 || res.status===200 || res.status===204){
      window.location.href= 'confirmPayment.html';
    } else {
      //error message
    }
  })
})