// JAVASCRIPT  
var markers = [
  '<img src="roxy.jpg" width = 180px height = 180 px>', 
  '<img src="megu.jpg" width = 180px height = 180 px>'];

var players = [];
var totals = []; 
var winCodes = [7,56,73,84,146,273,292,448]; 
var gameOver = false; 
var whoseTurn = 0; 
var playerScore1 = 0; // player 1 points
var playerScore2 = 0; // player 2 points

function startGame() 
{
   document.getElementById("Playagain").className = "hide";
   players[0] = document.getElementById("guessbox1").value;
   players[1] = document.getElementById("guessbox2").value;
   var counter = 1;
   var innerDivs = "";
   for (i = 1; i <= 3; i++)
   {
	innerDivs += '<div id="row-' + i + '">';

	for (j = 1; j <=3; j++)
   {	
   innerDivs += '<div onclick="playGame(this,' + counter + ');"></div>';
   counter *=2;
   }  
   innerDivs += '</div>';
}
	document.getElementById("game-board").innerHTML = innerDivs;
	totals = [0, 0];
	gameOver = false;
    document.getElementById("game-message").innerText = "It's  " + players[whoseTurn] + "'s turn";
	
}
function playGame (clickedDiv, divValue ) 
{
  document.getElementById("Playagain").className = "hide"
  if (!gameOver)
  {
  // add x or o to playing field 
  clickedDiv.innerHTML = markers[whoseTurn]; 
  // keep tracking of the players's totals for win combo 
  totals[whoseTurn] += divValue; 
  // call iswin() function 
  if (isWin()) 
  {
  document.getElementById ("game-message").innerText = players[whoseTurn] + "is the winner!"; 
  document.getElementById("submitguess").className = "show";
  document.getElementById("Playagain").className = "show";
  } 
  else if (gameOver)
  {  
  document.getElementById("game-message").innerText = "It is a tie. Both of them are best girl!"; 
   document.getElementById("Playagain").className = "show";
  } 
  else
  {  
  // toggle player turn 
  if (whoseTurn) whoseTurn = 0; else whoseTurn = 1; 
  
  // no clicking on same div again 
  clickedDiv.attributes["0"].nodeValue = ""; 
  // toggle message to display next player 
  document.getElementById("game-message").innerText = "It's " + players[whoseTurn] + "'s turn"; 
 }
 }
}
 // win code Logic 
 function isWin() 
 {
 for (i = 0; i < winCodes.length; i++) 
 {
 if ((totals[whoseTurn] & winCodes[i]) == winCodes[i]) { gameOver = true; return true; }  
 }
 if (totals[0] + totals[1] == 511) { gameOver = true;} 
 return false;
 }