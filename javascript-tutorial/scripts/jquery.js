// ready function expanded
//$().ready(
//    // anonomous function
//    ()=>{
//        // code goes here
//    }
//); 

// ready function contracted
//$().ready(()=>{
//        // code goes here
//});

//$().ready(()=>{   // old way of using it
$(()=>{

    console.log("jQuery is ready!");

    // button click
    // $("button").click(   // old way of using it
    $("button").on("click", 
        ()=>{
            console.debug("The button is clicked!");
        }
    );

    // pull number from input and display
    let valuePulledIn = $("input").val();
    //let valuePulledIn = $("#nbr").val();

    // convert value to number and add 3
    valuePulledIn = +valuePulledIn + 3;

    // put data into the input box
    $("input").val(valuePulledIn);
    //$("#nbr").val(valuePulledIn);

    console.log(valuePulledIn);

});

