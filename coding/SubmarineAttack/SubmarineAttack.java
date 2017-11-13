import java.io.*;
import java.util.*;
public class SubmarineAttack{
    public static void main(String[] args){
        Scanner scans = new Scanner(System.in);
        boolean play = true;
        boolean collide, farAway;
        String input;
        double height, width, xRect, yRect, xCircle, yCircle;
        int blastRadius, health, n;
        while(play){
            height = (Math.random() * 10) + 10;
            width = (Math.random() * 30) + 40;
            xRect = Math.random() * 300 + 1;
            yRect = Math.random() * 300 + 1;
            if(xRect > 300 - width){
                xRect = 300 - width;
            }
            if(yRect > 300 - height){
                xRect = 300 - height;
            }
            
            System.out.println("Submarine has been spotted!\n");
            //System.out.println(xRect + ", " + yRect);
            health = 2;
            for(n = 0; n<5; n++){
                System.out.println("Enter the x position of the depth charge: ");
                xCircle = circleLegal();
                System.out.println("Enter the y position of the depth charge: ");
                yCircle = circleLegal();
                blastRadius = 30;
                
                collide = overLap(height, width, xRect, yRect, xCircle, yCircle, blastRadius);
                farAway = far(height, width, xRect, yRect, xCircle, yCircle, blastRadius);
                if(collide){
                    System.out.println("** Direct Hit! **");
                    health-=2;
                } else if(!farAway){
                    System.out.println("** Close hit! **");
                    health-=1;
                } else{
                    System.out.println("** Intelligence shows the submarine has not taken damage. **");
                }
    //put code above into for loop
                if(health<=0){
                    System.out.println("The submarine has been destroyed!\n");
                    break;
                    //System.out.println("Another submarine has been spotted! Would you like to engage?");
                } else if(n == 4){
                    System.out.println("You didn't hit the submarine in time...\n");
                }
                //ASK TO PLAY AGAIN
            }
            System.out.println("Another submarine has been spotted! Would you like to engage?");
            input = scans.next();
            switch(input){
                case "NO":
                case "No":
                case "no":
                case "N":
                case "n":
                    play = false;
                    break;
                case "YES":
                case "Yes":
                case "yes":
                case "Y":
                case "y":
                    break;
                default:
                    play = false;
            }
            //if doesnt wanna play again, break out of for loop
            //else reset all variables
        }
    }
    
    public static boolean far(double height, double width, double xRect, double yRect, double xCircle, double yCircle, double blastRadius){
        //we have the x of the CENTER circle & we have the x of the upper lefthand corner of the rectangle
        // centerOfCircle - radius - width <= x <= center + radius
        // centerOfCircle - radius - height <= y <= center + radius
        boolean farAway = true;
        if(xCircle - 80 - width <= xRect && xRect <= xCircle + 80){
            if(yCircle - 80 - height <= yRect && yRect <= yCircle + 80){
                double leftX, rightX, upY, downY, middleX, middleY;
                double upperLeft, upperRight, lowerLeft, lowerRight, middleLeft, middleRight, upperMiddle, lowerMiddle;
                leftX = xRect;
                rightX = xRect + width;
                upY = yRect;
                downY = yRect + height;
                middleX = xRect + (width/2);
                middleY = yRect + (height/2);
                upperLeft = Math.pow(leftX - xCircle, 2) + Math.pow(upY - yCircle, 2);
                upperRight = Math.pow(rightX - xCircle, 2) + Math.pow(upY - yCircle, 2);
                lowerLeft = Math.pow(leftX - xCircle, 2) + Math.pow(downY - yCircle, 2);
                lowerRight = Math.pow(rightX - xCircle, 2) + Math.pow(downY - yCircle, 2);
                middleLeft = Math.pow(leftX - xCircle, 2) + Math.pow(middleY - yCircle, 2);
                middleRight = Math.pow(rightX - xCircle, 2) + Math.pow(middleY - yCircle, 2);
                upperMiddle = Math.pow(middleX - xCircle, 2) + Math.pow(upY - yCircle, 2);
                lowerMiddle = Math.pow(middleX - xCircle, 2) + Math.pow(downY - yCircle, 2);
                if(Math.sqrt(upperLeft)<=80){
                    farAway = false;
                } else if(Math.sqrt(upperRight)<=80){
                    farAway = false;
                } else if(Math.sqrt(lowerLeft)<=80){
                    farAway = false;
                } else if(Math.sqrt(lowerRight)<=80){
                    farAway = false;
                } else if(Math.sqrt(middleLeft)<=80){
                    farAway = false;
                } else if(Math.sqrt(middleRight)<=80){
                    farAway = false;
                } else if(Math.sqrt(upperMiddle)<=80){
                    farAway = false;
                } else if(Math.sqrt(lowerMiddle)<=80){
                    farAway = false;
                }
            }
        }
        
        return farAway;
    }
    
