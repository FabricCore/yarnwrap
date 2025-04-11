package yarnwrap.world.dimension;
public class NetherPortal { public net.minecraft.world.dimension.NetherPortal wrapperContained; public NetherPortal(net.minecraft.world.dimension.NetherPortal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int foundPortalBlocks() { return wrapperContained.foundPortalBlocks; }
// public void foundPortalBlocks(int value) { wrapperContained.foundPortalBlocks = value; }
// public yarnwrap.util.math.Direction negativeDir() { return new yarnwrap.util.math.Direction(wrapperContained.negativeDir); }
// public void negativeDir(yarnwrap.util.math.Direction value) { wrapperContained.negativeDir = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos lowerCorner() { return new yarnwrap.util.math.BlockPos(wrapperContained.lowerCorner); }
// public void lowerCorner(yarnwrap.util.math.BlockPos value) { wrapperContained.lowerCorner = value.wrapperContained; }
// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// public yarnwrap.world.WorldAccess world() { return new yarnwrap.world.WorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.WorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public Object IS_VALID_FRAME_BLOCK() { return wrapperContained.IS_VALID_FRAME_BLOCK; }
// // public void IS_VALID_FRAME_BLOCK(Object value) { wrapperContained.IS_VALID_FRAME_BLOCK = value; }
public int MAX_WIDTH() { return wrapperContained.MAX_WIDTH; }
// public void MAX_WIDTH(int value) { wrapperContained.MAX_WIDTH = value; }
public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
// public void MAX_HEIGHT(int value) { wrapperContained.MAX_HEIGHT = value; }
// public int MIN_WIDTH() { return wrapperContained.MIN_WIDTH; }
// public void MIN_WIDTH(int value) { wrapperContained.MIN_WIDTH = value; }
// public int MIN_HEIGHT() { return wrapperContained.MIN_HEIGHT; }
// public void MIN_HEIGHT(int value) { wrapperContained.MIN_HEIGHT = value; }
// public float FALLBACK_THRESHOLD() { return wrapperContained.FALLBACK_THRESHOLD; }
// public void FALLBACK_THRESHOLD(float value) { wrapperContained.FALLBACK_THRESHOLD = value; }
// public double HEIGHT_STRETCH() { return wrapperContained.HEIGHT_STRETCH; }
// public void HEIGHT_STRETCH(double value) { wrapperContained.HEIGHT_STRETCH = value; }
// public NetherPortal(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,Object axis) { this.wrapperContained = new net.minecraft.world.dimension.NetherPortal(world.wrapperContained,pos.wrapperContained,axis); }
// public boolean validStateInsidePortal(yarnwrap.block.BlockState state) { return wrapperContained.validStateInsidePortal(state.wrapperContained); }
public boolean isValid() { return wrapperContained.isValid(); }
public boolean wasAlreadyValid() { return wrapperContained.wasAlreadyValid(); }
public void createPortal() { wrapperContained.createPortal(); }
// public java.util.Optional getNewPortal(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,Object axis) { return wrapperContained.getNewPortal(world.wrapperContained,pos.wrapperContained,axis); }
// public java.util.Optional getOrEmpty(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate validator,Object axis) { return wrapperContained.getOrEmpty(world.wrapperContained,pos.wrapperContained,validator,axis); }
// public boolean method_30487(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_30487(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void method_30488(yarnwrap.block.BlockState pos) { wrapperContained.method_30488(pos.wrapperContained); }
// public boolean method_30489(yarnwrap.world.dimension.NetherPortal areaHelper) { return wrapperContained.method_30489(areaHelper.wrapperContained); }
// public int getPotentialHeight(Object pos) { return wrapperContained.getPotentialHeight(pos); }
// public boolean isHorizontalFrameValid(Object pos,int height) { return wrapperContained.isHorizontalFrameValid(pos,height); }
// public yarnwrap.util.math.BlockPos getLowerCorner(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLowerCorner(pos.wrapperContained)); }
// public int getWidth(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getWidth(pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.math.Vec3d entityPosInPortal(Object portalRect,Object portalAxis,yarnwrap.util.math.Vec3d entityPos,yarnwrap.entity.EntityDimensions entityDimensions) { return new yarnwrap.util.math.Vec3d(wrapperContained.entityPosInPortal(portalRect,portalAxis,entityPos.wrapperContained,entityDimensions.wrapperContained)); }
// public int getWidth() { return wrapperContained.getWidth(); }
// public int getHeight() { return wrapperContained.getHeight(); }
// public yarnwrap.util.math.Vec3d method_47381(double pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_47381(pos)); }
public yarnwrap.util.math.Vec3d findOpenPosition(yarnwrap.util.math.Vec3d fallback,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityDimensions dimensions) { return new yarnwrap.util.math.Vec3d(wrapperContained.findOpenPosition(fallback.wrapperContained,world.wrapperContained,entity.wrapperContained,dimensions.wrapperContained)); }

}