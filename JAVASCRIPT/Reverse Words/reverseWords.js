function reverseWords(sentence) 
{
    var words = sentence.split(' ');

    var reversedWords = words.map(function (word) 
    {
        return word.split('').reverse().join('');
    });

    var reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

var inputSentence = prompt("Enter a sentence:");
var reversedResult = reverseWords(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedResult);



