package yarnwrap.network.packet.c2s.common;
public class SyncedClientOptions { public net.minecraft.network.packet.c2s.common.SyncedClientOptions wrapperContained; public SyncedClientOptions(net.minecraft.network.packet.c2s.common.SyncedClientOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean chatColorsEnabled() { return wrapperContained.chatColorsEnabled; }
// public void chatColorsEnabled(boolean value) { wrapperContained.chatColorsEnabled = value; }
// public int playerModelParts() { return wrapperContained.playerModelParts; }
// public void playerModelParts(int value) { wrapperContained.playerModelParts = value; }
// public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm); }
// public void mainArm(yarnwrap.util.Arm value) { wrapperContained.mainArm = value.wrapperContained; }
// public boolean filtersText() { return wrapperContained.filtersText; }
// public void filtersText(boolean value) { wrapperContained.filtersText = value; }
// public boolean allowsServerListing() { return wrapperContained.allowsServerListing; }
// public void allowsServerListing(boolean value) { wrapperContained.allowsServerListing = value; }
public int MAX_LANGUAGE_CODE_LENGTH() { return wrapperContained.MAX_LANGUAGE_CODE_LENGTH; }
// public void MAX_LANGUAGE_CODE_LENGTH(int value) { wrapperContained.MAX_LANGUAGE_CODE_LENGTH = value; }
public SyncedClientOptions(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.SyncedClientOptions(buf.wrapperContained); }
// public boolean chatColorsEnabled() { return wrapperContained.chatColorsEnabled(); }
// public int playerModelParts() { return wrapperContained.playerModelParts(); }
// public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm()); }
// public boolean filtersText() { return wrapperContained.filtersText(); }
// public boolean allowsServerListing() { return wrapperContained.allowsServerListing(); }
public yarnwrap.network.packet.c2s.common.SyncedClientOptions createDefault() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.createDefault()); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}