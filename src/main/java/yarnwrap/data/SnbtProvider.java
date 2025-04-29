package yarnwrap.data;
public class SnbtProvider { public net.minecraft.data.SnbtProvider wrapperContained; public SnbtProvider(net.minecraft.data.SnbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.data.SnbtProvider.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.data.SnbtProvider.LOGGER = value; }

// public java.util.List write() { return wrapperContained.write; }
// public void write(java.util.List value) { wrapperContained.write = value; }
// public static java.util.List write() { return net.minecraft.data.SnbtProvider.write; }
// public static void write(java.util.List value, ) { net.minecraft.data.SnbtProvider.write = value; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.SnbtProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.SnbtProvider.output = value.wrapperContained; }

// public java.lang.Iterable paths() { return wrapperContained.paths; }
// public void paths(java.lang.Iterable value) { wrapperContained.paths = value; }
// public static java.lang.Iterable paths() { return net.minecraft.data.SnbtProvider.paths; }
// public static void paths(java.lang.Iterable value, ) { net.minecraft.data.SnbtProvider.paths = value; }

public SnbtProvider(yarnwrap.data.DataOutput output,java.lang.Iterable paths) { this.wrapperContained = new net.minecraft.data.SnbtProvider(output.wrapperContained,paths); }
// public void write(yarnwrap.data.DataWriter cache,Object data,java.nio.file.Path root) { wrapperContained.write(cache.wrapperContained,data,root); }
// public static void write(yarnwrap.data.DataWriter cache,Object data,java.nio.file.Path root, ) { net.minecraft.data.SnbtProvider.write(cache.wrapperContained,data,root); }
// public boolean method_10499(java.nio.file.Path path) { return wrapperContained.method_10499(path); }
// public static boolean method_10499(java.nio.file.Path path, ) { return net.minecraft.data.SnbtProvider.method_10499(path); }
// public java.lang.String getFileName(java.nio.file.Path root,java.nio.file.Path file) { return wrapperContained.getFileName(root,file); }
// public static java.lang.String getFileName(java.nio.file.Path root,java.nio.file.Path file, ) { return net.minecraft.data.SnbtProvider.getFileName(root,file); }
// public yarnwrap.data.SnbtProvider addWriter(Object tweaker) { return new yarnwrap.data.SnbtProvider(wrapperContained.addWriter(tweaker)); }
// public static yarnwrap.data.SnbtProvider addWriter(Object tweaker, ) { return new yarnwrap.data.SnbtProvider(net.minecraft.data.SnbtProvider.addWriter(tweaker)); }
// public yarnwrap.nbt.NbtCompound write(java.lang.String key,yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.write(key,compound.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound write(java.lang.String key,yarnwrap.nbt.NbtCompound compound, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.data.SnbtProvider.write(key,compound.wrapperContained)); }
// public Object toCompressedNbt(java.nio.file.Path path,java.lang.String name) { return wrapperContained.toCompressedNbt(path,name); }
// public static Object toCompressedNbt(java.nio.file.Path path,java.lang.String name, ) { return net.minecraft.data.SnbtProvider.toCompressedNbt(path,name); }
// public java.util.concurrent.CompletableFuture method_46587(java.nio.file.Path path) { return wrapperContained.method_46587(path); }
// public static java.util.concurrent.CompletableFuture method_46587(java.nio.file.Path path, ) { return net.minecraft.data.SnbtProvider.method_46587(path); }
// public java.util.concurrent.CompletionStage method_46589(java.util.concurrent.CompletableFuture future) { return wrapperContained.method_46589(future); }
// public static java.util.concurrent.CompletionStage method_46589(java.util.concurrent.CompletableFuture future, ) { return net.minecraft.data.SnbtProvider.method_46589(future); }

}