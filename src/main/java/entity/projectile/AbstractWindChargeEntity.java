package yarnwrap.entity.projectile;
public class AbstractWindChargeEntity { public net.minecraft.entity.projectile.AbstractWindChargeEntity wrapperContained; public AbstractWindChargeEntity(net.minecraft.entity.projectile.AbstractWindChargeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.explosion.ExplosionBehavior EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.EXPLOSION_BEHAVIOR); }
// public void createExplosion(yarnwrap.util.math.Vec3d pos) { wrapperContained.createExplosion(pos.wrapperContained); }

}