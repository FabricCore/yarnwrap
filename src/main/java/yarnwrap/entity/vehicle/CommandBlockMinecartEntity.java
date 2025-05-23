package yarnwrap.entity.vehicle;
public class CommandBlockMinecartEntity { public net.minecraft.entity.vehicle.CommandBlockMinecartEntity wrapperContained; public CommandBlockMinecartEntity(net.minecraft.entity.vehicle.CommandBlockMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData LAST_OUTPUT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAST_OUTPUT); }
// public void LAST_OUTPUT(yarnwrap.entity.data.TrackedData value) { wrapperContained.LAST_OUTPUT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LAST_OUTPUT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.vehicle.CommandBlockMinecartEntity.LAST_OUTPUT); }
// public static void LAST_OUTPUT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.vehicle.CommandBlockMinecartEntity.LAST_OUTPUT = value.wrapperContained; }

// public int lastExecuted() { return wrapperContained.lastExecuted; }
// public void lastExecuted(int value) { wrapperContained.lastExecuted = value; }
// public static int lastExecuted() { return net.minecraft.entity.vehicle.CommandBlockMinecartEntity.lastExecuted; }
// public static void lastExecuted(int value, ) { net.minecraft.entity.vehicle.CommandBlockMinecartEntity.lastExecuted = value; }

// public yarnwrap.entity.data.TrackedData COMMAND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COMMAND); }
// public void COMMAND(yarnwrap.entity.data.TrackedData value) { wrapperContained.COMMAND = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData COMMAND() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.vehicle.CommandBlockMinecartEntity.COMMAND); }
// public static void COMMAND(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.vehicle.CommandBlockMinecartEntity.COMMAND = value.wrapperContained; }

// public yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.commandExecutor); }
// public void commandExecutor(yarnwrap.world.CommandBlockExecutor value) { wrapperContained.commandExecutor = value.wrapperContained; }
// public static yarnwrap.world.CommandBlockExecutor commandExecutor() { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.entity.vehicle.CommandBlockMinecartEntity.commandExecutor); }
// public static void commandExecutor(yarnwrap.world.CommandBlockExecutor value, ) { net.minecraft.entity.vehicle.CommandBlockMinecartEntity.commandExecutor = value.wrapperContained; }

// public int EXECUTE_TICK_COOLDOWN() { return wrapperContained.EXECUTE_TICK_COOLDOWN; }
// public void EXECUTE_TICK_COOLDOWN(int value) { wrapperContained.EXECUTE_TICK_COOLDOWN = value; }
// public static int EXECUTE_TICK_COOLDOWN() { return net.minecraft.entity.vehicle.CommandBlockMinecartEntity.EXECUTE_TICK_COOLDOWN; }
// public static void EXECUTE_TICK_COOLDOWN(int value, ) { net.minecraft.entity.vehicle.CommandBlockMinecartEntity.EXECUTE_TICK_COOLDOWN = value; }

public yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getCommandExecutor()); }
// public static yarnwrap.world.CommandBlockExecutor getCommandExecutor() { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.entity.vehicle.CommandBlockMinecartEntity.getCommandExecutor()); }

}