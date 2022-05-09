/*This is for the sign up button*/
const model = document.getElementById('email-model');
const openBtn = document.querySelector('.sign-button');
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

const form = document.getElementById('form');
const name = document.getElementById('name');
const email = document.getElementById('email');
const password = document.getElementById('password');
const passwordConfirm = document.getElementById('password-confirm');

function showError(input, message) {
  const formValidation = input.parentElement;
  formValidation.className = 'form-validation error';

  const errorMessage = formValidation.querySelector('p');
  errorMessage.innerText = message;
}

function showValid(input) {
  const formValidation = input.parentElement;
  formValidation.className = 'form-validation valid';
}

function checkRequired(inputArr) {
  inputArr.forEach(function (input) {
    if (input.value.trim() === '') {
      showError(input, `${getFieldName(input)} is required`);
    } else {
      showValid(input);
      return true;
    }
  });
}

function checkLength(input, min, max) {
  if (input.value.length < min) {
    showError(
      input,
      `${getFieldName(input)} must be at least ${min} characters`
    );
  } else if (input.value.length > max) {
    showError(
      input,
      `${getFieldName(input)} must be less than ${max} characters`
    );
  } else {
    showValid(input);
    return true;
  }
}

function checkPassMatch(input1, input2) {
  if (input1.value !== input2.value) {
    showError(input2, 'Passwords do not match');
  }
}

function getFieldName(input) {
  return input.name.charAt(0).toUpperCase() + input.name.slice(1);
}

form.addEventListener('submit', (e) => {
  e.preventDefault();
  checkRequired([name, email, password, passwordConfirm]);
  checkLength(name, 3, 50);
  checkLength(password, 8, 25);
  checkLength(passwordConfirm, 8, 25);
  checkPassMatch(password, passwordConfirm);

  fetch("http://localhost:8080/userinfo/signUp", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      name: document.getElementById("name").value,
      email: document.getElementById("email").value,
      password: document.getElementById("password").value
    })
  }).then((res) => {
    if (res.status === 201) {
      window.location.href = 'userHome.html';
    } else {
      //error message
    }
  })
});





/*This is for the login button*/
const modelLog = document.getElementById('login-model');
const openBtnLog = document.querySelector('.login-button');
const closeBtnLog = document.querySelector('.close-btn-log');
openBtnLog.addEventListener('click', () => {
  modelLog.style.display = 'block';
});
closeBtnLog.addEventListener("click", () => {
  modelLog.style.display = 'none';
});

window.addEventListener('click', (e) => {
  if (e.target === modelLog) {
    modelLog.style.display = 'none';
  }
});

const formLog = document.getElementById('form-log');

formLog.addEventListener('submit', (e) => {
  e.preventDefault();
  checkRequired([name, email, password]);
  checkLength(password, 8, 25);

  //console.log(document.getElementById("email-login").value);

  fetch("http://localhost:8080/userinfo/login", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      email: document.getElementById("email-login").value,
      password: document.getElementById("password-login").value
    })
  }).then(res => {
    if (res.status === 200) {
      res.json().then(data => {
        localStorage.setItem("userInfo", JSON.stringify(data));
        //console.log(JSON.parse(localStorage.getItem("userInfo")));
        window.location.href='userHome.html';
      })
    }
  })
    .catch((error) => {
      console.error('Error', error);
    });
});