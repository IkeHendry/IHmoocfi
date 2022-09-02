
public class Container {
    private int storage;
    public Container(){
        this.storage = 0;
    }
    public int contains(){
        return this.storage;
    }
    public void add(int amount){
        if ((this.storage + amount) > 100){
            this.storage = 100;
        } else if (amount > 0) {
            this.storage = this.storage + amount;
        }
    }
    public void remove(int amount){
        if ((this.storage - amount) < 1){
            this.storage = 0;
        } else {
            this.storage = this.storage - amount;
        }
    }

    @Override
    public String toString() {
        return this.storage + "/100";
    }
    
}
