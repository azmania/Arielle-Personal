// BAHAMAS FLAG: HARD CODED
void bahamas() {
  
  // SETUP
  rectMode( CENTER );
  
  // BLUE PART OF FLAG
  fill( 125, 224, 237);
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // YELLOW PART OF FLAG
  fill( 255, 255, 0 );
  stroke(255,255,0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE * .33
  );
  
  
  // BLACK TRIANGLE
  fill(0, 0,0);
  stroke(0, 0,0);
  triangle(xFlagCenter, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE /2,  
  xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE /2);
  
  

}