    public static boolean overLap(double height, double width, double xRect, double yRect, double xCircle, double yCircle, double blastRadius){
        //we have the x of the CENTER circle & we have the x of the upper lefthand corner of the rectangle
        // centerOfCircle - radius - width <= x <= center + radius
        // centerOfCircle - radius - height <= y <= center + radius
        boolean intersect = false;
        if(xCircle - blastRadius - width <= xRect && xRect <= xCircle + blastRadius){
            if(yCircle - blastRadius - height <= yRect && yRect <= yCircle + blastRadius){
                //if (x, y) & center pt <= 30
                //else if (x+width, y + length) & center pt 
                // else if (x, y+length) & center pt 
                // else if (x+width, y)
                //distance = Math.sqrt((xRect-xCircle)**2 + (yRect-yCircle)**2) <- 30;
                double leftX, rightX, upY, downY, middleX, middleY;
                double upperLeft, upperRight, lowerLeft, lowerRight, middleLeft, middleRight, upperMiddle, lowerMiddle;
                leftX = xRect;
                rightX = xRect + width;
                upY = yRect;
                downY = yRect + height;
                middleX = xRect + (width/2);
                middleY = yRect + (height/2);
                upperLeft = Math.pow(leftX - xCircle, 2) + Math.pow(upY - yCircle, 2);
                upperRight = Math.pow(rightX - xCircle, 2) + Math.pow(upY - yCircle, 2);
                lowerLeft = Math.pow(leftX - xCircle, 2) + Math.pow(downY - yCircle, 2);
                lowerRight = Math.pow(rightX - xCircle, 2) + Math.pow(downY - yCircle, 2);
                middleLeft = Math.pow(leftX - xCircle, 2) + Math.pow(middleY - yCircle, 2);
                middleRight = Math.pow(rightX - xCircle, 2) + Math.pow(middleY - yCircle, 2);
                upperMiddle = Math.pow(middleX - xCircle, 2) + Math.pow(upY - yCircle, 2);
                lowerMiddle = Math.pow(middleX - xCircle, 2) + Math.pow(downY - yCircle, 2);
                if(Math.sqrt(upperLeft)<=30){
                    intersect = true;
                } else if(Math.sqrt(upperRight)<=30){
                    intersect = true;
                } else if(Math.sqrt(lowerLeft)<=30){
                    intersect = true;
                } else if(Math.sqrt(lowerRight)<=30){
                    intersect = true;
                } else if(Math.sqrt(middleLeft)<=30){
                    intersect = true;
                } else if(Math.sqrt(middleRight)<=30){
                    intersect = true;
                } else if(Math.sqrt(upperMiddle)<=30){
                    intersect = true;
                } else if(Math.sqrt(lowerMiddle)<=30){
                    intersect = true;
                }
            }
        }
        return intersect;
    }
    
    public static double circleLegal(){
        Scanner reader = new Scanner(System.in);
        double pos;
        while(true){
            pos = reader.nextDouble();
            if(!(pos < 0 || pos > 270)){
                break;
            } else{
                System.out.println("\tError! The submarine is within this 300x300 meter area!\nEnter again: ");
            }
        }
        return pos;
    }
}