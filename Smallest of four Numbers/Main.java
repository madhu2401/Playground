#include<stdio.h>

int main()
{
  // Type your code here
   int w,x, y, z;
      scanf("%d %d %d %d", &w, &x, &y, &z);
      if((w < x)&&(w < y))
      {
         printf("%d",w);
      }
      else if((x < y)&&(x<z))
      {
         printf("%d",x);
      }
      else if((y<x)&&(y<z))
      {
        printf("%d\n",y);
      }
      else
      {
        printf("%d\n",z);
      }
}