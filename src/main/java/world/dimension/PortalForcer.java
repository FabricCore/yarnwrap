package yarnwrap.world.dimension;
public class PortalForcer { public net.minecraft.world.dimension.PortalForcer wrapperContained; public PortalForcer(net.minecraft.world.dimension.PortalForcer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public boolean isValidPortalPos(yarnwrap.util.math.BlockPos pos,Object temp,yarnwrap.util.math.Direction portalDirection,int distanceOrthogonalToPortal) { return wrapperContained.isValidPortalPos(pos.wrapperContained,temp,portalDirection.wrapperContained,distanceOrthogonalToPortal); }
// public java.util.Optional createPortal(yarnwrap.util.math.BlockPos pos,Object axis) { return wrapperContained.createPortal(pos.wrapperContained,axis); }
public java.util.Optional getPortalPos(yarnwrap.util.math.BlockPos pos,boolean destIsNether,yarnwrap.world.border.WorldBorder worldBorder) { return wrapperContained.getPortalPos(pos.wrapperContained,destIsNether,worldBorder.wrapperContained); }
// public boolean isBlockStateValid(Object pos) { return wrapperContained.isBlockStateValid(pos); }

}