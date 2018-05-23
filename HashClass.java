public class HashClass {

    private int[] hash;
    private int size;

    public HashClass(int i) {
        create(i);
    }

    public HashClass() {
        create(7);
    }

    private void create(int i) {
        hash = new int[i];
        size = i;
    }

    public void insert(int integer) {
        if (integer != 0) {
            int cursor = integer % size;
            int collision = 0;
            boolean done = false;
            while (!done && collision < size) {
                if (hash[cursor] == 0) {
                    hash[cursor] = integer;
                    done = true;
                }
                if (!done && cursor == hash.length - 1) {
                    cursor = 0;
                    collision++;
                } else {
                    cursor++;
                    collision++;
                }
            }
            if (!done) {
                System.out.println(integer + " insert attempt. Hash"
                        + "table full. Number of collisions "
                        + collision + ".");
            } else {
                System.out.println(integer + " inserted. Number"
                        + " of collisions " + collision + ".");
            }
        }
    }

    public boolean belongs(int integer) {
        boolean found = false;
        if (integer != 0) {
            int cursor = integer % size;
            int collision = 0;
            while (!found && collision < size) {
                if (hash[cursor] == integer) {
                    found = true;
                }
                if (!found && cursor == hash.length - 1) {
                    cursor = 0;
                    collision++;
                } else {
                    cursor++;
                    collision++;
                }
            }
        }
        return found;
    }

    public boolean omit(int integer) {
        boolean found = false;
        if (integer != 0) {
            int cursor = integer % size;
            int collision = 0;
            while (!found && collision < size) {
                if (hash[cursor] == integer) {
                    found = true;
                    hash[cursor] = 0;
                }
                if (!found && cursor == hash.length - 1) {
                    cursor = 0;
                    collision++;
                } else {
                    cursor++;
                    collision++;
                }
            }
        }
        return found;
    }

    public void print() {
        System.out.println("#####################");
        System.out.println("#      Print        #");
        System.out.println("#####################");

        int i = 0;
        while (i < hash.length) {
            System.out.println("* " + hash[i]);
            i++;
        }
        System.out.println("#####################");
    }
///////////////////////////////////////////////////////////////////////////////
}
