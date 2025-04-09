package yarnwrap.network.packet.s2c.play;
public class CraftFailedResponseS2CPacket { public net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket wrapperContained; public CraftFailedResponseS2CPacket(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier recipeId() { return new yarnwrap.util.Identifier(wrapperContained.recipeId); }
// public int syncId() { return wrapperContained.syncId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.Identifier getRecipeId() { return new yarnwrap.util.Identifier(wrapperContained.getRecipeId()); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}