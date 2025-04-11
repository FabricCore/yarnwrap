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
// public EntityPositionSource(com.mojang.datafixers.util.Either source,float yOffset) { this.wrapperContained = new net.minecraft.world.event.EntityPositionSource(source,yOffset); }
public EntityPositionSource(yarnwrap.entity.Entity entity,float yOffset) { this.wrapperContained = new net.minecraft.world.event.EntityPositionSource(entity.wrapperContained,yOffset); }
// public com.mojang.datafixers.kinds.App method_32932(Object instance) { return wrapperContained.method_32932(instance); }
// public yarnwrap.util.math.Vec3d method_42337(yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_42337(entity.wrapperContained)); }
// public java.lang.Float method_42338(yarnwrap.world.event.EntityPositionSource entityPositionSource) { return wrapperContained.method_42338(entityPositionSource.wrapperContained); }
// public void method_42673(yarnwrap.entity.Entity entity) { wrapperContained.method_42673(entity.wrapperContained); }
// public java.util.Optional method_42674(yarnwrap.world.World entityId) { return wrapperContained.method_42674(entityId.wrapperContained); }
// public yarnwrap.entity.Entity method_42675(yarnwrap.world.World uuid) { return new yarnwrap.entity.Entity(wrapperContained.method_42675(uuid.wrapperContained)); }
// public java.lang.Integer method_42676(com.mojang.datafixers.util.Either entityId) { return wrapperContained.method_42676(entityId); }
// public java.util.UUID method_42677(java.lang.Integer entityIdx) { return wrapperContained.method_42677(entityIdx); }
// public java.lang.Integer method_42678(java.util.UUID uuid) { return wrapperContained.method_42678(uuid); }
// public yarnwrap.world.event.EntityPositionSource method_42679(java.util.UUID uuid,java.lang.Float yOffset) { return new yarnwrap.world.event.EntityPositionSource(wrapperContained.method_42679(uuid,yOffset)); }
// public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public void findEntityInWorld(yarnwrap.world.World world) { wrapperContained.findEntityInWorld(world.wrapperContained); }
// public java.util.UUID method_42682(com.mojang.datafixers.util.Either entityId) { return wrapperContained.method_42682(entityId); }
// public int getEntityId() { return wrapperContained.getEntityId(); }
// public java.lang.Float method_56124(yarnwrap.world.event.EntityPositionSource source) { return wrapperContained.method_56124(source.wrapperContained); }
// public yarnwrap.world.event.EntityPositionSource method_56125(java.lang.Integer entityId,java.lang.Float yOffset) { return new yarnwrap.world.event.EntityPositionSource(wrapperContained.method_56125(entityId,yOffset)); }

}