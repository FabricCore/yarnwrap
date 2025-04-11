package yarnwrap.server.command;
public class EffectCommand { public net.minecraft.server.command.EffectCommand wrapperContained; public EffectCommand(net.minecraft.server.command.EffectCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType GIVE_FAILED_EXCEPTION() { return wrapperContained.GIVE_FAILED_EXCEPTION; }
// public void GIVE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.GIVE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CLEAR_SPECIFIC_FAILED_EXCEPTION() { return wrapperContained.CLEAR_SPECIFIC_FAILED_EXCEPTION; }
// public void CLEAR_SPECIFIC_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CLEAR_SPECIFIC_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CLEAR_EVERYTHING_FAILED_EXCEPTION() { return wrapperContained.CLEAR_EVERYTHING_FAILED_EXCEPTION; }
// public void CLEAR_EVERYTHING_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CLEAR_EVERYTHING_FAILED_EXCEPTION = value; }
// public int executeGive(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.registry.entry.RegistryEntry statusEffect,java.lang.Integer seconds,int amplifier,boolean showParticles) { return wrapperContained.executeGive(source.wrapperContained,targets,statusEffect.wrapperContained,seconds,amplifier,showParticles); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeClear(source.wrapperContained,targets); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.registry.entry.RegistryEntry statusEffect) { return wrapperContained.executeClear(source.wrapperContained,targets,statusEffect.wrapperContained); }

}