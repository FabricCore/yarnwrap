package yarnwrap.block;
public class LichenGrower { public net.minecraft.block.LichenGrower wrapperContained; public LichenGrower(net.minecraft.block.LichenGrower wrapperContained) { this.wrapperContained = wrapperContained; }

public Object GROW_TYPES() { return wrapperContained.GROW_TYPES; }
// // public void GROW_TYPES(Object value) { wrapperContained.GROW_TYPES = value; }
// public Object growChecker() { return wrapperContained.growChecker; }
// // public void growChecker(Object value) { wrapperContained.growChecker = value; }
public LichenGrower(yarnwrap.block.MultifaceGrowthBlock lichen) { this.wrapperContained = new net.minecraft.block.LichenGrower(lichen.wrapperContained); }
// public LichenGrower(Object growChecker) { this.wrapperContained = new net.minecraft.block.LichenGrower(growChecker); }
// public java.util.Optional place(yarnwrap.world.WorldAccess world,Object pos,boolean markForPostProcessing) { return wrapperContained.place(world.wrapperContained,pos,markForPostProcessing); }
// public java.util.Optional method_41442(yarnwrap.world.WorldAccess growPos) { return wrapperContained.method_41442(growPos.wrapperContained); }
public boolean canGrow(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canGrow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean method_41444(yarnwrap.block.BlockState direction2) { return wrapperContained.method_41444(direction2.wrapperContained); }
// public java.util.Optional getGrowPos(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction oldDirection,yarnwrap.util.math.Direction newDirection,Object predicate) { return wrapperContained.getGrowPos(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldDirection.wrapperContained,newDirection.wrapperContained,predicate); }
public java.util.Optional grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction oldDirection,yarnwrap.util.math.Direction newDirection,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldDirection.wrapperContained,newDirection.wrapperContained,markForPostProcessing); }
public java.util.Optional grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.random.Random random,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,random.wrapperContained,markForPostProcessing); }
// public long grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,markForPostProcessing); }
// public java.util.Optional method_41449(yarnwrap.block.BlockState direction2) { return wrapperContained.method_41449(direction2.wrapperContained); }
public java.util.Optional grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public java.util.Optional method_41451(yarnwrap.block.BlockState direction) { return wrapperContained.method_41451(direction.wrapperContained); }
public long grow(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean markForPostProcessing) { return wrapperContained.grow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,markForPostProcessing); }
// public java.lang.Long method_41453(yarnwrap.block.BlockState direction) { return wrapperContained.method_41453(direction.wrapperContained); }
// public boolean method_41454(yarnwrap.block.BlockState direction) { return wrapperContained.method_41454(direction.wrapperContained); }
// public java.util.Optional method_41455(yarnwrap.block.BlockState direction2) { return wrapperContained.method_41455(direction2.wrapperContained); }
// public boolean method_41456(yarnwrap.block.BlockState direction) { return wrapperContained.method_41456(direction.wrapperContained); }

}