package yarnwrap.server.command;
public class ParticleCommand { public net.minecraft.server.command.ParticleCommand wrapperContained; public ParticleCommand(net.minecraft.server.command.ParticleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.particle.ParticleEffect parameters,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d delta,float speed,int count,boolean force,java.util.Collection viewers) { return wrapperContained.execute(source.wrapperContained,parameters.wrapperContained,pos.wrapperContained,delta.wrapperContained,speed,count,force,viewers); }

}