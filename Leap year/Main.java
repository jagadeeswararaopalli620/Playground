#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  a=a%4;
  if(a==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}