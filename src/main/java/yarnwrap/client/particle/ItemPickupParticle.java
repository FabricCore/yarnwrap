package yarnwrap.client.particle;
public class ItemPickupParticle { public net.minecraft.client.particle.ItemPickupParticle wrapperContained; public ItemPickupParticle(net.minecraft.client.particle.ItemPickupParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.BufferBuilderStorage bufferStorage() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferStorage); }
// public void bufferStorage(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.bufferStorage = value.wrapperContained; }
// public yarnwrap.entity.Entity interactingEntity() { return new yarnwrap.entity.Entity(wrapperContained.interactingEntity); }
// public void interactingEntity(yarnwrap.entity.Entity value) { wrapperContained.interactingEntity = value.wrapperContained; }
// public yarnwrap.entity.Entity itemEntity() { return new yarnwrap.entity.Entity(wrapperContained.itemEntity); }
// public void itemEntity(yarnwrap.entity.Entity value) { wrapperContained.itemEntity = value.wrapperContained; }
// public yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.dispatcher); }
// public void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.dispatcher = value.wrapperContained; }
// public int ticksExisted() { return wrapperContained.ticksExisted; }
// public void ticksExisted(int value) { wrapperContained.ticksExisted = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public double lastTargetX() { return wrapperContained.lastTargetX; }
// public void lastTargetX(double value) { wrapperContained.lastTargetX = value; }
// public double lastTargetY() { return wrapperContained.lastTargetY; }
// public void lastTargetY(double value) { wrapperContained.lastTargetY = value; }
// public double lastTargetZ() { return wrapperContained.lastTargetZ; }
// public void lastTargetZ(double value) { wrapperContained.lastTargetZ = value; }
public ItemPickupParticle(yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher,yarnwrap.client.render.BufferBuilderStorage bufferStorage,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity itemEntity,yarnwrap.entity.Entity interactingEntity) { this.wrapperContained = new net.minecraft.client.particle.ItemPickupParticle(dispatcher.wrapperContained,bufferStorage.wrapperContained,world.wrapperContained,itemEntity.wrapperContained,interactingEntity.wrapperContained); }
// public ItemPickupParticle(yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher,yarnwrap.client.render.BufferBuilderStorage bufferStorage,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity itemEntity,yarnwrap.entity.Entity interactingEntity,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.client.particle.ItemPickupParticle(dispatcher.wrapperContained,bufferStorage.wrapperContained,world.wrapperContained,itemEntity.wrapperContained,interactingEntity.wrapperContained,velocity.wrapperContained); }
// public yarnwrap.entity.Entity getOrCopy(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getOrCopy(entity.wrapperContained)); }
// public void updateTargetPos() { wrapperContained.updateTargetPos(); }
// public void updateLastTargetPos() { wrapperContained.updateLastTargetPos(); }

}