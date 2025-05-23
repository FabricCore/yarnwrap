package yarnwrap.entity.projectile;
public class FireballEntity { public net.minecraft.entity.projectile.FireballEntity wrapperContained; public FireballEntity(net.minecraft.entity.projectile.FireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int explosionPower() { return wrapperContained.explosionPower; }
// public void explosionPower(int value) { wrapperContained.explosionPower = value; }
// public static int explosionPower() { return net.minecraft.entity.projectile.FireballEntity.explosionPower; }
// public static void explosionPower(int value, ) { net.minecraft.entity.projectile.FireballEntity.explosionPower = value; }

// public byte DEFAULT_EXPLOSION_POWER() { return wrapperContained.DEFAULT_EXPLOSION_POWER; }
// public void DEFAULT_EXPLOSION_POWER(byte value) { wrapperContained.DEFAULT_EXPLOSION_POWER = value; }
// public static byte DEFAULT_EXPLOSION_POWER() { return net.minecraft.entity.projectile.FireballEntity.DEFAULT_EXPLOSION_POWER; }
// public static void DEFAULT_EXPLOSION_POWER(byte value, ) { net.minecraft.entity.projectile.FireballEntity.DEFAULT_EXPLOSION_POWER = value; }

public FireballEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity,int explosionPower) { this.wrapperContained = new net.minecraft.entity.projectile.FireballEntity(world.wrapperContained,owner.wrapperContained,velocity.wrapperContained,explosionPower); }

}