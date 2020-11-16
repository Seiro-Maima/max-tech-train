$(()=>{

    console.log("Ready...");

    // create an instance of a User
    var user = {
        id: 0,  // ALWAYS put zero!
        admin: true,
        email: "Dumbo@Dumber.com",
        firstName: "Fatma",
        lastName: "Hussein",
        password: "dumbo",
        phoneNumber: "119",
        reviewer: false,
        userName: "fatmaIsCounterfiet"  
        // NOTE: username must be unique. 
        // ERROR MESSAGE 
        //  jquery.min.js:2 POST http://localhost:8080/api/users 500
        // means you are trying to add an already existing username
    };

    // add a new user - will be persistence
    $.ajax({
        method: "POST",
        url: "http://localhost:8080/api/users",
        data: JSON.stringify(user),
        // tell it we are passing JSON data
        contentType: "application/json"
    })
        // done method is if ajax call was successful
        .done(res => {
            // display what comes back from method
            console.log(res);
            getAll();
        })
        // fail method if call failed
        .fail(err => {
            console.error(err);
        });


    // reading database using get method
    // created as a function since it's asynchronos
    // and we want to call it after POST is complete
    const getAll = () => {
        $.getJSON("http://localhost:8080/api/users")
            // when the call completes, put everything in users variable
            .done(users => {
                // display array of users in console message
                console.log(users);
            });
    }  

    console.log("After a GET JSON call.");
    getAll();
})