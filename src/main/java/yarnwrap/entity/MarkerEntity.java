package yarnwrap.entity;
public class MarkerEntity { public net.minecraft.entity.MarkerEntity wrapperContained; public MarkerEntity(net.minecraft.entity.MarkerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public void DATA_KEY(java.lang.String value) { wrapperContained.DATA_KEY = value; }
// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }
// public void data(yarnwrap.nbt.NbtCompound value) { wrapperContained.data = value.wrapperContained; }

}