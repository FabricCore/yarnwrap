package yarnwrap.block;
public class LichenGrower { public net.minecraft.block.LichenGrower wrapperContained; public LichenGrower(net.minecraft.block.LichenGrower wrapperContained) { this.wrapperContained = wrapperContained; }

public Object GROW_TYPES() { return wrapperContained.GROW_TYPES; }
// // public void GROW_TYPES(Object value) { wrapperContained.GROW_TYPES = value; }
// public Object growChecker() { return wrapperContained.growChecker; }
// // public void growChecker(Object value) { wrapperContained.growChecker = value; }
// public java.util.Optional place(yarnwrap.world.WorldAccess world,Object pos,boolean markForPostProcessing) { return wrapperContained.place(world.wrapperContained,pos,markForPostProcessing); }
public boolean canGrow(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canGrow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public java.util.Optional getGrowPos(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction oldDirection,yarnwrap.util.math.Direction newDirection,Object predicate) { return wrapperContained.getGrowPos(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldDirection.wrapperContained,newDirection.wrapperContained,predicate); }
public java.util.Optional grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction oldDirection,yarnwrap.util.math.Direction newDirection,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldDirection.wrapperContained,newDirection.wrapperContained,markForPostProcessing); }
public java.util.Optional grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.random.Random random,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,random.wrapperContained,markForPostProcessing); }
// public long grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,markForPostProcessing); }
public java.util.Optional grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public long grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,markForPostProcessing); }

}