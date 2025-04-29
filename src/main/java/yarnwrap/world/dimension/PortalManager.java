package yarnwrap.world.dimension;
public class PortalManager { public net.minecraft.world.dimension.PortalManager wrapperContained; public PortalManager(net.minecraft.world.dimension.PortalManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Portal portal() { return new yarnwrap.block.Portal(wrapperContained.portal); }
// public void portal(yarnwrap.block.Portal value) { wrapperContained.portal = value.wrapperContained; }
// public static yarnwrap.block.Portal portal() { return new yarnwrap.block.Portal(net.minecraft.world.dimension.PortalManager.portal); }
// public static void portal(yarnwrap.block.Portal value, ) { net.minecraft.world.dimension.PortalManager.portal = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.dimension.PortalManager.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.dimension.PortalManager.pos = value.wrapperContained; }

// public int ticksInPortal() { return wrapperContained.ticksInPortal; }
// public void ticksInPortal(int value) { wrapperContained.ticksInPortal = value; }
// public static int ticksInPortal() { return net.minecraft.world.dimension.PortalManager.ticksInPortal; }
// public static void ticksInPortal(int value, ) { net.minecraft.world.dimension.PortalManager.ticksInPortal = value; }

// public boolean inPortal() { return wrapperContained.inPortal; }
// public void inPortal(boolean value) { wrapperContained.inPortal = value; }
// public static boolean inPortal() { return net.minecraft.world.dimension.PortalManager.inPortal; }
// public static void inPortal(boolean value, ) { net.minecraft.world.dimension.PortalManager.inPortal = value; }

public PortalManager(yarnwrap.block.Portal portal,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.world.dimension.PortalManager(portal.wrapperContained,pos.wrapperContained); }
public Object getEffect() { return wrapperContained.getEffect(); }
// public static Object getEffect() { return net.minecraft.world.dimension.PortalManager.getEffect(); }
public yarnwrap.world.TeleportTarget createTeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { return new yarnwrap.world.TeleportTarget(wrapperContained.createTeleportTarget(world.wrapperContained,entity.wrapperContained)); }
// public static yarnwrap.world.TeleportTarget createTeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.world.dimension.PortalManager.createTeleportTarget(world.wrapperContained,entity.wrapperContained)); }
public boolean tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,boolean canUsePortals) { return wrapperContained.tick(world.wrapperContained,entity.wrapperContained,canUsePortals); }
// public static boolean tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,boolean canUsePortals, ) { return net.minecraft.world.dimension.PortalManager.tick(world.wrapperContained,entity.wrapperContained,canUsePortals); }
public boolean portalMatches(yarnwrap.block.Portal portal) { return wrapperContained.portalMatches(portal.wrapperContained); }
// public static boolean portalMatches(yarnwrap.block.Portal portal, ) { return net.minecraft.world.dimension.PortalManager.portalMatches(portal.wrapperContained); }
public void setPortalPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setPortalPos(pos.wrapperContained); }
// public static void setPortalPos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.dimension.PortalManager.setPortalPos(pos.wrapperContained); }
public void setInPortal(boolean inPortal) { wrapperContained.setInPortal(inPortal); }
// public static void setInPortal(boolean inPortal, ) { net.minecraft.world.dimension.PortalManager.setInPortal(inPortal); }
public boolean hasExpired() { return wrapperContained.hasExpired(); }
// public static boolean hasExpired() { return net.minecraft.world.dimension.PortalManager.hasExpired(); }
public yarnwrap.util.math.BlockPos getPortalPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPortalPos()); }
// public static yarnwrap.util.math.BlockPos getPortalPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.dimension.PortalManager.getPortalPos()); }
public int getTicksInPortal() { return wrapperContained.getTicksInPortal(); }
// public static int getTicksInPortal() { return net.minecraft.world.dimension.PortalManager.getTicksInPortal(); }
public boolean isInPortal() { return wrapperContained.isInPortal(); }
// public static boolean isInPortal() { return net.minecraft.world.dimension.PortalManager.isInPortal(); }
// public void decayTicksInPortal() { wrapperContained.decayTicksInPortal(); }
// public static void decayTicksInPortal() { net.minecraft.world.dimension.PortalManager.decayTicksInPortal(); }

}