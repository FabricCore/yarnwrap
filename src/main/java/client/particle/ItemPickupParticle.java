package yarnwrap.client.particle;
public class ItemPickupParticle { public net.minecraft.client.particle.ItemPickupParticle wrapperContained; public ItemPickupParticle(net.minecraft.client.particle.ItemPickupParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.BufferBuilderStorage bufferStorage() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferStorage); }
// public yarnwrap.entity.Entity interactingEntity() { return new yarnwrap.entity.Entity(wrapperContained.interactingEntity); }
// public yarnwrap.entity.Entity itemEntity() { return new yarnwrap.entity.Entity(wrapperContained.itemEntity); }
// public yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.dispatcher); }
// public int ticksExisted() { return wrapperContained.ticksExisted; }
// public double targetX() { return wrapperContained.targetX; }
// public double targetY() { return wrapperContained.targetY; }
// public double targetZ() { return wrapperContained.targetZ; }
// public double lastTargetX() { return wrapperContained.lastTargetX; }
// public double lastTargetY() { return wrapperContained.lastTargetY; }
// public double lastTargetZ() { return wrapperContained.lastTargetZ; }
// public yarnwrap.entity.Entity getOrCopy(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getOrCopy(entity.wrapperContained)); }
// public void updateTargetPos() { wrapperContained.updateTargetPos(); }
// public void updateLastTargetPos() { wrapperContained.updateLastTargetPos(); }

}