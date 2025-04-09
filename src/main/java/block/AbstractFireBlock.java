package yarnwrap.block;
public class AbstractFireBlock { public net.minecraft.block.AbstractFireBlock wrapperContained; public AbstractFireBlock(net.minecraft.block.AbstractFireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public float damage() { return wrapperContained.damage; }
// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
// public float BASE_SOUND_VOLUME() { return wrapperContained.BASE_SOUND_VOLUME; }
// public int SET_ON_FIRE_SECONDS() { return wrapperContained.SET_ON_FIRE_SECONDS; }
// public boolean isFlammable(yarnwrap.block.BlockState state) { return wrapperContained.isFlammable(state.wrapperContained); }
public yarnwrap.block.BlockState getState(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getState(world.wrapperContained,pos.wrapperContained)); }
public boolean canPlaceAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canPlaceAt(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean shouldLightPortalAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.shouldLightPortalAt(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean isOverworldOrNether(yarnwrap.world.World world) { return wrapperContained.isOverworldOrNether(world.wrapperContained); }

}