package yarnwrap.block;
public class ComposterBlock { public net.minecraft.block.ComposterBlock wrapperContained; public ComposterBlock(net.minecraft.block.ComposterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
public it.unimi.dsi.fastutil.objects.Object2FloatMap ITEM_TO_LEVEL_INCREASE_CHANCE() { return wrapperContained.ITEM_TO_LEVEL_INCREASE_CHANCE; }
// public yarnwrap.util.shape.VoxelShape RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.RAYCAST_SHAPE); }
// public net.minecraft.util.shape.VoxelShape[] LEVEL_TO_COLLISION_SHAPE() { return wrapperContained.LEVEL_TO_COLLISION_SHAPE; }
public int NUM_LEVELS() { return wrapperContained.NUM_LEVELS; }
public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void registerCompostableItem(float levelIncreaseChance,yarnwrap.item.ItemConvertible item) { wrapperContained.registerCompostableItem(levelIncreaseChance,item.wrapperContained); }
// public yarnwrap.block.BlockState addToComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { return new yarnwrap.block.BlockState(wrapperContained.addToComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained)); }
public void registerDefaultCompostableItems() { wrapperContained.registerDefaultCompostableItems(); }
// public yarnwrap.block.BlockState emptyComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.emptyComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public void playEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean fill) { wrapperContained.playEffects(world.wrapperContained,pos.wrapperContained,fill); }
public yarnwrap.block.BlockState compost(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.compost(user.wrapperContained,state.wrapperContained,world.wrapperContained,stack.wrapperContained,pos.wrapperContained)); }
public yarnwrap.block.BlockState emptyFullComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.emptyFullComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }

}