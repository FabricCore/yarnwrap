package yarnwrap.world.event.listener;
public class Vibration { public net.minecraft.world.event.listener.Vibration wrapperContained; public Vibration(net.minecraft.world.event.listener.Vibration wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.Optional getEntity(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getEntity(world.wrapperContained); }
// public java.util.UUID getOwnerUuid(yarnwrap.entity.Entity entity) { return wrapperContained.getOwnerUuid(entity.wrapperContained); }
public java.util.Optional getOwner(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getOwner(world.wrapperContained); }

}