package yarnwrap.item;
public class ItemStackSet { public net.minecraft.item.ItemStackSet wrapperContained; public ItemStackSet(net.minecraft.item.ItemStackSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
public java.util.Set create() { return wrapperContained.create(); }

}