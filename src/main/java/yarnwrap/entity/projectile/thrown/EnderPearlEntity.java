package yarnwrap.entity.projectile.thrown;
public class EnderPearlEntity { public net.minecraft.entity.projectile.thrown.EnderPearlEntity wrapperContained; public EnderPearlEntity(net.minecraft.entity.projectile.thrown.EnderPearlEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public EnderPearlEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.EnderPearlEntity(world.wrapperContained,owner.wrapperContained); }
// public void playTeleportSound(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos) { wrapperContained.playTeleportSound(world.wrapperContained,pos.wrapperContained); }
// public static void playTeleportSound(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.projectile.thrown.EnderPearlEntity.playTeleportSound(world.wrapperContained,pos.wrapperContained); }
// public boolean canTeleportEntityTo(yarnwrap.entity.Entity entity,yarnwrap.world.World world) { return wrapperContained.canTeleportEntityTo(entity.wrapperContained,world.wrapperContained); }
// public static boolean canTeleportEntityTo(yarnwrap.entity.Entity entity,yarnwrap.world.World world, ) { return net.minecraft.entity.projectile.thrown.EnderPearlEntity.canTeleportEntityTo(entity.wrapperContained,world.wrapperContained); }

}