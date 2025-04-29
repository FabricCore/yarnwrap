package yarnwrap.client.particle;
public class ItemPickupParticle { public net.minecraft.client.particle.ItemPickupParticle wrapperContained; public ItemPickupParticle(net.minecraft.client.particle.ItemPickupParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.BufferBuilderStorage bufferStorage() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferStorage); }
// public void bufferStorage(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.bufferStorage = value.wrapperContained; }
// public static yarnwrap.client.render.BufferBuilderStorage bufferStorage() { return new yarnwrap.client.render.BufferBuilderStorage(net.minecraft.client.particle.ItemPickupParticle.bufferStorage); }
// public static void bufferStorage(yarnwrap.client.render.BufferBuilderStorage value, ) { net.minecraft.client.particle.ItemPickupParticle.bufferStorage = value.wrapperContained; }

// public yarnwrap.entity.Entity interactingEntity() { return new yarnwrap.entity.Entity(wrapperContained.interactingEntity); }
// public void interactingEntity(yarnwrap.entity.Entity value) { wrapperContained.interactingEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity interactingEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.particle.ItemPickupParticle.interactingEntity); }
// public static void interactingEntity(yarnwrap.entity.Entity value, ) { net.minecraft.client.particle.ItemPickupParticle.interactingEntity = value.wrapperContained; }

// public yarnwrap.entity.Entity itemEntity() { return new yarnwrap.entity.Entity(wrapperContained.itemEntity); }
// public void itemEntity(yarnwrap.entity.Entity value) { wrapperContained.itemEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity itemEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.particle.ItemPickupParticle.itemEntity); }
// public static void itemEntity(yarnwrap.entity.Entity value, ) { net.minecraft.client.particle.ItemPickupParticle.itemEntity = value.wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.dispatcher); }
// public void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.dispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.particle.ItemPickupParticle.dispatcher); }
// public static void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.particle.ItemPickupParticle.dispatcher = value.wrapperContained; }

// public int ticksExisted() { return wrapperContained.ticksExisted; }
// public void ticksExisted(int value) { wrapperContained.ticksExisted = value; }
// public static int ticksExisted() { return net.minecraft.client.particle.ItemPickupParticle.ticksExisted; }
// public static void ticksExisted(int value, ) { net.minecraft.client.particle.ItemPickupParticle.ticksExisted = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.client.particle.ItemPickupParticle.targetX; }
// public static void targetX(double value, ) { net.minecraft.client.particle.ItemPickupParticle.targetX = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.client.particle.ItemPickupParticle.targetY; }
// public static void targetY(double value, ) { net.minecraft.client.particle.ItemPickupParticle.targetY = value; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.client.particle.ItemPickupParticle.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.client.particle.ItemPickupParticle.targetZ = value; }

// public double lastTargetX() { return wrapperContained.lastTargetX; }
// public void lastTargetX(double value) { wrapperContained.lastTargetX = value; }
// public static double lastTargetX() { return net.minecraft.client.particle.ItemPickupParticle.lastTargetX; }
// public static void lastTargetX(double value, ) { net.minecraft.client.particle.ItemPickupParticle.lastTargetX = value; }

// public double lastTargetY() { return wrapperContained.lastTargetY; }
// public void lastTargetY(double value) { wrapperContained.lastTargetY = value; }
// public static double lastTargetY() { return net.minecraft.client.particle.ItemPickupParticle.lastTargetY; }
// public static void lastTargetY(double value, ) { net.minecraft.client.particle.ItemPickupParticle.lastTargetY = value; }

// public double lastTargetZ() { return wrapperContained.lastTargetZ; }
// public void lastTargetZ(double value) { wrapperContained.lastTargetZ = value; }
// public static double lastTargetZ() { return net.minecraft.client.particle.ItemPickupParticle.lastTargetZ; }
// public static void lastTargetZ(double value, ) { net.minecraft.client.particle.ItemPickupParticle.lastTargetZ = value; }

public ItemPickupParticle(yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher,yarnwrap.client.render.BufferBuilderStorage bufferStorage,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity itemEntity,yarnwrap.entity.Entity interactingEntity) { this.wrapperContained = new net.minecraft.client.particle.ItemPickupParticle(dispatcher.wrapperContained,bufferStorage.wrapperContained,world.wrapperContained,itemEntity.wrapperContained,interactingEntity.wrapperContained); }
// public ItemPickupParticle(yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher,yarnwrap.client.render.BufferBuilderStorage bufferStorage,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity itemEntity,yarnwrap.entity.Entity interactingEntity,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.client.particle.ItemPickupParticle(dispatcher.wrapperContained,bufferStorage.wrapperContained,world.wrapperContained,itemEntity.wrapperContained,interactingEntity.wrapperContained,velocity.wrapperContained); }
// public yarnwrap.entity.Entity getOrCopy(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getOrCopy(entity.wrapperContained)); }
// public static yarnwrap.entity.Entity getOrCopy(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.Entity(net.minecraft.client.particle.ItemPickupParticle.getOrCopy(entity.wrapperContained)); }
// public void updateTargetPos() { wrapperContained.updateTargetPos(); }
// public static void updateTargetPos() { net.minecraft.client.particle.ItemPickupParticle.updateTargetPos(); }
// public void updateLastTargetPos() { wrapperContained.updateLastTargetPos(); }
// public static void updateLastTargetPos() { net.minecraft.client.particle.ItemPickupParticle.updateLastTargetPos(); }

}