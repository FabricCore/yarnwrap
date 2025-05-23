package yarnwrap.block;
public class Segmented { public net.minecraft.block.Segmented wrapperContained; public Segmented(net.minecraft.block.Segmented wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SEGMENTS_PER_PLACEMENT() { return wrapperContained.SEGMENTS_PER_PLACEMENT; }
// public void SEGMENTS_PER_PLACEMENT(int value) { wrapperContained.SEGMENTS_PER_PLACEMENT = value; }
public static int SEGMENTS_PER_PLACEMENT() { return net.minecraft.block.Segmented.SEGMENTS_PER_PLACEMENT; }
// public static void SEGMENTS_PER_PLACEMENT(int value, ) { net.minecraft.block.Segmented.SEGMENTS_PER_PLACEMENT = value; }

// public int MAX_SEGMENTS() { return wrapperContained.MAX_SEGMENTS; }
// public void MAX_SEGMENTS(int value) { wrapperContained.MAX_SEGMENTS = value; }
public static int MAX_SEGMENTS() { return net.minecraft.block.Segmented.MAX_SEGMENTS; }
// public static void MAX_SEGMENTS(int value, ) { net.minecraft.block.Segmented.MAX_SEGMENTS = value; }

// public yarnwrap.state.property.IntProperty SEGMENT_AMOUNT() { return new yarnwrap.state.property.IntProperty(wrapperContained.SEGMENT_AMOUNT); }
// public void SEGMENT_AMOUNT(yarnwrap.state.property.IntProperty value) { wrapperContained.SEGMENT_AMOUNT = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty SEGMENT_AMOUNT() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.Segmented.SEGMENT_AMOUNT); }
// public static void SEGMENT_AMOUNT(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.Segmented.SEGMENT_AMOUNT = value.wrapperContained; }

public double getHeight() { return wrapperContained.getHeight(); }
// public static double getHeight() { return net.minecraft.block.Segmented.getHeight(); }
public yarnwrap.state.property.IntProperty getAmountProperty() { return new yarnwrap.state.property.IntProperty(wrapperContained.getAmountProperty()); }
// public static yarnwrap.state.property.IntProperty getAmountProperty() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.Segmented.getAmountProperty()); }
public yarnwrap.block.BlockState getPlacementState(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.Block block,yarnwrap.state.property.IntProperty amountProperty,yarnwrap.state.property.EnumProperty directionProperty) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementState(context.wrapperContained,block.wrapperContained,amountProperty.wrapperContained,directionProperty.wrapperContained)); }
// public static yarnwrap.block.BlockState getPlacementState(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.Block block,yarnwrap.state.property.IntProperty amountProperty,yarnwrap.state.property.EnumProperty directionProperty, ) { return new yarnwrap.block.BlockState(net.minecraft.block.Segmented.getPlacementState(context.wrapperContained,block.wrapperContained,amountProperty.wrapperContained,directionProperty.wrapperContained)); }
public boolean shouldAddSegment(yarnwrap.block.BlockState state,yarnwrap.item.ItemPlacementContext context,yarnwrap.state.property.IntProperty property) { return wrapperContained.shouldAddSegment(state.wrapperContained,context.wrapperContained,property.wrapperContained); }
// public static boolean shouldAddSegment(yarnwrap.block.BlockState state,yarnwrap.item.ItemPlacementContext context,yarnwrap.state.property.IntProperty property, ) { return net.minecraft.block.Segmented.shouldAddSegment(state.wrapperContained,context.wrapperContained,property.wrapperContained); }
public java.util.function.Function createShapeFunction(yarnwrap.state.property.EnumProperty directionProperty,yarnwrap.state.property.IntProperty segmentAmountProperty) { return wrapperContained.createShapeFunction(directionProperty.wrapperContained,segmentAmountProperty.wrapperContained); }
// public static java.util.function.Function createShapeFunction(yarnwrap.state.property.EnumProperty directionProperty,yarnwrap.state.property.IntProperty segmentAmountProperty, ) { return net.minecraft.block.Segmented.createShapeFunction(directionProperty.wrapperContained,segmentAmountProperty.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66466(yarnwrap.state.property.EnumProperty state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66466(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66466(yarnwrap.state.property.EnumProperty state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.Segmented.method_66466(state.wrapperContained)); }

}