package yarnwrap.entity.vehicle;
public class CommandBlockMinecartEntity { public net.minecraft.entity.vehicle.CommandBlockMinecartEntity wrapperContained; public CommandBlockMinecartEntity(net.minecraft.entity.vehicle.CommandBlockMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int EXECUTE_TICK_COOLDOWN() { return wrapperContained.EXECUTE_TICK_COOLDOWN; }
// public yarnwrap.entity.data.TrackedData LAST_OUTPUT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAST_OUTPUT); }
// public int lastExecuted() { return wrapperContained.lastExecuted; }
// public yarnwrap.entity.data.TrackedData COMMAND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COMMAND); }
// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }

}