/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author HP 745 G5
 */
public class pacMan {
    int x;
    int y;
    int width;
    int height;
    
    public pacMan(int x, int y, int width, int height){
        x = x;
        y =y;
        width = width;
        height = height;
    }
    
    public void moveLeft(){
        if(x > 0){
            x -= 1;
        }
    }
    
    public void moveRight(){
        if(x < width - 1){
            x += 1;
        }
    }
    
    public void moveUp(){
        if(y > 0){
            y -= 1;
        }
    }
    
    public void moveDown(){
        if(y < height -1){
            y += 1;
        }
    }
    
    public void printPosition(){
        System.out.println("pacMan berada diposisi (" +x+", "+y+")");
    }
}
