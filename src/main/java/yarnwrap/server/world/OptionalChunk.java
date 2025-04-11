package yarnwrap.server.world;
public class OptionalChunk { public net.minecraft.server.world.OptionalChunk wrapperContained; public OptionalChunk(net.minecraft.server.world.OptionalChunk wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isPresent() { return wrapperContained.isPresent(); }
// public java.lang.Object orElse(yarnwrap.server.world.OptionalChunk optionalChunk,java.lang.Object other) { return wrapperContained.orElse(optionalChunk.wrapperContained,other); }
// public yarnwrap.server.world.OptionalChunk of(java.lang.Object chunk) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.of(chunk)); }
// public yarnwrap.server.world.OptionalChunk of(java.lang.String error) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.of(error)); }
public yarnwrap.server.world.OptionalChunk ifPresent(java.util.function.Consumer callback) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.ifPresent(callback)); }
public yarnwrap.server.world.OptionalChunk map(java.util.function.Function mapper) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.map(mapper)); }
// public yarnwrap.server.world.OptionalChunk of(java.util.function.Supplier error) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.of(error)); }
public java.lang.String getError() { return wrapperContained.getError(); }
public java.lang.Object orElse(java.lang.Object other) { return wrapperContained.orElse(other); }
// public java.lang.Object orElseThrow(java.util.function.Supplier exceptionSupplier) { return wrapperContained.orElseThrow(exceptionSupplier); }

}