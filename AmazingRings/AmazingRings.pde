int x1 = 60;
int x2 = 180;
void setup() {
  size(240, 120);
}
void draw() {
background(255, 255, 244);
for (int i = 0; i <= 100; i += 10){
    noFill();
    ellipse(x1, 60, i, i);
}
for (int i = 0; i <= 100; i += 10){
    noFill();
    ellipse(x2, 60, i, i);
}
x2 = x2 - 1;
x1 = x1 + 1;
}