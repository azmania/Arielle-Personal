size(800,600);
background(0);
fill(242, 215, 36);
textSize(50);
text("GARTH WEBB CHARGERS",100,100);
fill(0);
stroke(255);
strokeWeight(7);
//horns
fill(255);
strokeWeight(2);
triangle(509,200,509,105,600,200);//hornr
triangle(288,200,288,105,197,200);//hornl
triangle(288,200,288,295,197,200);//hornl2
triangle(509,200,509,295,600,200);//hornr2
//head
fill(0);
ellipse(400,300,300,300); //head

//eye1
fill(255);
ellipse(340,250, 30, 30);//eyes
fill(125, 87, 87);
ellipse(340,250, 20,20); //iris
fill(0);
ellipse(340,250, 15,15); //pupil
//eye2
fill(255);
ellipse(460,250, 30, 30);//eyes
fill(125, 87, 87);
ellipse(460,250, 20,20); //iris
fill(0);
ellipse(460,250, 15,15); //pupil

//angerlines
strokeWeight(5);
line(410, 275, 470, 225);
line(390, 275, 330, 225);
line(470,225, 490, 245);
line(330,225, 310,245);
//snout
ellipseMode(CENTER);
ellipse(400,375, 150,120); 
//nostrils
strokeWeight(7);
line(430, 335, 425, 355);
line(375, 335, 380, 355);

//mouth
strokeWeight(3);
line(350,400, 450,400);