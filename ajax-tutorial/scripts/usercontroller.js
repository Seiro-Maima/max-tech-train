const baseurl = "http://localhost:8080/api";


$(() => {
    $("#pkbutton").on("click", () => {
        getPK();
    });
})

// get all users
const getAll = () => {
    $.getJSON(`${baseurl}/users`)
        // res = results should be arrays of user list
        // .done is after the JSON call from url
        .done(res => {
            console.log(res);
            display(res);
        });
}  

// get a single user by Primary Key
const getPK = () => {
    // get pk from input
    let id = $("#ppk").val();

    $.getJSON(`${baseurl}/users/${id}`)
        .done(res => {
            console.log(res);
            displaySingle(res);
        });
}

// display single user based on PK
const displaySingle = (user) => {
    $("#pid").val(user.id);
    $("#pusername").val(user.userName);
    $("#pfirstname").val(user.firstName);
    $("#plastname").val(user.lastName);
    $("#pphone").val(user.phoneNumber);
    $("#pemail").val(user.email);
    $("#previewer").val(user.reviewer);
    $("#padmin").val(user.admin);
}

// dynamically display all users
const display = (users) => {
    let tbody = $("#tbody");
    tbody.empty();
    for(let user of users){
        let tr = $("<tr></tr>");
        let tdId = $(`<td>${user.id}</td>`);
        let tdusername = $(`<td>${user.userName}</td>`);
        let tdname = $(`<td>${user.firstName} ${user.lastName}</td>`);
        let tdphone = $(`<td>${user.phoneNumber}</td>`);
        let tdemail = $(`<td>${user.email}</td>`);
        let tdreviewer = $(`<td>${user.reviewer}</td>`);
        let tdadmin = $(`<td>${user.admin}</td>`);
        
        // append to table row
        tr.append(tdId)
        .append(tdusername)
        .append(tdname)
        .append(tdphone)
        .append(tdemail)
        .append(tdreviewer)
        .append(tdadmin);

        //append to table body
        tbody.append(tr);
    }
}

// call get all function afterwards
// getAll();    // turn on later
