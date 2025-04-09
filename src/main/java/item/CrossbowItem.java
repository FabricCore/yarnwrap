package yarnwrap.item;
public class CrossbowItem { public net.minecraft.item.CrossbowItem wrapperContained; public CrossbowItem(net.minecraft.item.CrossbowItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int RANGE() { return wrapperContained.RANGE; }
// public float DEFAULT_PULL_TIME() { return wrapperContained.DEFAULT_PULL_TIME; }
// public float CHARGE_PROGRESS() { return wrapperContained.CHARGE_PROGRESS; }
// public float LOAD_PROGRESS() { return wrapperContained.LOAD_PROGRESS; }
// public float DEFAULT_SPEED() { return wrapperContained.DEFAULT_SPEED; }
// public float FIREWORK_ROCKET_SPEED() { return wrapperContained.FIREWORK_ROCKET_SPEED; }
// public Object DEFAULT_LOADING_SOUNDS() { return wrapperContained.DEFAULT_LOADING_SOUNDS; }
// public boolean loaded() { return wrapperContained.loaded; }
// public boolean charged() { return wrapperContained.charged; }
// public float getSpeed(yarnwrap.component.type.ChargedProjectilesComponent stack) { return wrapperContained.getSpeed(stack.wrapperContained); }
// public float getSoundPitch(yarnwrap.util.math.random.Random random,int index) { return wrapperContained.getSoundPitch(random.wrapperContained,index); }
// public org.joml.Vector3f calcVelocity(yarnwrap.entity.LivingEntity shooter,yarnwrap.util.math.Vec3d direction,float yaw) { return wrapperContained.calcVelocity(shooter.wrapperContained,direction.wrapperContained,yaw); }
// public Object getLoadingSounds(yarnwrap.item.ItemStack stack) { return wrapperContained.getLoadingSounds(stack.wrapperContained); }
// public boolean loadProjectiles(yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack crossbow) { return wrapperContained.loadProjectiles(shooter.wrapperContained,crossbow.wrapperContained); }
// public float getPullProgress(int useTicks,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getPullProgress(useTicks,stack.wrapperContained,user.wrapperContained); }
public int getPullTime(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getPullTime(stack.wrapperContained,user.wrapperContained); }
public void shootAll(yarnwrap.world.World world,yarnwrap.entity.LivingEntity shooter,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,float speed,float divergence,yarnwrap.entity.LivingEntity target) { wrapperContained.shootAll(world.wrapperContained,shooter.wrapperContained,hand.wrapperContained,stack.wrapperContained,speed,divergence,target.wrapperContained); }
public boolean isCharged(yarnwrap.item.ItemStack stack) { return wrapperContained.isCharged(stack.wrapperContained); }
// public float getSoundPitch(boolean flag,yarnwrap.util.math.random.Random random) { return wrapperContained.getSoundPitch(flag,random.wrapperContained); }

}