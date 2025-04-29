package yarnwrap.block.entity;
public class CommandBlockBlockEntity { public net.minecraft.block.entity.CommandBlockBlockEntity wrapperContained; public CommandBlockBlockEntity(net.minecraft.block.entity.CommandBlockBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean conditionMet() { return wrapperContained.conditionMet; }
// public void conditionMet(boolean value) { wrapperContained.conditionMet = value; }
// public static boolean conditionMet() { return net.minecraft.block.entity.CommandBlockBlockEntity.conditionMet; }
// public static void conditionMet(boolean value, ) { net.minecraft.block.entity.CommandBlockBlockEntity.conditionMet = value; }

// public boolean auto() { return wrapperContained.auto; }
// public void auto(boolean value) { wrapperContained.auto = value; }
// public static boolean auto() { return net.minecraft.block.entity.CommandBlockBlockEntity.auto; }
// public static void auto(boolean value, ) { net.minecraft.block.entity.CommandBlockBlockEntity.auto = value; }

// public boolean powered() { return wrapperContained.powered; }
// public void powered(boolean value) { wrapperContained.powered = value; }
// public static boolean powered() { return net.minecraft.block.entity.CommandBlockBlockEntity.powered; }
// public static void powered(boolean value, ) { net.minecraft.block.entity.CommandBlockBlockEntity.powered = value; }

// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
// public void commandExecutor(yarnwrap.world.CommandBlockExecutor value) { wrapperContained.commandExecutor = value.wrapperContained; }
// public static yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.block.entity.CommandBlockBlockEntity.commandExecutor); }
// public static void commandExecutor(yarnwrap.world.CommandBlockExecutor value, ) { net.minecraft.block.entity.CommandBlockBlockEntity.commandExecutor = value.wrapperContained; }

public CommandBlockBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CommandBlockBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setPowered(boolean powered) { wrapperContained.setPowered(powered); }
// public static void setPowered(boolean powered, ) { net.minecraft.block.entity.CommandBlockBlockEntity.setPowered(powered); }
public Object getCommandBlockType() { return wrapperContained.getCommandBlockType(); }
// public static Object getCommandBlockType() { return net.minecraft.block.entity.CommandBlockBlockEntity.getCommandBlockType(); }
public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }
// public static yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.block.entity.CommandBlockBlockEntity.getCommandExecutor()); }
public void setAuto(boolean auto) { wrapperContained.setAuto(auto); }
// public static void setAuto(boolean auto, ) { net.minecraft.block.entity.CommandBlockBlockEntity.setAuto(auto); }
public boolean isAuto() { return wrapperContained.isAuto(); }
// public static boolean isAuto() { return net.minecraft.block.entity.CommandBlockBlockEntity.isAuto(); }
public boolean isPowered() { return wrapperContained.isPowered(); }
// public static boolean isPowered() { return net.minecraft.block.entity.CommandBlockBlockEntity.isPowered(); }
public boolean isConditionMet() { return wrapperContained.isConditionMet(); }
// public static boolean isConditionMet() { return net.minecraft.block.entity.CommandBlockBlockEntity.isConditionMet(); }
public boolean updateConditionMet() { return wrapperContained.updateConditionMet(); }
// public static boolean updateConditionMet() { return net.minecraft.block.entity.CommandBlockBlockEntity.updateConditionMet(); }
public boolean isConditionalCommandBlock() { return wrapperContained.isConditionalCommandBlock(); }
// public static boolean isConditionalCommandBlock() { return net.minecraft.block.entity.CommandBlockBlockEntity.isConditionalCommandBlock(); }
public void updateCommandBlock() { wrapperContained.updateCommandBlock(); }
// public static void updateCommandBlock() { net.minecraft.block.entity.CommandBlockBlockEntity.updateCommandBlock(); }
// public void scheduleAutoTick() { wrapperContained.scheduleAutoTick(); }
// public static void scheduleAutoTick() { net.minecraft.block.entity.CommandBlockBlockEntity.scheduleAutoTick(); }

}