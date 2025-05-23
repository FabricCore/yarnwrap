package yarnwrap.network.packet.c2s.play;
public class CraftRequestC2SPacket { public net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket wrapperContained; public CraftRequestC2SPacket(net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.syncId = value; }

// public yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(wrapperContained.recipeId); }
// public void recipeId(yarnwrap.recipe.NetworkRecipeId value) { wrapperContained.recipeId = value.wrapperContained; }
// public static yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.recipeId); }
// public static void recipeId(yarnwrap.recipe.NetworkRecipeId value, ) { net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.recipeId = value.wrapperContained; }

// public boolean craftAll() { return wrapperContained.craftAll; }
// public void craftAll(boolean value) { wrapperContained.craftAll = value; }
// public static boolean craftAll() { return net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.craftAll; }
// public static void craftAll(boolean value, ) { net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.craftAll = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.CODEC = value.wrapperContained; }

// public int syncId() { return wrapperContained.syncId(); }
// // public static int syncId() { return net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.syncId(); }
// public yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(wrapperContained.recipeId()); }
// // public static yarnwrap.recipe.NetworkRecipeId recipeId() { return new yarnwrap.recipe.NetworkRecipeId(net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.recipeId()); }
// public boolean craftAll() { return wrapperContained.craftAll(); }
// // public static boolean craftAll() { return net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket.craftAll(); }

}