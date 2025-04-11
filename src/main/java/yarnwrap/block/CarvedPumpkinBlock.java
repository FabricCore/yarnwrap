package yarnwrap.block;
public class CarvedPumpkinBlock { public net.minecraft.block.CarvedPumpkinBlock wrapperContained; public CarvedPumpkinBlock(net.minecraft.block.CarvedPumpkinBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.block.pattern.BlockPattern snowGolemDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.snowGolemDispenserPattern); }
// public void snowGolemDispenserPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.snowGolemDispenserPattern = value.wrapperContained; }
// public yarnwrap.block.pattern.BlockPattern snowGolemPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.snowGolemPattern); }
// public void snowGolemPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.snowGolemPattern = value.wrapperContained; }
// public java.util.function.Predicate IS_GOLEM_HEAD_PREDICATE() { return wrapperContained.IS_GOLEM_HEAD_PREDICATE; }
// public void IS_GOLEM_HEAD_PREDICATE(java.util.function.Predicate value) { wrapperContained.IS_GOLEM_HEAD_PREDICATE = value; }
// public yarnwrap.block.pattern.BlockPattern ironGolemDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.ironGolemDispenserPattern); }
// public void ironGolemDispenserPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.ironGolemDispenserPattern = value.wrapperContained; }
// public yarnwrap.block.pattern.BlockPattern ironGolemPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.ironGolemPattern); }
// public void ironGolemPattern(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.ironGolemPattern = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void breakPatternBlocks(yarnwrap.world.World world,Object patternResult) { wrapperContained.breakPatternBlocks(world.wrapperContained,patternResult); }
// public void spawnEntity(yarnwrap.world.World world,Object patternResult,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnEntity(world.wrapperContained,patternResult,entity.wrapperContained,pos.wrapperContained); }
// public void updatePatternBlocks(yarnwrap.world.World world,Object patternResult) { wrapperContained.updatePatternBlocks(world.wrapperContained,patternResult); }
// public yarnwrap.block.pattern.BlockPattern getIronGolemDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getIronGolemDispenserPattern()); }
// public yarnwrap.block.pattern.BlockPattern getSnowGolemPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getSnowGolemPattern()); }
// public yarnwrap.block.pattern.BlockPattern getIronGolemPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getIronGolemPattern()); }
// public void trySpawnEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.trySpawnEntity(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.pattern.BlockPattern getSnowGolemDispenserPattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getSnowGolemDispenserPattern()); }
public boolean canDispense(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canDispense(world.wrapperContained,pos.wrapperContained); }

}