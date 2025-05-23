package yarnwrap.client.world;
public class WorldEventHandler { public net.minecraft.client.world.WorldEventHandler wrapperContained; public WorldEventHandler(net.minecraft.client.world.WorldEventHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.world.WorldEventHandler.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.world.WorldEventHandler.client = value.wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.client.world.WorldEventHandler.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.client.world.WorldEventHandler.world = value.wrapperContained; }

// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.world.WorldEventHandler.worldRenderer); }
// public static void worldRenderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.world.WorldEventHandler.worldRenderer = value.wrapperContained; }

// public java.util.Map playingSongs() { return wrapperContained.playingSongs; }
// public void playingSongs(java.util.Map value) { wrapperContained.playingSongs = value; }
// public static java.util.Map playingSongs() { return net.minecraft.client.world.WorldEventHandler.playingSongs; }
// public static void playingSongs(java.util.Map value, ) { net.minecraft.client.world.WorldEventHandler.playingSongs = value; }

public WorldEventHandler(yarnwrap.client.MinecraftClient client,yarnwrap.world.World world,yarnwrap.client.render.WorldRenderer worldRenderer) { this.wrapperContained = new net.minecraft.client.world.WorldEventHandler(client.wrapperContained,world.wrapperContained,worldRenderer.wrapperContained); }
public void processGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.processGlobalEvent(eventId,pos.wrapperContained,data); }
// public static void processGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data, ) { net.minecraft.client.world.WorldEventHandler.processGlobalEvent(eventId,pos.wrapperContained,data); }
// public void shootParticles(int direction,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.particle.SimpleParticleType particleType) { wrapperContained.shootParticles(direction,pos.wrapperContained,random.wrapperContained,particleType.wrapperContained); }
// public static void shootParticles(int direction,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.particle.SimpleParticleType particleType, ) { net.minecraft.client.world.WorldEventHandler.shootParticles(direction,pos.wrapperContained,random.wrapperContained,particleType.wrapperContained); }
// public void updateEntitiesForSong(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean playing) { wrapperContained.updateEntitiesForSong(world.wrapperContained,pos.wrapperContained,playing); }
// public static void updateEntitiesForSong(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean playing, ) { net.minecraft.client.world.WorldEventHandler.updateEntitiesForSong(world.wrapperContained,pos.wrapperContained,playing); }
// public void stopJukeboxSong(yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.stopJukeboxSong(jukeboxPos.wrapperContained); }
// public static void stopJukeboxSong(yarnwrap.util.math.BlockPos jukeboxPos, ) { net.minecraft.client.world.WorldEventHandler.stopJukeboxSong(jukeboxPos.wrapperContained); }
// public void method_62192(yarnwrap.util.math.BlockPos song) { wrapperContained.method_62192(song.wrapperContained); }
// public static void method_62192(yarnwrap.util.math.BlockPos song, ) { net.minecraft.client.world.WorldEventHandler.method_62192(song.wrapperContained); }
// public void playJukeboxSong(yarnwrap.registry.entry.RegistryEntry song,yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.playJukeboxSong(song.wrapperContained,jukeboxPos.wrapperContained); }
// public static void playJukeboxSong(yarnwrap.registry.entry.RegistryEntry song,yarnwrap.util.math.BlockPos jukeboxPos, ) { net.minecraft.client.world.WorldEventHandler.playJukeboxSong(song.wrapperContained,jukeboxPos.wrapperContained); }
public void processWorldEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.processWorldEvent(eventId,pos.wrapperContained,data); }
// public static void processWorldEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data, ) { net.minecraft.client.world.WorldEventHandler.processWorldEvent(eventId,pos.wrapperContained,data); }
// public void stopJukeboxSongAndUpdate(yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.stopJukeboxSongAndUpdate(jukeboxPos.wrapperContained); }
// public static void stopJukeboxSongAndUpdate(yarnwrap.util.math.BlockPos jukeboxPos, ) { net.minecraft.client.world.WorldEventHandler.stopJukeboxSongAndUpdate(jukeboxPos.wrapperContained); }

}