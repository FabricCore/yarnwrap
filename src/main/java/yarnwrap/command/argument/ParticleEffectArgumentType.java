package yarnwrap.command.argument;
public class ParticleEffectArgumentType { public net.minecraft.command.argument.ParticleEffectArgumentType wrapperContained; public ParticleEffectArgumentType(net.minecraft.command.argument.ParticleEffectArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_OPTIONS_EXCEPTION() { return wrapperContained.INVALID_OPTIONS_EXCEPTION; }
// public void INVALID_OPTIONS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_OPTIONS_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_PARTICLE_EXCEPTION() { return wrapperContained.UNKNOWN_PARTICLE_EXCEPTION; }
// public void UNKNOWN_PARTICLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_PARTICLE_EXCEPTION = value; }
// public yarnwrap.particle.ParticleType getType(com.mojang.brigadier.StringReader reader,yarnwrap.registry.RegistryWrapper registryWrapper) { return new yarnwrap.particle.ParticleType(wrapperContained.getType(reader,registryWrapper.wrapperContained)); }
public yarnwrap.command.argument.ParticleEffectArgumentType particleEffect(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.ParticleEffectArgumentType(wrapperContained.particleEffect(registryAccess.wrapperContained)); }
// public yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,Object registryLookup) { return new yarnwrap.particle.ParticleEffect(wrapperContained.readParameters(reader,registryLookup)); }
// public yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,yarnwrap.particle.ParticleType type,Object registryLookup) { return new yarnwrap.particle.ParticleEffect(wrapperContained.readParameters(reader,type.wrapperContained,registryLookup)); }
public yarnwrap.particle.ParticleEffect getParticle(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle(context,name)); }

}