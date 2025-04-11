package yarnwrap.server.command;
public class EffectCommand { public net.minecraft.server.command.EffectCommand wrapperContained; public EffectCommand(net.minecraft.server.command.EffectCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType GIVE_FAILED_EXCEPTION() { return wrapperContained.GIVE_FAILED_EXCEPTION; }
// public void GIVE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.GIVE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CLEAR_SPECIFIC_FAILED_EXCEPTION() { return wrapperContained.CLEAR_SPECIFIC_FAILED_EXCEPTION; }
// public void CLEAR_SPECIFIC_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CLEAR_SPECIFIC_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CLEAR_EVERYTHING_FAILED_EXCEPTION() { return wrapperContained.CLEAR_EVERYTHING_FAILED_EXCEPTION; }
// public void CLEAR_EVERYTHING_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CLEAR_EVERYTHING_FAILED_EXCEPTION = value; }
// public int method_13225(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13225(context); }
// public int method_13226(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13226(context); }
// public int executeGive(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.registry.entry.RegistryEntry statusEffect,java.lang.Integer seconds,int amplifier,boolean showParticles) { return wrapperContained.executeGive(source.wrapperContained,targets,statusEffect.wrapperContained,seconds,amplifier,showParticles); }
// public int method_13228(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13228(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeClear(source.wrapperContained,targets); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.registry.entry.RegistryEntry statusEffect) { return wrapperContained.executeClear(source.wrapperContained,targets,statusEffect.wrapperContained); }
// public int method_13232(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13232(context); }
// public int method_13233(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13233(context); }
// public int method_13234(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13234(context); }
// public boolean method_13235(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13235(source.wrapperContained); }
// public int method_23650(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_23650(context); }
// public int method_48545(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48545(context); }
// public int method_48546(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48546(context); }
// public int method_48547(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48547(context); }

}