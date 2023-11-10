function submitForm() {
    // Get form values
    var firstName = document.getElementById('firstName').value;
    var lastName = document.getElementById('lastName').value;
    var dob = document.getElementById('dob').value;
    var country = document.getElementById('country').value;
    
    var genderElements = document.getElementsByName('gender');
    var gender = Array.from(genderElements)
        .filter(element => element.checked)
        .map(element => element.value)
        .join(', ');

    var profession = document.getElementById('profession').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;

    // Validate all fields
    if (!firstName || !lastName || !dob || !country || !gender || !profession || !email || !mobile) {
        alert("All fields are required!");
        return;
    }

    // Display results in the popup
    var resultHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;
    document.getElementById('popupResult').innerHTML = resultHTML;

    // Show the popup
    document.getElementById('popup').style.display = 'flex';
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}

function closePopup() {
    // Close the popup and reset the form
    document.getElementById('popup').style.display = 'none';
    resetForm();
}
