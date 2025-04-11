package yarnwrap.world.storage;
public class ChunkCompressionFormat { public net.minecraft.world.storage.ChunkCompressionFormat wrapperContained; public ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.storage.ChunkCompressionFormat GZIP() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.GZIP); }
// public void GZIP(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.GZIP = value.wrapperContained; }
public yarnwrap.world.storage.ChunkCompressionFormat DEFLATE() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.DEFLATE); }
// public void DEFLATE(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.DEFLATE = value.wrapperContained; }
public yarnwrap.world.storage.ChunkCompressionFormat UNCOMPRESSED() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.UNCOMPRESSED); }
// public void UNCOMPRESSED(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.UNCOMPRESSED = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap FORMATS() { return wrapperContained.FORMATS; }
// public void FORMATS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.FORMATS = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public Object inputStreamWrapper() { return wrapperContained.inputStreamWrapper; }
// // public void inputStreamWrapper(Object value) { wrapperContained.inputStreamWrapper = value; }
// public Object outputStreamWrapper() { return wrapperContained.outputStreamWrapper; }
// // public void outputStreamWrapper(Object value) { wrapperContained.outputStreamWrapper = value; }
public yarnwrap.world.storage.ChunkCompressionFormat LZ4() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.LZ4); }
// public void LZ4(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.LZ4 = value.wrapperContained; }
public yarnwrap.world.storage.ChunkCompressionFormat DEFAULT_FORMAT() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.DEFAULT_FORMAT); }
// public void DEFAULT_FORMAT(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.DEFAULT_FORMAT = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap FORMAT_BY_NAME() { return wrapperContained.FORMAT_BY_NAME; }
// public void FORMAT_BY_NAME(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.FORMAT_BY_NAME = value; }
// public yarnwrap.world.storage.ChunkCompressionFormat currentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.currentFormat); }
// public void currentFormat(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.currentFormat = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.world.storage.ChunkCompressionFormat CUSTOM() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.CUSTOM); }
// public void CUSTOM(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.CUSTOM = value.wrapperContained; }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.world.storage.ChunkCompressionFormat get(int id) { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.get(id)); }
// public yarnwrap.world.storage.ChunkCompressionFormat add(yarnwrap.world.storage.ChunkCompressionFormat version) { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.add(version.wrapperContained)); }
// public java.io.InputStream wrap(java.io.InputStream inputStream) { return wrapperContained.wrap(inputStream); }
// public java.io.OutputStream wrap(java.io.OutputStream outputStream) { return wrapperContained.wrap(outputStream); }
public boolean exists(int id) { return wrapperContained.exists(id); }
public yarnwrap.world.storage.ChunkCompressionFormat getCurrentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.getCurrentFormat()); }
public void setCurrentFormat(java.lang.String name) { wrapperContained.setCurrentFormat(name); }

}