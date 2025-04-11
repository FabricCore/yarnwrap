package yarnwrap.network.packet.s2c.play;
public class EntityPassengersSetS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket wrapperContained; public EntityPassengersSetS2CPacket(net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] passengerIds() { return wrapperContained.passengerIds; }
// public void passengerIds(int[] value) { wrapperContained.passengerIds = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int[] getPassengerIds() { return wrapperContained.getPassengerIds(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}