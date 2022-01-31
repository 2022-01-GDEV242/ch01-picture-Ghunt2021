/**
 * The image being represented is of a man travelling on a boat,  
 * heading towards the strange island with the mutated red coconuts.
 * 
 * @author  Gunnar Hunt
 * @version 01.30.2022
 */
public class Picture
{
    private Person boatguy;
    private Square boat;
    private Circle coconut1;
    private Circle coconut2;
    private Square seaground;
    private Triangle islandpt1;
    private Triangle islandpt2;
    private Circle suncorner;
    private Triangle leaftriangle;
    private Triangle treetriangle;
    private Circle theactualsun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        boat = new Square();
        boatguy = new Person();
        coconut1 = new Circle();
        coconut2 = new Circle();	
        seaground = new Square();	
        islandpt1 = new Triangle();
        islandpt2 = new Triangle();
        suncorner= new Circle();
        leaftriangle = new Triangle();	
        treetriangle = new Triangle();
        theactualsun = new Circle();	
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {  
        boatguy.changeColor("black");
        boatguy.moveHorizontal(60);
        boatguy.moveVertical(30);
        boatguy.makeVisible();
        

        boat.changeColor("red");
        boat.moveHorizontal(310);
        boat.moveVertical(160);
        boat.makeVisible();
      

        coconut1.changeColor("red");
        coconut1.moveHorizontal(200);
        coconut1.moveVertical(90);
        coconut1.changeSize(20);
        coconut1.makeVisible();
        

        coconut2.changeColor("red");
        coconut2.moveHorizontal(240);
        coconut2.moveVertical(90);
        coconut2.changeSize(20);
        coconut2.makeVisible();
        
        treetriangle.changeColor("black");
        treetriangle.moveHorizontal(230);
        treetriangle.moveVertical(86);
        treetriangle.changeSize(50,25);
        treetriangle.makeVisible();
        

        leaftriangle.changeColor("green");
        leaftriangle.moveHorizontal(230);
        leaftriangle.moveVertical(75);
        leaftriangle.changeSize(25,75);
        leaftriangle.makeVisible();
        

        theactualsun.changeColor("yellow");
        theactualsun.moveHorizontal(20);
        theactualsun.moveVertical(10);
        theactualsun.changeSize(68);
        theactualsun.makeVisible();
        

        seaground.changeColor("blue");
        seaground.moveHorizontal(0);
        seaground.moveVertical(180);
        seaground.changeSize(5000);
        seaground.makeVisible();
        

        islandpt1.changeColor("yellow");
        islandpt1.moveHorizontal(250);
        islandpt1.moveVertical(140);
        islandpt1.changeSize(100,100);
        islandpt1.makeVisible();
        

        islandpt2.changeColor("yellow");
        islandpt2.moveHorizontal(-320);
        islandpt2.moveVertical(75);
        islandpt2.changeSize(100,100);
        islandpt2.makeVisible();
       

        suncorner.changeColor("yellow");
        suncorner.moveHorizontal(204);
        suncorner.moveVertical(130);
        suncorner.changeSize(50);
        suncorner.makeVisible();
    }    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky1 != null)   // only if it's painted already...
        {
            boatguy.changeColor("black");
            boat.changeColor("grey");
            coconut1.changeColor("grey");
            coconut2.changeColor("grey");
            seaground.changeColor("black");
            islandpt1.changeColor("grey");
            islandpt2.changeColor("grey");
            suncorner.changeColor("grey");
            leaftriangle.changeColor("black");
            treetriangle.changeColor("black");
            theactualsun.changeColor("grey");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky1 != null)   // only if it's painted already...
        {
            boatguy.changeColor("black");
            boat.changeColor("blue");
            coconut1.changeColor("red");
            coconut2.changeColor("red");
            seaground.changeColor("blue");
            islandpt1.changeColor("yellow");
            islandpt2.changeColor("yellow");
            suncorner.changeColor("yellow");
            leaftriangle.changeColor("green");
            treetriangle.changeColor("black");
            theactualsun.changeColor("yellow");
        }
    }
}

