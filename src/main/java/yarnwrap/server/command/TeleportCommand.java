package yarnwrap.server.command;
public class TeleportCommand { public net.minecraft.server.command.TeleportCommand wrapperContained; public TeleportCommand(net.minecraft.server.command.TeleportCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_POSITION_EXCEPTION() { return wrapperContained.INVALID_POSITION_EXCEPTION; }
// public void INVALID_POSITION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_POSITION_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.server.world.ServerWorld world,yarnwrap.command.argument.PosArgument location,yarnwrap.command.argument.PosArgument rotation,Object facingLocation) { return wrapperContained.execute(source.wrapperContained,targets,world.wrapperContained,location.wrapperContained,rotation.wrapperContained,facingLocation); }
// public void teleport(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.server.world.ServerWorld world,double x,double y,double z,java.util.Set movementFlags,float yaw,float pitch,Object facingLocation) { wrapperContained.teleport(source.wrapperContained,target.wrapperContained,world.wrapperContained,x,y,z,movementFlags,yaw,pitch,facingLocation); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.entity.Entity destination) { return wrapperContained.execute(source.wrapperContained,targets,destination.wrapperContained); }
// public java.lang.String formatFloat(double d) { return wrapperContained.formatFloat(d); }

}