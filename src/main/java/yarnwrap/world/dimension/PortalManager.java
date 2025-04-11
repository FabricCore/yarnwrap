package yarnwrap.world.dimension;
public class PortalManager { public net.minecraft.world.dimension.PortalManager wrapperContained; public PortalManager(net.minecraft.world.dimension.PortalManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Portal portal() { return new yarnwrap.block.Portal(wrapperContained.portal); }
// public void portal(yarnwrap.block.Portal value) { wrapperContained.portal = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public int ticksInPortal() { return wrapperContained.ticksInPortal; }
// public void ticksInPortal(int value) { wrapperContained.ticksInPortal = value; }
// public boolean inPortal() { return wrapperContained.inPortal; }
// public void inPortal(boolean value) { wrapperContained.inPortal = value; }
public PortalManager(yarnwrap.block.Portal portal,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.world.dimension.PortalManager(portal.wrapperContained,pos.wrapperContained); }
public Object getEffect() { return wrapperContained.getEffect(); }
public yarnwrap.world.TeleportTarget createTeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { return new yarnwrap.world.TeleportTarget(wrapperContained.createTeleportTarget(world.wrapperContained,entity.wrapperContained)); }
public boolean tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,boolean canUsePortals) { return wrapperContained.tick(world.wrapperContained,entity.wrapperContained,canUsePortals); }
public boolean portalMatches(yarnwrap.block.Portal portal) { return wrapperContained.portalMatches(portal.wrapperContained); }
public void setPortalPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setPortalPos(pos.wrapperContained); }
public void setInPortal(boolean inPortal) { wrapperContained.setInPortal(inPortal); }
public boolean hasExpired() { return wrapperContained.hasExpired(); }
public yarnwrap.util.math.BlockPos getPortalPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPortalPos()); }
public int getTicksInPortal() { return wrapperContained.getTicksInPortal(); }
public boolean isInPortal() { return wrapperContained.isInPortal(); }
// public void decayTicksInPortal() { wrapperContained.decayTicksInPortal(); }

}