package yarnwrap.server.world;
public class OptionalChunk { public net.minecraft.server.world.OptionalChunk wrapperContained; public OptionalChunk(net.minecraft.server.world.OptionalChunk wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isPresent() { return wrapperContained.isPresent(); }
// public static boolean isPresent() { return net.minecraft.server.world.OptionalChunk.isPresent(); }
// public java.lang.Object orElse(yarnwrap.server.world.OptionalChunk optionalChunk,java.lang.Object other) { return wrapperContained.orElse(optionalChunk.wrapperContained,other); }
// public static java.lang.Object orElse(yarnwrap.server.world.OptionalChunk optionalChunk,java.lang.Object other, ) { return net.minecraft.server.world.OptionalChunk.orElse(optionalChunk.wrapperContained,other); }
// public yarnwrap.server.world.OptionalChunk of(java.lang.Object chunk) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.of(chunk)); }
// public static yarnwrap.server.world.OptionalChunk of(java.lang.Object chunk, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.OptionalChunk.of(chunk)); }
// public yarnwrap.server.world.OptionalChunk of(java.lang.String error) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.of(error)); }
// public static yarnwrap.server.world.OptionalChunk of(java.lang.String error, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.OptionalChunk.of(error)); }
public yarnwrap.server.world.OptionalChunk ifPresent(java.util.function.Consumer callback) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.ifPresent(callback)); }
// public static yarnwrap.server.world.OptionalChunk ifPresent(java.util.function.Consumer callback, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.OptionalChunk.ifPresent(callback)); }
public yarnwrap.server.world.OptionalChunk map(java.util.function.Function mapper) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.map(mapper)); }
// public static yarnwrap.server.world.OptionalChunk map(java.util.function.Function mapper, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.OptionalChunk.map(mapper)); }
// public yarnwrap.server.world.OptionalChunk of(java.util.function.Supplier error) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.of(error)); }
// public static yarnwrap.server.world.OptionalChunk of(java.util.function.Supplier error, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.OptionalChunk.of(error)); }
public java.lang.String getError() { return wrapperContained.getError(); }
// public static java.lang.String getError() { return net.minecraft.server.world.OptionalChunk.getError(); }
public java.lang.Object orElse(java.lang.Object other) { return wrapperContained.orElse(other); }
// public static java.lang.Object orElse(java.lang.Object other, ) { return net.minecraft.server.world.OptionalChunk.orElse(other); }
// public java.lang.Object orElseThrow(java.util.function.Supplier exceptionSupplier) { return wrapperContained.orElseThrow(exceptionSupplier); }
// public static java.lang.Object orElseThrow(java.util.function.Supplier exceptionSupplier, ) { return net.minecraft.server.world.OptionalChunk.orElseThrow(exceptionSupplier); }

}