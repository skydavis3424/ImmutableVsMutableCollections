package MainPkg;

import java.util.ArrayList;

public class MutableList implements CRUDable {
    
    // class fields //
    private ArrayList<Integer> list;
    
    // class constructor //
    public MutableList(int...args)  {
        this.list = new ArrayList();
        for (int i = 0; i < args.length; i++)  {
            list.add(args[i]);
        }
    }
    
    // class methods //
    @Override
    public void create(int number)  {
        list.add(number);
        System.out.println(CRUDable.mutableSuccess);
    }
    
    @Override
    public int read(int index)  {
        return list.get(index);
    }
    
    @Override
    public void update(int index, int number)  {
        list.add(index, number);
        System.out.println(CRUDable.mutableSuccess);
    }
    
    @Override
    public void delete(int index)  {
        list.remove(index);
        System.out.println(CRUDable.mutableSuccess);
    }
    
    @Override
    public int size()  {
        return list.size();
    }
    
}
