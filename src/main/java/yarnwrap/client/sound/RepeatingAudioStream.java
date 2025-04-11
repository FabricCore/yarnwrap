package yarnwrap.client.sound;
public class RepeatingAudioStream { public net.minecraft.client.sound.RepeatingAudioStream wrapperContained; public RepeatingAudioStream(net.minecraft.client.sound.RepeatingAudioStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object delegateFactory() { return wrapperContained.delegateFactory; }
// // public void delegateFactory(Object value) { wrapperContained.delegateFactory = value; }
// public yarnwrap.client.sound.AudioStream delegate() { return new yarnwrap.client.sound.AudioStream(wrapperContained.delegate); }
// public void delegate(yarnwrap.client.sound.AudioStream value) { wrapperContained.delegate = value.wrapperContained; }
// public java.io.BufferedInputStream inputStream() { return wrapperContained.inputStream; }
// public void inputStream(java.io.BufferedInputStream value) { wrapperContained.inputStream = value; }
// public RepeatingAudioStream(Object delegateFactory,java.io.InputStream inputStream) { this.wrapperContained = new net.minecraft.client.sound.RepeatingAudioStream(delegateFactory,inputStream); }

}