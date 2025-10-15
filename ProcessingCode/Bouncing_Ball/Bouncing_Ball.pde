float circleX =1000;
float circleY =450;
float modX = 7.5;
float modY = 7.5;

void setup() {
  size(2000, 900);
  
}

void draw() {
  background(0);
  noStroke();
  fill(255, 0, 0);
  circle(circleX, circleY, 100);
  if(circleY>849){
    modY = random(-20,0);
  }
  else if(circleY<51){
    modY = random(20);
  }
  else if(circleX>1949){
  modX = random(-20,0);
  }
  else if(circleX<51)
  modX = random(20);
  
  circleX += modX;
  circleY += modY;
}
