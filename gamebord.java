public int getPointsForRow(int row){
  int totalPoints = 0;
  boolean sameColor = true;
  String colorCheck = board[row][0].getColor();

for(int col = 0; col < board[row].length; col++){
  totalPoints += board[row][col].getPoints();
  if(!board[row][col].getColor().equals(colorCheck)){
    sameColor = false;
  }
}

if(sameColor){
  return totalPoints*2;
}

return totalPoints;
}
