package yarnwrap.nbt;
public class NbtFloat { public net.minecraft.nbt.NbtFloat wrapperContained; public NbtFloat(net.minecraft.nbt.NbtFloat wrapperContained) { this.wrapperContained = wrapperContained; }

// public float value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtFloat ZERO() { return new yarnwrap.nbt.NbtFloat(wrapperContained.ZERO); }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public int SIZE() { return wrapperContained.SIZE; }
public yarnwrap.nbt.NbtFloat of(float value) { return new yarnwrap.nbt.NbtFloat(wrapperContained.of(value)); }

}