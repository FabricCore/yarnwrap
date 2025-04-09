package yarnwrap.client.sound;
public class RepeatingAudioStream { public net.minecraft.client.sound.RepeatingAudioStream wrapperContained; public RepeatingAudioStream(net.minecraft.client.sound.RepeatingAudioStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object delegateFactory() { return wrapperContained.delegateFactory; }
// public yarnwrap.client.sound.AudioStream delegate() { return new yarnwrap.client.sound.AudioStream(wrapperContained.delegate); }
// public java.io.BufferedInputStream inputStream() { return wrapperContained.inputStream; }

}