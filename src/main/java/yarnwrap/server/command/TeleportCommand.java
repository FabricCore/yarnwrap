package yarnwrap.server.command;
public class TeleportCommand { public net.minecraft.server.command.TeleportCommand wrapperContained; public TeleportCommand(net.minecraft.server.command.TeleportCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_POSITION_EXCEPTION() { return wrapperContained.INVALID_POSITION_EXCEPTION; }
// public void INVALID_POSITION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_POSITION_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_POSITION_EXCEPTION() { return net.minecraft.server.command.TeleportCommand.INVALID_POSITION_EXCEPTION; }
// public static void INVALID_POSITION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TeleportCommand.INVALID_POSITION_EXCEPTION = value; }

// public int method_13758(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13758(context); }
// public static int method_13758(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13758(context); }
// public int method_13759(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13759(context); }
// public static int method_13759(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13759(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.TeleportCommand.register(dispatcher); }
// public int method_13761(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13761(context); }
// public static int method_13761(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13761(context); }
// public int method_13762(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13762(context); }
// public static int method_13762(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13762(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.server.world.ServerWorld world,yarnwrap.command.argument.PosArgument location,yarnwrap.command.argument.PosArgument rotation,yarnwrap.server.command.LookTarget facingLocation) { return wrapperContained.execute(source.wrapperContained,targets,world.wrapperContained,location.wrapperContained,rotation.wrapperContained,facingLocation.wrapperContained); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.server.world.ServerWorld world,yarnwrap.command.argument.PosArgument location,yarnwrap.command.argument.PosArgument rotation,yarnwrap.server.command.LookTarget facingLocation, ) { return net.minecraft.server.command.TeleportCommand.execute(source.wrapperContained,targets,world.wrapperContained,location.wrapperContained,rotation.wrapperContained,facingLocation.wrapperContained); }
// public void teleport(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.server.world.ServerWorld world,double x,double y,double z,java.util.Set movementFlags,float yaw,float pitch,yarnwrap.server.command.LookTarget facingLocation) { wrapperContained.teleport(source.wrapperContained,target.wrapperContained,world.wrapperContained,x,y,z,movementFlags,yaw,pitch,facingLocation.wrapperContained); }
// public static void teleport(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.server.world.ServerWorld world,double x,double y,double z,java.util.Set movementFlags,float yaw,float pitch,yarnwrap.server.command.LookTarget facingLocation, ) { net.minecraft.server.command.TeleportCommand.teleport(source.wrapperContained,target.wrapperContained,world.wrapperContained,x,y,z,movementFlags,yaw,pitch,facingLocation.wrapperContained); }
// public int method_13767(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13767(context); }
// public static int method_13767(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13767(context); }
// public int method_13768(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13768(context); }
// public static int method_13768(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13768(context); }
// public int method_13769(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13769(context); }
// public static int method_13769(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13769(context); }
// public int method_13770(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13770(context); }
// public static int method_13770(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TeleportCommand.method_13770(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.entity.Entity destination) { return wrapperContained.execute(source.wrapperContained,targets,destination.wrapperContained); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.entity.Entity destination, ) { return net.minecraft.server.command.TeleportCommand.execute(source.wrapperContained,targets,destination.wrapperContained); }
// public java.lang.String formatFloat(double d) { return wrapperContained.formatFloat(d); }
// public static java.lang.String formatFloat(double d, ) { return net.minecraft.server.command.TeleportCommand.formatFloat(d); }
// public java.util.Set getFlags(yarnwrap.command.argument.PosArgument pos,yarnwrap.command.argument.PosArgument rotation,boolean sameDimension) { return wrapperContained.getFlags(pos.wrapperContained,rotation.wrapperContained,sameDimension); }
// public static java.util.Set getFlags(yarnwrap.command.argument.PosArgument pos,yarnwrap.command.argument.PosArgument rotation,boolean sameDimension, ) { return net.minecraft.server.command.TeleportCommand.getFlags(pos.wrapperContained,rotation.wrapperContained,sameDimension); }

}