package yarnwrap.block;
public class PoweredRailBlock { public net.minecraft.block.PoweredRailBlock wrapperContained; public PoweredRailBlock(net.minecraft.block.PoweredRailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PoweredRailBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PoweredRailBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PoweredRailBlock.SHAPE); }
// public static void SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PoweredRailBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PoweredRailBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PoweredRailBlock.CODEC = value; }

// public boolean isPoweredByOtherRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean distance) { return wrapperContained.isPoweredByOtherRails(world.wrapperContained,pos.wrapperContained,state.wrapperContained,distance); }
// public static boolean isPoweredByOtherRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean distance, ) { return net.minecraft.block.PoweredRailBlock.isPoweredByOtherRails(world.wrapperContained,pos.wrapperContained,state.wrapperContained,distance); }
// public boolean isPoweredByOtherRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean distance,int shape) { return wrapperContained.isPoweredByOtherRails(world.wrapperContained,pos.wrapperContained,distance,shape); }
// public static boolean isPoweredByOtherRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean distance,int shape, ) { return net.minecraft.block.PoweredRailBlock.isPoweredByOtherRails(world.wrapperContained,pos.wrapperContained,distance,shape); }

}