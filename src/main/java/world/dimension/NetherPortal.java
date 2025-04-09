package yarnwrap.world.dimension;
public class NetherPortal { public net.minecraft.world.dimension.NetherPortal wrapperContained; public NetherPortal(net.minecraft.world.dimension.NetherPortal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
// public int foundPortalBlocks() { return wrapperContained.foundPortalBlocks; }
// public yarnwrap.util.math.Direction negativeDir() { return new yarnwrap.util.math.Direction(wrapperContained.negativeDir); }
// public yarnwrap.util.math.BlockPos lowerCorner() { return new yarnwrap.util.math.BlockPos(wrapperContained.lowerCorner); }
// public Object axis() { return wrapperContained.axis; }
// public yarnwrap.world.WorldAccess world() { return new yarnwrap.world.WorldAccess(wrapperContained.world); }
// public Object IS_VALID_FRAME_BLOCK() { return wrapperContained.IS_VALID_FRAME_BLOCK; }
public int MAX_WIDTH() { return wrapperContained.MAX_WIDTH; }
public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
// public int MIN_WIDTH() { return wrapperContained.MIN_WIDTH; }
// public int MIN_HEIGHT() { return wrapperContained.MIN_HEIGHT; }
// public float FALLBACK_THRESHOLD() { return wrapperContained.FALLBACK_THRESHOLD; }
// public double HEIGHT_STRETCH() { return wrapperContained.HEIGHT_STRETCH; }
// public boolean validStateInsidePortal(yarnwrap.block.BlockState state) { return wrapperContained.validStateInsidePortal(state.wrapperContained); }
public boolean isValid() { return wrapperContained.isValid(); }
public boolean wasAlreadyValid() { return wrapperContained.wasAlreadyValid(); }
public void createPortal() { wrapperContained.createPortal(); }
// public java.util.Optional getNewPortal(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,Object axis) { return wrapperContained.getNewPortal(world.wrapperContained,pos.wrapperContained,axis); }
// public java.util.Optional getOrEmpty(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate validator,Object axis) { return wrapperContained.getOrEmpty(world.wrapperContained,pos.wrapperContained,validator,axis); }
// public int getPotentialHeight(Object pos) { return wrapperContained.getPotentialHeight(pos); }
// public boolean isHorizontalFrameValid(Object pos,int height) { return wrapperContained.isHorizontalFrameValid(pos,height); }
// public yarnwrap.util.math.BlockPos getLowerCorner(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLowerCorner(pos.wrapperContained)); }
// public int getWidth(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getWidth(pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.math.Vec3d entityPosInPortal(Object portalRect,Object portalAxis,yarnwrap.util.math.Vec3d entityPos,yarnwrap.entity.EntityDimensions entityDimensions) { return new yarnwrap.util.math.Vec3d(wrapperContained.entityPosInPortal(portalRect,portalAxis,entityPos.wrapperContained,entityDimensions.wrapperContained)); }
// public int getWidth() { return wrapperContained.getWidth(); }
// public int getHeight() { return wrapperContained.getHeight(); }
public yarnwrap.util.math.Vec3d findOpenPosition(yarnwrap.util.math.Vec3d fallback,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityDimensions dimensions) { return new yarnwrap.util.math.Vec3d(wrapperContained.findOpenPosition(fallback.wrapperContained,world.wrapperContained,entity.wrapperContained,dimensions.wrapperContained)); }

}