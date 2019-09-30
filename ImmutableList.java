package MainPkg;

import java.util.ArrayList;

public class ImmutableList implements CRUDable {
    
    // class fields //
    private final ArrayList<Integer> list;
    
    // class constructor //
    public ImmutableList(int...vars)  {
        this.list = new ArrayList();
        for (int i = 0; i < vars.length; i++)  {
            list.add(vars[i]);
        }
    }
    
    // class methods //
    @Override
    public void create(int number)  {
        System.out.println(CRUDable.immutableError);
    }
    
    @Override
    public int read(int index)  {
        return list.get(index);
    }
    
    @Override
    public void update(int index, int number)  {
        System.out.println(CRUDable.immutableError);
    }
    
    @Override
    public void delete(int index)  {
        System.out.println(CRUDable.immutableError);
    }
    
    @Override
    public int size()  {
        return list.size();
    }
    
    
}
