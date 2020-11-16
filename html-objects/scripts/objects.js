let companies = [
    { id: 1, name: "Amazon", sales: 3000 },
    { id: 2, name: "BestBuy", sales: 2000 },
    { id: 3, name: "Meijer", sales: 4000 },
    { id: 4, name: "Kroger", sales: 7000 },
    { id: 5, name: "Walmart", sales: 9000 },
    { id: 6, name: "PG", sales: 8000 }
];

// function will iterate each item in array of company and display to console
const displayCompaniesConsole = () => {
    for(let c of companies){
        console.log("Id: ", c.id, " | Name: ", c.name, " | Sales: ", c.sales);
    }
}

// function will dynamically create a table for items in companies array
const displayCompaniesDynamic = () => {
    // get programmatic access to the TBODY tag
    let tbodytag = document.getElementById("tbody");
    // clear the HTML contents of the TBODY tag
    tbodytag.innerHTML = "";

    // loop through the array of objects
    for(let c of companies){
        // form the table so data goes in between <td> tags
        // use a variable to construct row to be inserted into TBODY tag
        let tr = "<tr>";    // opening table-row tag
        tr += `<td>${c.id}</td>`;   // using interpolation - less error prone
        tr += `<td>${c.name}</td>`; 
        tr += `<td>${c.sales}</td>`; 
        tr += "</tr>";      // closing table-row tag
        // append constructed row to inner HTML of TBODY variable
        tbodytag.innerHTML += tr;
    }
}