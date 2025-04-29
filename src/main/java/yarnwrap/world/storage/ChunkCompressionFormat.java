package yarnwrap.world.storage;
public class ChunkCompressionFormat { public net.minecraft.world.storage.ChunkCompressionFormat wrapperContained; public ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.storage.ChunkCompressionFormat GZIP() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.GZIP); }
// public void GZIP(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.GZIP = value.wrapperContained; }
public static yarnwrap.world.storage.ChunkCompressionFormat GZIP() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.GZIP); }
// public static void GZIP(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.GZIP = value.wrapperContained; }

// public yarnwrap.world.storage.ChunkCompressionFormat DEFLATE() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.DEFLATE); }
// public void DEFLATE(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.DEFLATE = value.wrapperContained; }
public static yarnwrap.world.storage.ChunkCompressionFormat DEFLATE() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.DEFLATE); }
// public static void DEFLATE(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.DEFLATE = value.wrapperContained; }

// public yarnwrap.world.storage.ChunkCompressionFormat UNCOMPRESSED() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.UNCOMPRESSED); }
// public void UNCOMPRESSED(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.UNCOMPRESSED = value.wrapperContained; }
public static yarnwrap.world.storage.ChunkCompressionFormat UNCOMPRESSED() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.UNCOMPRESSED); }
// public static void UNCOMPRESSED(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.UNCOMPRESSED = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap FORMATS() { return wrapperContained.FORMATS; }
// public void FORMATS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.FORMATS = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap FORMATS() { return net.minecraft.world.storage.ChunkCompressionFormat.FORMATS; }
// public static void FORMATS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.world.storage.ChunkCompressionFormat.FORMATS = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.world.storage.ChunkCompressionFormat.id; }
// public static void id(int value, ) { net.minecraft.world.storage.ChunkCompressionFormat.id = value; }

// public Object inputStreamWrapper() { return wrapperContained.inputStreamWrapper; }
// // public void inputStreamWrapper(Object value) { wrapperContained.inputStreamWrapper = value; }
// // public static Object inputStreamWrapper() { return net.minecraft.world.storage.ChunkCompressionFormat.inputStreamWrapper; }
// // public static void inputStreamWrapper(Object value, ) { net.minecraft.world.storage.ChunkCompressionFormat.inputStreamWrapper = value; }

// public Object outputStreamWrapper() { return wrapperContained.outputStreamWrapper; }
// // public void outputStreamWrapper(Object value) { wrapperContained.outputStreamWrapper = value; }
// // public static Object outputStreamWrapper() { return net.minecraft.world.storage.ChunkCompressionFormat.outputStreamWrapper; }
// // public static void outputStreamWrapper(Object value, ) { net.minecraft.world.storage.ChunkCompressionFormat.outputStreamWrapper = value; }

// public yarnwrap.world.storage.ChunkCompressionFormat LZ4() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.LZ4); }
// public void LZ4(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.LZ4 = value.wrapperContained; }
public static yarnwrap.world.storage.ChunkCompressionFormat LZ4() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.LZ4); }
// public static void LZ4(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.LZ4 = value.wrapperContained; }

// public yarnwrap.world.storage.ChunkCompressionFormat DEFAULT_FORMAT() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.DEFAULT_FORMAT); }
// public void DEFAULT_FORMAT(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.DEFAULT_FORMAT = value.wrapperContained; }
public static yarnwrap.world.storage.ChunkCompressionFormat DEFAULT_FORMAT() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.DEFAULT_FORMAT); }
// public static void DEFAULT_FORMAT(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.DEFAULT_FORMAT = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.storage.ChunkCompressionFormat.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.storage.ChunkCompressionFormat.LOGGER = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap FORMAT_BY_NAME() { return wrapperContained.FORMAT_BY_NAME; }
// public void FORMAT_BY_NAME(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.FORMAT_BY_NAME = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap FORMAT_BY_NAME() { return net.minecraft.world.storage.ChunkCompressionFormat.FORMAT_BY_NAME; }
// public static void FORMAT_BY_NAME(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.world.storage.ChunkCompressionFormat.FORMAT_BY_NAME = value; }

