package yarnwrap.entity.projectile;
public class WindChargeEntity { public net.minecraft.entity.projectile.WindChargeEntity wrapperContained; public WindChargeEntity(net.minecraft.entity.projectile.WindChargeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.EXPLOSION_BEHAVIOR); }
// public float EXPLOSION_POWER() { return wrapperContained.EXPLOSION_POWER; }
// public int deflectCooldown() { return wrapperContained.deflectCooldown; }

}