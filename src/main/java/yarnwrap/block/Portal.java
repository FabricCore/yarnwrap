package yarnwrap.block;
public class Portal { public net.minecraft.block.Portal wrapperContained; public Portal(net.minecraft.block.Portal wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.TeleportTarget createTeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.TeleportTarget(wrapperContained.createTeleportTarget(world.wrapperContained,entity.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.world.TeleportTarget createTeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.block.Portal.createTeleportTarget(world.wrapperContained,entity.wrapperContained,pos.wrapperContained)); }
public int getPortalDelay(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { return wrapperContained.getPortalDelay(world.wrapperContained,entity.wrapperContained); }
// public static int getPortalDelay(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity, ) { return net.minecraft.block.Portal.getPortalDelay(world.wrapperContained,entity.wrapperContained); }
public Object getPortalEffect() { return wrapperContained.getPortalEffect(); }
// public static Object getPortalEffect() { return net.minecraft.block.Portal.getPortalEffect(); }

}