package yarnwrap.item;
public class ItemStackSet { public net.minecraft.item.ItemStackSet wrapperContained; public ItemStackSet(net.minecraft.item.ItemStackSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
// // public void HASH_STRATEGY(Object value) { wrapperContained.HASH_STRATEGY = value; }
// // public static Object HASH_STRATEGY() { return net.minecraft.item.ItemStackSet.HASH_STRATEGY; }
// // public static void HASH_STRATEGY(Object value, ) { net.minecraft.item.ItemStackSet.HASH_STRATEGY = value; }

// public java.util.Set create() { return wrapperContained.create(); }
public static java.util.Set create() { return net.minecraft.item.ItemStackSet.create(); }

}