package yarnwrap.command.argument;
public class ParticleEffectArgumentType { public net.minecraft.command.argument.ParticleEffectArgumentType wrapperContained; public ParticleEffectArgumentType(net.minecraft.command.argument.ParticleEffectArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_OPTIONS_EXCEPTION() { return wrapperContained.INVALID_OPTIONS_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_PARTICLE_EXCEPTION() { return wrapperContained.UNKNOWN_PARTICLE_EXCEPTION; }
// public yarnwrap.particle.ParticleType getType(com.mojang.brigadier.StringReader reader,yarnwrap.registry.RegistryWrapper registryWrapper) { return new yarnwrap.particle.ParticleType(wrapperContained.getType(reader,registryWrapper.wrapperContained)); }
public yarnwrap.command.argument.ParticleEffectArgumentType particleEffect(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.ParticleEffectArgumentType(wrapperContained.particleEffect(registryAccess.wrapperContained)); }
// public yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,Object registryLookup) { return new yarnwrap.particle.ParticleEffect(wrapperContained.readParameters(reader,registryLookup)); }
// public yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,yarnwrap.particle.ParticleType type,Object registryLookup) { return new yarnwrap.particle.ParticleEffect(wrapperContained.readParameters(reader,type.wrapperContained,registryLookup)); }
public yarnwrap.particle.ParticleEffect getParticle(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle(context,name)); }

}