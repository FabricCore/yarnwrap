package yarnwrap.data;
public class SnbtProvider { public net.minecraft.data.SnbtProvider wrapperContained; public SnbtProvider(net.minecraft.data.SnbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List write() { return wrapperContained.write; }
// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public java.lang.Iterable paths() { return wrapperContained.paths; }
// public void write(yarnwrap.data.DataWriter cache,Object data,java.nio.file.Path root) { wrapperContained.write(cache.wrapperContained,data,root); }
// public java.lang.String getFileName(java.nio.file.Path root,java.nio.file.Path file) { return wrapperContained.getFileName(root,file); }
// public yarnwrap.data.SnbtProvider addWriter(Object tweaker) { return new yarnwrap.data.SnbtProvider(wrapperContained.addWriter(tweaker)); }
// public yarnwrap.nbt.NbtCompound write(java.lang.String key,yarnwrap.nbt.NbtCompound compound) { return new yarnwrap.nbt.NbtCompound(wrapperContained.write(key,compound.wrapperContained)); }
// public Object toCompressedNbt(java.nio.file.Path path,java.lang.String name) { return wrapperContained.toCompressedNbt(path,name); }

}