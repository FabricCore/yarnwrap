package yarnwrap.world.chunk;
public class UpgradeData { public net.minecraft.world.chunk.UpgradeData wrapperContained; public UpgradeData(net.minecraft.world.chunk.UpgradeData wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.UpgradeData NO_UPGRADE_DATA() { return new yarnwrap.world.chunk.UpgradeData(wrapperContained.NO_UPGRADE_DATA); }
// public java.util.EnumSet sidesToUpgrade() { return wrapperContained.sidesToUpgrade; }
// public net.minecraft.util.math.EightWayDirection[] EIGHT_WAYS() { return wrapperContained.EIGHT_WAYS; }
// public java.util.Map BLOCK_TO_LOGIC() { return wrapperContained.BLOCK_TO_LOGIC; }
// public java.util.Set CALLBACK_LOGICS() { return wrapperContained.CALLBACK_LOGICS; }
// public int[][] centerIndicesToUpgrade() { return wrapperContained.centerIndicesToUpgrade; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String INDICES_KEY() { return wrapperContained.INDICES_KEY; }
// public java.util.List blockTicks() { return wrapperContained.blockTicks; }
// public java.util.List fluidTicks() { return wrapperContained.fluidTicks; }
// public void upgradeCenter(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.upgradeCenter(chunk.wrapperContained); }
public boolean isDone() { return wrapperContained.isDone(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public yarnwrap.block.BlockState applyAdjacentBlock(yarnwrap.block.BlockState oldState,yarnwrap.util.math.Direction dir,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos otherPos) { return new yarnwrap.block.BlockState(wrapperContained.applyAdjacentBlock(oldState.wrapperContained,dir.wrapperContained,world.wrapperContained,currentPos.wrapperContained,otherPos.wrapperContained)); }
// public void upgradeSide(yarnwrap.world.chunk.WorldChunk chunk,yarnwrap.util.math.EightWayDirection side) { wrapperContained.upgradeSide(chunk.wrapperContained,side.wrapperContained); }
public void upgrade(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.upgrade(chunk.wrapperContained); }
// public void addNeighborTicks(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,java.util.function.Function nameToType,java.util.List ticks) { wrapperContained.addNeighborTicks(nbt.wrapperContained,key,nameToType,ticks); }

}