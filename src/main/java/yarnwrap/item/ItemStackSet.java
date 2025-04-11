package yarnwrap.item;
public class ItemStackSet { public net.minecraft.item.ItemStackSet wrapperContained; public ItemStackSet(net.minecraft.item.ItemStackSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
// // public void HASH_STRATEGY(Object value) { wrapperContained.HASH_STRATEGY = value; }
public java.util.Set create() { return wrapperContained.create(); }

}