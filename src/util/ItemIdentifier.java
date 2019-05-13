package util;

/**
 *
 */
public class ItemIdentifier {
    private int itemIdentifier;

    /**
     * Creates a new instance.
     *
     * @param itemIdentifier
     */
    public ItemIdentifier(int itemIdentifier){
        this.itemIdentifier = itemIdentifier;
    }

    /**
     *
     * @return
     */
    public int getItemIdentifier(){
        return this.itemIdentifier;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.getItemIdentifier());
        return builder.toString();
    }

    /**
     * SUT: Used to test if the ItemIdentifiers are equal.
     *
     * @param otherObj
     * @return
     */
    public boolean equals(Object otherObj){
        if(otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        ItemIdentifier otherCasted = (ItemIdentifier) otherObj;
        if (!(this.itemIdentifier == otherCasted.itemIdentifier)) return false;
        return true;
    }
}
