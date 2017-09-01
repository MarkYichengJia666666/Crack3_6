import java.util.LinkedList;

/**
 * Created by jiayicheng on 17/7/29.
 */
abstract class Animal {
    private int order;
    protected String name;
    protected String type;
    public Animal(String n,String t){name=n;type=t;}
    public void setOrder(int n){order=n;}
    public int getOrder(){return order;}

    public boolean Older(Animal b){return this.order>b.getOrder();}
}