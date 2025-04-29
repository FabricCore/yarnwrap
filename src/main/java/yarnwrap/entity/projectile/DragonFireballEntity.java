package yarnwrap.entity.projectile;
public class DragonFireballEntity { public net.minecraft.entity.projectile.DragonFireballEntity wrapperContained; public DragonFireballEntity(net.minecraft.entity.projectile.DragonFireballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float DAMAGE_RANGE() { return wrapperContained.DAMAGE_RANGE; }
// public void DAMAGE_RANGE(float value) { wrapperContained.DAMAGE_RANGE = value; }
public static float DAMAGE_RANGE() { return net.minecraft.entity.projectile.DragonFireballEntity.DAMAGE_RANGE; }
// public static void DAMAGE_RANGE(float value, ) { net.minecraft.entity.projectile.DragonFireballEntity.DAMAGE_RANGE = value; }

public DragonFireballEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.entity.projectile.DragonFireballEntity(world.wrapperContained,owner.wrapperContained,velocity.wrapperContained); }

}