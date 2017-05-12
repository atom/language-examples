
// 1. Example ----------------------

var Sales = "Toyota";

function CarTypes(name) {
  if (name == "Honda") {
    return name;
  } else {
    return "Sorry, we don't sell " + name + ".";
  }
}

var car = { myCar: "Saturn", getCar: CarTypes("Honda"), special: Sales };

console.log(car.special);


// 2. Tests ----------------------
