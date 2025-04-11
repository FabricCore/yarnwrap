package yarnwrap.block;
public class SculkSpreadable { public net.minecraft.block.SculkSpreadable wrapperContained; public SculkSpreadable(net.minecraft.block.SculkSpreadable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.SculkSpreadable VEIN_ONLY_SPREADER() { return new yarnwrap.block.SculkSpreadable(wrapperContained.VEIN_ONLY_SPREADER); }
// public void VEIN_ONLY_SPREADER(yarnwrap.block.SculkSpreadable value) { wrapperContained.VEIN_ONLY_SPREADER = value.wrapperContained; }
public byte getUpdate() { return wrapperContained.getUpdate(); }
public void spreadAtSamePosition(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.spreadAtSamePosition(world.wrapperContained,state.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean spread(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.Collection directions,boolean markForPostProcessing) { return wrapperContained.spread(world.wrapperContained,pos.wrapperContained,state.wrapperContained,directions,markForPostProcessing); }
public boolean method_41470(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.method_41470(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public int spread(Object cursor,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos catalystPos,yarnwrap.util.math.random.Random random,yarnwrap.block.entity.SculkSpreadManager spreadManager,boolean shouldConvertToBlock) { return wrapperContained.spread(cursor,world.wrapperContained,catalystPos.wrapperContained,random.wrapperContained,spreadManager.wrapperContained,shouldConvertToBlock); }
public boolean shouldConvertToSpreadable() { return wrapperContained.shouldConvertToSpreadable(); }
public int getDecay(int oldDecay) { return wrapperContained.getDecay(oldDecay); }

}