
/**
 *
 * @author tristesse08
 */
public class Ice {
    String shape;
    String color;
    String flavor;
    String fill;
    
    Ice(){
    this.shape="cube";
    this.color="white";
    this.flavor=null;
    this.fill="water";
        
    }
    
    Ice(String shape){
        this.shape=shape;
    }
    
    Ice(String shape,String color,String flavor, String fill){
    this.shape=shape;
    this.color=color;
    this.flavor=flavor;
    this.fill=fill;
        
    }
    
    public static void main(String[] args) {
        Ice first=new Ice();
        Ice second=new Ice("star","red","sweet","strawbery water");
        Ice third=new Ice("diamond");
    }

    
}
