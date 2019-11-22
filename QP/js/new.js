function showQuestions(){
    document.getElementById('instructions_p').style.display = "none";
    document.getElementById('questions_p').style.display = "block";
    document.getElementById('welcome_p').style.display = "none";
    document.getElementById('instructions_RC').style.display = "none";
    document.getElementById('head').innerHTML = "";
    document.getElementById('head').innerHTML = "Question";
    document.getElementById('sub').innerHTML = "";
}

function showInstructions(){
    document.getElementById('instructions_p').style.display = "block";
    document.getElementById('questions_p').style.display = "none";
    document.getElementById('welcome_p').style.display = "none";
    document.getElementById('instructions_RC').style.display = "none";
    document.getElementById('head').innerHTML = "";
    document.getElementById('head').innerHTML = "Instructions";
    document.getElementById('sub').innerHTML = "";
}

function showWelcome(){
    document.getElementById('instructions_p').style.display = "none";
    document.getElementById('questions_p').style.display = "none";
    document.getElementById('welcome_p').style.display = "block";
    document.getElementById('instructions_RC').style.display = "none";
    document.getElementById('head').innerHTML = "";
    document.getElementById('head').innerHTML = "Welcome";
    document.getElementById('sub').innerHTML = "";
    document.getElementById('head').innerHTML = "Spring Micro Services Hands-On Certification";
}
function showRestClient(){
    document.getElementById('instructions_p').style.display = "none";
    document.getElementById('questions_p').style.display = "none";
    document.getElementById('welcome_p').style.display = "none";
    document.getElementById('instructions_RC').style.display = "block";
    document.getElementById('head').innerHTML = "";
    document.getElementById('head').innerHTML = "Welcome";
    document.getElementById('sub').innerHTML = "";
    document.getElementById("head").style.marginLeft = "0px";
    document.getElementById('head').innerHTML = "RestClient Instructions";
}