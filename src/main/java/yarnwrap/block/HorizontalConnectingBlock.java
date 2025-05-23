package yarnwrap.block;
public class HorizontalConnectingBlock { public net.minecraft.block.HorizontalConnectingBlock wrapperContained; public HorizontalConnectingBlock(net.minecraft.block.HorizontalConnectingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HorizontalConnectingBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HorizontalConnectingBlock.WATERLOGGED = value.wrapperContained; }

// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
public static java.util.Map FACING_PROPERTIES() { return net.minecraft.block.HorizontalConnectingBlock.FACING_PROPERTIES; }
// public static void FACING_PROPERTIES(java.util.Map value, ) { net.minecraft.block.HorizontalConnectingBlock.FACING_PROPERTIES = value; }

// public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HorizontalConnectingBlock.WEST); }
// public static void WEST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HorizontalConnectingBlock.WEST = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HorizontalConnectingBlock.SOUTH); }
// public static void SOUTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HorizontalConnectingBlock.SOUTH = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HorizontalConnectingBlock.NORTH); }
// public static void NORTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HorizontalConnectingBlock.NORTH = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HorizontalConnectingBlock.EAST); }
// public static void EAST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HorizontalConnectingBlock.EAST = value.wrapperContained; }

// public java.util.function.Function collisionShapeFunction() { return wrapperContained.collisionShapeFunction; }
// public void collisionShapeFunction(java.util.function.Function value) { wrapperContained.collisionShapeFunction = value; }
// public static java.util.function.Function collisionShapeFunction() { return net.minecraft.block.HorizontalConnectingBlock.collisionShapeFunction; }
// public static void collisionShapeFunction(java.util.function.Function value, ) { net.minecraft.block.HorizontalConnectingBlock.collisionShapeFunction = value; }

// public java.util.function.Function outlineShapeFunction() { return wrapperContained.outlineShapeFunction; }
// public void outlineShapeFunction(java.util.function.Function value) { wrapperContained.outlineShapeFunction = value; }
// public static java.util.function.Function outlineShapeFunction() { return net.minecraft.block.HorizontalConnectingBlock.outlineShapeFunction; }
// public static void outlineShapeFunction(java.util.function.Function value, ) { net.minecraft.block.HorizontalConnectingBlock.outlineShapeFunction = value; }

// public HorizontalConnectingBlock(float radius1,float radius2,float boundingHeight1,float boundingHeight2,float collisionHeight,Object settings) { this.wrapperContained = new net.minecraft.block.HorizontalConnectingBlock(radius1,radius2,boundingHeight1,boundingHeight2,collisionHeight,settings); }
// public java.util.function.Function createShapeFunction(float radius1,float radius2,float height1,float offset2,float height2) { return wrapperContained.createShapeFunction(radius1,radius2,height1,offset2,height2); }
// public static java.util.function.Function createShapeFunction(float radius1,float radius2,float height1,float offset2,float height2, ) { return net.minecraft.block.HorizontalConnectingBlock.createShapeFunction(radius1,radius2,height1,offset2,height2); }
// public boolean method_9986(Object entry) { return wrapperContained.method_9986(entry); }
// public static boolean method_9986(Object entry, ) { return net.minecraft.block.HorizontalConnectingBlock.method_9986(entry); }
// public yarnwrap.util.shape.VoxelShape method_66428(yarnwrap.util.shape.VoxelShape state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66428(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66428(yarnwrap.util.shape.VoxelShape state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HorizontalConnectingBlock.method_66428(state.wrapperContained)); }

}