package yarnwrap.entity.projectile;
public class AbstractWindChargeEntity { public net.minecraft.entity.projectile.AbstractWindChargeEntity wrapperContained; public AbstractWindChargeEntity(net.minecraft.entity.projectile.AbstractWindChargeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.EXPLOSION_BEHAVIOR); }
// public void EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.EXPLOSION_BEHAVIOR = value.wrapperContained; }
public static yarnwrap.world.explosion.ExplosionBehavior EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(net.minecraft.entity.projectile.AbstractWindChargeEntity.EXPLOSION_BEHAVIOR); }
// public static void EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value, ) { net.minecraft.entity.projectile.AbstractWindChargeEntity.EXPLOSION_BEHAVIOR = value.wrapperContained; }

// public AbstractWindChargeEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.entity.Entity owner,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.projectile.AbstractWindChargeEntity(type.wrapperContained,world.wrapperContained,owner.wrapperContained,x,y,z); }
// public void createExplosion(yarnwrap.util.math.Vec3d pos) { wrapperContained.createExplosion(pos.wrapperContained); }
// public static void createExplosion(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.projectile.AbstractWindChargeEntity.createExplosion(pos.wrapperContained); }

}