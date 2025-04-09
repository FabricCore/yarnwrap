package yarnwrap.network.packet.s2c.play;
public class EntitiesDestroyS2CPacket { public net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket wrapperContained; public EntitiesDestroyS2CPacket(net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntList entityIds() { return wrapperContained.entityIds; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public it.unimi.dsi.fastutil.ints.IntList getEntityIds() { return wrapperContained.getEntityIds(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}