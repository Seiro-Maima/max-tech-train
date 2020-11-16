// event that will put value in input box
function onLoaded(){
    // access anything regarding the input box
    // similar to holding the Object
    let htmlcntrl = document.getElementById("name");
    htmlcntrl.value = "Maima";
}

// event that will occur when button is clicked
function buttonClicked(){
    // document is referring to global HTML document
    let name = document.getElementById("name").value;
    console.log("The name is: ", name);
}