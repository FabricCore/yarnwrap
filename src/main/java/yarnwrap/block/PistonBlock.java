package yarnwrap.block;
public class PistonBlock { public net.minecraft.block.PistonBlock wrapperContained; public PistonBlock(net.minecraft.block.PistonBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sticky() { return wrapperContained.sticky; }
// public void sticky(boolean value) { wrapperContained.sticky = value; }
// public static boolean sticky() { return net.minecraft.block.PistonBlock.sticky; }
// public static void sticky(boolean value, ) { net.minecraft.block.PistonBlock.sticky = value; }

// public yarnwrap.state.property.BooleanProperty EXTENDED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EXTENDED); }
// public void EXTENDED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EXTENDED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty EXTENDED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PistonBlock.EXTENDED); }
// public static void EXTENDED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PistonBlock.EXTENDED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PistonBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PistonBlock.CODEC = value; }

// public java.util.Map EXTENDED_SHAPES_BY_DIRECTION() { return wrapperContained.EXTENDED_SHAPES_BY_DIRECTION; }
// public void EXTENDED_SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.EXTENDED_SHAPES_BY_DIRECTION = value; }
// public static java.util.Map EXTENDED_SHAPES_BY_DIRECTION() { return net.minecraft.block.PistonBlock.EXTENDED_SHAPES_BY_DIRECTION; }
// public static void EXTENDED_SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.PistonBlock.EXTENDED_SHAPES_BY_DIRECTION = value; }

// public PistonBlock(boolean sticky,Object settings) { this.wrapperContained = new net.minecraft.block.PistonBlock(sticky,settings); }
// public boolean move(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir,boolean extend) { return wrapperContained.move(world.wrapperContained,pos.wrapperContained,dir.wrapperContained,extend); }
// public static boolean move(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir,boolean extend, ) { return net.minecraft.block.PistonBlock.move(world.wrapperContained,pos.wrapperContained,dir.wrapperContained,extend); }
// public boolean shouldExtend(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction pistonFace) { return wrapperContained.shouldExtend(world.wrapperContained,pos.wrapperContained,pistonFace.wrapperContained); }
// public static boolean shouldExtend(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction pistonFace, ) { return net.minecraft.block.PistonBlock.shouldExtend(world.wrapperContained,pos.wrapperContained,pistonFace.wrapperContained); }
// public void tryMove(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.tryMove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void tryMove(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.PistonBlock.tryMove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isMovable(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean canBreak,yarnwrap.util.math.Direction pistonDir) { return wrapperContained.isMovable(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,canBreak,pistonDir.wrapperContained); }
// public static boolean isMovable(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean canBreak,yarnwrap.util.math.Direction pistonDir, ) { return net.minecraft.block.PistonBlock.isMovable(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,canBreak,pistonDir.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54091(Object instance) { return wrapperContained.method_54091(instance); }
// public static com.mojang.datafixers.kinds.App method_54091(Object instance, ) { return net.minecraft.block.PistonBlock.method_54091(instance); }
// public java.lang.Boolean method_54092(yarnwrap.block.PistonBlock block) { return wrapperContained.method_54092(block.wrapperContained); }
// public static java.lang.Boolean method_54092(yarnwrap.block.PistonBlock block, ) { return net.minecraft.block.PistonBlock.method_54092(block.wrapperContained); }

}