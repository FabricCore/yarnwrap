package yarnwrap.command.argument.serialize;
public class ConstantArgumentSerializer { public net.minecraft.command.argument.serialize.ConstantArgumentSerializer wrapperContained; public ConstantArgumentSerializer(net.minecraft.command.argument.serialize.ConstantArgumentSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object properties() { return wrapperContained.properties; }
public yarnwrap.command.argument.serialize.ConstantArgumentSerializer of(java.util.function.Function typeSupplier) { return new yarnwrap.command.argument.serialize.ConstantArgumentSerializer(wrapperContained.of(typeSupplier)); }
public yarnwrap.command.argument.serialize.ConstantArgumentSerializer of(java.util.function.Supplier typeSupplier) { return new yarnwrap.command.argument.serialize.ConstantArgumentSerializer(wrapperContained.of(typeSupplier)); }

}