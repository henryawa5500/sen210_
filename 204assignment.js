const student = {
    name: 'Henry',
    age: 17,
  };
  
  let validEmail = false;
  
  while (!validEmail) {
    const email = prompt('Please enter your email:');
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  
    if (emailRegex.test(email)) {
      student.email = email;
      validEmail = true;
    } else {
      alert('Invalid email. Please try again.');
    }
  }