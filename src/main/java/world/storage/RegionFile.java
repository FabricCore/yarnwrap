package yarnwrap.world.storage;
public class RegionFile { public net.minecraft.world.storage.RegionFile wrapperContained; public RegionFile(net.minecraft.world.storage.RegionFile wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.nio.ByteBuffer ZERO() { return wrapperContained.ZERO; }
// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public yarnwrap.world.storage.ChunkCompressionFormat compressionFormat() { return new yarnwrap.world.storage.ChunkCompressionFormat(wrapperContained.compressionFormat); }
// public java.nio.ByteBuffer header() { return wrapperContained.header; }
// public java.nio.IntBuffer sectorData() { return wrapperContained.sectorData; }
// public java.nio.IntBuffer saveTimes() { return wrapperContained.saveTimes; }
// public yarnwrap.world.storage.SectorMap sectors() { return new yarnwrap.world.storage.SectorMap(wrapperContained.sectors); }
// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public int SECTOR_DATA_LIMIT() { return wrapperContained.SECTOR_DATA_LIMIT; }
// public java.lang.String FILE_EXTENSION() { return wrapperContained.FILE_EXTENSION; }
// public java.nio.file.Path path() { return wrapperContained.path; }
// public yarnwrap.world.storage.StorageKey storageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.storageKey); }
// public int getSectorData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getSectorData(pos.wrapperContained); }
public boolean hasChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.hasChunk(pos.wrapperContained); }
// public int getIndex(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getIndex(pos.wrapperContained); }
// public void writeHeader() { wrapperContained.writeHeader(); }
// public int getSize(int sectorData) { return wrapperContained.getSize(sectorData); }
// public int packSectorData(int offset,int size) { return wrapperContained.packSectorData(offset,size); }
// public java.io.DataInputStream getChunkInputStream(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChunkInputStream(pos.wrapperContained); }
// public void writeChunk(yarnwrap.util.math.ChunkPos pos,java.nio.ByteBuffer buf) { wrapperContained.writeChunk(pos.wrapperContained,buf); }
// public java.io.ByteArrayInputStream getInputStream(java.nio.ByteBuffer buffer,int length) { return wrapperContained.getInputStream(buffer,length); }
// public void fillLastSector() { wrapperContained.fillLastSector(); }
// public int getOffset(int sectorData) { return wrapperContained.getOffset(sectorData); }
public boolean isChunkValid(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isChunkValid(pos.wrapperContained); }
// public int getSectorCount(int byteCount) { return wrapperContained.getSectorCount(byteCount); }
// public java.io.DataOutputStream getChunkOutputStream(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChunkOutputStream(pos.wrapperContained); }
// public java.nio.ByteBuffer getHeaderBuf() { return wrapperContained.getHeaderBuf(); }
// public boolean hasChunkStreamVersionId(byte flags) { return wrapperContained.hasChunkStreamVersionId(flags); }
// public java.io.DataInputStream getInputStream(yarnwrap.util.math.ChunkPos pos,byte flags) { return wrapperContained.getInputStream(pos.wrapperContained,flags); }
// public java.io.DataInputStream decompress(yarnwrap.util.math.ChunkPos pos,byte flags,java.io.InputStream stream) { return wrapperContained.decompress(pos.wrapperContained,flags,stream); }
// public Object writeSafely(java.nio.file.Path path,java.nio.ByteBuffer buf) { return wrapperContained.writeSafely(path,buf); }
// public byte getChunkStreamVersionId(byte flags) { return wrapperContained.getChunkStreamVersionId(flags); }
// public java.nio.file.Path getExternalChunkPath(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getExternalChunkPath(chunkPos.wrapperContained); }
// public void sync() { wrapperContained.sync(); }
// public int getEpochTimeSeconds() { return wrapperContained.getEpochTimeSeconds(); }
// public void delete(yarnwrap.util.math.ChunkPos pos) { wrapperContained.delete(pos.wrapperContained); }
public java.nio.file.Path getPath() { return wrapperContained.getPath(); }

}