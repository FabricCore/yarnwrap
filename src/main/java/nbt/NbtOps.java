package yarnwrap.nbt;
public class NbtOps { public net.minecraft.nbt.NbtOps wrapperContained; public NbtOps(net.minecraft.nbt.NbtOps wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.nbt.NbtOps INSTANCE() { return new yarnwrap.nbt.NbtOps(wrapperContained.INSTANCE); }
// public java.lang.String MARKER_KEY() { return wrapperContained.MARKER_KEY; }
// public yarnwrap.nbt.NbtElement unpackMarker(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtElement(wrapperContained.unpackMarker(nbt.wrapperContained)); }
// public java.util.Optional createMerger(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.createMerger(nbt.wrapperContained); }

}