package yarnwrap.client.sound;
public class RepeatingAudioStream { public net.minecraft.client.sound.RepeatingAudioStream wrapperContained; public RepeatingAudioStream(net.minecraft.client.sound.RepeatingAudioStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object delegateFactory() { return wrapperContained.delegateFactory; }
// // public void delegateFactory(Object value) { wrapperContained.delegateFactory = value; }
// // public static Object delegateFactory() { return net.minecraft.client.sound.RepeatingAudioStream.delegateFactory; }
// // public static void delegateFactory(Object value, ) { net.minecraft.client.sound.RepeatingAudioStream.delegateFactory = value; }

// public yarnwrap.client.sound.AudioStream delegate() { return new yarnwrap.client.sound.AudioStream(wrapperContained.delegate); }
// public void delegate(yarnwrap.client.sound.AudioStream value) { wrapperContained.delegate = value.wrapperContained; }
// public static yarnwrap.client.sound.AudioStream delegate() { return new yarnwrap.client.sound.AudioStream(net.minecraft.client.sound.RepeatingAudioStream.delegate); }
// public static void delegate(yarnwrap.client.sound.AudioStream value, ) { net.minecraft.client.sound.RepeatingAudioStream.delegate = value.wrapperContained; }

// public java.io.BufferedInputStream inputStream() { return wrapperContained.inputStream; }
// public void inputStream(java.io.BufferedInputStream value) { wrapperContained.inputStream = value; }
// public static java.io.BufferedInputStream inputStream() { return net.minecraft.client.sound.RepeatingAudioStream.inputStream; }
// public static void inputStream(java.io.BufferedInputStream value, ) { net.minecraft.client.sound.RepeatingAudioStream.inputStream = value; }

// public RepeatingAudioStream(Object delegateFactory,java.io.InputStream inputStream) { this.wrapperContained = new net.minecraft.client.sound.RepeatingAudioStream(delegateFactory,inputStream); }

}