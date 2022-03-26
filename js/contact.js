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

  