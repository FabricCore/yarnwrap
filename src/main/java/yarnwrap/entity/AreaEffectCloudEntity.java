package yarnwrap.entity;
public class AreaEffectCloudEntity { public net.minecraft.entity.AreaEffectCloudEntity wrapperContained; public AreaEffectCloudEntity(net.minecraft.entity.AreaEffectCloudEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MAX_RADIUS() { return wrapperContained.MAX_RADIUS; }
// public void MAX_RADIUS(float value) { wrapperContained.MAX_RADIUS = value; }
// public yarnwrap.component.type.PotionContentsComponent potionContentsComponent() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.potionContentsComponent); }
// public void potionContentsComponent(yarnwrap.component.type.PotionContentsComponent value) { wrapperContained.potionContentsComponent = value.wrapperContained; }
// public float radiusOnUse() { return wrapperContained.radiusOnUse; }
// public void radiusOnUse(float value) { wrapperContained.radiusOnUse = value; }
// public float radiusGrowth() { return wrapperContained.radiusGrowth; }
// public void radiusGrowth(float value) { wrapperContained.radiusGrowth = value; }
// public yarnwrap.entity.data.TrackedData PARTICLE_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PARTICLE_ID); }
// public void PARTICLE_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.PARTICLE_ID = value.wrapperContained; }
// public int durationOnUse() { return wrapperContained.durationOnUse; }
// public void durationOnUse(int value) { wrapperContained.durationOnUse = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int reapplicationDelay() { return wrapperContained.reapplicationDelay; }
// public void reapplicationDelay(int value) { wrapperContained.reapplicationDelay = value; }
// public yarnwrap.entity.data.TrackedData RADIUS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RADIUS); }
// public void RADIUS(yarnwrap.entity.data.TrackedData value) { wrapperContained.RADIUS = value.wrapperContained; }
// public int duration() { return wrapperContained.duration; }
// public void duration(int value) { wrapperContained.duration = value; }
// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public void ownerUuid(java.util.UUID value) { wrapperContained.ownerUuid = value; }
// public int waitTime() { return wrapperContained.waitTime; }
// public void waitTime(int value) { wrapperContained.waitTime = value; }
// public java.util.Map affectedEntities() { return wrapperContained.affectedEntities; }
// public void affectedEntities(java.util.Map value) { wrapperContained.affectedEntities = value; }
// public yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.LivingEntity value) { wrapperContained.owner = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData WAITING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WAITING); }
// public void WAITING(yarnwrap.entity.data.TrackedData value) { wrapperContained.WAITING = value.wrapperContained; }
public AreaEffectCloudEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.AreaEffectCloudEntity(world.wrapperContained,x,y,z); }
// public boolean method_32874(Object entry) { return wrapperContained.method_32874(entry); }
public void setDurationOnUse(int durationOnUse) { wrapperContained.setDurationOnUse(durationOnUse); }
public float getRadiusOnUse() { return wrapperContained.getRadiusOnUse(); }
public float getRadiusGrowth() { return wrapperContained.getRadiusGrowth(); }
public int getDurationOnUse() { return wrapperContained.getDurationOnUse(); }
public int getWaitTime() { return wrapperContained.getWaitTime(); }
// public int method_48564(int duration) { return wrapperContained.method_48564(duration); }
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