package yarnwrap.block;
public class TallPlantBlock { public net.minecraft.block.TallPlantBlock wrapperContained; public TallPlantBlock(net.minecraft.block.TallPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.TallPlantBlock.HALF); }
// public static void HALF(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.TallPlantBlock.HALF = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TallPlantBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TallPlantBlock.CODEC = value; }

// public void placeAt(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int flags) { wrapperContained.placeAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained,flags); }
// public static void placeAt(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int flags, ) { net.minecraft.block.TallPlantBlock.placeAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained,flags); }
// public void onBreakInCreative(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onBreakInCreative(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained); }
// public static void onBreakInCreative(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.TallPlantBlock.onBreakInCreative(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained); }
// public yarnwrap.block.BlockState withWaterloggedState(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.withWaterloggedState(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState withWaterloggedState(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.block.TallPlantBlock.withWaterloggedState(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }

}