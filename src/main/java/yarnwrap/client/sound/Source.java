package yarnwrap.client.sound;
public class Source { public net.minecraft.client.sound.Source wrapperContained; public Source(net.minecraft.client.sound.Source wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.sound.Source.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.sound.Source.LOGGER = value; }

// public int pointer() { return wrapperContained.pointer; }
// public void pointer(int value) { wrapperContained.pointer = value; }
// public static int pointer() { return net.minecraft.client.sound.Source.pointer; }
// public static void pointer(int value, ) { net.minecraft.client.sound.Source.pointer = value; }

// public java.util.concurrent.atomic.AtomicBoolean playing() { return wrapperContained.playing; }
// public void playing(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.playing = value; }
// public static java.util.concurrent.atomic.AtomicBoolean playing() { return net.minecraft.client.sound.Source.playing; }
// public static void playing(java.util.concurrent.atomic.AtomicBoolean value, ) { net.minecraft.client.sound.Source.playing = value; }

// public int bufferSize() { return wrapperContained.bufferSize; }
// public void bufferSize(int value) { wrapperContained.bufferSize = value; }
// public static int bufferSize() { return net.minecraft.client.sound.Source.bufferSize; }
// public static void bufferSize(int value, ) { net.minecraft.client.sound.Source.bufferSize = value; }

// public yarnwrap.client.sound.AudioStream stream() { return new yarnwrap.client.sound.AudioStream(wrapperContained.stream); }
// public void stream(yarnwrap.client.sound.AudioStream value) { wrapperContained.stream = value.wrapperContained; }
// public static yarnwrap.client.sound.AudioStream stream() { return new yarnwrap.client.sound.AudioStream(net.minecraft.client.sound.Source.stream); }
// public static void stream(yarnwrap.client.sound.AudioStream value, ) { net.minecraft.client.sound.Source.stream = value.wrapperContained; }

// public Source(int pointer) { this.wrapperContained = new net.minecraft.client.sound.Source(pointer); }
// public yarnwrap.client.sound.Source create() { return new yarnwrap.client.sound.Source(wrapperContained.create()); }
// public static yarnwrap.client.sound.Source create() { return new yarnwrap.client.sound.Source(net.minecraft.client.sound.Source.create()); }
public void setPitch(float pitch) { wrapperContained.setPitch(pitch); }
// public static void setPitch(float pitch, ) { net.minecraft.client.sound.Source.setPitch(pitch); }
// public void read(int count) { wrapperContained.read(count); }
// public static void read(int count, ) { net.minecraft.client.sound.Source.read(count); }
public void setPosition(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPosition(pos.wrapperContained); }
// public static void setPosition(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.client.sound.Source.setPosition(pos.wrapperContained); }
public void setBuffer(yarnwrap.client.sound.StaticSound sound) { wrapperContained.setBuffer(sound.wrapperContained); }
// public static void setBuffer(yarnwrap.client.sound.StaticSound sound, ) { net.minecraft.client.sound.Source.setBuffer(sound.wrapperContained); }
public void setStream(yarnwrap.client.sound.AudioStream stream) { wrapperContained.setStream(stream.wrapperContained); }
// public static void setStream(yarnwrap.client.sound.AudioStream stream, ) { net.minecraft.client.sound.Source.setStream(stream.wrapperContained); }
// public int getBufferSize(javax.sound.sampled.AudioFormat format,int time) { return wrapperContained.getBufferSize(format,time); }
// public static int getBufferSize(javax.sound.sampled.AudioFormat format,int time, ) { return net.minecraft.client.sound.Source.getBufferSize(format,time); }
public void setLooping(boolean looping) { wrapperContained.setLooping(looping); }
// public static void setLooping(boolean looping, ) { net.minecraft.client.sound.Source.setLooping(looping); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.sound.Source.close(); }
public void setVolume(float volume) { wrapperContained.setVolume(volume); }
// public static void setVolume(float volume, ) { net.minecraft.client.sound.Source.setVolume(volume); }
// public void method_19648(int pointer) { wrapperContained.method_19648(pointer); }
// public static void method_19648(int pointer, ) { net.minecraft.client.sound.Source.method_19648(pointer); }
public void setRelative(boolean relative) { wrapperContained.setRelative(relative); }
// public static void setRelative(boolean relative, ) { net.minecraft.client.sound.Source.setRelative(relative); }
public void play() { wrapperContained.play(); }
// public static void play() { net.minecraft.client.sound.Source.play(); }
public void setAttenuation(float attenuation) { wrapperContained.setAttenuation(attenuation); }
// public static void setAttenuation(float attenuation, ) { net.minecraft.client.sound.Source.setAttenuation(attenuation); }
// public void method_19652(int pointer) { wrapperContained.method_19652(pointer); }
// public static void method_19652(int pointer, ) { net.minecraft.client.sound.Source.method_19652(pointer); }
public void pause() { wrapperContained.pause(); }
// public static void pause() { net.minecraft.client.sound.Source.pause(); }
public void resume() { wrapperContained.resume(); }
// public static void resume() { net.minecraft.client.sound.Source.resume(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.client.sound.Source.stop(); }
public boolean isStopped() { return wrapperContained.isStopped(); }
// public static boolean isStopped() { return net.minecraft.client.sound.Source.isStopped(); }
public void disableAttenuation() { wrapperContained.disableAttenuation(); }
// public static void disableAttenuation() { net.minecraft.client.sound.Source.disableAttenuation(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.sound.Source.tick(); }
// public int getSourceState() { return wrapperContained.getSourceState(); }
// public static int getSourceState() { return net.minecraft.client.sound.Source.getSourceState(); }
// public int removeProcessedBuffers() { return wrapperContained.removeProcessedBuffers(); }
// public static int removeProcessedBuffers() { return net.minecraft.client.sound.Source.removeProcessedBuffers(); }
public boolean isPlaying() { return wrapperContained.isPlaying(); }
// public static boolean isPlaying() { return net.minecraft.client.sound.Source.isPlaying(); }

}