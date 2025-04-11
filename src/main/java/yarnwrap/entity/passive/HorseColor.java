package yarnwrap.entity.passive;
public class HorseColor { public net.minecraft.entity.passive.HorseColor wrapperContained; public HorseColor(net.minecraft.entity.passive.HorseColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// // public HorseColor(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.entity.passive.HorseColor(id,name); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.entity.passive.HorseColor byId(int id) { return new yarnwrap.entity.passive.HorseColor(wrapperContained.byId(id)); }

}