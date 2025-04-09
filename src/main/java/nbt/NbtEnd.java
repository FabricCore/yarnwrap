package yarnwrap.nbt;
public class NbtEnd { public net.minecraft.nbt.NbtEnd wrapperContained; public NbtEnd(net.minecraft.nbt.NbtEnd wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
public yarnwrap.nbt.NbtEnd INSTANCE() { return new yarnwrap.nbt.NbtEnd(wrapperContained.INSTANCE); }
// public int SIZE() { return wrapperContained.SIZE; }

}