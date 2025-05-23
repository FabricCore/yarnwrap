package yarnwrap.entity.projectile.thrown;
public class EnderPearlEntity { public net.minecraft.entity.projectile.thrown.EnderPearlEntity wrapperContained; public EnderPearlEntity(net.minecraft.entity.projectile.thrown.EnderPearlEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public long chunkTicketExpiryTicks() { return wrapperContained.chunkTicketExpiryTicks; }
// public void chunkTicketExpiryTicks(long value) { wrapperContained.chunkTicketExpiryTicks = value; }
// public static long chunkTicketExpiryTicks() { return net.minecraft.entity.projectile.thrown.EnderPearlEntity.chunkTicketExpiryTicks; }
// public static void chunkTicketExpiryTicks(long value, ) { net.minecraft.entity.projectile.thrown.EnderPearlEntity.chunkTicketExpiryTicks = value; }

public EnderPearlEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.EnderPearlEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
// public void playTeleportSound(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos) { wrapperContained.playTeleportSound(world.wrapperContained,pos.wrapperContained); }
// public static void playTeleportSound(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.projectile.thrown.EnderPearlEntity.playTeleportSound(world.wrapperContained,pos.wrapperContained); }
// public boolean canTeleportEntityTo(yarnwrap.entity.Entity entity,yarnwrap.world.World world) { return wrapperContained.canTeleportEntityTo(entity.wrapperContained,world.wrapperContained); }
// public static boolean canTeleportEntityTo(yarnwrap.entity.Entity entity,yarnwrap.world.World world, ) { return net.minecraft.entity.projectile.thrown.EnderPearlEntity.canTeleportEntityTo(entity.wrapperContained,world.wrapperContained); }
// public void removeFromOwner() { wrapperContained.removeFromOwner(); }
// public static void removeFromOwner() { net.minecraft.entity.projectile.thrown.EnderPearlEntity.removeFromOwner(); }
// public void addToOwner() { wrapperContained.addToOwner(); }
// public static void addToOwner() { net.minecraft.entity.projectile.thrown.EnderPearlEntity.addToOwner(); }
// public yarnwrap.entity.Entity resolveOwner(yarnwrap.server.world.ServerWorld world,java.util.UUID uuid) { return new yarnwrap.entity.Entity(wrapperContained.resolveOwner(world.wrapperContained,uuid)); }
// public static yarnwrap.entity.Entity resolveOwner(yarnwrap.server.world.ServerWorld world,java.util.UUID uuid, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.projectile.thrown.EnderPearlEntity.resolveOwner(world.wrapperContained,uuid)); }
// public yarnwrap.entity.Entity method_71626(yarnwrap.server.world.ServerWorld uuid) { return new yarnwrap.entity.Entity(wrapperContained.method_71626(uuid.wrapperContained)); }
// public static yarnwrap.entity.Entity method_71626(yarnwrap.server.world.ServerWorld uuid, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.projectile.thrown.EnderPearlEntity.method_71626(uuid.wrapperContained)); }

}