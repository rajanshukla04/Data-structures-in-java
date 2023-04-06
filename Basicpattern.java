public class Basicpattern{
    public static void main(String[] args) {
        // print the hello rectangle 
        
        int m=4,n=4;
        //outer loop
        System.out.println("Holo digaram ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1|| j==1|| i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

// print the triangle  
// Half Pyramid -- pattern name 
        // outer loop for coloum 
        System.out.println("print the triangle  ");
        for(int i=1;i<=n;i++){
            //inner loop 
            for(int j=1;j<=i;j++){
                System.out.print("8");
            }
            System.out.println();
        }
        

// pattern -Inverted half pyramind 
// 1st way 
System.out.println("Inverted half pyramind ");
for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        System.out.print("*");
    }
    System.out.println();
}


// 2nd way to slove the above problem is 

/*
for(int i=5;i>=1;i--){
    //inner loop 
    for(int j=1;j<=i;j++){
        System.out.print("8");
    }
    System.out.println();
}
*/

// 5 print - inverte half pyramid (ratated by 180 deg)

System.out.println("print - inverte half pyramid (ratated by 180 deg");
/*
- - -*
- - **
-* * *
* * * * 
*/

// in this type of slove problem we have to use  the three loop 
// outer loop
// space loop
// print star loop

 

for(int i=0;i<=n;i++){

    // inner loop -space print 
    for(int j=1;j<n-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
}


// 6- pattern - Half pyramid with number 
/*
1
12
123
1234
12345
*/
System.out.println("pattern - Half pyramid with number ");

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}


// 7 print inverted half pyramid with numbers
/*
 1 2 3 4 5 
 1 2 3 4
 1 2 3
 1 2
 1 
 
*/
System.out.println("print inverted half pyramid with numbers");
for(int i=1;i<=5;i++){
    for(int j=1;j<=6-i;j++){
        System.out.print(j);
    }
    System.out.println();
}



// 8 print the pattern -Floyd's Triangle

/*1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

// number print is incrase then we know that we are 
// not going to print the j loop 
// we have take one number that i have to print 

System.out.println("print the pattern -Floyd's Triangle");
int sum=1;
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(sum+" ");
        sum++;
    }
    System.out.println();
}

// print - 0-1 Triangle
/*
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1 
 */

System.out.println("print - 0-1 Triangle");
 for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
    System.out.println();
 }
 



    }

}