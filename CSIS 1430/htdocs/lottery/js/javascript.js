do {var x = prompt("How many do you want to picks?");
if ( x < 1 || x > 9) alert("Please retry, the limit is 9 number");}
while ( x < 1 || x > 9);
var lotto = [];
var lottoPicks = "";
for (var i = 0; i < x; i++)
{
	lotto[i] = Math.ceil(Math.random() * 100);
	
}
for (var i = 0; i < lotto.length; i++)
{
    if (i == 0) lottoPicks += lotto[i];
    else lottoPicks += "-" + lotto[i];
}	
document.getElementById("display").innerText= "The winner is number is: " + lottoPicks;

document.getElementById("Playagain").onclick = function () { 
var lotto = [];
var lottoPicks = "";
for (var i = 0; i < x; i++)
{
	lotto[i] = Math.ceil(Math.random() * 100);
	
}
for (var i = 0; i < lotto.length; i++)
{
    if (i == 0) lottoPicks += lotto[i];
    else lottoPicks += "-" + lotto[i];
}	
document.getElementById("display").innerText= "The winner is number is: " +  lottoPicks; };