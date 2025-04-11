package yarnwrap.command.argument;
public class ArgumentTypes { public net.minecraft.command.argument.ArgumentTypes wrapperContained; public ArgumentTypes(net.minecraft.command.argument.ArgumentTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map CLASS_MAP() { return wrapperContained.CLASS_MAP; }
// public void CLASS_MAP(java.util.Map value) { wrapperContained.CLASS_MAP = value; }
public yarnwrap.command.argument.serialize.ArgumentSerializer register(yarnwrap.registry.Registry registry) { return new yarnwrap.command.argument.serialize.ArgumentSerializer(wrapperContained.register(registry.wrapperContained)); }
// public yarnwrap.command.argument.serialize.ArgumentSerializer register(yarnwrap.registry.Registry registry,java.lang.String id,java.lang.Class clazz,yarnwrap.command.argument.serialize.ArgumentSerializer serializer) { return new yarnwrap.command.argument.serialize.ArgumentSerializer(wrapperContained.register(registry.wrapperContained,id,clazz,serializer.wrapperContained)); }
// public java.lang.Class upcast(java.lang.Class clazz) { return wrapperContained.upcast(clazz); }
public yarnwrap.command.argument.serialize.ArgumentSerializer get(com.mojang.brigadier.arguments.ArgumentType argumentType) { return new yarnwrap.command.argument.serialize.ArgumentSerializer(wrapperContained.get(argumentType)); }
public boolean has(java.lang.Class clazz) { return wrapperContained.has(clazz); }
public Object getArgumentTypeProperties(com.mojang.brigadier.arguments.ArgumentType argumentType) { return wrapperContained.getArgumentTypeProperties(argumentType); }

}