package yarnwrap.util;
public class DyeColor { public net.minecraft.util.DyeColor wrapperContained; public DyeColor(net.minecraft.util.DyeColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityColor() { return wrapperContained.entityColor; }
// public void entityColor(int value) { wrapperContained.entityColor = value; }
// public static int entityColor() { return net.minecraft.util.DyeColor.entityColor; }
// public static void entityColor(int value, ) { net.minecraft.util.DyeColor.entityColor = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.util.DyeColor.id; }
// public static void id(java.lang.String value, ) { net.minecraft.util.DyeColor.id = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap BY_FIREWORK_COLOR() { return wrapperContained.BY_FIREWORK_COLOR; }
// public void BY_FIREWORK_COLOR(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap value) { wrapperContained.BY_FIREWORK_COLOR = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap BY_FIREWORK_COLOR() { return net.minecraft.util.DyeColor.BY_FIREWORK_COLOR; }
// public static void BY_FIREWORK_COLOR(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap value, ) { net.minecraft.util.DyeColor.BY_FIREWORK_COLOR = value; }

// public yarnwrap.block.MapColor mapColor() { return new yarnwrap.block.MapColor(wrapperContained.mapColor); }
// public void mapColor(yarnwrap.block.MapColor value) { wrapperContained.mapColor = value.wrapperContained; }
// public static yarnwrap.block.MapColor mapColor() { return new yarnwrap.block.MapColor(net.minecraft.util.DyeColor.mapColor); }
// public static void mapColor(yarnwrap.block.MapColor value, ) { net.minecraft.util.DyeColor.mapColor = value.wrapperContained; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
// public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.util.DyeColor.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.util.DyeColor.INDEX_MAPPER = value; }

// public int fireworkColor() { return wrapperContained.fireworkColor; }
// public void fireworkColor(int value) { wrapperContained.fireworkColor = value; }
// public static int fireworkColor() { return net.minecraft.util.DyeColor.fireworkColor; }
// public static void fireworkColor(int value, ) { net.minecraft.util.DyeColor.fireworkColor = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.util.DyeColor.index; }
// public static void index(int value, ) { net.minecraft.util.DyeColor.index = value; }

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

// public com.mojang.serialization.Codec INDEX_CODEC() { return wrapperContained.INDEX_CODEC; }
// public void INDEX_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INDEX_CODEC = value; }
public static com.mojang.serialization.Codec INDEX_CODEC() { return net.minecraft.util.DyeColor.INDEX_CODEC; }
// public static void INDEX_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.DyeColor.INDEX_CODEC = value; }

// // public DyeColor(java.lang.String index,int id,int entityColor,java.lang.String mapColor,int fireworkColor,yarnwrap.block.MapColor signColor) { this.wrapperContained = new net.minecraft.util.DyeColor(index,id,entityColor,mapColor,fireworkColor,signColor.wrapperContained); }
// public yarnwrap.util.DyeColor byFireworkColor(int color) { return new yarnwrap.util.DyeColor(wrapperContained.byFireworkColor(color)); }
// public static yarnwrap.util.DyeColor byFireworkColor(int color, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.byFireworkColor(color)); }
public int getEntityColor() { return wrapperContained.getEntityColor(); }
// public static int getEntityColor() { return net.minecraft.util.DyeColor.getEntityColor(); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.util.DyeColor.getIndex(); }
public int getFireworkColor() { return wrapperContained.getFireworkColor(); }
// public static int getFireworkColor() { return net.minecraft.util.DyeColor.getFireworkColor(); }
// public yarnwrap.util.DyeColor byIndex(int index) { return new yarnwrap.util.DyeColor(wrapperContained.byIndex(index)); }
// public static yarnwrap.util.DyeColor byIndex(int index, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.byIndex(index)); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.util.DyeColor.getId(); }
// public yarnwrap.util.DyeColor byId(java.lang.String id,yarnwrap.util.DyeColor fallback) { return new yarnwrap.util.DyeColor(wrapperContained.byId(id,fallback.wrapperContained)); }
// public static yarnwrap.util.DyeColor byId(java.lang.String id,yarnwrap.util.DyeColor fallback, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.byId(id,fallback.wrapperContained)); }
public yarnwrap.block.MapColor getMapColor() { return new yarnwrap.block.MapColor(wrapperContained.getMapColor()); }
// public static yarnwrap.block.MapColor getMapColor() { return new yarnwrap.block.MapColor(net.minecraft.util.DyeColor.getMapColor()); }
// public java.lang.Integer method_7795(yarnwrap.util.DyeColor color) { return wrapperContained.method_7795(color.wrapperContained); }
// public static java.lang.Integer method_7795(yarnwrap.util.DyeColor color, ) { return net.minecraft.util.DyeColor.method_7795(color.wrapperContained); }
// public yarnwrap.util.DyeColor method_7797(yarnwrap.util.DyeColor color) { return new yarnwrap.util.DyeColor(wrapperContained.method_7797(color.wrapperContained)); }
// public static yarnwrap.util.DyeColor method_7797(yarnwrap.util.DyeColor color, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.method_7797(color.wrapperContained)); }
public int getSignColor() { return wrapperContained.getSignColor(); }
// public static int getSignColor() { return net.minecraft.util.DyeColor.getSignColor(); }
// public yarnwrap.util.DyeColor mixColors(yarnwrap.server.world.ServerWorld world,yarnwrap.util.DyeColor first,yarnwrap.util.DyeColor second) { return new yarnwrap.util.DyeColor(wrapperContained.mixColors(world.wrapperContained,first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.util.DyeColor mixColors(yarnwrap.server.world.ServerWorld world,yarnwrap.util.DyeColor first,yarnwrap.util.DyeColor second, ) { return new yarnwrap.util.DyeColor(net.minecraft.util.DyeColor.mixColors(world.wrapperContained,first.wrapperContained,second.wrapperContained)); }
// public yarnwrap.recipe.input.CraftingRecipeInput createColorMixingRecipeInput(yarnwrap.util.DyeColor first,yarnwrap.util.DyeColor second) { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.createColorMixingRecipeInput(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.recipe.input.CraftingRecipeInput createColorMixingRecipeInput(yarnwrap.util.DyeColor first,yarnwrap.util.DyeColor second, ) { return new yarnwrap.recipe.input.CraftingRecipeInput(net.minecraft.util.DyeColor.createColorMixingRecipeInput(first.wrapperContained,second.wrapperContained)); }
// public yarnwrap.item.ItemStack method_65357(yarnwrap.recipe.input.CraftingRecipeInput recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_65357(recipe.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_65357(yarnwrap.recipe.input.CraftingRecipeInput recipe, ) { return new yarnwrap.item.ItemStack(net.minecraft.util.DyeColor.method_65357(recipe.wrapperContained)); }
// public java.lang.Byte method_67674(yarnwrap.util.DyeColor color) { return wrapperContained.method_67674(color.wrapperContained); }
// public static java.lang.Byte method_67674(yarnwrap.util.DyeColor color, ) { return net.minecraft.util.DyeColor.method_67674(color.wrapperContained); }

}