package yarnwrap.world.event;
public class EntityPositionSource { public net.minecraft.world.event.EntityPositionSource wrapperContained; public EntityPositionSource(net.minecraft.world.event.EntityPositionSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float yOffset() { return wrapperContained.yOffset; }
// public void yOffset(float value) { wrapperContained.yOffset = value; }
// public com.mojang.datafixers.util.Either source() { return wrapperContained.source; }
// public void source(com.mojang.datafixers.util.Either value) { wrapperContained.source = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public void findEntityInWorld(yarnwrap.world.World world) { wrapperContained.findEntityInWorld(world.wrapperContained); }
// public int getEntityId() { return wrapperContained.getEntityId(); }

}