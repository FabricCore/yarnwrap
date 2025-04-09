package yarnwrap.client.sound;
public class Source { public net.minecraft.client.sound.Source wrapperContained; public Source(net.minecraft.client.sound.Source wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int pointer() { return wrapperContained.pointer; }
// public java.util.concurrent.atomic.AtomicBoolean playing() { return wrapperContained.playing; }
// public int bufferSize() { return wrapperContained.bufferSize; }
// public yarnwrap.client.sound.AudioStream stream() { return new yarnwrap.client.sound.AudioStream(wrapperContained.stream); }
// public yarnwrap.client.sound.Source create() { return new yarnwrap.client.sound.Source(wrapperContained.create()); }
public void setPitch(float pitch) { wrapperContained.setPitch(pitch); }
// public void read(int count) { wrapperContained.read(count); }
public void setPosition(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPosition(pos.wrapperContained); }
public void setBuffer(yarnwrap.client.sound.StaticSound sound) { wrapperContained.setBuffer(sound.wrapperContained); }
public void setStream(yarnwrap.client.sound.AudioStream stream) { wrapperContained.setStream(stream.wrapperContained); }
// public int getBufferSize(javax.sound.sampled.AudioFormat format,int time) { return wrapperContained.getBufferSize(format,time); }
public void setLooping(boolean looping) { wrapperContained.setLooping(looping); }
public void close() { wrapperContained.close(); }
public void setVolume(float volume) { wrapperContained.setVolume(volume); }
public void setRelative(boolean relative) { wrapperContained.setRelative(relative); }
public void play() { wrapperContained.play(); }
public void setAttenuation(float attenuation) { wrapperContained.setAttenuation(attenuation); }
public void pause() { wrapperContained.pause(); }
public void resume() { wrapperContained.resume(); }
public void stop() { wrapperContained.stop(); }
public boolean isStopped() { return wrapperContained.isStopped(); }
public void disableAttenuation() { wrapperContained.disableAttenuation(); }
public void tick() { wrapperContained.tick(); }
// public int getSourceState() { return wrapperContained.getSourceState(); }
// public int removeProcessedBuffers() { return wrapperContained.removeProcessedBuffers(); }
public boolean isPlaying() { return wrapperContained.isPlaying(); }

}