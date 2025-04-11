package yarnwrap.util;
public class DyeColor { public net.minecraft.util.DyeColor wrapperContained; public DyeColor(net.minecraft.util.DyeColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int signColor() { return wrapperContained.signColor; }
// public void signColor(int value) { wrapperContained.signColor = value; }
public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int entityColor() { return wrapperContained.entityColor; }
// public void entityColor(int value) { wrapperContained.entityColor = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap BY_FIREWORK_COLOR() { return wrapperContained.BY_FIREWORK_COLOR; }
// public void BY_FIREWORK_COLOR(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap value) { wrapperContained.BY_FIREWORK_COLOR = value; }
// public yarnwrap.block.MapColor mapColor() { return new yarnwrap.block.MapColor(wrapperContained.mapColor); }
// public void mapColor(yarnwrap.block.MapColor value) { wrapperContained.mapColor = value.wrapperContained; }
// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public int fireworkColor() { return wrapperContained.fireworkColor; }
// public void fireworkColor(int value) { wrapperContained.fireworkColor = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// // public DyeColor(java.lang.String id,int name,int entityColor,java.lang.String mapColor,int fireworkColor,yarnwrap.block.MapColor signColor) { this.wrapperContained = new net.minecraft.util.DyeColor(id,name,entityColor,mapColor,fireworkColor,signColor.wrapperContained); }
public int getSignColor() { return wrapperContained.getSignColor(); }
public yarnwrap.util.DyeColor byFireworkColor(int color) { return new yarnwrap.util.DyeColor(wrapperContained.byFireworkColor(color)); }
public int getEntityColor() { return wrapperContained.getEntityColor(); }
public int getId() { return wrapperContained.getId(); }
public int getFireworkColor() { return wrapperContained.getFireworkColor(); }
public yarnwrap.util.DyeColor byId(int id) { return new yarnwrap.util.DyeColor(wrapperContained.byId(id)); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.util.DyeColor byName(java.lang.String name,yarnwrap.util.DyeColor defaultColor) { return new yarnwrap.util.DyeColor(wrapperContained.byName(name,defaultColor.wrapperContained)); }
public yarnwrap.block.MapColor getMapColor() { return new yarnwrap.block.MapColor(wrapperContained.getMapColor()); }
// public java.lang.Integer method_7795(yarnwrap.util.DyeColor color) { return wrapperContained.method_7795(color.wrapperContained); }
// public yarnwrap.util.DyeColor method_7797(yarnwrap.util.DyeColor color) { return new yarnwrap.util.DyeColor(wrapperContained.method_7797(color.wrapperContained)); }

}