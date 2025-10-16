float circleX =180;
float circleY =320;
float squareX =180;
float squareY =320;
float SmodX = 7.5;
float SmodY = 7.5;
float CmodX = 7.5;
float CmodY = 7.5;


void setup() {
  size(640, 640);
}

void draw() {
  background(0);
  noStroke();
  
  
  fill(0);
  stroke(0,255,0);
  strokeWeight(10);
  rectMode(CENTER); 
  square(squareX, squareY, 100);
  
  if(squareY>585)
    SmodY = random(-5,0);
   else if (squareY<56)
     SmodY = random(5);
    if(squareX>585)
     SmodX = random(-5,0);
     else if(squareX<56)
     SmodX = random(5);
   
   squareX += SmodX;
   squareY += SmodY;
  
  

  strokeWeight(0);
  fill(255, 0, 0);
  circle(circleX, circleY, 20);
  
  if(circleY>squareY+30){
    CmodY = random(-5,0) +SmodY;
  }
  else if(circleY<squareY-30){
    CmodY = random(5) +SmodY;
  }
  else if(circleX>squareX+30){
    CmodX = random(-5,0)+SmodX;
  }
  else if(circleX<squareX-30)
    CmodX = random(5)+SmodX;

  circleX += CmodX;
  circleY += CmodY;
  
}
