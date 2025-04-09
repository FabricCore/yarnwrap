package yarnwrap.world.event;
public class EntityPositionSource { public net.minecraft.world.event.EntityPositionSource wrapperContained; public EntityPositionSource(net.minecraft.world.event.EntityPositionSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float yOffset() { return wrapperContained.yOffset; }
// public com.mojang.datafixers.util.Either source() { return wrapperContained.source; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public void findEntityInWorld(yarnwrap.world.World world) { wrapperContained.findEntityInWorld(world.wrapperContained); }
// public int getEntityId() { return wrapperContained.getEntityId(); }

}