package yarnwrap.network.packet.c2s.play;
public class CraftRequestC2SPacket { public net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket wrapperContained; public CraftRequestC2SPacket(net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
// public boolean craftAll() { return wrapperContained.craftAll; }
// public int syncId() { return wrapperContained.syncId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public boolean shouldCraftAll() { return wrapperContained.shouldCraftAll(); }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}