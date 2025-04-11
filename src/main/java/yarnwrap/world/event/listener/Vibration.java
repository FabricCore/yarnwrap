package yarnwrap.world.event.listener;
public class Vibration { public net.minecraft.world.event.listener.Vibration wrapperContained; public Vibration(net.minecraft.world.event.listener.Vibration wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public Vibration(yarnwrap.registry.entry.RegistryEntry gameEvent,float distance,yarnwrap.util.math.Vec3d pos,java.util.UUID uuid,java.util.UUID projectileOwnerUuid) { this.wrapperContained = new net.minecraft.world.event.listener.Vibration(gameEvent.wrapperContained,distance,pos.wrapperContained,uuid,projectileOwnerUuid); }
public Vibration(yarnwrap.registry.entry.RegistryEntry gameEvent,float distance,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.world.event.listener.Vibration(gameEvent.wrapperContained,distance,pos.wrapperContained,entity.wrapperContained); }
public java.util.Optional getEntity(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getEntity(world.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_42349(Object instance) { return wrapperContained.method_42349(instance); }
// public java.util.UUID getOwnerUuid(yarnwrap.entity.Entity entity) { return wrapperContained.getOwnerUuid(entity.wrapperContained); }
// public yarnwrap.world.event.listener.Vibration method_42685(yarnwrap.registry.entry.RegistryEntry event,java.lang.Float distance,yarnwrap.util.math.Vec3d pos,java.util.Optional uuid,java.util.Optional projectileOwnerUuid) { return new yarnwrap.world.event.listener.Vibration(wrapperContained.method_42685(event.wrapperContained,distance,pos.wrapperContained,uuid,projectileOwnerUuid)); }
// public java.util.Optional method_42686(yarnwrap.world.event.listener.Vibration vibration) { return wrapperContained.method_42686(vibration.wrapperContained); }
public java.util.Optional getOwner(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getOwner(world.wrapperContained); }
// public yarnwrap.entity.projectile.ProjectileEntity method_42688(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.projectile.ProjectileEntity(wrapperContained.method_42688(entity.wrapperContained)); }
// public java.util.Optional method_42689(yarnwrap.world.event.listener.Vibration vibration) { return wrapperContained.method_42689(vibration.wrapperContained); }
// public boolean method_42691(yarnwrap.entity.Entity entity) { return wrapperContained.method_42691(entity.wrapperContained); }

}