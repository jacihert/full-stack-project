public class RockPaperScissors {
    String player1;
    String player2;

    public RockPaperScissors(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static String rps(String player1, String player2) {
        String winner = "";

        if (player1.equals("rock")) {
            switch (player2) {
                case "scissors":
                    winner = "player1 wins";
                    break;
                case "paper":
                    winner = "player2 wins";
                    break;
                case "rock":
                    winner = "TIE";
                    break;
            }
        }
        if (player1.equals("paper")) {
                switch (player2) {
                    case "rock":
                        winner = "player1 wins";
                        break;
                    case "scissors":
                        winner = "player2 wins";
                        break;
                    case "paper":
                        winner = "TIE";
                        break;
                }
        }

        if (player1.equals("scissors")) {
            switch (player2) {
                case "paper":
                    winner = "player1 wins";
                    break;
                case "rock":
                    winner = "player2 wins";
                    break;
                case "scissors":
                    winner = "TIE";
                    break;
            }
        }
            return winner;
    }

//        @Override
//        public String toString() {
//            return "RockPaperScissors{" +
//                    "player1='" + player1 + '\'' +
//                    ", player2='" + player2 + '\'' +
//                    '}';
//        }


    }




