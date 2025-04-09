package yarnwrap.server.command;
public class EnchantCommand { public net.minecraft.server.command.EnchantCommand wrapperContained; public EnchantCommand(net.minecraft.server.command.EnchantCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_ENTITY_EXCEPTION() { return wrapperContained.FAILED_ENTITY_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_ITEMLESS_EXCEPTION() { return wrapperContained.FAILED_ITEMLESS_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType FAILED_LEVEL_EXCEPTION() { return wrapperContained.FAILED_LEVEL_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_INCOMPATIBLE_EXCEPTION() { return wrapperContained.FAILED_INCOMPATIBLE_EXCEPTION; }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.registry.entry.RegistryEntry enchantment,int level) { return wrapperContained.execute(source.wrapperContained,targets,enchantment.wrapperContained,level); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }

}