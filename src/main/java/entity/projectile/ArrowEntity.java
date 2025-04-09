package yarnwrap.entity.projectile;
public class ArrowEntity { public net.minecraft.entity.projectile.ArrowEntity wrapperContained; public ArrowEntity(net.minecraft.entity.projectile.ArrowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int NO_POTION_COLOR() { return wrapperContained.NO_POTION_COLOR; }
// public byte PARTICLE_EFFECT_STATUS() { return wrapperContained.PARTICLE_EFFECT_STATUS; }
// public int MAX_POTION_DURATION_TICKS() { return wrapperContained.MAX_POTION_DURATION_TICKS; }
// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public yarnwrap.component.type.PotionContentsComponent getPotionContents() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.getPotionContents()); }
// public void setPotionContents(yarnwrap.component.type.PotionContentsComponent potionContentsComponent) { wrapperContained.setPotionContents(potionContentsComponent.wrapperContained); }
public int getColor() { return wrapperContained.getColor(); }
// public void spawnParticles(int amount) { wrapperContained.spawnParticles(amount); }
// public void initColor() { wrapperContained.initColor(); }
public void addEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.addEffect(effect.wrapperContained); }

}