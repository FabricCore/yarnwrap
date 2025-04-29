package yarnwrap.entity;
public class CrossbowUser { public net.minecraft.entity.CrossbowUser wrapperContained; public CrossbowUser(net.minecraft.entity.CrossbowUser wrapperContained) { this.wrapperContained = wrapperContained; }

public void postShoot() { wrapperContained.postShoot(); }
// public static void postShoot() { net.minecraft.entity.CrossbowUser.postShoot(); }
public void shoot(yarnwrap.entity.LivingEntity entity,float speed) { wrapperContained.shoot(entity.wrapperContained,speed); }
// public static void shoot(yarnwrap.entity.LivingEntity entity,float speed, ) { net.minecraft.entity.CrossbowUser.shoot(entity.wrapperContained,speed); }
public yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTarget()); }
// public static yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.CrossbowUser.getTarget()); }
public void setCharging(boolean charging) { wrapperContained.setCharging(charging); }
// public static void setCharging(boolean charging, ) { net.minecraft.entity.CrossbowUser.setCharging(charging); }

}