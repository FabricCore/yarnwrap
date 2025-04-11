package yarnwrap.entity.projectile.thrown;
public class PotionEntity { public net.minecraft.entity.projectile.thrown.PotionEntity wrapperContained; public PotionEntity(net.minecraft.entity.projectile.thrown.PotionEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate AFFECTED_BY_WATER() { return wrapperContained.AFFECTED_BY_WATER; }
// public void AFFECTED_BY_WATER(java.util.function.Predicate value) { wrapperContained.AFFECTED_BY_WATER = value; }
// public void applyLingeringPotion(yarnwrap.component.type.PotionContentsComponent potion) { wrapperContained.applyLingeringPotion(potion.wrapperContained); }
// public void applySplashPotion(java.lang.Iterable effects,yarnwrap.entity.Entity entity) { wrapperContained.applySplashPotion(effects,entity.wrapperContained); }
// public void extinguishFire(yarnwrap.util.math.BlockPos pos) { wrapperContained.extinguishFire(pos.wrapperContained); }
// public void applyWater() { wrapperContained.applyWater(); }
// public boolean isLingering() { return wrapperContained.isLingering(); }

}