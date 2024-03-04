package com.example.udemyclass

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "rock"
        }

        2 -> computerChoice = "paper"

        3 -> {
            computerChoice = "scissors"
        }
    }
    println(computerChoice)

   /** if (playerChoice == "rock" && randomNumber == 1){
        println("draw")
    } else if (playerChoice == "rock" && randomNumber == 2)
        println("you lose")
      else if (playerChoice == "rock" && randomNumber == 3)
          println("you win")
      else if (playerChoice == "paper" && randomNumber == 1)
          println("you win")
      else if (playerChoice == "paper" && randomNumber == 2)
          println("draw")
    else if (playerChoice == "paper" && randomNumber == 3)
        println("you lose")
     else if (playerChoice == "scissors" && randomNumber == 1)
         println("you lose")
    else if (playerChoice == "scissors" && randomNumber == 2)
        println("you win")
    else if (playerChoice == "scissors" && randomNumber == 3)
        println("draw")
    */
    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Plyaer"
        playerChoice == "paper" && computerChoice == "rock" -> "Plyaer"
        playerChoice == "scissors" && computerChoice == "paper" -> "Plyaer"
       else -> "Computer"
    }
    if(winner == "Tie"){
        println("There is no winner")
    } else{
        println("The winner is $winner")
    }
}