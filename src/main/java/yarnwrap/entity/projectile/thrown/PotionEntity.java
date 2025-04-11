package yarnwrap.entity.projectile.thrown;
public class PotionEntity { public net.minecraft.entity.projectile.thrown.PotionEntity wrapperContained; public PotionEntity(net.minecraft.entity.projectile.thrown.PotionEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate AFFECTED_BY_WATER() { return wrapperContained.AFFECTED_BY_WATER; }
// public void AFFECTED_BY_WATER(java.util.function.Predicate value) { wrapperContained.AFFECTED_BY_WATER = value; }
public PotionEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.PotionEntity(world.wrapperContained,x,y,z); }
public PotionEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.PotionEntity(world.wrapperContained,owner.wrapperContained); }
// public boolean method_46401(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_46401(entity.wrapperContained); }
// public int method_48575(double duration) { return wrapperContained.method_48575(duration); }
// public void applyLingeringPotion(yarnwrap.component.type.PotionContentsComponent potion) { wrapperContained.applyLingeringPotion(potion.wrapperContained); }
// public void applySplashPotion(java.lang.Iterable effects,yarnwrap.entity.Entity entity) { wrapperContained.applySplashPotion(effects,entity.wrapperContained); }
// public void extinguishFire(yarnwrap.util.math.BlockPos pos) { wrapperContained.extinguishFire(pos.wrapperContained); }
// public void applyWater() { wrapperContained.applyWater(); }
// public boolean isLingering() { return wrapperContained.isLingering(); }

}