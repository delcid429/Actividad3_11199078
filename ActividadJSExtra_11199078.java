//Variables
var compuCard1 = 0;
var compuCard2 = 0;
var jugCard1 = 0;
var jugCard2 = 0;
var totalForFirstTwoCards = 0;
var jugCard3 = 0;
var totalFor3Cards = 0;
var jugCard4 = 0;
var totalFor4Cards = 0;
var compuCardTotal = 0;

//Parte 1
compuCard1 = Math.floor(Math.random() * 11) + 1;
compuCard2 = Math.floor(Math.random() * 11) + 1;
jugCard1 = Math.floor(Math.random() * 11) + 1;
jugCard2 = Math.floor(Math.random() * 11) + 1;

compuCardTotal = compuCard1 + compuCard2;

totalForFirstTwoCards = jugCard1 + jugCard2
console.log("sus cartas son: \nCarta 1: " + jugCard1 + "\nCarta 2: " + jugCard2)

var respuesta = window.confirm("¿Desea otra carta? \nActualmente el valor de sus cartas suma:" + totalForFirstTwoCards)

if (!respuesta) {
  console.log("La computadora tiene: " + compuCardTotal);
  console.log("El jugador tiene: " + totalForFirstTwoCards);
  if (compuCardTotal < totalForFirstTwoCards) {
    console.log("Enhorabuena, ha ganado");
  } else if (compuCardTotal == totalForFirstTwoCards) {
    console.log("Empate");
  } else {
    console.log("Lastima, ha perdido");
  }

}

while (totalForFirstTwoCards <= 21 && respuesta) {
  jugCard3 = Math.floor(Math.random() * 11) + 1;
  totalFor3Cards = totalForFirstTwoCards + jugCard3;
  console.log("Su nueva carta vale " + jugCard3 + ",su total es " + totalFor3Cards)

  if (totalFor3Cards >= 22) {
    console.log("Lastima, su total es " + totalFor3Cards + ", suerte para la próxima");
    break;
  } else {
    var respuesta2 = window.confirm("¿Desea otra carta? \nActualmente el valor de sus cartas suma:" + totalFor3Cards);
    if (!respuesta2) {
      console.log("La computadora tiene: " + compuCardTotal);
      console.log("El jugador tiene: " + totalFor3Cards);
      if (compuCardTotal < totalFor3Cards) {
        console.log("Enhorabuena, ha ganado");
        break;
      } else if (compuCardTotal == totalFor3Cards) {
        console.log("Empate");
        break;
      } else {
        console.log("Lastima, ha perdido");
        break;
      }
    }
  }

  if (respuesta2) {
    jugCard4 = Math.floor(Math.random() * 11) + 1;
    totalFor4Cards = totalFor3Cards + jugCard4;
    console.log("Su nueva carta vale " + jugCard4 + ",su total es " + totalFor4Cards)


    if (totalFor4Cards >= 22) {
      console.log("Lastima, su total es " + totalFor4Cards + ", suerte para la próxima");
      break;
    } else {
      console.log("La computadora tiene: " + compuCardTotal);
      console.log("El jugador tiene: " + totalFor4Cards);
      if (compuCardTotal < totalFor4Cards) {
        console.log("Enhorabuena, ha ganado");
        break;
      } else if (compuCardTotal == totalFor4Cards) {
        console.log("Empate");
        break;
      } else {
        console.log("Lastima, ha perdido");
        break;
      }
    }
  }
}