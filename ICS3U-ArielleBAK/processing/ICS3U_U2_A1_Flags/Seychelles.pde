// SEYCHELLES FLAG: HARD CODED
void seychelles() {
  
  // SETUP
  rectMode( CENTER );
  
  // RED PART OF FLAG
  fill( 255, 0, 0 );
  stroke(255,0,0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
    // BLUE TRIANGLE
  fill(0, 26, 255);
  stroke(0, 26, 255);
  triangle(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/6, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2
          );
          
  // YELLOW TRIANGLE
  fill(255, 230, 0);
  stroke(255, 230, 0);
  triangle(xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/6, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/6, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2
          );
  // WHITE TRIANGLE
  fill(255);
  stroke(255);
  triangle(xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/6,
          xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/6
          );
  // GREEN TRIANGLE
  fill(21, 179, 4);
  stroke(21, 179, 4);
   triangle(xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
          xFlagCenter + FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/6
          );

}