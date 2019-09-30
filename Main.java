package MainPkg;

public class Main {

    public static void main(String[] args) {
        
        // create a mutable list //
        MutableList mutable = new MutableList(1, 2, 3, 4, 5, 6, 7, 8);
        
        // create an immutable list //
        ImmutableList immutable = new ImmutableList(1, 2, 3, 4, 5, 6, 7, 8);
        
        // TEST 001: TEST MUTABLE LIST READ METHOD //
        if (mutable.read(2) == 3 && mutable.read(5) == 6)  {
            System.out.println("TEST 001: MUTABLE LIST (READ) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 001: MUTABLE LIST (READ) IS NOT WORKING TO SPEC" + "\n");
        }
        
        // TEST 002: TEST MUTABLE LIST CREATE METHOD //
        mutable.create(5);
        if (mutable.read(8) == 5)  {
            System.out.println("TEST 002: MUTABLE LIST (CREATE) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 002: MUTABLE LIST (CREATE) IS NOT WORKING TO SPEC" + "\n");
        }
        
        // TEST 003: TEST MUTABLE LIST UPDATE METHOD //
        mutable.update(0, 5);
        if (mutable.read(0) == 5)  {
            System.out.println("TEST 003: MUTABLE LIST (UPDATE) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 003: MUTABLE LIST (UPDATE) IS NOT WORKING TO SPEC" + "\n");
        }
        
        
        // TEST 004: TEST MUTABLE LIST DELETE METHOD //
        mutable.delete(0);
        if (mutable.read(0) == 1)  {
            System.out.println("TEST 004: MUTABLE LIST (DELETE) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 004: MUTABLE LIST (DELETE) IS NOT WORKING TO SPEC" + "\n");
        }
        
        // TEST 005: TEST IMMUTABLE LIST READ METHOD //
        if (immutable.read(0) == 1 && immutable.read(3) == 4)  {
            System.out.println("TEST 005: IMMUTABLE LIST (READ) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 005: IMMUTABLE LIST (READ) IS NOT WORKING TO SPEC" + "\n");
        }
        
        // TEST 006: TEST IMMUTABLE LIST CREATE METHOD //
        immutable.create(6);
        if (immutable.size() == 8)  {
            System.out.println("TEST 006: IMMUTABLE LIST (CREATE) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 006: IMMUTABLE LIST (CREATE) IS NOT WORKING TO SPEC" + "\n");
        }
        
        // TEST 007: TEST IMMUTABLE LIST UPDATE METHOD //
        immutable.update(5, 2);
        if (immutable.read(5) != 2)  {
            System.out.println("TEST 007: IMMUTABLE LIST (UPDATE) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 007: IMMUTABLE LIST (UPDATE) IS NOT WORKING TO SPEC" + "\n");
        }
        
        // TEST 008: TEST IMMUTABLE LIST DELETE METHOD //
        immutable.delete(0);
        if (immutable.size() == 8)  {
            System.out.println("TEST 008: IMMUTABLE LIST (DELETE) IS WORKING TO SPEC" + "\n");
        } else  {
            System.out.println("TEST 008: IMMUTABLE LIST (DELETE) IS NOT WORKING TO SPEC" + "\n");
        }
        
    }
    
}
