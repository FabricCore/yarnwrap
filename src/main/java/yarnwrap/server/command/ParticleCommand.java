package yarnwrap.server.command;
public class ParticleCommand { public net.minecraft.server.command.ParticleCommand wrapperContained; public ParticleCommand(net.minecraft.server.command.ParticleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public int method_13483(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13483(context); }
// public int method_13484(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13484(context); }
// public int method_13485(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13485(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int method_13487(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13487(context); }
// public int method_13488(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13488(context); }
// public int method_13489(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13489(context); }
// public boolean method_13490(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13490(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.particle.ParticleEffect parameters,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d delta,float speed,int count,boolean force,java.util.Collection viewers) { return wrapperContained.execute(source.wrapperContained,parameters.wrapperContained,pos.wrapperContained,delta.wrapperContained,speed,count,force,viewers); }
// public int method_13492(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13492(context); }

}