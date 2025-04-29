package yarnwrap.command.argument;
public class ParticleEffectArgumentType { public net.minecraft.command.argument.ParticleEffectArgumentType wrapperContained; public ParticleEffectArgumentType(net.minecraft.command.argument.ParticleEffectArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.command.argument.ParticleEffectArgumentType.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.command.argument.ParticleEffectArgumentType.registryLookup = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_OPTIONS_EXCEPTION() { return wrapperContained.INVALID_OPTIONS_EXCEPTION; }
// public void INVALID_OPTIONS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_OPTIONS_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_OPTIONS_EXCEPTION() { return net.minecraft.command.argument.ParticleEffectArgumentType.INVALID_OPTIONS_EXCEPTION; }
// public static void INVALID_OPTIONS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ParticleEffectArgumentType.INVALID_OPTIONS_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.ParticleEffectArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.ParticleEffectArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_PARTICLE_EXCEPTION() { return wrapperContained.UNKNOWN_PARTICLE_EXCEPTION; }
// public void UNKNOWN_PARTICLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_PARTICLE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_PARTICLE_EXCEPTION() { return net.minecraft.command.argument.ParticleEffectArgumentType.UNKNOWN_PARTICLE_EXCEPTION; }
// public static void UNKNOWN_PARTICLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ParticleEffectArgumentType.UNKNOWN_PARTICLE_EXCEPTION = value; }

public ParticleEffectArgumentType(yarnwrap.command.CommandRegistryAccess registryAccess) { this.wrapperContained = new net.minecraft.command.argument.ParticleEffectArgumentType(registryAccess.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ParticleEffectArgumentType.listSuggestions(context,builder); }
// public yarnwrap.particle.ParticleType getType(com.mojang.brigadier.StringReader reader,yarnwrap.registry.RegistryWrapper registryWrapper) { return new yarnwrap.particle.ParticleType(wrapperContained.getType(reader,registryWrapper.wrapperContained)); }
// public static yarnwrap.particle.ParticleType getType(com.mojang.brigadier.StringReader reader,yarnwrap.registry.RegistryWrapper registryWrapper, ) { return new yarnwrap.particle.ParticleType(net.minecraft.command.argument.ParticleEffectArgumentType.getType(reader,registryWrapper.wrapperContained)); }
// public com.mojang.brigadier.Message method_59751(java.lang.Object error) { return wrapperContained.method_59751(error); }
// public static com.mojang.brigadier.Message method_59751(java.lang.Object error, ) { return net.minecraft.command.argument.ParticleEffectArgumentType.method_59751(error); }
// public yarnwrap.command.argument.ParticleEffectArgumentType particleEffect(yarnwrap.command.CommandRegistryAccess registryAccess) { return new yarnwrap.command.argument.ParticleEffectArgumentType(wrapperContained.particleEffect(registryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.ParticleEffectArgumentType particleEffect(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return new yarnwrap.command.argument.ParticleEffectArgumentType(net.minecraft.command.argument.ParticleEffectArgumentType.particleEffect(registryAccess.wrapperContained)); }
// public yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,Object registryLookup) { return new yarnwrap.particle.ParticleEffect(wrapperContained.readParameters(reader,registryLookup)); }
// public static yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,Object registryLookup, ) { return new yarnwrap.particle.ParticleEffect(net.minecraft.command.argument.ParticleEffectArgumentType.readParameters(reader,registryLookup)); }
// public com.mojang.brigadier.Message method_9419(java.lang.Object id) { return wrapperContained.method_9419(id); }
// public static com.mojang.brigadier.Message method_9419(java.lang.Object id, ) { return net.minecraft.command.argument.ParticleEffectArgumentType.method_9419(id); }
// public yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,yarnwrap.particle.ParticleType type,Object registryLookup) { return new yarnwrap.particle.ParticleEffect(wrapperContained.readParameters(reader,type.wrapperContained,registryLookup)); }
// public static yarnwrap.particle.ParticleEffect readParameters(com.mojang.brigadier.StringReader reader,yarnwrap.particle.ParticleType type,Object registryLookup, ) { return new yarnwrap.particle.ParticleEffect(net.minecraft.command.argument.ParticleEffectArgumentType.readParameters(reader,type.wrapperContained,registryLookup)); }
// public yarnwrap.particle.ParticleEffect getParticle(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle(context,name)); }
// public static yarnwrap.particle.ParticleEffect getParticle(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.particle.ParticleEffect(net.minecraft.command.argument.ParticleEffectArgumentType.getParticle(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ParticleEffectArgumentType.parse(reader); }

}