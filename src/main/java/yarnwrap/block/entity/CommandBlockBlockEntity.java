package yarnwrap.block.entity;
public class CommandBlockBlockEntity { public net.minecraft.block.entity.CommandBlockBlockEntity wrapperContained; public CommandBlockBlockEntity(net.minecraft.block.entity.CommandBlockBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean conditionMet() { return wrapperContained.conditionMet; }
// public void conditionMet(boolean value) { wrapperContained.conditionMet = value; }
// public boolean auto() { return wrapperContained.auto; }
// public void auto(boolean value) { wrapperContained.auto = value; }
// public boolean powered() { return wrapperContained.powered; }
// public void powered(boolean value) { wrapperContained.powered = value; }
// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
// public void commandExecutor(yarnwrap.world.CommandBlockExecutor value) { wrapperContained.commandExecutor = value.wrapperContained; }
public CommandBlockBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CommandBlockBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setPowered(boolean powered) { wrapperContained.setPowered(powered); }
public Object getCommandBlockType() { return wrapperContained.getCommandBlockType(); }
public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }
public void setAuto(boolean auto) { wrapperContained.setAuto(auto); }
public boolean isAuto() { return wrapperContained.isAuto(); }
public boolean isPowered() { return wrapperContained.isPowered(); }
public boolean isConditionMet() { return wrapperContained.isConditionMet(); }
public boolean updateConditionMet() { return wrapperContained.updateConditionMet(); }
public boolean isConditionalCommandBlock() { return wrapperContained.isConditionalCommandBlock(); }
public void updateCommandBlock() { wrapperContained.updateCommandBlock(); }
// public void scheduleAutoTick() { wrapperContained.scheduleAutoTick(); }

}