package introduction.Properties.Inheritance;

public class BoxCost extends BoxWeight{

    double cost;

    BoxCost(){
        super();
        this.cost = -1;

    }

    BoxCost(BoxCost other){
        super(other);
        this.cost = other.cost;
    }

    public BoxCost(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
        //So here we can see that we can easily access the uppermost base class as all of em are intercomnnected to each other
    }
    public BoxCost(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
}
