package yarnwrap.entity.projectile.thrown;
public class EggEntity { public net.minecraft.entity.projectile.thrown.EggEntity wrapperContained; public EggEntity(net.minecraft.entity.projectile.thrown.EggEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions EMPTY_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.EMPTY_DIMENSIONS); }
// public void EMPTY_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.EMPTY_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions EMPTY_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.projectile.thrown.EggEntity.EMPTY_DIMENSIONS); }
// public static void EMPTY_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.projectile.thrown.EggEntity.EMPTY_DIMENSIONS = value.wrapperContained; }

public EggEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.EggEntity(world.wrapperContained,x,y,z); }
public EggEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.EggEntity(world.wrapperContained,owner.wrapperContained); }

}