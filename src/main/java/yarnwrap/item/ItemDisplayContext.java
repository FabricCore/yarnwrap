package yarnwrap.item;
public class ItemDisplayContext { public net.minecraft.item.ItemDisplayContext wrapperContained; public ItemDisplayContext(net.minecraft.item.ItemDisplayContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.ItemDisplayContext.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemDisplayContext.CODEC = value; }

// public java.util.function.IntFunction FROM_INDEX() { return wrapperContained.FROM_INDEX; }
// public void FROM_INDEX(java.util.function.IntFunction value) { wrapperContained.FROM_INDEX = value; }
public static java.util.function.IntFunction FROM_INDEX() { return net.minecraft.item.ItemDisplayContext.FROM_INDEX; }
// public static void FROM_INDEX(java.util.function.IntFunction value, ) { net.minecraft.item.ItemDisplayContext.FROM_INDEX = value; }

// public byte index() { return wrapperContained.index; }
// public void index(byte value) { wrapperContained.index = value; }
// public static byte index() { return net.minecraft.item.ItemDisplayContext.index; }
// public static void index(byte value, ) { net.minecraft.item.ItemDisplayContext.index = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.item.ItemDisplayContext.name; }
// public static void name(java.lang.String value, ) { net.minecraft.item.ItemDisplayContext.name = value; }

// // public ItemDisplayContext(java.lang.String index,int name) { this.wrapperContained = new net.minecraft.item.ItemDisplayContext(index,name); }
public boolean isFirstPerson() { return wrapperContained.isFirstPerson(); }
// public static boolean isFirstPerson() { return net.minecraft.item.ItemDisplayContext.isFirstPerson(); }
public byte getIndex() { return wrapperContained.getIndex(); }
// public static byte getIndex() { return net.minecraft.item.ItemDisplayContext.getIndex(); }
public boolean isLeftHand() { return wrapperContained.isLeftHand(); }
// public static boolean isLeftHand() { return net.minecraft.item.ItemDisplayContext.isLeftHand(); }

}