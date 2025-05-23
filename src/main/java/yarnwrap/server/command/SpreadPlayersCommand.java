package yarnwrap.server.command;
public class SpreadPlayersCommand { public net.minecraft.server.command.SpreadPlayersCommand wrapperContained; public SpreadPlayersCommand(net.minecraft.server.command.SpreadPlayersCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType FAILED_TEAMS_EXCEPTION() { return wrapperContained.FAILED_TEAMS_EXCEPTION; }
// public void FAILED_TEAMS_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType value) { wrapperContained.FAILED_TEAMS_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType FAILED_TEAMS_EXCEPTION() { return net.minecraft.server.command.SpreadPlayersCommand.FAILED_TEAMS_EXCEPTION; }
// public static void FAILED_TEAMS_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType value, ) { net.minecraft.server.command.SpreadPlayersCommand.FAILED_TEAMS_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType FAILED_ENTITIES_EXCEPTION() { return wrapperContained.FAILED_ENTITIES_EXCEPTION; }
// public void FAILED_ENTITIES_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType value) { wrapperContained.FAILED_ENTITIES_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType FAILED_ENTITIES_EXCEPTION() { return net.minecraft.server.command.SpreadPlayersCommand.FAILED_ENTITIES_EXCEPTION; }
// public static void FAILED_ENTITIES_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType value, ) { net.minecraft.server.command.SpreadPlayersCommand.FAILED_ENTITIES_EXCEPTION = value; }

// public int MAX_ATTEMPTS() { return wrapperContained.MAX_ATTEMPTS; }
// public void MAX_ATTEMPTS(int value) { wrapperContained.MAX_ATTEMPTS = value; }
// public static int MAX_ATTEMPTS() { return net.minecraft.server.command.SpreadPlayersCommand.MAX_ATTEMPTS; }
// public static void MAX_ATTEMPTS(int value, ) { net.minecraft.server.command.SpreadPlayersCommand.MAX_ATTEMPTS = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType INVALID_HEIGHT_EXCEPTION() { return wrapperContained.INVALID_HEIGHT_EXCEPTION; }
// public void INVALID_HEIGHT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.INVALID_HEIGHT_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType INVALID_HEIGHT_EXCEPTION() { return net.minecraft.server.command.SpreadPlayersCommand.INVALID_HEIGHT_EXCEPTION; }
// public static void INVALID_HEIGHT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.server.command.SpreadPlayersCommand.INVALID_HEIGHT_EXCEPTION = value; }

// public int getPileCountRespectingTeams(java.util.Collection entities) { return wrapperContained.getPileCountRespectingTeams(entities); }
// public static int getPileCountRespectingTeams(java.util.Collection entities, ) { return net.minecraft.server.command.SpreadPlayersCommand.getPileCountRespectingTeams(entities); }
// public Object makePiles(yarnwrap.util.math.random.Random random,int count,double minX,double minZ,double maxX,double maxZ) { return wrapperContained.makePiles(random.wrapperContained,count,minX,minZ,maxX,maxZ); }
// public static Object makePiles(yarnwrap.util.math.random.Random random,int count,double minX,double minZ,double maxX,double maxZ, ) { return net.minecraft.server.command.SpreadPlayersCommand.makePiles(random.wrapperContained,count,minX,minZ,maxX,maxZ); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.SpreadPlayersCommand.register(dispatcher); }
// public com.mojang.brigadier.Message method_13655(java.lang.Object pilesCount,java.lang.Object x,java.lang.Object z,java.lang.Object maxSpreadDistance) { return wrapperContained.method_13655(pilesCount,x,z,maxSpreadDistance); }
// public static com.mojang.brigadier.Message method_13655(java.lang.Object pilesCount,java.lang.Object x,java.lang.Object z,java.lang.Object maxSpreadDistance, ) { return net.minecraft.server.command.SpreadPlayersCommand.method_13655(pilesCount,x,z,maxSpreadDistance); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec2f center,float spreadDistance,float maxRange,int maxY,boolean respectTeams,java.util.Collection targets) { return wrapperContained.execute(source.wrapperContained,center.wrapperContained,spreadDistance,maxRange,maxY,respectTeams,targets); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec2f center,float spreadDistance,float maxRange,int maxY,boolean respectTeams,java.util.Collection targets, ) { return net.minecraft.server.command.SpreadPlayersCommand.execute(source.wrapperContained,center.wrapperContained,spreadDistance,maxRange,maxY,respectTeams,targets); }
// public double teleport(java.util.Collection entities,yarnwrap.server.world.ServerWorld world,Object[] piles,int maxY,boolean respectTeams) { return wrapperContained.teleport(entities,world.wrapperContained,piles,maxY,respectTeams); }
// public static double teleport(java.util.Collection entities,yarnwrap.server.world.ServerWorld world,Object[] piles,int maxY,boolean respectTeams, ) { return net.minecraft.server.command.SpreadPlayersCommand.teleport(entities,world.wrapperContained,piles,maxY,respectTeams); }
// public int method_13658(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13658(context); }
// public static int method_13658(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SpreadPlayersCommand.method_13658(context); }
// public com.mojang.brigadier.Message method_13660(java.lang.Object pilesCount,java.lang.Object x,java.lang.Object z,java.lang.Object maxSpreadDistance) { return wrapperContained.method_13660(pilesCount,x,z,maxSpreadDistance); }
// public static com.mojang.brigadier.Message method_13660(java.lang.Object pilesCount,java.lang.Object x,java.lang.Object z,java.lang.Object maxSpreadDistance, ) { return net.minecraft.server.command.SpreadPlayersCommand.method_13660(pilesCount,x,z,maxSpreadDistance); }
// public void spread(yarnwrap.util.math.Vec2f center,double spreadDistance,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.random.Random random,double minX,double minZ,double maxX,double maxZ,int maxY,Object[] piles,boolean respectTeams) { wrapperContained.spread(center.wrapperContained,spreadDistance,world.wrapperContained,random.wrapperContained,minX,minZ,maxX,maxZ,maxY,piles,respectTeams); }
// public static void spread(yarnwrap.util.math.Vec2f center,double spreadDistance,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.random.Random random,double minX,double minZ,double maxX,double maxZ,int maxY,Object[] piles,boolean respectTeams, ) { net.minecraft.server.command.SpreadPlayersCommand.spread(center.wrapperContained,spreadDistance,world.wrapperContained,random.wrapperContained,minX,minZ,maxX,maxZ,maxY,piles,respectTeams); }
// public int method_29193(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_29193(context); }
// public static int method_29193(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SpreadPlayersCommand.method_29193(context); }
// public com.mojang.brigadier.Message method_39991(java.lang.Object maxY,java.lang.Object worldBottomY) { return wrapperContained.method_39991(maxY,worldBottomY); }
// public static com.mojang.brigadier.Message method_39991(java.lang.Object maxY,java.lang.Object worldBottomY, ) { return net.minecraft.server.command.SpreadPlayersCommand.method_39991(maxY,worldBottomY); }

}