package yarnwrap.entity;
public class MarkerEntity { public net.minecraft.entity.MarkerEntity wrapperContained; public MarkerEntity(net.minecraft.entity.MarkerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }

}