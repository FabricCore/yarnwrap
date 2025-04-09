package yarnwrap.server.command;
public class WorldBorderCommand { public net.minecraft.server.command.WorldBorderCommand wrapperContained; public WorldBorderCommand(net.minecraft.server.command.WorldBorderCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType WARNING_TIME_FAILED_EXCEPTION() { return wrapperContained.WARNING_TIME_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType DAMAGE_AMOUNT_FAILED_EXCEPTION() { return wrapperContained.DAMAGE_AMOUNT_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CENTER_FAILED_EXCEPTION() { return wrapperContained.CENTER_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_FAILED_SMALL_EXCEPTION() { return wrapperContained.SET_FAILED_SMALL_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType WARNING_DISTANCE_FAILED_EXCEPTION() { return wrapperContained.WARNING_DISTANCE_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType DAMAGE_BUFFER_FAILED_EXCEPTION() { return wrapperContained.DAMAGE_BUFFER_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_FAILED_BIG_EXCEPTION() { return wrapperContained.SET_FAILED_BIG_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_FAILED_NO_CHANGE_EXCEPTION() { return wrapperContained.SET_FAILED_NO_CHANGE_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_FAILED_FAR_EXCEPTION() { return wrapperContained.SET_FAILED_FAR_EXCEPTION; }
// public int executeSet(yarnwrap.server.command.ServerCommandSource source,double distance,long time) { return wrapperContained.executeSet(source.wrapperContained,distance,time); }
// public int executeWarningTime(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeWarningTime(source.wrapperContained,time); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeWarningDistance(yarnwrap.server.command.ServerCommandSource source,int distance) { return wrapperContained.executeWarningDistance(source.wrapperContained,distance); }
// public int executeDamage(yarnwrap.server.command.ServerCommandSource source,float damagePerBlock) { return wrapperContained.executeDamage(source.wrapperContained,damagePerBlock); }
// public int executeBuffer(yarnwrap.server.command.ServerCommandSource source,float distance) { return wrapperContained.executeBuffer(source.wrapperContained,distance); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeGet(source.wrapperContained); }
// public int executeCenter(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec2f pos) { return wrapperContained.executeCenter(source.wrapperContained,pos.wrapperContained); }

}