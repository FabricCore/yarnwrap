package yarnwrap.network.packet.s2c.play;
public class EntitiesDestroyS2CPacket { public net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket wrapperContained; public EntitiesDestroyS2CPacket(net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntList entityIds() { return wrapperContained.entityIds; }
// public void entityIds(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.entityIds = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public EntitiesDestroyS2CPacket(it.unimi.dsi.fastutil.ints.IntList entityIds) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket(entityIds); }
// public EntitiesDestroyS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket(buf.wrapperContained); }
public EntitiesDestroyS2CPacket(int entityIds) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket(entityIds); }
public it.unimi.dsi.fastutil.ints.IntList getEntityIds() { return wrapperContained.getEntityIds(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}