package yarnwrap.world.dimension;
public class NetherPortal { public net.minecraft.world.dimension.NetherPortal wrapperContained; public NetherPortal(net.minecraft.world.dimension.NetherPortal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.world.dimension.NetherPortal.width; }
// public static void width(int value, ) { net.minecraft.world.dimension.NetherPortal.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.world.dimension.NetherPortal.height; }
// public static void height(int value, ) { net.minecraft.world.dimension.NetherPortal.height = value; }

// public int foundPortalBlocks() { return wrapperContained.foundPortalBlocks; }
// public void foundPortalBlocks(int value) { wrapperContained.foundPortalBlocks = value; }
// public static int foundPortalBlocks() { return net.minecraft.world.dimension.NetherPortal.foundPortalBlocks; }
// public static void foundPortalBlocks(int value, ) { net.minecraft.world.dimension.NetherPortal.foundPortalBlocks = value; }

// public yarnwrap.util.math.Direction negativeDir() { return new yarnwrap.util.math.Direction(wrapperContained.negativeDir); }
// public void negativeDir(yarnwrap.util.math.Direction value) { wrapperContained.negativeDir = value.wrapperContained; }
// public static yarnwrap.util.math.Direction negativeDir() { return new yarnwrap.util.math.Direction(net.minecraft.world.dimension.NetherPortal.negativeDir); }
// public static void negativeDir(yarnwrap.util.math.Direction value, ) { net.minecraft.world.dimension.NetherPortal.negativeDir = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos lowerCorner() { return new yarnwrap.util.math.BlockPos(wrapperContained.lowerCorner); }
// public void lowerCorner(yarnwrap.util.math.BlockPos value) { wrapperContained.lowerCorner = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos lowerCorner() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.dimension.NetherPortal.lowerCorner); }
// public static void lowerCorner(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.dimension.NetherPortal.lowerCorner = value.wrapperContained; }

// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// // public static Object axis() { return net.minecraft.world.dimension.NetherPortal.axis; }
// // public static void axis(Object value, ) { net.minecraft.world.dimension.NetherPortal.axis = value; }

// public Object IS_VALID_FRAME_BLOCK() { return wrapperContained.IS_VALID_FRAME_BLOCK; }
// // public void IS_VALID_FRAME_BLOCK(Object value) { wrapperContained.IS_VALID_FRAME_BLOCK = value; }
// // public static Object IS_VALID_FRAME_BLOCK() { return net.minecraft.world.dimension.NetherPortal.IS_VALID_FRAME_BLOCK; }
// // public static void IS_VALID_FRAME_BLOCK(Object value, ) { net.minecraft.world.dimension.NetherPortal.IS_VALID_FRAME_BLOCK = value; }

// public int MAX_WIDTH() { return wrapperContained.MAX_WIDTH; }
// public void MAX_WIDTH(int value) { wrapperContained.MAX_WIDTH = value; }
public static int MAX_WIDTH() { return net.minecraft.world.dimension.NetherPortal.MAX_WIDTH; }
// public static void MAX_WIDTH(int value, ) { net.minecraft.world.dimension.NetherPortal.MAX_WIDTH = value; }

// public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
// public void MAX_HEIGHT(int value) { wrapperContained.MAX_HEIGHT = value; }
public static int MAX_HEIGHT() { return net.minecraft.world.dimension.NetherPortal.MAX_HEIGHT; }
// public static void MAX_HEIGHT(int value, ) { net.minecraft.world.dimension.NetherPortal.MAX_HEIGHT = value; }

// public int MIN_WIDTH() { return wrapperContained.MIN_WIDTH; }
// public void MIN_WIDTH(int value) { wrapperContained.MIN_WIDTH = value; }
// public static int MIN_WIDTH() { return net.minecraft.world.dimension.NetherPortal.MIN_WIDTH; }
// public static void MIN_WIDTH(int value, ) { net.minecraft.world.dimension.NetherPortal.MIN_WIDTH = value; }

// public int MIN_HEIGHT() { return wrapperContained.MIN_HEIGHT; }
// public void MIN_HEIGHT(int value) { wrapperContained.MIN_HEIGHT = value; }
// public static int MIN_HEIGHT() { return net.minecraft.world.dimension.NetherPortal.MIN_HEIGHT; }
// public static void MIN_HEIGHT(int value, ) { net.minecraft.world.dimension.NetherPortal.MIN_HEIGHT = value; }

// public float FALLBACK_THRESHOLD() { return wrapperContained.FALLBACK_THRESHOLD; }
// public void FALLBACK_THRESHOLD(float value) { wrapperContained.FALLBACK_THRESHOLD = value; }
// public static float FALLBACK_THRESHOLD() { return net.minecraft.world.dimension.NetherPortal.FALLBACK_THRESHOLD; }
// public static void FALLBACK_THRESHOLD(float value, ) { net.minecraft.world.dimension.NetherPortal.FALLBACK_THRESHOLD = value; }

// public double HEIGHT_STRETCH() { return wrapperContained.HEIGHT_STRETCH; }
// public void HEIGHT_STRETCH(double value) { wrapperContained.HEIGHT_STRETCH = value; }
// public static double HEIGHT_STRETCH() { return net.minecraft.world.dimension.NetherPortal.HEIGHT_STRETCH; }
// public static void HEIGHT_STRETCH(double value, ) { net.minecraft.world.dimension.NetherPortal.HEIGHT_STRETCH = value; }

// public NetherPortal(Object axis,int foundPortalBlocks,yarnwrap.util.math.Direction negativeDir,yarnwrap.util.math.BlockPos lowerCorner,int width,int height) { this.wrapperContained = new net.minecraft.world.dimension.NetherPortal(axis,foundPortalBlocks,negativeDir.wrapperContained,lowerCorner.wrapperContained,width,height); }
// public boolean validStateInsidePortal(yarnwrap.block.BlockState state) { return wrapperContained.validStateInsidePortal(state.wrapperContained); }
// public static boolean validStateInsidePortal(yarnwrap.block.BlockState state, ) { return net.minecraft.world.dimension.NetherPortal.validStateInsidePortal(state.wrapperContained); }
public boolean isValid() { return wrapperContained.isValid(); }
// public static boolean isValid() { return net.minecraft.world.dimension.NetherPortal.isValid(); }
public boolean wasAlreadyValid() { return wrapperContained.wasAlreadyValid(); }
// public static boolean wasAlreadyValid() { return net.minecraft.world.dimension.NetherPortal.wasAlreadyValid(); }
public void createPortal(yarnwrap.world.WorldAccess world) { wrapperContained.createPortal(world.wrapperContained); }
// public static void createPortal(yarnwrap.world.WorldAccess world, ) { net.minecraft.world.dimension.NetherPortal.createPortal(world.wrapperContained); }
// public java.util.Optional getNewPortal(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,Object firstCheckedAxis) { return wrapperContained.getNewPortal(world.wrapperContained,pos.wrapperContained,firstCheckedAxis); }
// public static java.util.Optional getNewPortal(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,Object firstCheckedAxis, ) { return net.minecraft.world.dimension.NetherPortal.getNewPortal(world.wrapperContained,pos.wrapperContained,firstCheckedAxis); }
// public java.util.Optional getOrEmpty(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate validator,Object firstCheckedAxis) { return wrapperContained.getOrEmpty(world.wrapperContained,pos.wrapperContained,validator,firstCheckedAxis); }
// public static java.util.Optional getOrEmpty(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate validator,Object firstCheckedAxis, ) { return net.minecraft.world.dimension.NetherPortal.getOrEmpty(world.wrapperContained,pos.wrapperContained,validator,firstCheckedAxis); }
// public boolean method_30487(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_30487(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_30487(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.dimension.NetherPortal.method_30487(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean method_30489(yarnwrap.world.dimension.NetherPortal areaHelper) { return wrapperContained.method_30489(areaHelper.wrapperContained); }
// public static boolean method_30489(yarnwrap.world.dimension.NetherPortal areaHelper, ) { return net.minecraft.world.dimension.NetherPortal.method_30489(areaHelper.wrapperContained); }
// public int getPotentialHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir,Object pos,int width,org.apache.commons.lang3.mutable.MutableInt foundPortalBlocks) { return wrapperContained.getPotentialHeight(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained,pos,width,foundPortalBlocks); }
// public static int getPotentialHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir,Object pos,int width,org.apache.commons.lang3.mutable.MutableInt foundPortalBlocks, ) { return net.minecraft.world.dimension.NetherPortal.getPotentialHeight(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained,pos,width,foundPortalBlocks); }
// public boolean isHorizontalFrameValid(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction direction,Object pos,int width,int height) { return wrapperContained.isHorizontalFrameValid(world.wrapperContained,lowerCorner.wrapperContained,direction.wrapperContained,pos,width,height); }
// public static boolean isHorizontalFrameValid(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction direction,Object pos,int width,int height, ) { return net.minecraft.world.dimension.NetherPortal.isHorizontalFrameValid(world.wrapperContained,lowerCorner.wrapperContained,direction.wrapperContained,pos,width,height); }
// public yarnwrap.util.math.BlockPos getLowerCorner(yarnwrap.world.BlockView world,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos pow) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLowerCorner(world.wrapperContained,direction.wrapperContained,pow.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getLowerCorner(yarnwrap.world.BlockView world,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos pow, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.dimension.NetherPortal.getLowerCorner(world.wrapperContained,direction.wrapperContained,pow.wrapperContained)); }
// public int getWidth(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir) { return wrapperContained.getWidth(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained); }
// public static int getWidth(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir, ) { return net.minecraft.world.dimension.NetherPortal.getWidth(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained); }
// public yarnwrap.util.math.Vec3d entityPosInPortal(Object portalRect,Object portalAxis,yarnwrap.util.math.Vec3d entityPos,yarnwrap.entity.EntityDimensions entityDimensions) { return new yarnwrap.util.math.Vec3d(wrapperContained.entityPosInPortal(portalRect,portalAxis,entityPos.wrapperContained,entityDimensions.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d entityPosInPortal(Object portalRect,Object portalAxis,yarnwrap.util.math.Vec3d entityPos,yarnwrap.entity.EntityDimensions entityDimensions, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.world.dimension.NetherPortal.entityPosInPortal(portalRect,portalAxis,entityPos.wrapperContained,entityDimensions.wrapperContained)); }
// public int getValidatedWidth(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir) { return wrapperContained.getValidatedWidth(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained); }
// public static int getValidatedWidth(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir, ) { return net.minecraft.world.dimension.NetherPortal.getValidatedWidth(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained); }
// public int getHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir,int width,org.apache.commons.lang3.mutable.MutableInt foundPortalBlocks) { return wrapperContained.getHeight(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained,width,foundPortalBlocks); }
// public static int getHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos lowerCorner,yarnwrap.util.math.Direction negativeDir,int width,org.apache.commons.lang3.mutable.MutableInt foundPortalBlocks, ) { return net.minecraft.world.dimension.NetherPortal.getHeight(world.wrapperContained,lowerCorner.wrapperContained,negativeDir.wrapperContained,width,foundPortalBlocks); }
// public yarnwrap.util.math.Vec3d method_47381(double pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_47381(pos)); }
// public static yarnwrap.util.math.Vec3d method_47381(double pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.world.dimension.NetherPortal.method_47381(pos)); }
// public yarnwrap.util.math.Vec3d findOpenPosition(yarnwrap.util.math.Vec3d fallback,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityDimensions dimensions) { return new yarnwrap.util.math.Vec3d(wrapperContained.findOpenPosition(fallback.wrapperContained,world.wrapperContained,entity.wrapperContained,dimensions.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d findOpenPosition(yarnwrap.util.math.Vec3d fallback,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityDimensions dimensions, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.world.dimension.NetherPortal.findOpenPosition(fallback.wrapperContained,world.wrapperContained,entity.wrapperContained,dimensions.wrapperContained)); }
// public yarnwrap.world.dimension.NetherPortal getOnAxis(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,Object axis) { return new yarnwrap.world.dimension.NetherPortal(wrapperContained.getOnAxis(world.wrapperContained,pos.wrapperContained,axis)); }
// public static yarnwrap.world.dimension.NetherPortal getOnAxis(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,Object axis, ) { return new yarnwrap.world.dimension.NetherPortal(net.minecraft.world.dimension.NetherPortal.getOnAxis(world.wrapperContained,pos.wrapperContained,axis)); }
// public void method_64315(yarnwrap.world.WorldAccess pos) { wrapperContained.method_64315(pos.wrapperContained); }
// public static void method_64315(yarnwrap.world.WorldAccess pos, ) { net.minecraft.world.dimension.NetherPortal.method_64315(pos.wrapperContained); }

}