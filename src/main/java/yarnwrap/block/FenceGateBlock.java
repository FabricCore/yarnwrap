package yarnwrap.block;
public class FenceGateBlock { public net.minecraft.block.FenceGateBlock wrapperContained; public FenceGateBlock(net.minecraft.block.FenceGateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.FenceGateBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.FenceGateBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty IN_WALL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.IN_WALL); }
// public void IN_WALL(yarnwrap.state.property.BooleanProperty value) { wrapperContained.IN_WALL = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty IN_WALL() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.FenceGateBlock.IN_WALL); }
// public static void IN_WALL(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.FenceGateBlock.IN_WALL = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public void OPEN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OPEN = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.FenceGateBlock.OPEN); }
// public static void OPEN(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.FenceGateBlock.OPEN = value.wrapperContained; }

// public yarnwrap.block.WoodType type() { return new yarnwrap.block.WoodType(wrapperContained.type); }
// public void type(yarnwrap.block.WoodType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.block.WoodType type() { return new yarnwrap.block.WoodType(net.minecraft.block.FenceGateBlock.type); }
// public static void type(yarnwrap.block.WoodType value, ) { net.minecraft.block.FenceGateBlock.type = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FenceGateBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FenceGateBlock.CODEC = value; }

// public java.util.Map REGULAR_CULLING_SHAPES() { return wrapperContained.REGULAR_CULLING_SHAPES; }
// public void REGULAR_CULLING_SHAPES(java.util.Map value) { wrapperContained.REGULAR_CULLING_SHAPES = value; }
// public static java.util.Map REGULAR_CULLING_SHAPES() { return net.minecraft.block.FenceGateBlock.REGULAR_CULLING_SHAPES; }
// public static void REGULAR_CULLING_SHAPES(java.util.Map value, ) { net.minecraft.block.FenceGateBlock.REGULAR_CULLING_SHAPES = value; }

// public java.util.Map IN_WALL_CULLING_SHAPES() { return wrapperContained.IN_WALL_CULLING_SHAPES; }
// public void IN_WALL_CULLING_SHAPES(java.util.Map value) { wrapperContained.IN_WALL_CULLING_SHAPES = value; }
// public static java.util.Map IN_WALL_CULLING_SHAPES() { return net.minecraft.block.FenceGateBlock.IN_WALL_CULLING_SHAPES; }
// public static void IN_WALL_CULLING_SHAPES(java.util.Map value, ) { net.minecraft.block.FenceGateBlock.IN_WALL_CULLING_SHAPES = value; }

// public java.util.Map REGULAR_OUTLINE_SHAPES() { return wrapperContained.REGULAR_OUTLINE_SHAPES; }
// public void REGULAR_OUTLINE_SHAPES(java.util.Map value) { wrapperContained.REGULAR_OUTLINE_SHAPES = value; }
// public static java.util.Map REGULAR_OUTLINE_SHAPES() { return net.minecraft.block.FenceGateBlock.REGULAR_OUTLINE_SHAPES; }
// public static void REGULAR_OUTLINE_SHAPES(java.util.Map value, ) { net.minecraft.block.FenceGateBlock.REGULAR_OUTLINE_SHAPES = value; }

// public java.util.Map IN_WALL_OUTLINE_SHAPES() { return wrapperContained.IN_WALL_OUTLINE_SHAPES; }
// public void IN_WALL_OUTLINE_SHAPES(java.util.Map value) { wrapperContained.IN_WALL_OUTLINE_SHAPES = value; }
// public static java.util.Map IN_WALL_OUTLINE_SHAPES() { return net.minecraft.block.FenceGateBlock.IN_WALL_OUTLINE_SHAPES; }
// public static void IN_WALL_OUTLINE_SHAPES(java.util.Map value, ) { net.minecraft.block.FenceGateBlock.IN_WALL_OUTLINE_SHAPES = value; }

// public java.util.Map CLOSED_COLLISION_SHAPES() { return wrapperContained.CLOSED_COLLISION_SHAPES; }
// public void CLOSED_COLLISION_SHAPES(java.util.Map value) { wrapperContained.CLOSED_COLLISION_SHAPES = value; }
// public static java.util.Map CLOSED_COLLISION_SHAPES() { return net.minecraft.block.FenceGateBlock.CLOSED_COLLISION_SHAPES; }
// public static void CLOSED_COLLISION_SHAPES(java.util.Map value, ) { net.minecraft.block.FenceGateBlock.CLOSED_COLLISION_SHAPES = value; }

// public java.util.Map CLOSED_SIDES_SHAPES() { return wrapperContained.CLOSED_SIDES_SHAPES; }
// public void CLOSED_SIDES_SHAPES(java.util.Map value) { wrapperContained.CLOSED_SIDES_SHAPES = value; }
// public static java.util.Map CLOSED_SIDES_SHAPES() { return net.minecraft.block.FenceGateBlock.CLOSED_SIDES_SHAPES; }
// public static void CLOSED_SIDES_SHAPES(java.util.Map value, ) { net.minecraft.block.FenceGateBlock.CLOSED_SIDES_SHAPES = value; }

// public FenceGateBlock(yarnwrap.block.WoodType type,Object settings) { this.wrapperContained = new net.minecraft.block.FenceGateBlock(type.wrapperContained,settings); }
// public boolean isWall(yarnwrap.block.BlockState state) { return wrapperContained.isWall(state.wrapperContained); }
// public static boolean isWall(yarnwrap.block.BlockState state, ) { return net.minecraft.block.FenceGateBlock.isWall(state.wrapperContained); }
// public boolean canWallConnect(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side) { return wrapperContained.canWallConnect(state.wrapperContained,side.wrapperContained); }
// public static boolean canWallConnect(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side, ) { return net.minecraft.block.FenceGateBlock.canWallConnect(state.wrapperContained,side.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54013(Object instance) { return wrapperContained.method_54013(instance); }
// public static com.mojang.datafixers.kinds.App method_54013(Object instance, ) { return net.minecraft.block.FenceGateBlock.method_54013(instance); }
// public yarnwrap.block.WoodType method_54014(yarnwrap.block.FenceGateBlock block) { return new yarnwrap.block.WoodType(wrapperContained.method_54014(block.wrapperContained)); }
// public static yarnwrap.block.WoodType method_54014(yarnwrap.block.FenceGateBlock block, ) { return new yarnwrap.block.WoodType(net.minecraft.block.FenceGateBlock.method_54014(block.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape method_66429(yarnwrap.util.shape.VoxelShape shape) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66429(shape.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66429(yarnwrap.util.shape.VoxelShape shape, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FenceGateBlock.method_66429(shape.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape method_66430(yarnwrap.util.shape.VoxelShape shape) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66430(shape.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66430(yarnwrap.util.shape.VoxelShape shape, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FenceGateBlock.method_66430(shape.wrapperContained)); }

}