package yarnwrap.server.command;
public class DamageCommand { public net.minecraft.server.command.DamageCommand wrapperContained; public DamageCommand(net.minecraft.server.command.DamageCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVULNERABLE_EXCEPTION() { return wrapperContained.INVULNERABLE_EXCEPTION; }
// public void INVULNERABLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVULNERABLE_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,float amount,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.execute(source.wrapperContained,target.wrapperContained,amount,damageSource.wrapperContained); }

}