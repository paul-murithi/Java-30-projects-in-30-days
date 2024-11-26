// TODO: Add implimentation for this method
const signupForm = document.getElementById("signup-form");

signupForm.addEventListener("submit", (event) => {
  event.preventDefault();
  validateSignUpForm();
});

function validateSignUpForm() {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;
  const rePassword = document.getElementById("re-password").value;
  const error = document.getElementById("error");

  if (!name || !email || !password || !rePassword) {
    error.textContent = "Please fill in all fields";
    return;
  }

  if (!validateEmail(email)) {
    error.textContent = "Please enter a valid email address";
    return;
  }

  if (!validatePasswordMatch(password, rePassword)) {
    error.textContent = "Passwords do not match";
    return;
  }

  // TODO: Submit Form
  error.textContent = "";
}

function validateEmail(email) {
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return emailRegex.test(email);
}

function validatePasswordMatch(password, rePassword) {
  return password === rePassword;
}
