//IIFE and Closure
const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `emp${count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("Harni: "+empId()); 
  console.log("Hani: "+empId()); 
  console.log("Sheka: "+empId());
   

  //Callbacks
  console.log("\n"); //to start the output from the neext line
  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(lastName);
  }
  
  var greeting = function(ln){
    console.log('Welcome ' + ln);
  };
  
  fullName("K","Harni",  greeting);
  console.log("\n");
  fullName("Moli","Hani", greeting);
  console.log("\n");
  fullName("K","Sheka",  greeting);
