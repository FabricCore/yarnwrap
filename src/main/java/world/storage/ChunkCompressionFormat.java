package yarnwrap.world.storage;
public class ChunkCompressionFormat { public net.minecraft.world.storage.ChunkCompressionFormat wrapperContained; public ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.storage.ChunkCompressionFormat GZIP() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.GZIP); }
public yarnwrap.world.storage.ChunkCompressionFormat DEFLATE() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.DEFLATE); }
public yarnwrap.world.storage.ChunkCompressionFormat UNCOMPRESSED() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.UNCOMPRESSED); }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap FORMATS() { return wrapperContained.FORMATS; }
// public int id() { return wrapperContained.id; }
// public Object inputStreamWrapper() { return wrapperContained.inputStreamWrapper; }
// public Object outputStreamWrapper() { return wrapperContained.outputStreamWrapper; }
public yarnwrap.world.storage.ChunkCompressionFormat LZ4() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.LZ4); }
public yarnwrap.world.storage.ChunkCompressionFormat DEFAULT_FORMAT() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.DEFAULT_FORMAT); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap FORMAT_BY_NAME() { return wrapperContained.FORMAT_BY_NAME; }
// public yarnwrap.world.storage.ChunkCompressionFormat currentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.currentFormat); }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.world.storage.ChunkCompressionFormat CUSTOM() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.CUSTOM); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.world.storage.ChunkCompressionFormat get(int id) { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.get(id)); }
// public yarnwrap.world.storage.ChunkCompressionFormat add(yarnwrap.world.storage.ChunkCompressionFormat version) { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.add(version.wrapperContained)); }
// public java.io.InputStream wrap(java.io.InputStream inputStream) { return wrapperContained.wrap(inputStream); }
// public java.io.OutputStream wrap(java.io.OutputStream outputStream) { return wrapperContained.wrap(outputStream); }
public boolean exists(int id) { return wrapperContained.exists(id); }
public yarnwrap.world.storage.ChunkCompressionFormat getCurrentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.getCurrentFormat()); }
public void setCurrentFormat(java.lang.String name) { wrapperContained.setCurrentFormat(name); }

}