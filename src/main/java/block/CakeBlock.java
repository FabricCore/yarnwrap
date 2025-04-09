package yarnwrap.block;
public class CakeBlock { public net.minecraft.block.CakeBlock wrapperContained; public CakeBlock(net.minecraft.block.CakeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] BITES_TO_SHAPE() { return wrapperContained.BITES_TO_SHAPE; }
public yarnwrap.state.property.IntProperty BITES() { return new yarnwrap.state.property.IntProperty(wrapperContained.BITES); }
public int DEFAULT_COMPARATOR_OUTPUT() { return wrapperContained.DEFAULT_COMPARATOR_OUTPUT; }
public int MAX_BITES() { return wrapperContained.MAX_BITES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public int getComparatorOutput(int bites) { return wrapperContained.getComparatorOutput(bites); }
// public yarnwrap.util.ActionResult tryEat(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.tryEat(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained)); }

}