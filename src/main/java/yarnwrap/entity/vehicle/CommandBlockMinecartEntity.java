package yarnwrap.entity.vehicle;
public class CommandBlockMinecartEntity { public net.minecraft.entity.vehicle.CommandBlockMinecartEntity wrapperContained; public CommandBlockMinecartEntity(net.minecraft.entity.vehicle.CommandBlockMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int EXECUTE_TICK_COOLDOWN() { return wrapperContained.EXECUTE_TICK_COOLDOWN; }
// public void EXECUTE_TICK_COOLDOWN(int value) { wrapperContained.EXECUTE_TICK_COOLDOWN = value; }
// public yarnwrap.entity.data.TrackedData LAST_OUTPUT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAST_OUTPUT); }
// public void LAST_OUTPUT(yarnwrap.entity.data.TrackedData value) { wrapperContained.LAST_OUTPUT = value.wrapperContained; }
// public int lastExecuted() { return wrapperContained.lastExecuted; }
// public void lastExecuted(int value) { wrapperContained.lastExecuted = value; }
// public yarnwrap.entity.data.TrackedData COMMAND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COMMAND); }
// public void COMMAND(yarnwrap.entity.data.TrackedData value) { wrapperContained.COMMAND = value.wrapperContained; }
// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
// public void commandExecutor(yarnwrap.world.CommandBlockExecutor value) { wrapperContained.commandExecutor = value.wrapperContained; }
public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }

}