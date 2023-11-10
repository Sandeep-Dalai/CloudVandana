//Perform sorting of an array in descending order
function sortDescending(arr) {
    arr.sort(function(a, b) {
        
        return b - a;
    });
}

var numbers = [5, 2, 8, 1, 4];

console.log("Original Array: " + numbers);

sortDescending(numbers);

console.log("Sorted Array (Descending): " + numbers);

