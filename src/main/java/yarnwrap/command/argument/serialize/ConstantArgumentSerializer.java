package yarnwrap.command.argument.serialize;
public class ConstantArgumentSerializer { public net.minecraft.command.argument.serialize.ConstantArgumentSerializer wrapperContained; public ConstantArgumentSerializer(net.minecraft.command.argument.serialize.ConstantArgumentSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object properties() { return wrapperContained.properties; }
// // public void properties(Object value) { wrapperContained.properties = value; }
// public ConstantArgumentSerializer(java.util.function.Function typeSupplier) { this.wrapperContained = new net.minecraft.command.argument.serialize.ConstantArgumentSerializer(typeSupplier); }
public yarnwrap.command.argument.serialize.ConstantArgumentSerializer of(java.util.function.Function typeSupplier) { return new yarnwrap.command.argument.serialize.ConstantArgumentSerializer(wrapperContained.of(typeSupplier)); }
public yarnwrap.command.argument.serialize.ConstantArgumentSerializer of(java.util.function.Supplier typeSupplier) { return new yarnwrap.command.argument.serialize.ConstantArgumentSerializer(wrapperContained.of(typeSupplier)); }
// public com.mojang.brigadier.arguments.ArgumentType method_42000(java.util.function.Supplier commandRegistryAccess) { return wrapperContained.method_42000(commandRegistryAccess); }

}