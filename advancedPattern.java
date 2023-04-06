public interface advancedPattern {

// print the patten butterfly pattern 
/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */
public static void main(String[] args) {

    // outer loop 
    
    System.out.println("print the patten butterfly pattern ");
for(int i=1;i<=4;i++){
    // first the first star 
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    // print the space 
    // space =2*(n-i)
    for(int k=1;k<=(4-i)*2;k++){
        System.out.print(" ");
    }
    // print the secodn star 
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}




for(int i=1;i<=4;i++){
    for(int j=4;j>=i;j--){
        System.out.print("*");
    }
    for(int j=1;j<=(i-1)*2;j++){
        System.out.print(" ");
    }

    for(int j=4;j>=i;j--){
        System.out.print("*");
    }
    
    System.out.println();
}


System.out.println("\n");


// 2nday way 
//upper half


/*
int n=4;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
    System.out.print("*");
}
int space=2*(n-i);
for(int j=1;j<=space;j++) {
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println();
}


//lower half

for(int i=4;i>=1;i--){
    for(int j=1;j<=i;j++){
    System.out.print("*");
}
int space=2*(n-i);
for(int j=1;j<=space;j++) {
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println();
}

*/
System.out.println("print pattern - solid Rhombus");
/*
     *****
   *****
  *****
 *****
*****
 */

// print pattern - solid Rhombus


for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print(" ");}
        for(int k=1;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
    }

    

System.out.println("print --number pyramid ");
    // print --number pyramid 
/*
 
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

 
    for(int i=1;i<=5;i++){
        //space 
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        // numbers ->print row no row no times
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");  // for priyamad we can give the space 

        }
        System.out.println();
    }
    

    System.out.println("print -- palindromic pattern ");

// print -- palindromic pattern 

/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/



for(int i=0;i<=5;i++){
    for(int j=1;j<=5-i;j++){
        System.out.print("  ");
    }
    // 1st half number 
    for(int k=i;k>=1;k--){
        System.out.print(k+" ");
    }
    // 2nd half number 

   for(int k=2;k<=i;k++){
    System.out.print(k+" ");
   }
    System.out.println();
}



// print pattern -diamond 

System.out.println("print pattern -diamond ");
/*
 
   *
  ***
 *****
*******
*******
 *****
  ***
   *


 */

// upper half 
for(int i=1;i<=4;i++) {
    for(int k=1;k<=4-i;k++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    for(int k=2;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
}


// lower half  
for(int i=4;i>=1;i--) {
    for(int k=1;k<=4-i;k++){
        System.out.print(" ");
    }
    for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
    }

    // for above if we not use 2*-i instead of that we use i 

    /*for(int k=2;k<=i;k++){
        System.out.print("*");
    }*/
    System.out.println();
}



}}
