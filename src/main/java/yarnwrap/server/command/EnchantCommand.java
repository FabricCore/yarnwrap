package yarnwrap.server.command;
public class EnchantCommand { public net.minecraft.server.command.EnchantCommand wrapperContained; public EnchantCommand(net.minecraft.server.command.EnchantCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_ENTITY_EXCEPTION() { return wrapperContained.FAILED_ENTITY_EXCEPTION; }
// public void FAILED_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_ENTITY_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_ITEMLESS_EXCEPTION() { return wrapperContained.FAILED_ITEMLESS_EXCEPTION; }
// public void FAILED_ITEMLESS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_ITEMLESS_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType FAILED_LEVEL_EXCEPTION() { return wrapperContained.FAILED_LEVEL_EXCEPTION; }
// public void FAILED_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.FAILED_LEVEL_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_INCOMPATIBLE_EXCEPTION() { return wrapperContained.FAILED_INCOMPATIBLE_EXCEPTION; }
// public void FAILED_INCOMPATIBLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_INCOMPATIBLE_EXCEPTION = value; }
// public int method_13240(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13240(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.registry.entry.RegistryEntry enchantment,int level) { return wrapperContained.execute(source.wrapperContained,targets,enchantment.wrapperContained,level); }
// public com.mojang.brigadier.Message method_13242(java.lang.Object entityName) { return wrapperContained.method_13242(entityName); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public com.mojang.brigadier.Message method_13244(java.lang.Object itemName) { return wrapperContained.method_13244(itemName); }
// public int method_13245(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13245(context); }
// public boolean method_13246(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13246(source.wrapperContained); }
// public com.mojang.brigadier.Message method_13247(java.lang.Object entityName) { return wrapperContained.method_13247(entityName); }
// public com.mojang.brigadier.Message method_13248(java.lang.Object level,java.lang.Object maxLevel) { return wrapperContained.method_13248(level,maxLevel); }

}