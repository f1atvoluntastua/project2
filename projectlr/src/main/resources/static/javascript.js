document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('salary-form').addEventListener('submit', function(event) {
        event.preventDefault();
    
        let age = event.target.age.value;
    
        fetch('/calculate', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({age: age})
        })
        .then(response => response.text())
        .then(salary => {
            document.getElementById('result').innerText = 'Predicted Salary: ' + salary;
        })
        .catch(console.error);
    });
});
