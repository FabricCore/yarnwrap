package yarnwrap.nbt;
public class NbtIo { public net.minecraft.nbt.NbtIo wrapperContained; public NbtIo(net.minecraft.nbt.NbtIo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.OpenOption[] OPEN_OPTIONS() { return wrapperContained.OPEN_OPTIONS; }
// public yarnwrap.nbt.NbtCompound readCompound(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompound(input,tracker.wrapperContained)); }
// public yarnwrap.nbt.NbtElement readElement(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.readElement(input,tracker.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound readCompound(java.io.DataInput input) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompound(input)); }
// public void writeCompound(yarnwrap.nbt.NbtCompound nbt,java.io.DataOutput output) { wrapperContained.writeCompound(nbt.wrapperContained,output); }
// public yarnwrap.nbt.NbtCompound readCompressed(java.io.InputStream stream,yarnwrap.nbt.NbtSizeTracker tagSizeTracker) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompressed(stream,tagSizeTracker.wrapperContained)); }
// public void write(yarnwrap.nbt.NbtCompound nbt,java.nio.file.Path path) { wrapperContained.write(nbt.wrapperContained,path); }
// public void writeUnsafe(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output) { wrapperContained.writeUnsafe(nbt.wrapperContained,output); }
// public yarnwrap.nbt.NbtCompound read(java.nio.file.Path path) { return new yarnwrap.nbt.NbtCompound(wrapperContained.read(path)); }
// public void writeCompressed(yarnwrap.nbt.NbtCompound nbt,java.io.OutputStream stream) { wrapperContained.writeCompressed(nbt.wrapperContained,stream); }
// public yarnwrap.nbt.NbtCompound readCompressed(java.nio.file.Path path,yarnwrap.nbt.NbtSizeTracker tagSizeTracker) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompressed(path,tagSizeTracker.wrapperContained)); }
// public void writeCompressed(yarnwrap.nbt.NbtCompound nbt,java.nio.file.Path path) { wrapperContained.writeCompressed(nbt.wrapperContained,path); }
// public void scan(java.io.DataInput input,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.scan(input,scanner.wrapperContained,tracker.wrapperContained); }
// public void scanCompressed(java.nio.file.Path path,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.scanCompressed(path,scanner.wrapperContained,tracker.wrapperContained); }
// public void scanCompressed(java.io.InputStream stream,yarnwrap.nbt.scanner.NbtScanner scanner,yarnwrap.nbt.NbtSizeTracker tracker) { wrapperContained.scanCompressed(stream,scanner.wrapperContained,tracker.wrapperContained); }
// public java.io.DataInputStream decompress(java.io.InputStream stream) { return wrapperContained.decompress(stream); }
// public yarnwrap.nbt.NbtElement readElement(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker,byte typeId) { return new yarnwrap.nbt.NbtElement(wrapperContained.readElement(input,tracker.wrapperContained,typeId)); }
// public void writeForPacket(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output) { wrapperContained.writeForPacket(nbt.wrapperContained,output); }
// public yarnwrap.nbt.NbtElement read(java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.read(input,tracker.wrapperContained)); }
// public java.io.DataOutputStream compress(java.io.OutputStream stream) { return wrapperContained.compress(stream); }
// public void write(yarnwrap.nbt.NbtElement nbt,java.io.DataOutput output) { wrapperContained.write(nbt.wrapperContained,output); }

}