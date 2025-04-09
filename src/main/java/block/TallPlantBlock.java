package yarnwrap.block;
public class TallPlantBlock { public net.minecraft.block.TallPlantBlock wrapperContained; public TallPlantBlock(net.minecraft.block.TallPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void placeAt(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int flags) { wrapperContained.placeAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained,flags); }
// public void onBreakInCreative(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onBreakInCreative(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained); }
public yarnwrap.block.BlockState withWaterloggedState(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.withWaterloggedState(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }

}