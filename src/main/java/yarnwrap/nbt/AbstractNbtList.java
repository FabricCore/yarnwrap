package yarnwrap.nbt;
public class AbstractNbtList { public net.minecraft.nbt.AbstractNbtList wrapperContained; public AbstractNbtList(net.minecraft.nbt.AbstractNbtList wrapperContained) { this.wrapperContained = wrapperContained; }

public void add(int index,java.lang.Object value) { wrapperContained.add(index,value); }
public boolean addElement(int index,yarnwrap.nbt.NbtElement element) { return wrapperContained.addElement(index,element.wrapperContained); }
public boolean setElement(int index,yarnwrap.nbt.NbtElement element) { return wrapperContained.setElement(index,element.wrapperContained); }
public byte getHeldType() { return wrapperContained.getHeldType(); }
public java.lang.Object remove(int index) { return wrapperContained.remove(index); }
public java.lang.Object set(int index,java.lang.Object value) { return wrapperContained.set(index,value); }

}