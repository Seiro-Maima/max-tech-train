let nbr = 0;

$(() => {

    display();

    $("#minus").on("click", () =>{
        nbr--;
        display();
    });

    $("#plus").on("click", () =>{
        nbr++;
        display();
    });

})

const display = () => {
    $("#nbr").val(nbr);

    // set normal values
    $("#nbr").css("color", "black")
            .css("fontStyle", "normal")
            .css("fontWeight", "normal");

    // check if number is divisible
    if(nbr % 2 == 0)
        $("#nbr").css("color", "red")
    if(nbr % 3 == 0)
        $("#nbr").css("fontWeight", "bold");
    if(nbr % 5 == 0)
        $("#nbr").css("fontStyle", "italic")
}