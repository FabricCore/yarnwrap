package yarnwrap.server.command;
public class SummonCommand { public net.minecraft.server.command.SummonCommand wrapperContained; public SummonCommand(net.minecraft.server.command.SummonCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_POSITION_EXCEPTION() { return wrapperContained.INVALID_POSITION_EXCEPTION; }
// public void INVALID_POSITION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_POSITION_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_UUID_EXCEPTION() { return wrapperContained.FAILED_UUID_EXCEPTION; }
// public void FAILED_UUID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_UUID_EXCEPTION = value; }
// public int method_13689(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13689(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int method_13691(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13691(context); }
// public int method_13692(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13692(context); }
// public boolean method_13693(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13693(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,Object entityType,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt,boolean initialize) { return wrapperContained.execute(source.wrapperContained,entityType,pos.wrapperContained,nbt.wrapperContained,initialize); }
// public yarnwrap.entity.Entity summon(yarnwrap.server.command.ServerCommandSource source,Object entityType,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt,boolean initialize) { return new yarnwrap.entity.Entity(wrapperContained.summon(source.wrapperContained,entityType,pos.wrapperContained,nbt.wrapperContained,initialize)); }
// public yarnwrap.entity.Entity method_48759(yarnwrap.util.math.Vec3d entity) { return new yarnwrap.entity.Entity(wrapperContained.method_48759(entity.wrapperContained)); }

}