// public yarnwrap.world.storage.ChunkCompressionFormat currentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.currentFormat); }
// public void currentFormat(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.currentFormat = value.wrapperContained; }
// public static yarnwrap.world.storage.ChunkCompressionFormat currentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.currentFormat); }
// public static void currentFormat(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.currentFormat = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.storage.ChunkCompressionFormat.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.storage.ChunkCompressionFormat.name = value; }

// public yarnwrap.world.storage.ChunkCompressionFormat CUSTOM() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.CUSTOM); }
// public void CUSTOM(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.CUSTOM = value.wrapperContained; }
public static yarnwrap.world.storage.ChunkCompressionFormat CUSTOM() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.CUSTOM); }
// public static void CUSTOM(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.ChunkCompressionFormat.CUSTOM = value.wrapperContained; }

// public ChunkCompressionFormat(int id,java.lang.String name,Object inputStreamWrapper,Object outputStreamWrapper) { this.wrapperContained = new net.minecraft.world.storage.ChunkCompressionFormat(id,name,inputStreamWrapper,outputStreamWrapper); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.world.storage.ChunkCompressionFormat.getId(); }
// public yarnwrap.world.storage.ChunkCompressionFormat get(int id) { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.get(id)); }
// public static yarnwrap.world.storage.ChunkCompressionFormat get(int id, ) { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.get(id)); }
// public yarnwrap.world.storage.ChunkCompressionFormat add(yarnwrap.world.storage.ChunkCompressionFormat version) { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.add(version.wrapperContained)); }
// public static yarnwrap.world.storage.ChunkCompressionFormat add(yarnwrap.world.storage.ChunkCompressionFormat version, ) { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.add(version.wrapperContained)); }
// public java.io.InputStream wrap(java.io.InputStream inputStream) { return wrapperContained.wrap(inputStream); }
// public static java.io.InputStream wrap(java.io.InputStream inputStream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.wrap(inputStream); }
// public java.io.OutputStream wrap(java.io.OutputStream outputStream) { return wrapperContained.wrap(outputStream); }
// public static java.io.OutputStream wrap(java.io.OutputStream outputStream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.wrap(outputStream); }
// public boolean exists(int id) { return wrapperContained.exists(id); }
// public static boolean exists(int id, ) { return net.minecraft.world.storage.ChunkCompressionFormat.exists(id); }
// public java.io.InputStream method_21888(java.io.InputStream stream) { return wrapperContained.method_21888(stream); }
// public static java.io.InputStream method_21888(java.io.InputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_21888(stream); }
// public java.io.OutputStream method_21889(java.io.OutputStream stream) { return wrapperContained.method_21889(stream); }
// public static java.io.OutputStream method_21889(java.io.OutputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_21889(stream); }
// public java.io.InputStream method_39803(java.io.InputStream stream) { return wrapperContained.method_39803(stream); }
// public static java.io.InputStream method_39803(java.io.InputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_39803(stream); }
// public java.io.OutputStream method_39804(java.io.OutputStream stream) { return wrapperContained.method_39804(stream); }
// public static java.io.OutputStream method_39804(java.io.OutputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_39804(stream); }
// public java.io.InputStream method_39805(java.io.InputStream stream) { return wrapperContained.method_39805(stream); }
// public static java.io.InputStream method_39805(java.io.InputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_39805(stream); }
// public java.io.OutputStream method_39806(java.io.OutputStream stream) { return wrapperContained.method_39806(stream); }
// public static java.io.OutputStream method_39806(java.io.OutputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_39806(stream); }
// public yarnwrap.world.storage.ChunkCompressionFormat getCurrentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.getCurrentFormat()); }
public static yarnwrap.world.storage.ChunkCompressionFormat getCurrentFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.ChunkCompressionFormat.getCurrentFormat()); }
// public void setCurrentFormat(java.lang.String name) { wrapperContained.setCurrentFormat(name); }
// public static void setCurrentFormat(java.lang.String name, ) { net.minecraft.world.storage.ChunkCompressionFormat.setCurrentFormat(name); }
// public java.io.InputStream method_56569(java.io.InputStream stream) { return wrapperContained.method_56569(stream); }
// public static java.io.InputStream method_56569(java.io.InputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_56569(stream); }
// public java.io.OutputStream method_56570(java.io.OutputStream stream) { return wrapperContained.method_56570(stream); }
// public static java.io.OutputStream method_56570(java.io.OutputStream stream, ) { return net.minecraft.world.storage.ChunkCompressionFormat.method_56570(stream); }

}