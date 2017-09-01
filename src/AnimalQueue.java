import java.util.LinkedList;

/**
 * Created by jiayicheng on 17/7/29.
 */
 class AnimalQueue {
    LinkedList<Dog> dogs=new LinkedList<Dog>();
    LinkedList<Cat> cats=new LinkedList<Cat>();

    private int order=0;

    public void enqueue(Animal a)
    {
        a.setOrder(order);
        order++;
if(a.type=="DOG"){ dogs.addLast((Dog)a);}
        else{cats.addLast((Cat)a);}
}

   public Animal dequeue()
   {if(dogs.size()==0)
       return cats.poll();
       else if(cats.size()==0)
           return dogs.poll();
       Dog c=dogs.peek();
       Cat d=cats.peek();
       if(c.getOrder()>d.getOrder())
           return Dog();
       else
           return Cat();
   }
    public Animal Dog()
    {
        return dogs.poll();
    }
    public Animal Cat()
    {
        return cats.poll();
    }
 }
