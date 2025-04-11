package yarnwrap.data;
public class SnbtProvider { public net.minecraft.data.SnbtProvider wrapperContained; public SnbtProvider(net.minecraft.data.SnbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.List write() { return wrapperContained.write; }
// public void write(java.util.List value) { wrapperContained.write = value; }
// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public java.lang.Iterable paths() { return wrapperContained.paths; }
// public void paths(java.lang.Iterable value) { wrapperContained.paths = value; }
public SnbtProvider(yarnwrap.data.DataOutput output,java.lang.Iterable paths) { this.wrapperContained = new net.minecraft.data.SnbtProvider(output.wrapperContained,paths); }
// public void write(yarnwrap.data.DataWriter cache,Object data,java.nio.file.Path root) { wrapperContained.write(cache.wrapperContained,data,root); }
// public boolean method_10499(java.nio.file.Path path) { return wrapperContained.method_10499(path); }
// public java.lang.String getFileName(java.nio.file.Path root,java.nio.file.Path file) { return wrapperContained.getFileName(root,file); }
// public yarnwrap.data.SnbtProvider addWriter(Object tweaker) { return new yarnwrap.data.SnbtProvider(wrapperContained.addWriter(tweaker)); }
// public yarnwrap.nbt.NbtCompound write(java.lang.String key,yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.write(key,compound.wrapperContained)); }
// public Object toCompressedNbt(java.nio.file.Path path,java.lang.String name) { return wrapperContained.toCompressedNbt(path,name); }
// public java.util.concurrent.CompletableFuture method_46587(java.nio.file.Path path) { return wrapperContained.method_46587(path); }
// public java.util.concurrent.CompletionStage method_46589(java.util.concurrent.CompletableFuture future) { return wrapperContained.method_46589(future); }

}