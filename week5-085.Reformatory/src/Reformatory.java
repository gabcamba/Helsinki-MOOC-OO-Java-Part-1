public class Reformatory {
    private int totalWeightsMeasured;
    

    public int weight(Person person)
    {
        this.totalWeightsMeasured++;
        return person.getWeight();
        
    }
    
    public void feed(Person person)
    {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured()
    {
        return totalWeightsMeasured;
    }

}
