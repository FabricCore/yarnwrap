package yarnwrap.world.dimension;
public class PortalForcer { public net.minecraft.world.dimension.PortalForcer wrapperContained; public PortalForcer(net.minecraft.world.dimension.PortalForcer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.dimension.PortalForcer.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.dimension.PortalForcer.world = value.wrapperContained; }

public PortalForcer(yarnwrap.server.world.ServerWorld world) { this.wrapperContained = new net.minecraft.world.dimension.PortalForcer(world.wrapperContained); }
// public boolean method_22389(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_22389(poiType.wrapperContained); }
// public static boolean method_22389(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.world.dimension.PortalForcer.method_22389(poiType.wrapperContained); }
// public boolean isValidPortalPos(yarnwrap.util.math.BlockPos pos,Object temp,yarnwrap.util.math.Direction portalDirection,int distanceOrthogonalToPortal) { return wrapperContained.isValidPortalPos(pos.wrapperContained,temp,portalDirection.wrapperContained,distanceOrthogonalToPortal); }
// public static boolean isValidPortalPos(yarnwrap.util.math.BlockPos pos,Object temp,yarnwrap.util.math.Direction portalDirection,int distanceOrthogonalToPortal, ) { return net.minecraft.world.dimension.PortalForcer.isValidPortalPos(pos.wrapperContained,temp,portalDirection.wrapperContained,distanceOrthogonalToPortal); }
// public java.util.Optional createPortal(yarnwrap.util.math.BlockPos pos,Object axis) { return wrapperContained.createPortal(pos.wrapperContained,axis); }
// public static java.util.Optional createPortal(yarnwrap.util.math.BlockPos pos,Object axis, ) { return net.minecraft.world.dimension.PortalForcer.createPortal(pos.wrapperContained,axis); }
public java.util.Optional getPortalPos(yarnwrap.util.math.BlockPos pos,boolean destIsNether,yarnwrap.world.border.WorldBorder worldBorder) { return wrapperContained.getPortalPos(pos.wrapperContained,destIsNether,worldBorder.wrapperContained); }
// public static java.util.Optional getPortalPos(yarnwrap.util.math.BlockPos pos,boolean destIsNether,yarnwrap.world.border.WorldBorder worldBorder, ) { return net.minecraft.world.dimension.PortalForcer.getPortalPos(pos.wrapperContained,destIsNether,worldBorder.wrapperContained); }
// public boolean isBlockStateValid(Object pos) { return wrapperContained.isBlockStateValid(pos); }
// public static boolean isBlockStateValid(Object pos, ) { return net.minecraft.world.dimension.PortalForcer.isBlockStateValid(pos); }
// public boolean method_61028(yarnwrap.util.math.BlockPos portalPos) { return wrapperContained.method_61028(portalPos.wrapperContained); }
// public static boolean method_61028(yarnwrap.util.math.BlockPos portalPos, ) { return net.minecraft.world.dimension.PortalForcer.method_61028(portalPos.wrapperContained); }
// public double method_61029(yarnwrap.util.math.BlockPos portalPos) { return wrapperContained.method_61029(portalPos.wrapperContained); }
// public static double method_61029(yarnwrap.util.math.BlockPos portalPos, ) { return net.minecraft.world.dimension.PortalForcer.method_61029(portalPos.wrapperContained); }

}