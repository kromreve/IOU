document.getElementById("edit-btn").onclick = function () {
    if (document.getElementById("inp").hasAttribute("readonly") === false) {
      document.getElementById("inp").setAttribute("readonly", true);
    } else {
      document.getElementById("inp").removeAttribute("readonly");
    }
    if (
      document.getElementById("inp2").hasAttribute("readonly") === false
    ) {
      document.getElementById("inp2").setAttribute("readonly", true);
    } else {
      document.getElementById("inp2").removeAttribute("readonly");
    }
    if (
      document.getElementById("inp3").hasAttribute("readonly") === false
    ) {
      document.getElementById("inp3").setAttribute("readonly", true);
    } else {
      document.getElementById("inp3").removeAttribute("readonly");
    }
    if (
      document.getElementById("inp4").hasAttribute("readonly") === false
    ) {
      document.getElementById("inp4").setAttribute("readonly", true);
    } else {
      document.getElementById("inp4").removeAttribute("readonly");
    }
    var diff = document.getElementById("edit-btn");
    if (diff.value == "Save") diff.value = "Edit";
    else diff.value = "Save";
    //document.getElementById("inp").removeAttribute("readonly");
  };


  
  var val = localStorage.getItem('userInfo');
  var obj = JSON.parse(val);
  document.getElementById("username").innerText = obj.name;
  
  
  
  const form = document.getElementById("update-account-form")
  form.addEventListener('submit', (e) => {
    e.preventDefault();
    
    var val = localStorage.getItem('userInfo');
    var obj = JSON.parse(val);
    console.log(obj.userID);
    fetch("http://localhost:8080/userinfo/updateAccount", {
     method:"PUT", 
     headers:{
       "Content-Type":"application/json"
     },
     body:JSON.stringify({
       name: document.getElementById("inp").value,
       email: document.getElementById("inp2").value,
       password: document.getElementById("inp3").value,
       phoneNumber: document.getElementById("inp4").value,
       userID: obj.userID
     })
   }).then((res)=> {
     if(res.status===201 || res.status===200 || res.status===204){
       console.log("Sucess");
     }else{
       //error message
     }
   })
 });