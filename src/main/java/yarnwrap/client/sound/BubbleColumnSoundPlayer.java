package yarnwrap.client.sound;
public class BubbleColumnSoundPlayer { public net.minecraft.client.sound.BubbleColumnSoundPlayer wrapperContained; public BubbleColumnSoundPlayer(net.minecraft.client.sound.BubbleColumnSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public boolean hasPlayedForCurrentColumn() { return wrapperContained.hasPlayedForCurrentColumn; }
// public void hasPlayedForCurrentColumn(boolean value) { wrapperContained.hasPlayedForCurrentColumn = value; }
// public boolean firstTick() { return wrapperContained.firstTick; }
// public void firstTick(boolean value) { wrapperContained.firstTick = value; }

}