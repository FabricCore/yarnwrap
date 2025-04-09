package yarnwrap.server.command;
public class SpreadPlayersCommand { public net.minecraft.server.command.SpreadPlayersCommand wrapperContained; public SpreadPlayersCommand(net.minecraft.server.command.SpreadPlayersCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType FAILED_TEAMS_EXCEPTION() { return wrapperContained.FAILED_TEAMS_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType FAILED_ENTITIES_EXCEPTION() { return wrapperContained.FAILED_ENTITIES_EXCEPTION; }
// public int MAX_ATTEMPTS() { return wrapperContained.MAX_ATTEMPTS; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType INVALID_HEIGHT_EXCEPTION() { return wrapperContained.INVALID_HEIGHT_EXCEPTION; }
// public int getPileCountRespectingTeams(java.util.Collection entities) { return wrapperContained.getPileCountRespectingTeams(entities); }
// public Object makePiles(yarnwrap.util.math.random.Random random,int count,double minX,double minZ,double maxX,double maxZ) { return wrapperContained.makePiles(random.wrapperContained,count,minX,minZ,maxX,maxZ); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec2f center,float spreadDistance,float maxRange,int maxY,boolean respectTeams,java.util.Collection players) { return wrapperContained.execute(source.wrapperContained,center.wrapperContained,spreadDistance,maxRange,maxY,respectTeams,players); }
// public double getMinDistance(java.util.Collection entities,yarnwrap.server.world.ServerWorld world,Object[] piles,int maxY,boolean respectTeams) { return wrapperContained.getMinDistance(entities,world.wrapperContained,piles,maxY,respectTeams); }
// public void spread(yarnwrap.util.math.Vec2f center,double spreadDistance,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.random.Random random,double minX,double minZ,double maxX,double maxZ,int maxY,Object[] piles,boolean respectTeams) { wrapperContained.spread(center.wrapperContained,spreadDistance,world.wrapperContained,random.wrapperContained,minX,minZ,maxX,maxZ,maxY,piles,respectTeams); }

}