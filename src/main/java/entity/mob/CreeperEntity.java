package yarnwrap.entity.mob;
public class CreeperEntity { public net.minecraft.entity.mob.CreeperEntity wrapperContained; public CreeperEntity(net.minecraft.entity.mob.CreeperEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGED); }
// public int explosionRadius() { return wrapperContained.explosionRadius; }
// public int headsDropped() { return wrapperContained.headsDropped; }
// public int currentFuseTime() { return wrapperContained.currentFuseTime; }
// public int fuseTime() { return wrapperContained.fuseTime; }
// public int lastFuseTime() { return wrapperContained.lastFuseTime; }
// public yarnwrap.entity.data.TrackedData FUSE_SPEED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FUSE_SPEED); }
// public yarnwrap.entity.data.TrackedData IGNITED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IGNITED); }
public Object createCreeperAttributes() { return wrapperContained.createCreeperAttributes(); }
public boolean isIgnited() { return wrapperContained.isIgnited(); }
// public void spawnEffectsCloud() { wrapperContained.spawnEffectsCloud(); }
public void onHeadDropped() { wrapperContained.onHeadDropped(); }
public float getClientFuseTime(float timeDelta) { return wrapperContained.getClientFuseTime(timeDelta); }
public void ignite() { wrapperContained.ignite(); }
public void setFuseSpeed(int fuseSpeed) { wrapperContained.setFuseSpeed(fuseSpeed); }
// public void explode() { wrapperContained.explode(); }
public int getFuseSpeed() { return wrapperContained.getFuseSpeed(); }
public boolean shouldDropHead() { return wrapperContained.shouldDropHead(); }

}