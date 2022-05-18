/*This is for the sign up button*/
const model = document.getElementById('email-model');
const openBtn = document.querySelector('.review');
const closeBtn = document.querySelector('.close-btn');
openBtn.addEventListener('click', () => {
    model.style.display = 'block';
  });
  closeBtn.addEventListener("click", () => {
    model.style.display = 'none';
  });

  window.addEventListener('click', (e) => {
    if (e.target === model) {
      model.style.display = 'none';
    }
  });

  const rep_model = document.getElementById('rep-model');
const rep_openBtn = document.querySelector('.report');
const rep_closeBtn = document.querySelector('.rep-close-btn');
rep_openBtn.addEventListener('click', () => {
    rep_model.style.display = 'block';
  });
  rep_closeBtn.addEventListener("click", () => {
    rep_model.style.display = 'none';
  });

  window.addEventListener('click', (e) => {
    if (e.target === rep_model) {
      rep_model.style.display = 'none';
    }
  });

  const con_model = document.getElementById('con-model');
  const con_openBtn = document.querySelector('.contact');
  const con_closeBtn = document.querySelector('.con-close-btn');
  con_openBtn.addEventListener('click', () => {
      con_model.style.display = 'block';
    });
    con_closeBtn.addEventListener("click", () => {
      con_model.style.display = 'none';
    });
  
    window.addEventListener('click', (e) => {
      if (e.target === con_model) {
        con_model.style.display = 'none';
      }
    });  


const errorForm = document.getElementById("rep-form");

errorForm.addEventListener('submit', (e) => {
e.preventDefault();



  fetch("http://localhost:8080/bug/reportError", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      description: document.getElementById('error-report-text').value
    })
  }).then((res) => {
    if (res.status === 201) {
      window.location.href='contactPage.html';
    } else {
      //error message
    }
  })
});
