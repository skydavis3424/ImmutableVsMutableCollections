package MainPkg;

public interface CRUDable {
    
    // constants //
    public static final String immutableError = "Immutable List cannot be modified";
    public static final String mutableSuccess = "Mutable List has been modified";
    
    // method signatures //
    public void create(int number);
    public int read(int index);
    public void update(int index, int number);
    public void delete(int index);
    public int size();
    
    
}
