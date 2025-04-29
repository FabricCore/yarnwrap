package yarnwrap.world.storage;
public class RegionFile { public net.minecraft.world.storage.RegionFile wrapperContained; public RegionFile(net.minecraft.world.storage.RegionFile wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.storage.RegionFile.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.storage.RegionFile.LOGGER = value; }

// public java.nio.ByteBuffer ZERO() { return wrapperContained.ZERO; }
// public void ZERO(java.nio.ByteBuffer value) { wrapperContained.ZERO = value; }
// public static java.nio.ByteBuffer ZERO() { return net.minecraft.world.storage.RegionFile.ZERO; }
// public static void ZERO(java.nio.ByteBuffer value, ) { net.minecraft.world.storage.RegionFile.ZERO = value; }

// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public void channel(java.nio.channels.FileChannel value) { wrapperContained.channel = value; }
// public static java.nio.channels.FileChannel channel() { return net.minecraft.world.storage.RegionFile.channel; }
// public static void channel(java.nio.channels.FileChannel value, ) { net.minecraft.world.storage.RegionFile.channel = value; }

// public yarnwrap.world.storage.ChunkCompressionFormat compressionFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.compressionFormat); }
// public void compressionFormat(yarnwrap.world.storage.ChunkCompressionFormat value) { wrapperContained.compressionFormat = value.wrapperContained; }
// public static yarnwrap.world.storage.ChunkCompressionFormat compressionFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(net.minecraft.world.storage.RegionFile.compressionFormat); }
// public static void compressionFormat(yarnwrap.world.storage.ChunkCompressionFormat value, ) { net.minecraft.world.storage.RegionFile.compressionFormat = value.wrapperContained; }

// public java.nio.ByteBuffer header() { return wrapperContained.header; }
// public void header(java.nio.ByteBuffer value) { wrapperContained.header = value; }
// public static java.nio.ByteBuffer header() { return net.minecraft.world.storage.RegionFile.header; }
// public static void header(java.nio.ByteBuffer value, ) { net.minecraft.world.storage.RegionFile.header = value; }

// public java.nio.IntBuffer sectorData() { return wrapperContained.sectorData; }
// public void sectorData(java.nio.IntBuffer value) { wrapperContained.sectorData = value; }
// public static java.nio.IntBuffer sectorData() { return net.minecraft.world.storage.RegionFile.sectorData; }
// public static void sectorData(java.nio.IntBuffer value, ) { net.minecraft.world.storage.RegionFile.sectorData = value; }

// public java.nio.IntBuffer saveTimes() { return wrapperContained.saveTimes; }
// public void saveTimes(java.nio.IntBuffer value) { wrapperContained.saveTimes = value; }
// public static java.nio.IntBuffer saveTimes() { return net.minecraft.world.storage.RegionFile.saveTimes; }
// public static void saveTimes(java.nio.IntBuffer value, ) { net.minecraft.world.storage.RegionFile.saveTimes = value; }

// public yarnwrap.world.storage.SectorMap sectors() { return new yarnwrap.world.storage.SectorMap(wrapperContained.sectors); }
// public void sectors(yarnwrap.world.storage.SectorMap value) { wrapperContained.sectors = value.wrapperContained; }
// public static yarnwrap.world.storage.SectorMap sectors() { return new yarnwrap.world.storage.SectorMap(net.minecraft.world.storage.RegionFile.sectors); }
// public static void sectors(yarnwrap.world.storage.SectorMap value, ) { net.minecraft.world.storage.RegionFile.sectors = value.wrapperContained; }

// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public void directory(java.nio.file.Path value) { wrapperContained.directory = value; }
// public static java.nio.file.Path directory() { return net.minecraft.world.storage.RegionFile.directory; }
// public static void directory(java.nio.file.Path value, ) { net.minecraft.world.storage.RegionFile.directory = value; }

// public int SECTOR_DATA_LIMIT() { return wrapperContained.SECTOR_DATA_LIMIT; }
// public void SECTOR_DATA_LIMIT(int value) { wrapperContained.SECTOR_DATA_LIMIT = value; }
// public static int SECTOR_DATA_LIMIT() { return net.minecraft.world.storage.RegionFile.SECTOR_DATA_LIMIT; }
// public static void SECTOR_DATA_LIMIT(int value, ) { net.minecraft.world.storage.RegionFile.SECTOR_DATA_LIMIT = value; }

// public java.lang.String FILE_EXTENSION() { return wrapperContained.FILE_EXTENSION; }
// public void FILE_EXTENSION(java.lang.String value) { wrapperContained.FILE_EXTENSION = value; }
// public static java.lang.String FILE_EXTENSION() { return net.minecraft.world.storage.RegionFile.FILE_EXTENSION; }
// public static void FILE_EXTENSION(java.lang.String value, ) { net.minecraft.world.storage.RegionFile.FILE_EXTENSION = value; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public static java.nio.file.Path path() { return net.minecraft.world.storage.RegionFile.path; }
// public static void path(java.nio.file.Path value, ) { net.minecraft.world.storage.RegionFile.path = value; }

// public yarnwrap.world.storage.StorageKey storageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.storageKey); }
// public void storageKey(yarnwrap.world.storage.StorageKey value) { wrapperContained.storageKey = value.wrapperContained; }
// public static yarnwrap.world.storage.StorageKey storageKey() { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.RegionFile.storageKey); }
// public static void storageKey(yarnwrap.world.storage.StorageKey value, ) { net.minecraft.world.storage.RegionFile.storageKey = value.wrapperContained; }

// public RegionFile(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path path,java.nio.file.Path directory,yarnwrap.world.storage.ChunkCompressionFormat compressionFormat,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.RegionFile(storageKey.wrapperContained,path,directory,compressionFormat.wrapperContained,dsync); }
// public RegionFile(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,java.nio.file.Path path,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.RegionFile(storageKey.wrapperContained,directory,path,dsync); }
// public int getSectorData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getSectorData(pos.wrapperContained); }
// public static int getSectorData(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.RegionFile.getSectorData(pos.wrapperContained); }
public boolean hasChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.hasChunk(pos.wrapperContained); }
// public static boolean hasChunk(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.RegionFile.hasChunk(pos.wrapperContained); }
// public int getIndex(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getIndex(pos.wrapperContained); }
// public static int getIndex(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.RegionFile.getIndex(pos.wrapperContained); }
// public void writeHeader() { wrapperContained.writeHeader(); }
// public static void writeHeader() { net.minecraft.world.storage.RegionFile.writeHeader(); }
// public int getSize(int sectorData) { return wrapperContained.getSize(sectorData); }
// public static int getSize(int sectorData, ) { return net.minecraft.world.storage.RegionFile.getSize(sectorData); }
// public int packSectorData(int offset,int size) { return wrapperContained.packSectorData(offset,size); }
// public static int packSectorData(int offset,int size, ) { return net.minecraft.world.storage.RegionFile.packSectorData(offset,size); }
// public java.io.DataInputStream getChunkInputStream(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChunkInputStream(pos.wrapperContained); }
// public static java.io.DataInputStream getChunkInputStream(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.RegionFile.getChunkInputStream(pos.wrapperContained); }
// public void writeChunk(yarnwrap.util.math.ChunkPos pos,java.nio.ByteBuffer buf) { wrapperContained.writeChunk(pos.wrapperContained,buf); }
// public static void writeChunk(yarnwrap.util.math.ChunkPos pos,java.nio.ByteBuffer buf, ) { net.minecraft.world.storage.RegionFile.writeChunk(pos.wrapperContained,buf); }
// public java.io.ByteArrayInputStream getInputStream(java.nio.ByteBuffer buffer,int length) { return wrapperContained.getInputStream(buffer,length); }
// public static java.io.ByteArrayInputStream getInputStream(java.nio.ByteBuffer buffer,int length, ) { return net.minecraft.world.storage.RegionFile.getInputStream(buffer,length); }
// public void fillLastSector() { wrapperContained.fillLastSector(); }
// public static void fillLastSector() { net.minecraft.world.storage.RegionFile.fillLastSector(); }
// public int getOffset(int sectorData) { return wrapperContained.getOffset(sectorData); }
// public static int getOffset(int sectorData, ) { return net.minecraft.world.storage.RegionFile.getOffset(sectorData); }
public boolean isChunkValid(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isChunkValid(pos.wrapperContained); }
// public static boolean isChunkValid(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.RegionFile.isChunkValid(pos.wrapperContained); }
// public int getSectorCount(int byteCount) { return wrapperContained.getSectorCount(byteCount); }
// public static int getSectorCount(int byteCount, ) { return net.minecraft.world.storage.RegionFile.getSectorCount(byteCount); }
// public java.io.DataOutputStream getChunkOutputStream(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChunkOutputStream(pos.wrapperContained); }
// public static java.io.DataOutputStream getChunkOutputStream(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.RegionFile.getChunkOutputStream(pos.wrapperContained); }
// public java.nio.ByteBuffer getHeaderBuf() { return wrapperContained.getHeaderBuf(); }
// public static java.nio.ByteBuffer getHeaderBuf() { return net.minecraft.world.storage.RegionFile.getHeaderBuf(); }
// public boolean hasChunkStreamVersionId(byte flags) { return wrapperContained.hasChunkStreamVersionId(flags); }
// public static boolean hasChunkStreamVersionId(byte flags, ) { return net.minecraft.world.storage.RegionFile.hasChunkStreamVersionId(flags); }
// public java.io.DataInputStream getInputStream(yarnwrap.util.math.ChunkPos pos,byte flags) { return wrapperContained.getInputStream(pos.wrapperContained,flags); }
// public static java.io.DataInputStream getInputStream(yarnwrap.util.math.ChunkPos pos,byte flags, ) { return net.minecraft.world.storage.RegionFile.getInputStream(pos.wrapperContained,flags); }
// public java.io.DataInputStream decompress(yarnwrap.util.math.ChunkPos pos,byte flags,java.io.InputStream stream) { return wrapperContained.decompress(pos.wrapperContained,flags,stream); }
// public static java.io.DataInputStream decompress(yarnwrap.util.math.ChunkPos pos,byte flags,java.io.InputStream stream, ) { return net.minecraft.world.storage.RegionFile.decompress(pos.wrapperContained,flags,stream); }
// public Object writeSafely(java.nio.file.Path path,java.nio.ByteBuffer buf) { return wrapperContained.writeSafely(path,buf); }
// public static Object writeSafely(java.nio.file.Path path,java.nio.ByteBuffer buf, ) { return net.minecraft.world.storage.RegionFile.writeSafely(path,buf); }
// public byte getChunkStreamVersionId(byte flags) { return wrapperContained.getChunkStreamVersionId(flags); }
// public static byte getChunkStreamVersionId(byte flags, ) { return net.minecraft.world.storage.RegionFile.getChunkStreamVersionId(flags); }
// public java.nio.file.Path getExternalChunkPath(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getExternalChunkPath(chunkPos.wrapperContained); }
// public static java.nio.file.Path getExternalChunkPath(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.storage.RegionFile.getExternalChunkPath(chunkPos.wrapperContained); }
// public void sync() { wrapperContained.sync(); }
// public static void sync() { net.minecraft.world.storage.RegionFile.sync(); }
// public int getEpochTimeSeconds() { return wrapperContained.getEpochTimeSeconds(); }
// public static int getEpochTimeSeconds() { return net.minecraft.world.storage.RegionFile.getEpochTimeSeconds(); }
// public void delete(yarnwrap.util.math.ChunkPos pos) { wrapperContained.delete(pos.wrapperContained); }
// public static void delete(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.RegionFile.delete(pos.wrapperContained); }
public java.nio.file.Path getPath() { return wrapperContained.getPath(); }
// public static java.nio.file.Path getPath() { return net.minecraft.world.storage.RegionFile.getPath(); }

}