package yarnwrap.block.jukebox;
public class JukeboxManager { public net.minecraft.block.jukebox.JukeboxManager wrapperContained; public JukeboxManager(net.minecraft.block.jukebox.JukeboxManager wrapperContained) { this.wrapperContained = wrapperContained; }

public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
// public void TICKS_PER_SECOND(int value) { wrapperContained.TICKS_PER_SECOND = value; }
// public long ticksSinceSongStarted() { return wrapperContained.ticksSinceSongStarted; }
// public void ticksSinceSongStarted(long value) { wrapperContained.ticksSinceSongStarted = value; }
// public yarnwrap.registry.entry.RegistryEntry song() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.song); }
// public void song(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.song = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public Object changeNotifier() { return wrapperContained.changeNotifier; }
// // public void changeNotifier(Object value) { wrapperContained.changeNotifier = value; }
// public JukeboxManager(Object changeNotifier,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.block.jukebox.JukeboxManager(changeNotifier,pos.wrapperContained); }
public boolean isPlaying() { return wrapperContained.isPlaying(); }
public void stopPlaying(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state) { wrapperContained.stopPlaying(world.wrapperContained,state.wrapperContained); }
// public void spawnNoteParticles(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnNoteParticles(world.wrapperContained,pos.wrapperContained); }
public void startPlaying(yarnwrap.world.WorldAccess world,yarnwrap.registry.entry.RegistryEntry song) { wrapperContained.startPlaying(world.wrapperContained,song.wrapperContained); }
public void setValues(yarnwrap.registry.entry.RegistryEntry song,long ticksPlaying) { wrapperContained.setValues(song.wrapperContained,ticksPlaying); }
public yarnwrap.block.jukebox.JukeboxSong getSong() { return new yarnwrap.block.jukebox.JukeboxSong(wrapperContained.getSong()); }
public void tick(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state) { wrapperContained.tick(world.wrapperContained,state.wrapperContained); }
public long getTicksSinceSongStarted() { return wrapperContained.getTicksSinceSongStarted(); }
// public boolean hasSecondPassed() { return wrapperContained.hasSecondPassed(); }

}