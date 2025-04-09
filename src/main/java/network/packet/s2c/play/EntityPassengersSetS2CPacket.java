package yarnwrap.network.packet.s2c.play;
public class EntityPassengersSetS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket wrapperContained; public EntityPassengersSetS2CPacket(net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] passengerIds() { return wrapperContained.passengerIds; }
// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int[] getPassengerIds() { return wrapperContained.getPassengerIds(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}