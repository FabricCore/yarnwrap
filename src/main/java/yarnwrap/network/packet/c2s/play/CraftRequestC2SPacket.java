package yarnwrap.network.packet.c2s.play;
public class CraftRequestC2SPacket { public net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket wrapperContained; public CraftRequestC2SPacket(net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
// public void recipeId(yarnwrap.util.Identifier value) { wrapperContained.recipeId = value.wrapperContained; }
// public boolean craftAll() { return wrapperContained.craftAll; }
// public void craftAll(boolean value) { wrapperContained.craftAll = value; }
// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public CraftRequestC2SPacket(int syncId,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket(syncId,recipe.wrapperContained,craftAll); }
// public CraftRequestC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public boolean shouldCraftAll() { return wrapperContained.shouldCraftAll(); }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}