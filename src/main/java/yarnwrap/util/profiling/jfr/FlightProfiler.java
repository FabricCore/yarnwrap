package yarnwrap.util.profiling.jfr;
public class FlightProfiler { public net.minecraft.util.profiling.jfr.FlightProfiler wrapperContained; public FlightProfiler(net.minecraft.util.profiling.jfr.FlightProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiling.jfr.FlightProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.FlightProfiler(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiling.jfr.FlightProfiler value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.profiling.jfr.FlightProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.FlightProfiler(net.minecraft.util.profiling.jfr.FlightProfiler.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.profiling.jfr.FlightProfiler value, ) { net.minecraft.util.profiling.jfr.FlightProfiler.INSTANCE = value.wrapperContained; }

public java.nio.file.Path stop() { return wrapperContained.stop(); }
// public static java.nio.file.Path stop() { return net.minecraft.util.profiling.jfr.FlightProfiler.stop(); }
public boolean start(yarnwrap.util.profiling.jfr.InstanceType instanceType) { return wrapperContained.start(instanceType.wrapperContained); }
// public static boolean start(yarnwrap.util.profiling.jfr.InstanceType instanceType, ) { return net.minecraft.util.profiling.jfr.FlightProfiler.start(instanceType.wrapperContained); }
public boolean isProfiling() { return wrapperContained.isProfiling(); }
// public static boolean isProfiling() { return net.minecraft.util.profiling.jfr.FlightProfiler.isProfiling(); }
public void onTick(float tickTime) { wrapperContained.onTick(tickTime); }
// public static void onTick(float tickTime, ) { net.minecraft.util.profiling.jfr.FlightProfiler.onTick(tickTime); }
public yarnwrap.util.function.Finishable startChunkGenerationProfiling(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.registry.RegistryKey world,java.lang.String targetStatus) { return new yarnwrap.util.function.Finishable(wrapperContained.startChunkGenerationProfiling(chunkPos.wrapperContained,world.wrapperContained,targetStatus)); }
// public static yarnwrap.util.function.Finishable startChunkGenerationProfiling(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.registry.RegistryKey world,java.lang.String targetStatus, ) { return new yarnwrap.util.function.Finishable(net.minecraft.util.profiling.jfr.FlightProfiler.startChunkGenerationProfiling(chunkPos.wrapperContained,world.wrapperContained,targetStatus)); }
public void onPacketReceived(yarnwrap.network.NetworkPhase state,yarnwrap.network.packet.PacketType type,java.net.SocketAddress remoteAddress,int bytes) { wrapperContained.onPacketReceived(state.wrapperContained,type.wrapperContained,remoteAddress,bytes); }
// public static void onPacketReceived(yarnwrap.network.NetworkPhase state,yarnwrap.network.packet.PacketType type,java.net.SocketAddress remoteAddress,int bytes, ) { net.minecraft.util.profiling.jfr.FlightProfiler.onPacketReceived(state.wrapperContained,type.wrapperContained,remoteAddress,bytes); }
public void onPacketSent(yarnwrap.network.NetworkPhase state,yarnwrap.network.packet.PacketType type,java.net.SocketAddress remoteAddress,int bytes) { wrapperContained.onPacketSent(state.wrapperContained,type.wrapperContained,remoteAddress,bytes); }
// public static void onPacketSent(yarnwrap.network.NetworkPhase state,yarnwrap.network.packet.PacketType type,java.net.SocketAddress remoteAddress,int bytes, ) { net.minecraft.util.profiling.jfr.FlightProfiler.onPacketSent(state.wrapperContained,type.wrapperContained,remoteAddress,bytes); }
public boolean isAvailable() { return wrapperContained.isAvailable(); }
// public static boolean isAvailable() { return net.minecraft.util.profiling.jfr.FlightProfiler.isAvailable(); }
public yarnwrap.util.function.Finishable startWorldLoadProfiling() { return new yarnwrap.util.function.Finishable(wrapperContained.startWorldLoadProfiling()); }
// public static yarnwrap.util.function.Finishable startWorldLoadProfiling() { return new yarnwrap.util.function.Finishable(net.minecraft.util.profiling.jfr.FlightProfiler.startWorldLoadProfiling()); }
public void onChunkRegionRead(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes) { wrapperContained.onChunkRegionRead(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }
// public static void onChunkRegionRead(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes, ) { net.minecraft.util.profiling.jfr.FlightProfiler.onChunkRegionRead(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }
public void onChunkRegionWrite(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes) { wrapperContained.onChunkRegionWrite(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }
// public static void onChunkRegionWrite(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes, ) { net.minecraft.util.profiling.jfr.FlightProfiler.onChunkRegionWrite(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }

}