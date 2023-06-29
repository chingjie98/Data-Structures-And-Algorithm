public class Array {

    private int[] items;
    private int count;

    public Array(int length){
        this.items = new int[length];
        this.count = 0;
    }

    public void Print(){
        for (int i=0; i<count; i++) {
            System.out.println(items[i]);
        }
    }

    public void Insert(int item){

        if (count == items.length){
            // create a new array if the size is maxed out
            // and set that new array to be the current array
            int newLength = count * 2;
            int[] newItems = new int[newLength];

            for (int i=0; i<count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void RemoveAt(int index){
        //if index is 1, remove item at index 1, and shift all items from right to left
        //to shift items from right to left, start with the existing count at index
        //[10,20,30,40]
        //[10,30,40]
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++){

            if (i < count - 1) {
                items[i] = items[i + 1];
            }
        }

        count--;
    }

    public int IndexOf(int value){

        for (int i = 0; i < count; i++){
            if (items[i] == value){
                return i;
            }
        }

        return -1;

    }



}
