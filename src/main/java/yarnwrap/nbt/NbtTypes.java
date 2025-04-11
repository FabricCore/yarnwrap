package yarnwrap.nbt;
public class NbtTypes { public net.minecraft.nbt.NbtTypes wrapperContained; public NbtTypes(net.minecraft.nbt.NbtTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.nbt.NbtType[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.nbt.NbtType[] value) { wrapperContained.VALUES = value; }
public yarnwrap.nbt.NbtType byId(int id) { return new yarnwrap.nbt.NbtType(wrapperContained.byId(id)); }

}