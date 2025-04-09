package yarnwrap.world.storage;
public class NbtScannable { public net.minecraft.world.storage.NbtScannable wrapperContained; public NbtScannable(net.minecraft.world.storage.NbtScannable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.concurrent.CompletableFuture scanChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.scanner.NbtScanner scanner) { return wrapperContained.scanChunk(pos.wrapperContained,scanner.wrapperContained); }

}