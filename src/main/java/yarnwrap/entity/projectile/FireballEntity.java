package yarnwrap.entity.projectile;
public class FireballEntity { public net.minecraft.entity.projectile.FireballEntity wrapperContained; public FireballEntity(net.minecraft.entity.projectile.FireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int explosionPower() { return wrapperContained.explosionPower; }
// public void explosionPower(int value) { wrapperContained.explosionPower = value; }

}