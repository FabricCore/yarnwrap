package yarnwrap.server.command;
public class RideCommand { public net.minecraft.server.command.RideCommand wrapperContained; public RideCommand(net.minecraft.server.command.RideCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NOT_RIDING_EXCEPTION() { return wrapperContained.NOT_RIDING_EXCEPTION; }
// public void NOT_RIDING_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NOT_RIDING_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType ALREADY_RIDING_EXCEPTION() { return wrapperContained.ALREADY_RIDING_EXCEPTION; }
// public void ALREADY_RIDING_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.ALREADY_RIDING_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType GENERIC_FAILURE_EXCEPTION() { return wrapperContained.GENERIC_FAILURE_EXCEPTION; }
// public void GENERIC_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.GENERIC_FAILURE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANT_RIDE_PLAYERS_EXCEPTION() { return wrapperContained.CANT_RIDE_PLAYERS_EXCEPTION; }
// public void CANT_RIDE_PLAYERS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CANT_RIDE_PLAYERS_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType RIDE_LOOP_EXCEPTION() { return wrapperContained.RIDE_LOOP_EXCEPTION; }
// public void RIDE_LOOP_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.RIDE_LOOP_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType WRONG_DIMENSION_EXCEPTION() { return wrapperContained.WRONG_DIMENSION_EXCEPTION; }
// public void WRONG_DIMENSION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.WRONG_DIMENSION_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeDismount(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity rider) { return wrapperContained.executeDismount(source.wrapperContained,rider.wrapperContained); }
// public int executeMount(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity rider,yarnwrap.entity.Entity vehicle) { return wrapperContained.executeMount(source.wrapperContained,rider.wrapperContained,vehicle.wrapperContained); }

}