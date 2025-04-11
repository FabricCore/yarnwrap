package yarnwrap.world.chunk;
public class UpgradeData { public net.minecraft.world.chunk.UpgradeData wrapperContained; public UpgradeData(net.minecraft.world.chunk.UpgradeData wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.UpgradeData NO_UPGRADE_DATA() { return new yarnwrap.world.chunk.UpgradeData(wrapperContained.NO_UPGRADE_DATA); }
// public void NO_UPGRADE_DATA(yarnwrap.world.chunk.UpgradeData value) { wrapperContained.NO_UPGRADE_DATA = value.wrapperContained; }
// public java.util.EnumSet sidesToUpgrade() { return wrapperContained.sidesToUpgrade; }
// public void sidesToUpgrade(java.util.EnumSet value) { wrapperContained.sidesToUpgrade = value; }
// public net.minecraft.util.math.EightWayDirection[] EIGHT_WAYS() { return wrapperContained.EIGHT_WAYS; }
// public void EIGHT_WAYS(net.minecraft.util.math.EightWayDirection[] value) { wrapperContained.EIGHT_WAYS = value; }
// public java.util.Map BLOCK_TO_LOGIC() { return wrapperContained.BLOCK_TO_LOGIC; }
// public void BLOCK_TO_LOGIC(java.util.Map value) { wrapperContained.BLOCK_TO_LOGIC = value; }
// public java.util.Set CALLBACK_LOGICS() { return wrapperContained.CALLBACK_LOGICS; }
// public void CALLBACK_LOGICS(java.util.Set value) { wrapperContained.CALLBACK_LOGICS = value; }
// public int[][] centerIndicesToUpgrade() { return wrapperContained.centerIndicesToUpgrade; }
// public void centerIndicesToUpgrade(int[][] value) { wrapperContained.centerIndicesToUpgrade = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String INDICES_KEY() { return wrapperContained.INDICES_KEY; }
// public void INDICES_KEY(java.lang.String value) { wrapperContained.INDICES_KEY = value; }
// public java.util.List blockTicks() { return wrapperContained.blockTicks; }
// public void blockTicks(java.util.List value) { wrapperContained.blockTicks = value; }
// public java.util.List fluidTicks() { return wrapperContained.fluidTicks; }
// public void fluidTicks(java.util.List value) { wrapperContained.fluidTicks = value; }
public UpgradeData(yarnwrap.nbt.NbtCompound nbt,yarnwrap.world.HeightLimitView world) { this.wrapperContained = new net.minecraft.world.chunk.UpgradeData(nbt.wrapperContained,world.wrapperContained); }
// public UpgradeData(yarnwrap.world.HeightLimitView world) { this.wrapperContained = new net.minecraft.world.chunk.UpgradeData(world.wrapperContained); }
// public void upgradeCenter(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.upgradeCenter(chunk.wrapperContained); }
public boolean isDone() { return wrapperContained.isDone(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public yarnwrap.block.BlockState applyAdjacentBlock(yarnwrap.block.BlockState oldState,yarnwrap.util.math.Direction dir,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos otherPos) { return new yarnwrap.block.BlockState(wrapperContained.applyAdjacentBlock(oldState.wrapperContained,dir.wrapperContained,world.wrapperContained,currentPos.wrapperContained,otherPos.wrapperContained)); }
// public void upgradeSide(yarnwrap.world.chunk.WorldChunk chunk,yarnwrap.util.math.EightWayDirection side) { wrapperContained.upgradeSide(chunk.wrapperContained,side.wrapperContained); }
// public void method_12353(yarnwrap.world.World logic) { wrapperContained.method_12353(logic.wrapperContained); }
public void upgrade(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.upgrade(chunk.wrapperContained); }
// public void method_40452(yarnwrap.world.World tick) { wrapperContained.method_40452(tick.wrapperContained); }
// public java.lang.String method_40453(yarnwrap.block.Block block) { return wrapperContained.method_40453(block.wrapperContained); }
// public java.lang.String method_40454(yarnwrap.fluid.Fluid fluid) { return wrapperContained.method_40454(fluid.wrapperContained); }
// public java.util.Optional method_40455(java.lang.String id) { return wrapperContained.method_40455(id); }
// public void addNeighborTicks(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,java.util.function.Function nameToType,java.util.List ticks) { wrapperContained.addNeighborTicks(nbt.wrapperContained,key,nameToType,ticks); }
// public void method_40457(yarnwrap.nbt.NbtList tick,yarnwrap.world.tick.Tick fluidTick) { wrapperContained.method_40457(tick.wrapperContained,fluidTick.wrapperContained); }
// public void method_40458(yarnwrap.world.World tick) { wrapperContained.method_40458(tick.wrapperContained); }
// public java.util.Optional method_40459(java.lang.String id) { return wrapperContained.method_40459(id); }
// public void method_40460(yarnwrap.nbt.NbtList tick,yarnwrap.world.tick.Tick blockTick) { wrapperContained.method_40460(tick.wrapperContained,blockTick.wrapperContained); }

}