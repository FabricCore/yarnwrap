package yarnwrap.nbt;
public class NbtEnd { public net.minecraft.nbt.NbtEnd wrapperContained; public NbtEnd(net.minecraft.nbt.NbtEnd wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public yarnwrap.nbt.NbtEnd INSTANCE() { return new yarnwrap.nbt.NbtEnd(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.nbt.NbtEnd value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }

}