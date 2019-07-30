#include<stdio.h>
int main()
{
  int a,frst,lst,sum=0;
    scanf("%d",&a);
  frst=a/100;
  lst=a%10;
  sum=frst+lst;
  printf("%d",sum);
  return 0;
}