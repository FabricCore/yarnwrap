package yarnwrap.network.packet.c2s.common;
public class SyncedClientOptions { public net.minecraft.network.packet.c2s.common.SyncedClientOptions wrapperContained; public SyncedClientOptions(net.minecraft.network.packet.c2s.common.SyncedClientOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean chatColorsEnabled() { return wrapperContained.chatColorsEnabled; }
// public int playerModelParts() { return wrapperContained.playerModelParts; }
// public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm); }
// public boolean filtersText() { return wrapperContained.filtersText; }
// public boolean allowsServerListing() { return wrapperContained.allowsServerListing; }
public int MAX_LANGUAGE_CODE_LENGTH() { return wrapperContained.MAX_LANGUAGE_CODE_LENGTH; }
// public boolean chatColorsEnabled() { return wrapperContained.chatColorsEnabled(); }
// public int playerModelParts() { return wrapperContained.playerModelParts(); }
// public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm()); }
// public boolean filtersText() { return wrapperContained.filtersText(); }
// public boolean allowsServerListing() { return wrapperContained.allowsServerListing(); }
public yarnwrap.network.packet.c2s.common.SyncedClientOptions createDefault() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.createDefault()); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}