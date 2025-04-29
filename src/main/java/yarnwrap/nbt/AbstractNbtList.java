package yarnwrap.nbt;
public class AbstractNbtList { public net.minecraft.nbt.AbstractNbtList wrapperContained; public AbstractNbtList(net.minecraft.nbt.AbstractNbtList wrapperContained) { this.wrapperContained = wrapperContained; }

public void add(int index,java.lang.Object value) { wrapperContained.add(index,value); }
// public static void add(int index,java.lang.Object value, ) { net.minecraft.nbt.AbstractNbtList.add(index,value); }
public boolean addElement(int index,yarnwrap.nbt.NbtElement element) { return wrapperContained.addElement(index,element.wrapperContained); }
// public static boolean addElement(int index,yarnwrap.nbt.NbtElement element, ) { return net.minecraft.nbt.AbstractNbtList.addElement(index,element.wrapperContained); }
public boolean setElement(int index,yarnwrap.nbt.NbtElement element) { return wrapperContained.setElement(index,element.wrapperContained); }
// public static boolean setElement(int index,yarnwrap.nbt.NbtElement element, ) { return net.minecraft.nbt.AbstractNbtList.setElement(index,element.wrapperContained); }
public byte getHeldType() { return wrapperContained.getHeldType(); }
// public static byte getHeldType() { return net.minecraft.nbt.AbstractNbtList.getHeldType(); }
public java.lang.Object remove(int index) { return wrapperContained.remove(index); }
// public static java.lang.Object remove(int index, ) { return net.minecraft.nbt.AbstractNbtList.remove(index); }
public java.lang.Object set(int index,java.lang.Object value) { return wrapperContained.set(index,value); }
// public static java.lang.Object set(int index,java.lang.Object value, ) { return net.minecraft.nbt.AbstractNbtList.set(index,value); }

}