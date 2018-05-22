// MAURITANIA FLAG: HARD CODED
void mauritania() {
  
  // SETUP
  rectMode( CENTER );
  
  // GREEN PART OF FLAG
  fill( 57, 133, 51);
  stroke(255);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
 //Crescent
 
 fill(255,255,0);
 stroke(255,255,0);
 ellipse(xFlagCenter, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2 * 0.25, FLAG_SIZE * FLAG_FACTOR_WIDTH * .5, FLAG_SIZE * FLAG_FACTOR_WIDTH * 0.5 );
 fill( 57, 133, 51);
 stroke(57, 133, 51);
 ellipse(xFlagCenter, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2 * 0.5, FLAG_SIZE * FLAG_FACTOR_WIDTH * .5, FLAG_SIZE * FLAG_FACTOR_WIDTH * 0.5 );

//White
fill (255);
stroke(255);
rect(xFlagCenter, 
    yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2 - FLAG_FACTOR_HEIGHT * FLAG_SIZE/4 , 
    FLAG_FACTOR_WIDTH * FLAG_SIZE/2, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/2 
    );

// STAR SHAPE
 fill(255,255,0);
 stroke(255,255,0);
 star(xFlagCenter, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/4, 50, 20, 5);
  
}