package yarnwrap.nbt;
public class NbtOps { public net.minecraft.nbt.NbtOps wrapperContained; public NbtOps(net.minecraft.nbt.NbtOps wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.nbt.NbtOps INSTANCE() { return new yarnwrap.nbt.NbtOps(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.nbt.NbtOps value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public java.lang.String MARKER_KEY() { return wrapperContained.MARKER_KEY; }
// public void MARKER_KEY(java.lang.String value) { wrapperContained.MARKER_KEY = value; }
// public yarnwrap.nbt.NbtElement unpackMarker(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtElement(wrapperContained.unpackMarker(nbt.wrapperContained)); }
// public java.util.Optional createMerger(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.createMerger(nbt.wrapperContained); }

}