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