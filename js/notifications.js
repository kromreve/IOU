var val = localStorage.getItem('userInfo');
var obj = JSON.parse(val);
document.getElementById("username").innerText = obj.name;

/*
const accept1 = document.querySelector('notif-btn');
const accept1Btn = document.getElementById('pay1');

accept1.addEventListener('click', () => {
    accept1Btn.style.display='none';
})

const accept1 = document.querySelector("pay1");
const accept1 = document.querySelector("pay2");
*/
