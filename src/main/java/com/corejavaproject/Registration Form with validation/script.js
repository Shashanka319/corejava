function validateForm() {
    let submitForm=true;
    let name=document.registrationForm.name.value;
    let email=document.registrationForm.email.value;
    let password=document.registrationForm.password.value;
    let confirmPassword=document.registrationForm.confirmPassword.value;

    if(name.length<3){
        alert("Name is too small");
        submitForm=false;
    }
    if(email.length<5 || !email.includes("@")){
        alert("Email is not valid");
        submitForm=false;
    }
    if(password.length<6){
        alert("Password is too small");
        submitForm=false;
    }
    if(password!=confirmPassword){
        alert("Password doesn't match");
        submitForm=false;
    }
    if(submitForm == true){
        alert("Form submitted successfully");
    }
    return submitForm;
}