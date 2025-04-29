package yarnwrap.nbt;
public class NbtIo { public net.minecraft.nbt.NbtIo wrapperContained; public NbtIo(net.minecraft.nbt.NbtIo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.OpenOption[] OPEN_OPTIONS() { return wrapperContained.OPEN_OPTIONS; }
// public void OPEN_OPTIONS(java.nio.file.OpenOption[] value) { wrapperContained.OPEN_OPTIONS = value; }
// public static java.nio.file.OpenOption[] OPEN_OPTIONS() { return net.minecraft.nbt.NbtIo.OPEN_OPTIONS; }
// public static void OPEN_OPTIONS(java.nio.file.OpenOption[] value, ) { net.minecraft.nbt.NbtIo.OPEN_OPTIONS = value; }

// public yarnwrap.nbt.NbtCompound readCompound(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompound(input,tracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound readCompound(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtIo.readCompound(input,tracker.wrapperContained)); }
// public yarnwrap.nbt.NbtElement readElement(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.readElement(input,tracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement readElement(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtIo.readElement(input,tracker.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound readCompound(java.io.DataInput input) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompound(input)); }
// public static yarnwrap.nbt.NbtCompound readCompound(java.io.DataInput input, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtIo.readCompound(input)); }
// public void writeCompound(yarnwrap.nbt.NbtCompound nbt,java.io.DataOutput output) { wrapperContained.writeCompound(nbt.wrapperContained,output); }
// public static void writeCompound(yarnwrap.nbt.NbtCompound nbt,java.io.DataOutput output, ) { net.minecraft.nbt.NbtIo.writeCompound(nbt.wrapperContained,output); }
// public yarnwrap.nbt.NbtCompound readCompressed(java.io.InputStream stream,yarnwrap.nbt.NbtSizeTracker tagSizeTracker) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompressed(stream,tagSizeTracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound readCompressed(java.io.InputStream stream,yarnwrap.nbt.NbtSizeTracker tagSizeTracker, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtIo.readCompressed(stream,tagSizeTracker.wrapperContained)); }
// public void write(yarnwrap.nbt.NbtCompound nbt,java.nio.file.Path path) { wrapperContained.write(nbt.wrapperContained,path); }
// public static void write(yarnwrap.nbt.NbtCompound nbt,java.nio.file.Path path, ) { net.minecraft.nbt.NbtIo.write(nbt.wrapperContained,path); }
// public void writeUnsafe(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output) { wrapperContained.writeUnsafe(nbt.wrapperContained,output); }
// public static void writeUnsafe(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output, ) { net.minecraft.nbt.NbtIo.writeUnsafe(nbt.wrapperContained,output); }
// public yarnwrap.nbt.NbtCompound read(java.nio.file.Path path) { return new yarnwrap.nbt.NbtCompound(wrapperContained.read(path)); }
// public static yarnwrap.nbt.NbtCompound read(java.nio.file.Path path, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtIo.read(path)); }
// public void writeCompressed(yarnwrap.nbt.NbtCompound nbt,java.io.OutputStream stream) { wrapperContained.writeCompressed(nbt.wrapperContained,stream); }
// public static void writeCompressed(yarnwrap.nbt.NbtCompound nbt,java.io.OutputStream stream, ) { net.minecraft.nbt.NbtIo.writeCompressed(nbt.wrapperContained,stream); }
// public yarnwrap.nbt.NbtCompound readCompressed(java.nio.file.Path path,yarnwrap.nbt.NbtSizeTracker tagSizeTracker) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompressed(path,tagSizeTracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound readCompressed(java.nio.file.Path path,yarnwrap.nbt.NbtSizeTracker tagSizeTracker, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtIo.readCompressed(path,tagSizeTracker.wrapperContained)); }
// public void writeCompressed(yarnwrap.nbt.NbtCompound nbt,java.nio.file.Path path) { wrapperContained.writeCompressed(nbt.wrapperContained,path); }
// public static void writeCompressed(yarnwrap.nbt.NbtCompound nbt,java.nio.file.Path path, ) { net.minecraft.nbt.NbtIo.writeCompressed(nbt.wrapperContained,path); }
// public void scan(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.scan(input,scanner.wrapperContained,tracker.wrapperContained); }
// public static void scan(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker, ) { net.minecraft.nbt.NbtIo.scan(input,scanner.wrapperContained,tracker.wrapperContained); }
// public void scanCompressed(java.nio.file.Path path,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.scanCompressed(path,scanner.wrapperContained,tracker.wrapperContained); }
// public static void scanCompressed(java.nio.file.Path path,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker, ) { net.minecraft.nbt.NbtIo.scanCompressed(path,scanner.wrapperContained,tracker.wrapperContained); }
// public void scanCompressed(java.io.InputStream stream,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.scanCompressed(stream,scanner.wrapperContained,tracker.wrapperContained); }
// public static void scanCompressed(java.io.InputStream stream,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker, ) { net.minecraft.nbt.NbtIo.scanCompressed(stream,scanner.wrapperContained,tracker.wrapperContained); }
// public java.io.DataInputStream decompress(java.io.InputStream stream) { return wrapperContained.decompress(stream); }
// public static java.io.DataInputStream decompress(java.io.InputStream stream, ) { return net.minecraft.nbt.NbtIo.decompress(stream); }
// public yarnwrap.nbt.NbtElement readElement(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker,byte typeId) { return new yarnwrap.nbt.NbtElement(wrapperContained.readElement(input,tracker.wrapperContained,typeId)); }
// public static yarnwrap.nbt.NbtElement readElement(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker,byte typeId, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtIo.readElement(input,tracker.wrapperContained,typeId)); }
// public void writeForPacket(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output) { wrapperContained.writeForPacket(nbt.wrapperContained,output); }
// public static void writeForPacket(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output, ) { net.minecraft.nbt.NbtIo.writeForPacket(nbt.wrapperContained,output); }
// public yarnwrap.nbt.NbtElement read(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.read(input,tracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement read(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtIo.read(input,tracker.wrapperContained)); }
// public java.io.DataOutputStream compress(java.io.OutputStream stream) { return wrapperContained.compress(stream); }
// public static java.io.DataOutputStream compress(java.io.OutputStream stream, ) { return net.minecraft.nbt.NbtIo.compress(stream); }
// public void write(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output) { wrapperContained.write(nbt.wrapperContained,output); }
// public static void write(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output, ) { net.minecraft.nbt.NbtIo.write(nbt.wrapperContained,output); }

}