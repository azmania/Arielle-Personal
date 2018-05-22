// KUWAIT FLAG: HARD CODED
void kuwait() {
  
  // SETUP
  rectMode( CENTER );
  
  // GREEN PART OF FLAG
  fill( 79, 196, 68 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // WHITE PART OF FLAG
  fill( 255, 255, 255 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
  );
  
  // RED PART OF FLAG
  fill( 255, 0, 0 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * .33 , 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33 + 3
  );
  
  //BLACK RECTANGLE
  fill(0);
  rect(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2.67, 
    yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE/4, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/3); 
  
  //BLACK TRIANGLES
  triangle(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - (FLAG_FACTOR_HEIGHT * FLAG_SIZE/3)/2,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/4, yFlagCenter - (FLAG_FACTOR_HEIGHT * FLAG_SIZE/3)/2
  ); 
  
  triangle(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + (FLAG_FACTOR_HEIGHT * FLAG_SIZE/3)/2,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/4, yFlagCenter + (FLAG_FACTOR_HEIGHT * FLAG_SIZE/3)/2
  ); 
}