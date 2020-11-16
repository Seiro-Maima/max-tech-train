class Student{
    name;
    favcolor;
    favnumber;
    constructor(name, favcolor, favnumber){
        this.name = name;
        this.favcolor = favcolor;
        this.favnumber = favnumber;
    }
    log(){
        console.log(this.name, this.favcolor, this.favnumber)
    }
}

// create an array to hold instances of Student objects
let students = [
    new Student("Fred", "green", 8),
    new Student("Wilma", "red", 1),
    new Student("Barney", "blue", 7),
    new Student("Betty", "orange", 3),
    new Student("Pebbles", "pink", 2)
];

const save = () => {
    let name = document.getElementById("name").value;
    let color = document.getElementById("color").value;
    let number = document.getElementById("number").value;
    // verify it received user input correctly
    console.log(name, color, number);
    // create new Student
    let student = new Student(name, color, Number(number));
    // Add to array of students
    students.push(student);
    // double-check in Console if it was added to array
    console.log(students);

}

