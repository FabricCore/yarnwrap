package yarnwrap.network.packet.s2c.play;
public class CraftFailedResponseS2CPacket { public net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket wrapperContained; public CraftFailedResponseS2CPacket(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
// public void recipeId(yarnwrap.util.Identifier value) { wrapperContained.recipeId = value.wrapperContained; }
// public static yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.recipeId); }
// public static void recipeId(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.recipeId = value.wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.syncId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.CODEC = value.wrapperContained; }

public CraftFailedResponseS2CPacket(int syncId,yarnwrap.recipe.RecipeEntry recipe) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket(syncId,recipe.wrapperContained); }
// public CraftFailedResponseS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket(buf.wrapperContained); }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
// public static yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.getRecipeId()); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.write(buf.wrapperContained); }

}