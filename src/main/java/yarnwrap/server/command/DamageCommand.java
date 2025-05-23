package yarnwrap.server.command;
public class DamageCommand { public net.minecraft.server.command.DamageCommand wrapperContained; public DamageCommand(net.minecraft.server.command.DamageCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVULNERABLE_EXCEPTION() { return wrapperContained.INVULNERABLE_EXCEPTION; }
// public void INVULNERABLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVULNERABLE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVULNERABLE_EXCEPTION() { return net.minecraft.server.command.DamageCommand.INVULNERABLE_EXCEPTION; }
// public static void INVULNERABLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.DamageCommand.INVULNERABLE_EXCEPTION = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess, ) { net.minecraft.server.command.DamageCommand.register(dispatcher,registryAccess.wrapperContained); }
// public int method_48749(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48749(context); }
// public static int method_48749(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DamageCommand.method_48749(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,float amount,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.execute(source.wrapperContained,target.wrapperContained,amount,damageSource.wrapperContained); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,float amount,yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.server.command.DamageCommand.execute(source.wrapperContained,target.wrapperContained,amount,damageSource.wrapperContained); }
// public int method_48752(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48752(context); }
// public static int method_48752(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DamageCommand.method_48752(context); }
// public int method_48753(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48753(context); }
// public static int method_48753(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DamageCommand.method_48753(context); }
// public int method_48754(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48754(context); }
// public static int method_48754(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DamageCommand.method_48754(context); }
// public int method_48755(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48755(context); }
// public static int method_48755(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DamageCommand.method_48755(context); }

}