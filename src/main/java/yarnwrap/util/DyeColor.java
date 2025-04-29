package yarnwrap.util;
public class DyeColor { public net.minecraft.util.DyeColor wrapperContained; public DyeColor(net.minecraft.util.DyeColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int signColor() { return wrapperContained.signColor; }
// public void signColor(int value) { wrapperContained.signColor = value; }
// public static int signColor() { return net.minecraft.util.DyeColor.signColor; }
// public static void signColor(int value, ) { net.minecraft.util.DyeColor.signColor = value; }

// public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public static Object CODEC() { return net.minecraft.util.DyeColor.CODEC; }
// // public static void CODEC(Object value, ) { net.minecraft.util.DyeColor.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.DyeColor.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.DyeColor.PACKET_CODEC = value.wrapperContained; }

// public int entityColor() { return wrapperContained.entityColor; }
// public void entityColor(int value) { wrapperContained.entityColor = value; }
// public static int entityColor() { return net.minecraft.util.DyeColor.entityColor; }
// public static void entityColor(int value, ) { net.minecraft.util.DyeColor.entityColor = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.DyeColor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.DyeColor.name = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap BY_FIREWORK_COLOR() { return wrapperContained.BY_FIREWORK_COLOR; }
// public void BY_FIREWORK_COLOR(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap value) { wrapperContained.BY_FIREWORK_COLOR = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap BY_FIREWORK_COLOR() { return net.minecraft.util.DyeColor.BY_FIREWORK_COLOR; }
// public static void BY_FIREWORK_COLOR(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap value, ) { net.minecraft.util.DyeColor.BY_FIREWORK_COLOR = value; }

// public yarnwrap.block.MapColor mapColor() { return new yarnwrap.block.MapColor(wrapperContained.mapColor); }
// public void mapColor(yarnwrap.block.MapColor value) { wrapperContained.mapColor = value.wrapperContained; }
// public static yarnwrap.block.MapColor mapColor() { return new yarnwrap.block.MapColor(net.minecraft.util.DyeColor.mapColor); }
// public static void mapColor(yarnwrap.block.MapColor value, ) { net.minecraft.util.DyeColor.mapColor = value.wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.util.DyeColor.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.util.DyeColor.BY_ID = value; }

// public int fireworkColor() { return wrapperContained.fireworkColor; }
// public void fireworkColor(int value) { wrapperContained.fireworkColor = value; }
// public static int fireworkColor() { return net.minecraft.util.DyeColor.fireworkColor; }
// public static void fireworkColor(int value, ) { net.minecraft.util.DyeColor.fireworkColor = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.util.DyeColor.id; }
// public static void id(int value, ) { net.minecraft.util.DyeColor.id = value; }

// // public DyeColor(java.lang.String id,int name,int entityColor,java.lang.String mapColor,int fireworkColor,yarnwrap.block.MapColor signColor) { this.wrapperContained = new net.minecraft.util.DyeColor(id,name,entityColor,mapColor,fireworkColor,signColor.wrapperContained); }
public int getSignColor() { return wrapperContained.getSignColor(); }
// public static int getSignColor() { return net.minecraft.util.DyeColor.getSignColor(); }
// public yarnwrap.util.DyeColor byFireworkColor(int color) { return new yarnwrap.util.DyeColor(wrapperContained.byFireworkColor(color)); }
// public static yarnwrap.util.DyeColor byFireworkColor(int color, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.byFireworkColor(color)); }
public int getEntityColor() { return wrapperContained.getEntityColor(); }
// public static int getEntityColor() { return net.minecraft.util.DyeColor.getEntityColor(); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.util.DyeColor.getId(); }
public int getFireworkColor() { return wrapperContained.getFireworkColor(); }
// public static int getFireworkColor() { return net.minecraft.util.DyeColor.getFireworkColor(); }
// public yarnwrap.util.DyeColor byId(int id) { return new yarnwrap.util.DyeColor(wrapperContained.byId(id)); }
// public static yarnwrap.util.DyeColor byId(int id, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.byId(id)); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.util.DyeColor.getName(); }
// public yarnwrap.util.DyeColor byName(java.lang.String name,yarnwrap.util.DyeColor defaultColor) { return new yarnwrap.util.DyeColor(wrapperContained.byName(name,defaultColor.wrapperContained)); }
// public static yarnwrap.util.DyeColor byName(java.lang.String name,yarnwrap.util.DyeColor defaultColor, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.byName(name,defaultColor.wrapperContained)); }
public yarnwrap.block.MapColor getMapColor() { return new yarnwrap.block.MapColor(wrapperContained.getMapColor()); }
// public static yarnwrap.block.MapColor getMapColor() { return new yarnwrap.block.MapColor(net.minecraft.util.DyeColor.getMapColor()); }
// public java.lang.Integer method_7795(yarnwrap.util.DyeColor color) { return wrapperContained.method_7795(color.wrapperContained); }
// public static java.lang.Integer method_7795(yarnwrap.util.DyeColor color, ) { return net.minecraft.util.DyeColor.method_7795(color.wrapperContained); }
// public yarnwrap.util.DyeColor method_7797(yarnwrap.util.DyeColor color) { return new yarnwrap.util.DyeColor(wrapperContained.method_7797(color.wrapperContained)); }
// public static yarnwrap.util.DyeColor method_7797(yarnwrap.util.DyeColor color, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.method_7797(color.wrapperContained)); }

}