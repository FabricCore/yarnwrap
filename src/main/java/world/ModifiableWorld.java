package yarnwrap.world;
public class ModifiableWorld { public net.minecraft.world.ModifiableWorld wrapperContained; public ModifiableWorld(net.minecraft.world.ModifiableWorld wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean breakBlock(yarnwrap.util.math.BlockPos pos,boolean drop) { return wrapperContained.breakBlock(pos.wrapperContained,drop); }
public boolean setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int flags,int maxUpdateDepth) { return wrapperContained.setBlockState(pos.wrapperContained,state.wrapperContained,flags,maxUpdateDepth); }
public boolean breakBlock(yarnwrap.util.math.BlockPos pos,boolean drop,yarnwrap.entity.Entity breakingEntity,int maxUpdateDepth) { return wrapperContained.breakBlock(pos.wrapperContained,drop,breakingEntity.wrapperContained,maxUpdateDepth); }
public boolean spawnEntity(yarnwrap.entity.Entity entity) { return wrapperContained.spawnEntity(entity.wrapperContained); }
public boolean removeBlock(yarnwrap.util.math.BlockPos pos,boolean move) { return wrapperContained.removeBlock(pos.wrapperContained,move); }
public boolean breakBlock(yarnwrap.util.math.BlockPos pos,boolean drop,yarnwrap.entity.Entity breakingEntity) { return wrapperContained.breakBlock(pos.wrapperContained,drop,breakingEntity.wrapperContained); }
public boolean setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int flags) { return wrapperContained.setBlockState(pos.wrapperContained,state.wrapperContained,flags); }

}