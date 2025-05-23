package yarnwrap.entity.projectile.thrown;
public class ThrownEntity { public net.minecraft.entity.projectile.thrown.ThrownEntity wrapperContained; public ThrownEntity(net.minecraft.entity.projectile.thrown.ThrownEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public ThrownEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.ThrownEntity(type.wrapperContained,x,y,z,world.wrapperContained); }
// public void applyDrag() { wrapperContained.applyDrag(); }
// public static void applyDrag() { net.minecraft.entity.projectile.thrown.ThrownEntity.applyDrag(); }
// public void tickInitialBubbleColumnCollision() { wrapperContained.tickInitialBubbleColumnCollision(); }
// public static void tickInitialBubbleColumnCollision() { net.minecraft.entity.projectile.thrown.ThrownEntity.tickInitialBubbleColumnCollision(); }

}