package yarnwrap.entity.passive;
public class HorseColor { public net.minecraft.entity.passive.HorseColor wrapperContained; public HorseColor(net.minecraft.entity.passive.HorseColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String name() { return wrapperContained.name; }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.entity.passive.HorseColor byId(int id) { return new yarnwrap.entity.passive.HorseColor(wrapperContained.byId(id)); }

}