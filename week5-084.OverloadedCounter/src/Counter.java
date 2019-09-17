/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gab Camba
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue)
    {
        this(startingValue, false);
    }
    
    
    public Counter(int startingValue, boolean check)
    {
        this.value = startingValue;
        this.check = check;
        
    }
    
    public Counter(boolean check)
    {
        this(0, check);
    }
    
    public Counter()
    {
        this(0, false);
    }
    
    public int value()
    {
        return this.value;
    }
    
    public void increase()
    {
        this.value++;
    }
    
    public void decrease()
    {
        this.value--;
        if(check)
        {
            if(this.value<0)
            {
                this.value = 0;
            }
        }
    }
    
    public void increase(int amount)
    {
        int i = 1;
        while(i <= amount)
        {
            this.increase();
            i++;
        }
    }
    
    public void decrease(int amount)
    {
        int i = 1;
        if(amount>=0)
        {
            while(i<=amount)
            {
                this.decrease();
                i++;
            }
        }
        
    }
    
    
    
    
    
}
