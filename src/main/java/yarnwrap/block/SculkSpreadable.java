package yarnwrap.block;
public class SculkSpreadable { public net.minecraft.block.SculkSpreadable wrapperContained; public SculkSpreadable(net.minecraft.block.SculkSpreadable wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.SculkSpreadable VEIN_ONLY_SPREADER() { return new yarnwrap.block.SculkSpreadable(wrapperContained.VEIN_ONLY_SPREADER); }
// public void VEIN_ONLY_SPREADER(yarnwrap.block.SculkSpreadable value) { wrapperContained.VEIN_ONLY_SPREADER = value.wrapperContained; }
public static yarnwrap.block.SculkSpreadable VEIN_ONLY_SPREADER() { return new yarnwrap.block.SculkSpreadable(net.minecraft.block.SculkSpreadable.VEIN_ONLY_SPREADER); }
// public static void VEIN_ONLY_SPREADER(yarnwrap.block.SculkSpreadable value, ) { net.minecraft.block.SculkSpreadable.VEIN_ONLY_SPREADER = value.wrapperContained; }

public byte getUpdate() { return wrapperContained.getUpdate(); }
// public static byte getUpdate() { return net.minecraft.block.SculkSpreadable.getUpdate(); }
public void spreadAtSamePosition(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.spreadAtSamePosition(world.wrapperContained,state.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void spreadAtSamePosition(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.SculkSpreadable.spreadAtSamePosition(world.wrapperContained,state.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean spread(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.Collection directions,boolean markForPostProcessing) { return wrapperContained.spread(world.wrapperContained,pos.wrapperContained,state.wrapperContained,directions,markForPostProcessing); }
// public static boolean spread(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.Collection directions,boolean markForPostProcessing, ) { return net.minecraft.block.SculkSpreadable.spread(world.wrapperContained,pos.wrapperContained,state.wrapperContained,directions,markForPostProcessing); }
public boolean method_41470(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.method_41470(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean method_41470(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.SculkSpreadable.method_41470(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public int spread(Object cursor,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos catalystPos,yarnwrap.util.math.random.Random random,yarnwrap.block.entity.SculkSpreadManager spreadManager,boolean shouldConvertToBlock) { return wrapperContained.spread(cursor,world.wrapperContained,catalystPos.wrapperContained,random.wrapperContained,spreadManager.wrapperContained,shouldConvertToBlock); }
// public static int spread(Object cursor,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos catalystPos,yarnwrap.util.math.random.Random random,yarnwrap.block.entity.SculkSpreadManager spreadManager,boolean shouldConvertToBlock, ) { return net.minecraft.block.SculkSpreadable.spread(cursor,world.wrapperContained,catalystPos.wrapperContained,random.wrapperContained,spreadManager.wrapperContained,shouldConvertToBlock); }
public boolean shouldConvertToSpreadable() { return wrapperContained.shouldConvertToSpreadable(); }
// public static boolean shouldConvertToSpreadable() { return net.minecraft.block.SculkSpreadable.shouldConvertToSpreadable(); }
public int getDecay(int oldDecay) { return wrapperContained.getDecay(oldDecay); }
// public static int getDecay(int oldDecay, ) { return net.minecraft.block.SculkSpreadable.getDecay(oldDecay); }

}