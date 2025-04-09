package yarnwrap.entity.projectile;
public class FireballEntity { public net.minecraft.entity.projectile.FireballEntity wrapperContained; public FireballEntity(net.minecraft.entity.projectile.FireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int explosionPower() { return wrapperContained.explosionPower; }

}