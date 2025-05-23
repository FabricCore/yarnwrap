package yarnwrap.block;
public class PropaguleBlock { public net.minecraft.block.PropaguleBlock wrapperContained; public PropaguleBlock(net.minecraft.block.PropaguleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.PropaguleBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.PropaguleBlock.AGE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PropaguleBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PropaguleBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty HANGING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HANGING); }
// public void HANGING(yarnwrap.state.property.BooleanProperty value) { wrapperContained.HANGING = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty HANGING() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PropaguleBlock.HANGING); }
// public static void HANGING(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PropaguleBlock.HANGING = value.wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return wrapperContained.SHAPES_BY_AGE; }
// public void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_AGE = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return net.minecraft.block.PropaguleBlock.SHAPES_BY_AGE; }
// public static void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.PropaguleBlock.SHAPES_BY_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PropaguleBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PropaguleBlock.CODEC = value; }

// public int[] MIN_Y_BY_AGE() { return wrapperContained.MIN_Y_BY_AGE; }
// public void MIN_Y_BY_AGE(int[] value) { wrapperContained.MIN_Y_BY_AGE = value; }
// public static int[] MIN_Y_BY_AGE() { return net.minecraft.block.PropaguleBlock.MIN_Y_BY_AGE; }
// public static void MIN_Y_BY_AGE(int[] value, ) { net.minecraft.block.PropaguleBlock.MIN_Y_BY_AGE = value; }

// public yarnwrap.block.BlockState getDefaultHangingState() { return new yarnwrap.block.BlockState(wrapperContained.getDefaultHangingState()); }
public static yarnwrap.block.BlockState getDefaultHangingState() { return new yarnwrap.block.BlockState(net.minecraft.block.PropaguleBlock.getDefaultHangingState()); }
// public boolean isHanging(yarnwrap.block.BlockState state) { return wrapperContained.isHanging(state.wrapperContained); }
// public static boolean isHanging(yarnwrap.block.BlockState state, ) { return net.minecraft.block.PropaguleBlock.isHanging(state.wrapperContained); }
// public boolean isFullyGrown(yarnwrap.block.BlockState state) { return wrapperContained.isFullyGrown(state.wrapperContained); }
// public static boolean isFullyGrown(yarnwrap.block.BlockState state, ) { return net.minecraft.block.PropaguleBlock.isFullyGrown(state.wrapperContained); }
// public yarnwrap.block.BlockState getHangingState(int age) { return new yarnwrap.block.BlockState(wrapperContained.getHangingState(age)); }
// public static yarnwrap.block.BlockState getHangingState(int age, ) { return new yarnwrap.block.BlockState(net.minecraft.block.PropaguleBlock.getHangingState(age)); }
// public com.mojang.datafixers.kinds.App method_54032(Object instance) { return wrapperContained.method_54032(instance); }
// public static com.mojang.datafixers.kinds.App method_54032(Object instance, ) { return net.minecraft.block.PropaguleBlock.method_54032(instance); }
// public yarnwrap.block.SaplingGenerator method_54033(yarnwrap.block.PropaguleBlock block) { return new yarnwrap.block.SaplingGenerator(wrapperContained.method_54033(block.wrapperContained)); }
// public static yarnwrap.block.SaplingGenerator method_54033(yarnwrap.block.PropaguleBlock block, ) { return new yarnwrap.block.SaplingGenerator(net.minecraft.block.PropaguleBlock.method_54033(block.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape method_66451(int age) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66451(age)); }
// public static yarnwrap.util.shape.VoxelShape method_66451(int age, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PropaguleBlock.method_66451(age)); }

}