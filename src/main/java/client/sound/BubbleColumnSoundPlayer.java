package yarnwrap.client.sound;
public class BubbleColumnSoundPlayer { public net.minecraft.client.sound.BubbleColumnSoundPlayer wrapperContained; public BubbleColumnSoundPlayer(net.minecraft.client.sound.BubbleColumnSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public boolean hasPlayedForCurrentColumn() { return wrapperContained.hasPlayedForCurrentColumn; }
// public boolean firstTick() { return wrapperContained.firstTick; }

}