package yarnwrap.entity;
public class CrossbowUser { public net.minecraft.entity.CrossbowUser wrapperContained; public CrossbowUser(net.minecraft.entity.CrossbowUser wrapperContained) { this.wrapperContained = wrapperContained; }

public void postShoot() { wrapperContained.postShoot(); }
public void shoot(yarnwrap.entity.LivingEntity entity,float speed) { wrapperContained.shoot(entity.wrapperContained,speed); }
public yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTarget()); }
public void setCharging(boolean charging) { wrapperContained.setCharging(charging); }

}