// CUBA FLAG: HARD CODED
void cuba() {
  
  // SETUP
  rectMode( CENTER );
  
  // BLUE PART OF FLAG
  fill( 20, 20, 184);
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
    FLAG_SIZE * FLAG_FACTOR_HEIGHT * 0.6
  );
  
//SMALL BLUE PART OF FLAG   
  fill (20, 20, 184);
   rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_SIZE * FLAG_FACTOR_HEIGHT * 0.2
  );
  
  // RED TRIANGLE
  fill(255, 0,0);
  stroke(255, 0,0);
  triangle(
    xFlagCenter - (1.0/8.0)*FLAG_FACTOR_WIDTH * FLAG_SIZE, yFlagCenter, 
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE /2,  
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE /2
  );
  
  
// STAR SHAPE
 fill(255);
 stroke(255);
 star(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2.75, yFlagCenter, 70, 35, 5);
  
}