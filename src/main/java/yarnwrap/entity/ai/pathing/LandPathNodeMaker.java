package yarnwrap.entity.ai.pathing;
public class LandPathNodeMaker { public net.minecraft.entity.ai.pathing.LandPathNodeMaker wrapperContained; public LandPathNodeMaker(net.minecraft.entity.ai.pathing.LandPathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2BooleanMap collidedBoxes() { return wrapperContained.collidedBoxes; }
// public void collidedBoxes(it.unimi.dsi.fastutil.objects.Object2BooleanMap value) { wrapperContained.collidedBoxes = value; }
// public static it.unimi.dsi.fastutil.objects.Object2BooleanMap collidedBoxes() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.collidedBoxes; }
// public static void collidedBoxes(it.unimi.dsi.fastutil.objects.Object2BooleanMap value, ) { net.minecraft.entity.ai.pathing.LandPathNodeMaker.collidedBoxes = value; }

// public double Y_OFFSET() { return wrapperContained.Y_OFFSET; }
// public void Y_OFFSET(double value) { wrapperContained.Y_OFFSET = value; }
public static double Y_OFFSET() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.Y_OFFSET; }
// public static void Y_OFFSET(double value, ) { net.minecraft.entity.ai.pathing.LandPathNodeMaker.Y_OFFSET = value; }

// public double MIN_STEP_HEIGHT() { return wrapperContained.MIN_STEP_HEIGHT; }
// public void MIN_STEP_HEIGHT(double value) { wrapperContained.MIN_STEP_HEIGHT = value; }
// public static double MIN_STEP_HEIGHT() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.MIN_STEP_HEIGHT; }
// public static void MIN_STEP_HEIGHT(double value, ) { net.minecraft.entity.ai.pathing.LandPathNodeMaker.MIN_STEP_HEIGHT = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap nodeTypes() { return wrapperContained.nodeTypes; }
// public void nodeTypes(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.nodeTypes = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap nodeTypes() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.nodeTypes; }
// public static void nodeTypes(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.entity.ai.pathing.LandPathNodeMaker.nodeTypes = value; }

// public net.minecraft.entity.ai.pathing.PathNode[] successors() { return wrapperContained.successors; }
// public void successors(net.minecraft.entity.ai.pathing.PathNode[] value) { wrapperContained.successors = value; }
// public static net.minecraft.entity.ai.pathing.PathNode[] successors() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.successors; }
// public static void successors(net.minecraft.entity.ai.pathing.PathNode[] value, ) { net.minecraft.entity.ai.pathing.LandPathNodeMaker.successors = value; }

// public boolean isValidAdjacentSuccessor(yarnwrap.entity.ai.pathing.PathNode node,yarnwrap.entity.ai.pathing.PathNode successor) { return wrapperContained.isValidAdjacentSuccessor(node.wrapperContained,successor.wrapperContained); }
// public static boolean isValidAdjacentSuccessor(yarnwrap.entity.ai.pathing.PathNode node,yarnwrap.entity.ai.pathing.PathNode successor, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.isValidAdjacentSuccessor(node.wrapperContained,successor.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNodeType getLandNodeType(yarnwrap.entity.ai.pathing.PathContext context,Object pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getLandNodeType(context.wrapperContained,pos)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getLandNodeType(yarnwrap.entity.ai.pathing.PathContext context,Object pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getLandNodeType(context.wrapperContained,pos)); }
// public boolean checkBoxCollision(yarnwrap.util.math.Box box) { return wrapperContained.checkBoxCollision(box.wrapperContained); }
// public static boolean checkBoxCollision(yarnwrap.util.math.Box box, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.checkBoxCollision(box.wrapperContained); }
// public boolean method_29305(yarnwrap.util.math.Box box2) { return wrapperContained.method_29305(box2.wrapperContained); }
// public static boolean method_29305(yarnwrap.util.math.Box box2, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.method_29305(box2.wrapperContained); }
// public boolean isBlocked(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.isBlocked(node.wrapperContained); }
// public static boolean isBlocked(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.isBlocked(node.wrapperContained); }
// public boolean isValidDiagonalSuccessor(yarnwrap.entity.ai.pathing.PathNode xNode,yarnwrap.entity.ai.pathing.PathNode zNode,yarnwrap.entity.ai.pathing.PathNode xDiagNode) { return wrapperContained.isValidDiagonalSuccessor(xNode.wrapperContained,zNode.wrapperContained,xDiagNode.wrapperContained); }
// public static boolean isValidDiagonalSuccessor(yarnwrap.entity.ai.pathing.PathNode xNode,yarnwrap.entity.ai.pathing.PathNode zNode,yarnwrap.entity.ai.pathing.PathNode xDiagNode, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.isValidDiagonalSuccessor(xNode.wrapperContained,zNode.wrapperContained,xDiagNode.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getNodeType(x,y,z)); }
// public double getFeetY(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFeetY(pos.wrapperContained); }
// public static double getFeetY(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.getFeetY(pos.wrapperContained); }
// public boolean isAmphibious() { return wrapperContained.isAmphibious(); }
// public static boolean isAmphibious() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.isAmphibious(); }
// public boolean isBlocked(yarnwrap.entity.ai.pathing.PathNodeType nodeType) { return wrapperContained.isBlocked(nodeType.wrapperContained); }
// public static boolean isBlocked(yarnwrap.entity.ai.pathing.PathNodeType nodeType, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.isBlocked(nodeType.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNode getStart(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getStart(pos.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode getStart(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getStart(pos.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNode getNodeWith(int x,int y,int z,yarnwrap.entity.ai.pathing.PathNodeType type,float penalty) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNodeWith(x,y,z,type.wrapperContained,penalty)); }
// public static yarnwrap.entity.ai.pathing.PathNode getNodeWith(int x,int y,int z,yarnwrap.entity.ai.pathing.PathNodeType type,float penalty, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getNodeWith(x,y,z,type.wrapperContained,penalty)); }
// public yarnwrap.entity.ai.pathing.PathNode getBlockedNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getBlockedNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNode getBlockedNode(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getBlockedNode(x,y,z)); }
// public double getStepHeight() { return wrapperContained.getStepHeight(); }
// public static double getStepHeight() { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.getStepHeight(); }
// public boolean canPathThrough(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPathThrough(pos.wrapperContained); }
// public static boolean canPathThrough(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.canPathThrough(pos.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNode getJumpOnTopNode(int x,int y,int z,int maxYStep,double prevFeetY,yarnwrap.util.math.Direction direction,yarnwrap.entity.ai.pathing.PathNodeType nodeType,Object mutablePos) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getJumpOnTopNode(x,y,z,maxYStep,prevFeetY,direction.wrapperContained,nodeType.wrapperContained,mutablePos)); }
// public static yarnwrap.entity.ai.pathing.PathNode getJumpOnTopNode(int x,int y,int z,int maxYStep,double prevFeetY,yarnwrap.util.math.Direction direction,yarnwrap.entity.ai.pathing.PathNodeType nodeType,Object mutablePos, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getJumpOnTopNode(x,y,z,maxYStep,prevFeetY,direction.wrapperContained,nodeType.wrapperContained,mutablePos)); }
// public yarnwrap.entity.ai.pathing.PathNode getNonWaterNodeBelow(int x,int y,int z,yarnwrap.entity.ai.pathing.PathNode node) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNonWaterNodeBelow(x,y,z,node.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode getNonWaterNodeBelow(int x,int y,int z,yarnwrap.entity.ai.pathing.PathNode node, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getNonWaterNodeBelow(x,y,z,node.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNode getNodeWith(int x,int y,int z,yarnwrap.entity.ai.pathing.PathNodeType type) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNodeWith(x,y,z,type.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode getNodeWith(int x,int y,int z,yarnwrap.entity.ai.pathing.PathNodeType type, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getNodeWith(x,y,z,type.wrapperContained)); }
// public boolean isValidDiagonalSuccessor(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.isValidDiagonalSuccessor(node.wrapperContained); }
// public static boolean isValidDiagonalSuccessor(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.isValidDiagonalSuccessor(node.wrapperContained); }
public java.util.Set getCollidingNodeTypes(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z) { return wrapperContained.getCollidingNodeTypes(context.wrapperContained,x,y,z); }
// public static java.util.Set getCollidingNodeTypes(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.getCollidingNodeTypes(context.wrapperContained,x,y,z); }
// public yarnwrap.entity.ai.pathing.PathNode getOpenNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getOpenNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNode getOpenNode(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getOpenNode(x,y,z)); }
// public yarnwrap.entity.ai.pathing.PathNodeType getLandNodeType(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getLandNodeType(entity.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getLandNodeType(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getLandNodeType(entity.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNodeType getCommonNodeType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getCommonNodeType(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getCommonNodeType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getCommonNodeType(world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNodeType getNodeTypeFromNeighbors(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z,yarnwrap.entity.ai.pathing.PathNodeType fallback) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeTypeFromNeighbors(context.wrapperContained,x,y,z,fallback.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getNodeTypeFromNeighbors(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z,yarnwrap.entity.ai.pathing.PathNodeType fallback, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getNodeTypeFromNeighbors(context.wrapperContained,x,y,z,fallback.wrapperContained)); }
// public double getFeetY(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFeetY(world.wrapperContained,pos.wrapperContained); }
// public static double getFeetY(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.pathing.LandPathNodeMaker.getFeetY(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNode getPathNode(int x,int y,int z,int maxYStep,double prevFeetY,yarnwrap.util.math.Direction direction,yarnwrap.entity.ai.pathing.PathNodeType nodeType) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getPathNode(x,y,z,maxYStep,prevFeetY,direction.wrapperContained,nodeType.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode getPathNode(int x,int y,int z,int maxYStep,double prevFeetY,yarnwrap.util.math.Direction direction,yarnwrap.entity.ai.pathing.PathNodeType nodeType, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.LandPathNodeMaker.getPathNode(x,y,z,maxYStep,prevFeetY,direction.wrapperContained,nodeType.wrapperContained)); }

}