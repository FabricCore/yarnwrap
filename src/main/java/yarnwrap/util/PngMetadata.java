package yarnwrap.util;
public class PngMetadata { public net.minecraft.util.PngMetadata wrapperContained; public PngMetadata(net.minecraft.util.PngMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public long PNG_SIGNATURE() { return wrapperContained.PNG_SIGNATURE; }
// public void PNG_SIGNATURE(long value) { wrapperContained.PNG_SIGNATURE = value; }
// public int IHDR_CHUNK_TYPE() { return wrapperContained.IHDR_CHUNK_TYPE; }
// public void IHDR_CHUNK_TYPE(int value) { wrapperContained.IHDR_CHUNK_TYPE = value; }
// public int IHDR_CHUNK_LENGTH() { return wrapperContained.IHDR_CHUNK_LENGTH; }
// public void IHDR_CHUNK_LENGTH(int value) { wrapperContained.IHDR_CHUNK_LENGTH = value; }
// public yarnwrap.util.PngMetadata fromStream(java.io.InputStream stream) { return new yarnwrap.util.PngMetadata(wrapperContained.fromStream(stream)); }
// public yarnwrap.util.PngMetadata fromBytes(byte bytes) { return new yarnwrap.util.PngMetadata(wrapperContained.fromBytes(bytes)); }
// public void validate(java.nio.ByteBuffer buf) { wrapperContained.validate(buf); }

}