package yarnwrap.client.sound;
public class BufferedAudioStream { public net.minecraft.client.sound.BufferedAudioStream wrapperContained; public BufferedAudioStream(net.minecraft.client.sound.BufferedAudioStream wrapperContained) { this.wrapperContained = wrapperContained; }

public int CHUNK_SIZE() { return wrapperContained.CHUNK_SIZE; }
// public boolean read(it.unimi.dsi.fastutil.floats.FloatConsumer consumer) { return wrapperContained.read(consumer); }

}