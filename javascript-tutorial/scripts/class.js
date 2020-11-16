class Student{
    name;
    favcolor;
    favnumber;

    // constructor(){
    //     this.name = "Fred";
    //     this.name = "green";
    //     this.favnumber = 8;
    // }

    // change constructor so we can pass in any data
    constructor(name, favcolor, favnumber){
        this.name = name;
        this.favcolor = favcolor;
        this.favnumber = favnumber;
    }
    log(){
        console.log(this.name, this.favcolor, this.favnumber)
    }
}

// create instance of Student (first constructor)
// let fred = new Student();
// fred.name = "Fred";
// fred.log

// create instance of Student (second constructor)
// let fred = new Student("Fred", "green", 8);
// let wilma = new Student("Wilma", "red", 1)
// fred.log();
// wilma.log();

// create an array an initializing instances
let students = [
    new Student("Fred", "green", 8),
    new Student("Wilma", "red", 1),
    new Student("Barney", "blue", 7),
    new Student("Betty", "orange", 3),
    new Student("Pebbles", "pink", 2)
];

// dynamically create and display table of students
const displayStudents = () => {
    let tbodytag = document.getElementById("tbody");
    tbodytag.innerHTML = "";
    for(let s of students){
        let tr = "<tr>";    
        tr += `<td>${s.name}</td>`;   
        tr += `<td>${s.favcolor}</td>`; 
        tr += `<td>${s.favnumber}</td>`; 
        tr += "</tr>";
        tbodytag.innerHTML += tr;
    }
}