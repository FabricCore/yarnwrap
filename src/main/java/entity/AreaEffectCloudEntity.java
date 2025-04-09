package yarnwrap.entity;
public class AreaEffectCloudEntity { public net.minecraft.entity.AreaEffectCloudEntity wrapperContained; public AreaEffectCloudEntity(net.minecraft.entity.AreaEffectCloudEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MAX_RADIUS() { return wrapperContained.MAX_RADIUS; }
// public yarnwrap.component.type.PotionContentsComponent potionContentsComponent() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.potionContentsComponent); }
// public float radiusOnUse() { return wrapperContained.radiusOnUse; }
// public float radiusGrowth() { return wrapperContained.radiusGrowth; }
// public yarnwrap.entity.data.TrackedData PARTICLE_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PARTICLE_ID); }
// public int durationOnUse() { return wrapperContained.durationOnUse; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int reapplicationDelay() { return wrapperContained.reapplicationDelay; }
// public yarnwrap.entity.data.TrackedData RADIUS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RADIUS); }
// public int duration() { return wrapperContained.duration; }
// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public int waitTime() { return wrapperContained.waitTime; }
// public java.util.Map affectedEntities() { return wrapperContained.affectedEntities; }
// public yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(wrapperContained.owner); }
// public yarnwrap.entity.data.TrackedData WAITING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WAITING); }
public void setDurationOnUse(int durationOnUse) { wrapperContained.setDurationOnUse(durationOnUse); }
public float getRadiusOnUse() { return wrapperContained.getRadiusOnUse(); }
public float getRadiusGrowth() { return wrapperContained.getRadiusGrowth(); }
public int getDurationOnUse() { return wrapperContained.getDurationOnUse(); }
public int getWaitTime() { return wrapperContained.getWaitTime(); }
public void setWaitTime(int waitTime) { wrapperContained.setWaitTime(waitTime); }
public void setRadiusGrowth(float radiusGrowth) { wrapperContained.setRadiusGrowth(radiusGrowth); }
// public void updateColor() { wrapperContained.updateColor(); }
// public void setWaiting(boolean waiting) { wrapperContained.setWaiting(waiting); }
public float getRadius() { return wrapperContained.getRadius(); }
public yarnwrap.particle.ParticleEffect getParticleType() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticleType()); }
public void setRadius(float radius) { wrapperContained.setRadius(radius); }
public void setDuration(int duration) { wrapperContained.setDuration(duration); }
public int getDuration() { return wrapperContained.getDuration(); }
public void setOwner(yarnwrap.entity.LivingEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
public void setParticleType(yarnwrap.particle.ParticleEffect particle) { wrapperContained.setParticleType(particle.wrapperContained); }
public void setRadiusOnUse(float radiusOnUse) { wrapperContained.setRadiusOnUse(radiusOnUse); }
public void addEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.addEffect(effect.wrapperContained); }
public boolean isWaiting() { return wrapperContained.isWaiting(); }
public void setPotionContents(yarnwrap.component.type.PotionContentsComponent potionContentsComponent) { wrapperContained.setPotionContents(potionContentsComponent.wrapperContained); }

}