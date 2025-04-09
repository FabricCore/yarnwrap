package yarnwrap.server.command;
public class SummonCommand { public net.minecraft.server.command.SummonCommand wrapperContained; public SummonCommand(net.minecraft.server.command.SummonCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_POSITION_EXCEPTION() { return wrapperContained.INVALID_POSITION_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_UUID_EXCEPTION() { return wrapperContained.FAILED_UUID_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,Object entityType,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt,boolean initialize) { return wrapperContained.execute(source.wrapperContained,entityType,pos.wrapperContained,nbt.wrapperContained,initialize); }
// public yarnwrap.entity.Entity summon(yarnwrap.server.command.ServerCommandSource source,Object entityType,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt,boolean initialize) { return new yarnwrap.entity.Entity(wrapperContained.summon(source.wrapperContained,entityType,pos.wrapperContained,nbt.wrapperContained,initialize)); }

}