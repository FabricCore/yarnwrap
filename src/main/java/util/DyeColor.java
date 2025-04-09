package yarnwrap.util;
public class DyeColor { public net.minecraft.util.DyeColor wrapperContained; public DyeColor(net.minecraft.util.DyeColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int signColor() { return wrapperContained.signColor; }
public Object CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int entityColor() { return wrapperContained.entityColor; }
// public java.lang.String name() { return wrapperContained.name; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap BY_FIREWORK_COLOR() { return wrapperContained.BY_FIREWORK_COLOR; }
// public yarnwrap.block.MapColor mapColor() { return new yarnwrap.block.MapColor(wrapperContained.mapColor); }
// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int fireworkColor() { return wrapperContained.fireworkColor; }
// public int id() { return wrapperContained.id; }
public int getSignColor() { return wrapperContained.getSignColor(); }
public yarnwrap.util.DyeColor byFireworkColor(int color) { return new yarnwrap.util.DyeColor(wrapperContained.byFireworkColor(color)); }
public int getEntityColor() { return wrapperContained.getEntityColor(); }
public int getId() { return wrapperContained.getId(); }
public int getFireworkColor() { return wrapperContained.getFireworkColor(); }
public yarnwrap.util.DyeColor byId(int id) { return new yarnwrap.util.DyeColor(wrapperContained.byId(id)); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.util.DyeColor byName(java.lang.String name,yarnwrap.util.DyeColor defaultColor) { return new yarnwrap.util.DyeColor(wrapperContained.byName(name,defaultColor.wrapperContained)); }
public yarnwrap.block.MapColor getMapColor() { return new yarnwrap.block.MapColor(wrapperContained.getMapColor()); }

}