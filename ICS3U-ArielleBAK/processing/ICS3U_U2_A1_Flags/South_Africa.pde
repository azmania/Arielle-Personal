// SOUTH AFRICA FLAG: HARD CODED
void southAfrica() {
  
  // SETUP
  rectMode( CENTER );
  
  // RED PART OF FLAG
  fill( 255, 0, 0 );
  stroke(255,0,0);
  rect( 
    xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/10, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/4, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE * .8, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/2 
  );
  
  // BLUE PART OF FLAG
  fill( 9, 57, 186 );
  stroke(9, 57, 186);
  rect( 
    xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/10, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/4, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE * .8, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/2 
  );
  
  //WHITE TRIANGLE
  fill(255);
  stroke(255);
  triangle(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * .3, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
           xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * .3, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
           xFlagCenter, yFlagCenter
           );
  
  // WHITE RECTANGLE
  rect(xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/8, yFlagCenter,
       FLAG_FACTOR_WIDTH * FLAG_SIZE * .75, 
       FLAG_FACTOR_HEIGHT * FLAG_SIZE/3
       );
  
   //GREEN TRIANGLE
  fill(58, 140, 65);
  stroke(58, 140, 65);
  triangle(xFlagCenter - (FLAG_FACTOR_WIDTH * FLAG_SIZE * .3) - (FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.2/3) , yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
           xFlagCenter - (FLAG_FACTOR_WIDTH * FLAG_SIZE * .3) - (FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.2/3), yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
           xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/20 , yFlagCenter
           );
           
   // GREEN RECTANGLE
  rect(xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/8, yFlagCenter,
       FLAG_FACTOR_WIDTH * FLAG_SIZE * .75, 
       FLAG_FACTOR_HEIGHT * FLAG_SIZE/5
       );
       
  // GREEN RECTANGLE ATTACHED TO TRIANGLE
  rect(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * .3 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.2 * 2/3, yFlagCenter,
      FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.2 * 2/3, FLAG_FACTOR_HEIGHT * FLAG_SIZE
      );
      
  //YELLOW TRIANGLE
  fill(255, 230, 0);
  stroke(255, 230, 0);
  triangle(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 2/5, 
           xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 2/5,
           xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/4, yFlagCenter
           );
  
  //BLACK TRIANGLE
  fill(0);
  stroke(0);
  triangle(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 3/10, 
           xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 3/10,
           xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/3.3, yFlagCenter
           );
}