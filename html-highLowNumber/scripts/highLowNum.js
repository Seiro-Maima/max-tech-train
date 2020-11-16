let nbrs = [
    106,    573,    204,    804,    482,
    457,    769,    889,    860,    399,
    599,    824,    346,    851,    450,
    590,    520,    321,    341,    619,
    505,    769,    532,    764,    101
]

const clicked = () => {

    // high number will always be bigger than 0
    let highNum = 0;    
    // low number will always be a smaller than 100
    let lowNum = 1000;
    
    for(let n of nbrs){
        if(n > highNum)
            highNum = n;
        if(n <= lowNum)
            lowNum = n;
    }

    // set values to value on the input box
    document.getElementById("highNum").value = highNum;
    document.getElementById("lowNum").value = lowNum;

}