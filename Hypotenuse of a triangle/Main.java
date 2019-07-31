#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c;
  scanf("%f%f",&a,&b);
  c=(a*a)+(b*b);
  float d=sqrt(c);
  printf("%.2f",d);
  return 0;
}