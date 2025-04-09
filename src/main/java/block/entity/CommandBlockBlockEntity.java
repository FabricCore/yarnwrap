package yarnwrap.block.entity;
public class CommandBlockBlockEntity { public net.minecraft.block.entity.CommandBlockBlockEntity wrapperContained; public CommandBlockBlockEntity(net.minecraft.block.entity.CommandBlockBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean conditionMet() { return wrapperContained.conditionMet; }
// public boolean auto() { return wrapperContained.auto; }
// public boolean powered() { return wrapperContained.powered; }
// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
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