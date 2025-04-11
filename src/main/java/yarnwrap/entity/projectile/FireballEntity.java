package yarnwrap.entity.projectile;
public class FireballEntity { public net.minecraft.entity.projectile.FireballEntity wrapperContained; public FireballEntity(net.minecraft.entity.projectile.FireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int explosionPower() { return wrapperContained.explosionPower; }
// public void explosionPower(int value) { wrapperContained.explosionPower = value; }
public FireballEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity,int explosionPower) { this.wrapperContained = new net.minecraft.entity.projectile.FireballEntity(world.wrapperContained,owner.wrapperContained,velocity.wrapperContained,explosionPower); }

}