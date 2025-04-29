package yarnwrap.client.sound;
public class BufferedAudioStream { public net.minecraft.client.sound.BufferedAudioStream wrapperContained; public BufferedAudioStream(net.minecraft.client.sound.BufferedAudioStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHUNK_SIZE() { return wrapperContained.CHUNK_SIZE; }
// public void CHUNK_SIZE(int value) { wrapperContained.CHUNK_SIZE = value; }
public static int CHUNK_SIZE() { return net.minecraft.client.sound.BufferedAudioStream.CHUNK_SIZE; }
// public static void CHUNK_SIZE(int value, ) { net.minecraft.client.sound.BufferedAudioStream.CHUNK_SIZE = value; }

// public boolean read(it.unimi.dsi.fastutil.floats.FloatConsumer consumer) { return wrapperContained.read(consumer); }
// public static boolean read(it.unimi.dsi.fastutil.floats.FloatConsumer consumer, ) { return net.minecraft.client.sound.BufferedAudioStream.read(consumer); }

}