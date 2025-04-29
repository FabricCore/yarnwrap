package yarnwrap.entity.passive;
public class HorseColor { public net.minecraft.entity.passive.HorseColor wrapperContained; public HorseColor(net.minecraft.entity.passive.HorseColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.entity.passive.HorseColor.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.entity.passive.HorseColor.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.entity.passive.HorseColor.id; }
// public static void id(int value, ) { net.minecraft.entity.passive.HorseColor.id = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.passive.HorseColor.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.passive.HorseColor.CODEC = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.entity.passive.HorseColor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.entity.passive.HorseColor.name = value; }

// // public HorseColor(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.entity.passive.HorseColor(id,name); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.entity.passive.HorseColor.getId(); }
// public yarnwrap.entity.passive.HorseColor byId(int id) { return new yarnwrap.entity.passive.HorseColor(wrapperContained.byId(id)); }
// public static yarnwrap.entity.passive.HorseColor byId(int id, ) { return new yarnwrap.entity.passive.HorseColor(net.minecraft.entity.passive.HorseColor.byId(id)); }

}